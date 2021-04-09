package org.obp.util;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public class ParsingUtil {
    public static String getScalaMethodName(String scalaCode) {
        String[] split = scalaCode.split("(\n|\r|\t| )+");
        if (split.length <= 1) {
            return "";
        }

        List<String> strings = Arrays.asList(split);

        if (strings.stream().filter(token -> token.equals("def")).count() == 0) {
            return "";

        }

        int indexDef = strings.indexOf("def");
        if (indexDef == strings.size() - 1) {
            return "";
        }

        String strWithMethodName = strings.get(indexDef + 1);
        int leftBracketIndex = getCharIndexOrStrLen("(", strWithMethodName);
        int equalsIndex = getCharIndexOrStrLen("=", strWithMethodName);
        if (strWithMethodName.contains("=")){
            equalsIndex--;
        }

        return strWithMethodName.substring(0, Math.min(leftBracketIndex, equalsIndex));
    }

    private static int getCharIndexOrStrLen(String charName, String strWithMethodName) {
        int charIndex = strWithMethodName.indexOf("(");
        if (charIndex < 0) {
            charIndex = strWithMethodName.length();
        }

        return charIndex;
    }

    /**
     * Better check this endpoint:
     * https://apiexplorersandbox.openbankproject.com/?version=OBPv4.0.0&operation_id=OBPv4_0_0-createConnectorMethod&currentTag=Connector-Method&#OBPv4_0_0-createConnectorMethod
     * 
     * Here, we need to remove the methodSignature, just keep the method body.
     * @param methodBody override def getAtm(bankId: BankId, atmId: AtmId, callContext: Option[CallContext]): Future[Box[(AtmT, Option[CallContext])]] = {xxxxxx}
     * 
     * @return {xxxxxx}
     */
    public static String removeMethodSignature(String methodBody){
        if (methodBody==null) return "";
        String trimmedBody = methodBody.trim();
        //Here, I only use the indexOf, maybe later, we need to use regular expression for the method signature
        return trimmedBody.startsWith("override")?trimmedBody.substring(trimmedBody.indexOf("=")+1):trimmedBody;
    }

    /**
     *  find the connectorMethodId by connectorMethodName from the JSONArray, if it exists, return the connectorMethodId
     *  otherwise, it will return ""
     * @param connectorMethodName eg: getBank
     * @param connectorMethods the connectorMethod Array, see the Unit test 
     * 
     * @return UUID or "".
     */
    public static String getConnectorMethodIdFromJSONArray(String connectorMethodName, JSONArray connectorMethods){
        String connector_method_id = "";
        for (int i = 0 ; i < connectorMethods.length(); i++) {
            JSONObject obj = connectorMethods.getJSONObject(i);
            String method_name = obj.getString("method_name");
            if(connectorMethodName.equals(method_name)) {
                connector_method_id = obj.getString("connector_method_id");
            }
        }
        return connector_method_id;
    }
}
