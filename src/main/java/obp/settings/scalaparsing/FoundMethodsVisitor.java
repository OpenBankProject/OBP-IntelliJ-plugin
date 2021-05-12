package obp.settings.scalaparsing;


import obp.settings.generated.ScalaBaseVisitor;
import obp.settings.generated.ScalaLexer;
import obp.settings.generated.ScalaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FoundMethodsVisitor extends ScalaBaseVisitor<ScalaCode> {
    public List<ScalaFunction> getFunctions() {
        return functions;
    }
    private ANTLRInputStream antlrInputStream;

    public FoundMethodsVisitor(ANTLRInputStream antlrInputStream) {
        this.antlrInputStream = antlrInputStream;
    }

    List<ScalaFunction> functions = new ArrayList<ScalaFunction>();
    @Override
    public ScalaCode visitFunDef(ScalaParser.FunDefContext ctx) {

        if (ctx.funSig() != null) {
            ScalaFunction scalaFunction = getScalaFunction(ctx);
            functions.add(scalaFunction);
            return scalaFunction;
        } else if (ctx.constrExpr() != null) {
            return visit(ctx.constrExpr());
        } else {
            return visit(ctx.constrBlock());
        }
    }

    public static List<ScalaFunction> parseScalaFunction(String programText) throws IOException {
        programText=programText.replaceAll("override","");
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(new ByteArrayInputStream(programText.getBytes()));
        ScalaLexer lexer = new ScalaLexer(antlrInputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ScalaParser parser = new ScalaParser(tokens);
        parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
        //parser.setErrorHandler(new BailErrorStrategy());
        ParseTree tree = parser.block();
        FoundMethodsVisitor eval = new FoundMethodsVisitor(antlrInputStream);
        eval.visit(tree);

        return eval.getFunctions();
    }

    @NotNull
    private ScalaFunction getScalaFunction(ScalaParser  .FunDefContext ctx) {
        if (ctx.expr() != null) {
            ScalaFunction scalaFunction = new ScalaFunction( retrieveCtxText(ctx.expr()),ctx.funSig().Id().getText());
            return scalaFunction;
        } else {
            ScalaFunction scalaFunction = new ScalaFunction( retrieveCtxText(ctx.block()),ctx.funSig().Id().getText());
            return scalaFunction;
        }
    }

    private String retrieveCtxText(ParserRuleContext ctx){
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();

        Interval interval = new Interval(a,b);
        return antlrInputStream.getText(interval);
    }
}
