package org.obp.scalaparsing;

public class ScalaFunction extends ScalaCode{
    private final String functionBody;

    public ScalaFunction(String codeText, String functionBody) {
        super(CodeType.FUNCTION, codeText);
        this.functionBody=functionBody;
    }

    public String getFunctionBody() {
        return functionBody;
    }
}

