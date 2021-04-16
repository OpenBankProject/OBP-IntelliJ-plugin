package org.obp.scalaparsing;

public class ScalaFunction extends ScalaCode{
    private final String functionName;

    public ScalaFunction(String codeText, String functionName) {
        super(CodeType.FUNCTION, codeText);
        this.functionName =functionName;
    }

    public String getFunctionName() {
        return functionName;
    }
}

