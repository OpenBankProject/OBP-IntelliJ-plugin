package org.obp.scalaparsing;

import obp.settings.antlrgenerated.ScalaBaseVisitor;
import obp.settings.antlrgenerated.ScalaLexer;
import obp.settings.antlrgenerated.ScalaParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.codehaus.plexus.util.StringInputStream;
import org.jetbrains.annotations.NotNull;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
        Pattern overrideDefPattern=Pattern.compile("((\\s*)(override)(\\s+)def(\\s+))|((\\s*)def(\\s+))");
        Matcher matcher1 = overrideDefPattern.matcher(programText);
       
        String[] split = overrideDefPattern.split(programText);
        List<String> strings = Arrays.asList(split);
        Pattern pattern = Pattern.compile("[a-zA-Z_{1}][a-zA-Z0-9_]+");

        return strings.stream().filter(str->!str.trim().equals("")).map(functionStr->{
            Matcher matcher = pattern.matcher(functionStr);
            if (matcher.find()){
                int start = matcher.start();
                int end = matcher.end();
                String functionName = functionStr.substring(start, end);
                String functionBody=functionStr.substring(end+1);
                int indexOfEquals = functionBody.indexOf("=");
                 functionBody = functionBody.substring(indexOfEquals + 1).trim();
                 if (functionBody.startsWith("{")&&functionBody.endsWith("}")){
                     functionBody=functionBody.substring(1,functionBody.length()-1);
                 }
                return new ScalaFunction(functionBody,functionName);
            }else{
                return new ScalaFunction("",functionStr);

            }


        }).collect(Collectors.toList());

    }

    @NotNull
    private ScalaFunction getScalaFunction(ScalaParser.FunDefContext ctx) {
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
