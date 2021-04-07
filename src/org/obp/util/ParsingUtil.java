package org.obp.util;

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

    public static String removeOverrideKeyWord(String methodBody){
        if (methodBody==null) return "";
        String trimmedBody = methodBody.trim();
        return trimmedBody.startsWith("override")?trimmedBody.substring("override".length()):trimmedBody;
    }
}
