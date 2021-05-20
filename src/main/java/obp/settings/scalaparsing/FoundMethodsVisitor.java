package obp.settings.scalaparsing;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FoundMethodsVisitor  {

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

}
