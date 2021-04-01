package org.obp.util;

import java.util.Arrays;
import java.util.List;

public class ParsingUtil {
    public static String getScalaMethodName(String scalaCode){
        String[] split = scalaCode.split("(\n|\r|\t| )+");
        if (split.length<=1){
            return "";
        }

        List<String> strings = Arrays.asList(split);

        if (strings.stream().filter(token->token.equals("def")).count()==0){
            return null;

        }

        int indexDef = strings.indexOf("def");
        return null;
    }
}
