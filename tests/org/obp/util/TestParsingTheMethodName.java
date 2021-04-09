package org.obp.util;

import org.json.JSONArray;
import org.json.JSONObject;
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
    
    @Test
    public void testGetConnectorMethodIdFromJSONArray(){
        
        String connectorMethods= "{\n" +
                "    \"connector_methods\": [\n" +
                "        {\n" +
                "            \"connector_method_id\": \"8ef4ddd6-3939-4c77-871f-744016f3a41d\",\n" +
                "            \"method_name\": \"getAtm\",\n" +
                "            \"method_body\": \"%7B%0A%20%20%20%20%20%20import%20com.openbankproject.commons.model._%0A%20%20%20%20%20Future.successful(%0A%20%20%20%20%20%20Full(code.bankconnectors.vSept2018.InboundAtmSept2018(%0A%20%20%20%20%20%20%20%20atmId%20%3D%20AtmId(%221%22)%2C%0A%20%20%20%20%20%20%20%20bankId%20%3D%20BankId(%222%22)%2C%0A%20%20%20%20%20%20%20%20name%20%3D%20%22%22%2C%0A%20%20%20%20%20%20%20%20address%20%3D%20%20com.openbankproject.commons.model.Address(line1%20%3D%20%22%22%2C%0A%20%20%20%20%20%20%20%20%20%20line2%20%3D%20%22%22%2C%0A%20%20%20%20%20%20%20%20%20%20line3%20%3D%20%22%22%2C%0A%20%20%20%20%20%20%20%20%20%20city%20%3D%20%22%22%2C%0A%20%20%20%20%20%20%20%20%20%20county%20%3D%20Some(%22%22)%2C%0A%20%20%20%20%20%20%20%20%20%20state%20%3D%20%22%22%2C%0A%20%20%20%20%20%20%20%20%20%20postCode%20%3D%20%22%22%2C%0A%20%20%20%20%20%20%20%20%20%20%2F%2FISO_3166-1_alpha-2%0A%20%20%20%20%20%20%20%20%20%20countryCode%20%3D%20%22%22)%2C%0A%20%20%20%20%20%20%20%20location%20%3D%20com.openbankproject.commons.model.Location(11%2C11%2C%20None%2CNone)%2C%0A%20%20%20%20%20%20%20%20meta%20%3D%20com.openbankproject.commons.model.Meta(%0A%20%20%20%20%20%20%20%20%20%20com.openbankproject.commons.model.License(id%20%3D%20%22pddl%22%2C%20name%20%3D%20%22Open%20Data%20Commons%20Public%20Domain%20Dedication%20and%20License%20(PDDL)%22))%2C%0A%20%20%20%20%20%20%20%20OpeningTimeOnMonday%20%3D%20Some(%22%22)%2C%0A%20%20%20%20%20%20%20%20ClosingTimeOnMonday%20%3D%20Some(%22%22)%2C%0A%0A%20%20%20%20%20%20%20%20OpeningTimeOnTuesday%20%3D%20Some(%22%22)%2C%0A%20%20%20%20%20%20%20%20ClosingTimeOnTuesday%20%3D%20Some(%22%22)%2C%0A%0A%20%20%20%20%20%20%20%20OpeningTimeOnWednesday%20%3D%20Some(%22%22)%2C%0A%20%20%20%20%20%20%20%20ClosingTimeOnWednesday%20%3D%20Some(%22%22)%2C%0A%0A%20%20%20%20%20%20%20%20OpeningTimeOnThursday%20%3D%20Some(%22%22)%2C%0A%20%20%20%20%20%20%20%20ClosingTimeOnThursday%20%3D%20Some(%22%22)%2C%0A%0A%20%20%20%20%20%20%20%20OpeningTimeOnFriday%20%3D%20Some(%22%22)%2C%0A%20%20%20%20%20%20%20%20ClosingTimeOnFriday%20%3D%20Some(%22%22)%2C%0A%0A%20%20%20%20%20%20%20%20OpeningTimeOnSaturday%20%20%3D%20Some(%22%22)%2C%0A%20%20%20%20%20%20%20%20ClosingTimeOnSaturday%20%3D%20Some(%22%22)%2C%0A%0A%20%20%20%20%20%20%20%20OpeningTimeOnSunday%20%3D%20Some(%22%22)%2C%0A%20%20%20%20%20%20%20%20ClosingTimeOnSunday%20%3D%20Some(%22%22)%2C%0A%20%20%20%20%20%20%20%20isAccessible%20%3D%20Some(true)%2C%0A%0A%20%20%20%20%20%20%20%20locatedAt%20%3D%20Some(%22%22)%2C%0A%20%20%20%20%20%20%20%20moreInfo%20%3D%20Some(%22%22)%2C%0A%20%20%20%20%20%20%20%20hasDepositCapability%20%3D%20Some(true)%0A%20%20%20%20%20%20)%2C%20None)%0A%20%20%20%20)%0A%20%20%7D\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"connector_method_id\": \"ca34ff25-25f0-4c62-be2d-b3627e96d356\",\n" +
                "            \"method_name\": \"getBank\",\n" +
                "            \"method_body\": \"Future.successful(%0AFull((BankCommons(%0ABankId(%22Hello%20bank%20id%22)%2C%0A%221%22%2C%0A%221%22%2C%0A%221%22%2C%0A%221%22%2C%0A%221%22%2C%0A%221%22%2C%0A%221%22%2C%0A%228%22%0A)%2C%20None))%0A)\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        JSONObject connectorMethodsJsonObject = new JSONObject(connectorMethods);
        
        JSONArray connectorMethodsJSONArray = connectorMethodsJsonObject.getJSONArray("connector_methods"); 
        String getAtmConnectorMethodId = ParsingUtil.getConnectorMethodIdFromJSONArray("getAtm", connectorMethodsJSONArray);
        String getBankConnectorMethodId = ParsingUtil.getConnectorMethodIdFromJSONArray("getBank", connectorMethodsJSONArray);
        String getNonExistingMethodId = ParsingUtil.getConnectorMethodIdFromJSONArray("getNonExistingMethodName", connectorMethodsJSONArray);

        assertEquals(getAtmConnectorMethodId, "8ef4ddd6-3939-4c77-871f-744016f3a41d");
        assertEquals(getBankConnectorMethodId, "ca34ff25-25f0-4c62-be2d-b3627e96d356");
        assertEquals(getNonExistingMethodId, "");
        
    }
}
