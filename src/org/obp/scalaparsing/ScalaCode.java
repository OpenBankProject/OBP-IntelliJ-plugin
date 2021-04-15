package org.obp.scalaparsing;

public abstract class ScalaCode {

    private final String codeText;

    public ScalaCode(CodeType codeType, String codeText) {
        this.codeType = codeType;
        this.codeText=codeText;
    }

    protected CodeType codeType;
    CodeType getCodeType(){
        return codeType;
    }

    public String getCodeText() {
        return codeText;
    }
}
