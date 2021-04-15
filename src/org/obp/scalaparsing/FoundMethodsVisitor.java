package org.obp.scalaparsing;

import obp.settings.antlrgenerated.ScalaBaseVisitor;
import obp.settings.antlrgenerated.ScalaLexer;
import obp.settings.antlrgenerated.ScalaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.codehaus.plexus.util.StringInputStream;
import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FoundMethodsVisitor extends ScalaBaseVisitor<ScalaCode> {
    public List<ScalaFunction> getFunctions() {
        return functions;
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
        ScalaLexer lexer = new ScalaLexer( new ANTLRInputStream(new ByteArrayInputStream(programText.getBytes())));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ScalaParser parser = new ScalaParser(tokens);
        parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
        //parser.setErrorHandler(new BailErrorStrategy());
        ParseTree tree = parser.block();
        FoundMethodsVisitor eval = new FoundMethodsVisitor();
        eval.visit(tree);

        return eval.getFunctions();
    }

    @NotNull
    private ScalaFunction getScalaFunction(ScalaParser.FunDefContext ctx) {
        if (ctx.expr() != null) {
            ScalaFunction scalaFunction = new ScalaFunction(ctx.funSig().getText(), ctx.expr().getText());
            return scalaFunction;
        } else {
            ScalaFunction scalaFunction = new ScalaFunction(ctx.funSig().getText(), ctx.block().getText());
            return scalaFunction;
        }
    }
}
