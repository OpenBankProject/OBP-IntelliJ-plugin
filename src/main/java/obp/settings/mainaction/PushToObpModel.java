package obp.settings.mainaction;

public class PushToObpModel {
    private String functionName;
    private String functionCode;


    public PushToObpModel(String functionName, String functionCode) {

        this.functionName = functionName;
        this.functionCode = functionCode;
    }

    public String getFunctionName() {
        return functionName;
    }

    public String getFunctionCode() {
        return functionCode;
    }
}

