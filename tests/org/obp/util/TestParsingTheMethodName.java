package org.obp.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestParsingTheMethodName {

    public static final String SCALA_CODE = "override def getAtm(bankId: BankId, atmId: AtmId, callContext: Option[CallContext]): Future[Box[(AtmT, Option[CallContext])]] =\n" +
            "         {\n" +
            "         import com.openbankproject.commons.model._\n" +
            "         Future.successful(\n" +
            "         Full(code.bankconnectors.vSept2018.InboundAtmSept2018(\n" +
            "         atmId = AtmId(\"1\"),\n" +
            "         bankId = BankId(\"2\"),\n" +
            "         name = \"\",\n" +
            "         address =  com.openbankproject.commons.model.Address(line1 = \"\",\n" +
            "         line2 = \"\",\n" +
            "         line3 = \"\",\n" +
            "         city = \"\",\n" +
            "         county = Some(\"\"),\n" +
            "         state = \"\",\n" +
            "         postCode = \"\",\n" +
            "         //ISO_3166-1_alpha-2\n" +
            "         countryCode = \"\"),\n" +
            "         location = com.openbankproject.commons.model.Location(11,11, None,None),\n" +
            "         meta = com.openbankproject.commons.model.Meta(\n" +
            "         com.openbankproject.commons.model.License(id = \"pddl\", name = \"Open Data Commons Public Domain Dedication and License (PDDL)\")),\n" +
            "         OpeningTimeOnMonday = Some(\"\"),\n" +
            "         ClosingTimeOnMonday = Some(\"\"),\n" +
            "\n" +
            "         OpeningTimeOnTuesday = Some(\"\"),\n" +
            "         ClosingTimeOnTuesday = Some(\"\"),\n" +
            "\n" +
            "         OpeningTimeOnWednesday = Some(\"\"),\n" +
            "         ClosingTimeOnWednesday = Some(\"\"),\n" +
            "\n" +
            "         OpeningTimeOnThursday = Some(\"\"),\n" +
            "         ClosingTimeOnThursday = Some(\"\"),\n" +
            "\n" +
            "         OpeningTimeOnFriday = Some(\"\"),\n" +
            "         ClosingTimeOnFriday = Some(\"\"),\n" +
            "\n" +
            "         OpeningTimeOnSaturday  = Some(\"\"),\n" +
            "         ClosingTimeOnSaturday = Some(\"\"),\n" +
            "\n" +
            "         OpeningTimeOnSunday = Some(\"\"),\n" +
            "         ClosingTimeOnSunday = Some(\"\"),\n" +
            "         isAccessible = Some(true),\n" +
            "\n" +
            "         locatedAt = Some(\"\"),\n" +
            "         moreInfo = Some(\"\"),\n" +
            "         hasDepositCapability = Some(true)\n" +
            "         ), None)\n" +
            "         )\n" +
            "         }";

    @Test
    public void testTheEmptyMethod(){
            assertEquals("",ParsingUtil.getScalaMethodName(""));
    }

    @Test
    public void testOnlySpacesMethod(){
        assertEquals("",ParsingUtil.getScalaMethodName("\n\r\t    "));
    }

    @Test
    public void testNoMethodNameAfterDef(){
        assertEquals("",ParsingUtil.getScalaMethodName("\n\r\t   def "));
    }

    @Test
    public void testGetMethodName(){
        assertEquals("method",ParsingUtil.getScalaMethodName("\n\r\t   def method"));
    }

    @Test
    public void testGetRealMethodName(){
        assertEquals("getBank",ParsingUtil.getScalaMethodName("override def getBank(bankId: BankId, callContext: Option[CallContext]): Future[Box[(Bank, Option[CallContext])]] = Future.successful(\n" +
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
                "  )"));
    }
    @Test
    public void testMethodWithoutParameters(){
        assertEquals("hello",ParsingUtil.getScalaMethodName("@main def hello = println(\"Hello, world!\")"));
    }

    @Test
    public void testMethodWithoutParametersWithSpace(){
        assertEquals("hello",ParsingUtil.getScalaMethodName("@main def hello= println(\"Hello, world!\")"));
    }
    @Test
    public void testATMMethod(){
        assertEquals("getAtm",ParsingUtil.getScalaMethodName(SCALA_CODE));
    }

    @Test
    public void testRemoveOverride(){
        assertEquals(" def getAtm(bankId: BankId, atmId: AtmId, callContext: Option[CallContext]): Future[Box[(AtmT, Option[CallContext])]] =\n" +
                "         {\n" +
                "         import com.openbankproject.commons.model._\n" +
                "         Future.successful(\n" +
                "         Full(code.bankconnectors.vSept2018.InboundAtmSept2018(\n" +
                "         atmId = AtmId(\"1\"),\n" +
                "         bankId = BankId(\"2\"),\n" +
                "         name = \"\",\n" +
                "         address =  com.openbankproject.commons.model.Address(line1 = \"\",\n" +
                "         line2 = \"\",\n" +
                "         line3 = \"\",\n" +
                "         city = \"\",\n" +
                "         county = Some(\"\"),\n" +
                "         state = \"\",\n" +
                "         postCode = \"\",\n" +
                "         //ISO_3166-1_alpha-2\n" +
                "         countryCode = \"\"),\n" +
                "         location = com.openbankproject.commons.model.Location(11,11, None,None),\n" +
                "         meta = com.openbankproject.commons.model.Meta(\n" +
                "         com.openbankproject.commons.model.License(id = \"pddl\", name = \"Open Data Commons Public Domain Dedication and License (PDDL)\")),\n" +
                "         OpeningTimeOnMonday = Some(\"\"),\n" +
                "         ClosingTimeOnMonday = Some(\"\"),\n" +
                "\n" +
                "         OpeningTimeOnTuesday = Some(\"\"),\n" +
                "         ClosingTimeOnTuesday = Some(\"\"),\n" +
                "\n" +
                "         OpeningTimeOnWednesday = Some(\"\"),\n" +
                "         ClosingTimeOnWednesday = Some(\"\"),\n" +
                "\n" +
                "         OpeningTimeOnThursday = Some(\"\"),\n" +
                "         ClosingTimeOnThursday = Some(\"\"),\n" +
                "\n" +
                "         OpeningTimeOnFriday = Some(\"\"),\n" +
                "         ClosingTimeOnFriday = Some(\"\"),\n" +
                "\n" +
                "         OpeningTimeOnSaturday  = Some(\"\"),\n" +
                "         ClosingTimeOnSaturday = Some(\"\"),\n" +
                "\n" +
                "         OpeningTimeOnSunday = Some(\"\"),\n" +
                "         ClosingTimeOnSunday = Some(\"\"),\n" +
                "         isAccessible = Some(true),\n" +
                "\n" +
                "         locatedAt = Some(\"\"),\n" +
                "         moreInfo = Some(\"\"),\n" +
                "         hasDepositCapability = Some(true)\n" +
                "         ), None)\n" +
                "         )\n" +
                "         }",ParsingUtil.removeOverrideKeyWord(SCALA_CODE));
    }
}
