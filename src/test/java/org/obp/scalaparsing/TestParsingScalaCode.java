package org.obp.scalaparsing;

import obp.settings.scalaparsing.FoundMethodsVisitor;
import obp.settings.scalaparsing.ScalaFunction;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestParsingScalaCode {
    @Test
    public void testEmptyFunction() throws IOException {
        assertEquals(0, FoundMethodsVisitor.parseScalaFunction("").size());
    }

    @Test
    public void testHelloWorldFunction() throws IOException {
        assertEquals(1,FoundMethodsVisitor.parseScalaFunction("def hello = println(\"Hello, world!\")").size());
    }

    @Test
    public void testHelloWorldFunctionWithBracket() throws IOException {
        List<ScalaFunction> scalaFunctions = FoundMethodsVisitor.parseScalaFunction("{def hello = println(\"Hello, world!\")}");
        assertEquals(1, scalaFunctions.size());
        ScalaFunction scalaFunction = scalaFunctions.get(0);
        assertEquals("hello",scalaFunction.getFunctionName());
        assertEquals("println(\"Hello, world!\")",scalaFunction.getCodeText());

    }

    @Test
    public void testGetMethodWithParams() throws IOException {
        List<ScalaFunction> scalaFunctions = FoundMethodsVisitor.parseScalaFunction("override def getBank(bankId: BankId, callContext: Option[CallContext]): Future[Box[(Bank, Option[CallContext])]] = Future.successful(\n" +
                "    Full((BankCommons(\n" +
                "      BankId(\"Hello bank id\"),\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"8\"\n" +
                "    ), None))\n" +
                "  )"
               );
        assertEquals(1, scalaFunctions.size());
        ScalaFunction scalaFunction = scalaFunctions.get(0);
        assertEquals("getBank",scalaFunction.getFunctionName());
        assertEquals("Future.successful(Full((BankCommons(BankId(\"Hello bank id\"),\"1\",\"1\",\"1\",\"1\",\"1\",\"1\",\"1\",\"8\"),None)))",scalaFunction.getCodeText());


    }

    @Test
    public void testSeveralMethods() throws IOException {
        List<ScalaFunction> scalaFunctions = FoundMethodsVisitor.parseScalaFunction("override def getBank(bankId: BankId, callContext: Option[CallContext]): Future[Box[(Bank, Option[CallContext])]] = Future.successful(\n" +
                "    Full((BankCommons(\n" +
                "      BankId(\"Hello bank id\"),\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"8\"\n" +
                "    ), None))\n" +
                "  )" +
                "" +
                "override def getAtm(bankId: BankId, atmId: AtmId, callContext: Option[CallContext]): Future[Box[(AtmT, Option[CallContext])]] = \n" +
                "  {\n" +
                "      import com.openbankproject.commons.model._\n" +
                "     Future.successful(\n" +
                "      Full(code.bankconnectors.vSept2018.InboundAtmSept2018(\n" +
                "        atmId = AtmId(\"1\"),\n" +
                "        bankId = BankId(\"2\"),\n" +
                "        name = \"\",\n" +
                "        address =  com.openbankproject.commons.model.Address(line1 = \"\",\n" +
                "          line2 = \"\",\n" +
                "          line3 = \"\",\n" +
                "          city = \"\",\n" +
                "          county = Some(\"\"),\n" +
                "          state = \"\",\n" +
                "          postCode = \"\",\n" +
                "          //ISO_3166-1_alpha-2\n" +
                "          countryCode = \"\"),\n" +
                "        location = com.openbankproject.commons.model.Location(11,11, None,None),\n" +
                "        meta = com.openbankproject.commons.model.Meta(\n" +
                "          com.openbankproject.commons.model.License(id = \"pddl\", name = \"Open Data Commons Public Domain Dedication and License (PDDL)\")),\n" +
                "        OpeningTimeOnMonday = Some(\"\"),\n" +
                "        ClosingTimeOnMonday = Some(\"\"),\n" +
                "\n" +
                "        OpeningTimeOnTuesday = Some(\"\"),\n" +
                "        ClosingTimeOnTuesday = Some(\"\"),\n" +
                "\n" +
                "        OpeningTimeOnWednesday = Some(\"\"),\n" +
                "        ClosingTimeOnWednesday = Some(\"\"),\n" +
                "\n" +
                "        OpeningTimeOnThursday = Some(\"\"),\n" +
                "        ClosingTimeOnThursday = Some(\"\"),\n" +
                "\n" +
                "        OpeningTimeOnFriday = Some(\"\"),\n" +
                "        ClosingTimeOnFriday = Some(\"\"),\n" +
                "\n" +
                "        OpeningTimeOnSaturday  = Some(\"\"),\n" +
                "        ClosingTimeOnSaturday = Some(\"\"),\n" +
                "\n" +
                "        OpeningTimeOnSunday = Some(\"\"),\n" +
                "        ClosingTimeOnSunday = Some(\"\"),\n" +
                "        isAccessible = Some(true),\n" +
                "\n" +
                "        locatedAt = Some(\"\"),\n" +
                "        moreInfo = Some(\"\"),\n" +
                "        hasDepositCapability = Some(true)\n" +
                "      ), None)\n" +
                "    )\n" +
                "  }"
        );
        assertEquals(2, scalaFunctions.size());
        ScalaFunction scalaFunction = scalaFunctions.get(0);
        assertEquals("getBank",scalaFunction.getFunctionName());
        assertEquals("Future.successful(\n" +
                "    Full((BankCommons(\n" +
                "      BankId(\"Hello bank id\"),\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"1\",\n" +
                "      \"8\"\n" +
                "    ), None))\n" +
                "  )",scalaFunction.getCodeText());
        scalaFunction = scalaFunctions.get(1);
        assertEquals("getAtm",scalaFunction.getFunctionName());
        assertEquals("{\n" +
                "      import com.openbankproject.commons.model._\n" +
                "     Future.successful(\n" +
                "      Full(code.bankconnectors.vSept2018.InboundAtmSept2018(\n" +
                "        atmId = AtmId(\"1\"),\n" +
                "        bankId = BankId(\"2\"),\n" +
                "        name = \"\",\n" +
                "        address =  com.openbankproject.commons.model.Address(line1 = \"\",\n" +
                "          line2 = \"\",\n" +
                "          line3 = \"\",\n" +
                "          city = \"\",\n" +
                "          county = Some(\"\"),\n" +
                "          state = \"\",\n" +
                "          postCode = \"\",\n" +
                "          //ISO_3166-1_alpha-2\n" +
                "          countryCode = \"\"),\n" +
                "        location = com.openbankproject.commons.model.Location(11,11, None,None),\n" +
                "        meta = com.openbankproject.commons.model.Meta(\n" +
                "          com.openbankproject.commons.model.License(id = \"pddl\", name = \"Open Data Commons Public Domain Dedication and License (PDDL)\")),\n" +
                "        OpeningTimeOnMonday = Some(\"\"),\n" +
                "        ClosingTimeOnMonday = Some(\"\"),\n" +
                "\n" +
                "        OpeningTimeOnTuesday = Some(\"\"),\n" +
                "        ClosingTimeOnTuesday = Some(\"\"),\n" +
                "\n" +
                "        OpeningTimeOnWednesday = Some(\"\"),\n" +
                "        ClosingTimeOnWednesday = Some(\"\"),\n" +
                "\n" +
                "        OpeningTimeOnThursday = Some(\"\"),\n" +
                "        ClosingTimeOnThursday = Some(\"\"),\n" +
                "\n" +
                "        OpeningTimeOnFriday = Some(\"\"),\n" +
                "        ClosingTimeOnFriday = Some(\"\"),\n" +
                "\n" +
                "        OpeningTimeOnSaturday  = Some(\"\"),\n" +
                "        ClosingTimeOnSaturday = Some(\"\"),\n" +
                "\n" +
                "        OpeningTimeOnSunday = Some(\"\"),\n" +
                "        ClosingTimeOnSunday = Some(\"\"),\n" +
                "        isAccessible = Some(true),\n" +
                "\n" +
                "        locatedAt = Some(\"\"),\n" +
                "        moreInfo = Some(\"\"),\n" +
                "        hasDepositCapability = Some(true)\n" +
                "      ), None)\n" +
                "    )\n" +
                "  }",scalaFunction.getCodeText());

    }
}
