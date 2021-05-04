package org.obp.scalaparsing;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestParsingScalaCode {
    private static String EXCEPTION_STRING="override def getBank(bankId: BankId, callContext: Option[CallContext]): Future[Box[(Bank, Option[CallContext])]] = Future.successful(\n" +
            "      Full((BankCommons(\n" +
            "        BankId(\"OBP-IntelliJ-plugin-test-bank-id\"),\n" +
            "        \"4\",\n" +
            "        \"2\",\n" +
            "        \"2\",\n" +
            "        \"2\",\n" +
            "        \"2\",\n" +
            "        \"2\",\n" +
            "        \"2\",\n" +
            "        \"2\"\n" +
            "      ), None))\n" +
            "    )\n" +
            "\n" +
            "    override  def getBankAccountsForUser(username: String, callContext: Option[CallContext]) : Future[Box[(List[InboundAccount], Option[CallContext])]] = {\n" +
            "      import scala.xml.{Elem, NodeSeq}\n" +
            "      import code.adapter.soap._\n" +
            "      import scala.concurrent._\n" +
            "      import scala.concurrent.duration._\n" +
            "      import net.liftweb.common.{Box, Failure, Full}\n" +
            "      import com.openbankproject.commons.model._\n" +
            "      import code.adapter.soap.accounts.{Basic, ListAccounts, ListAccountsQuery}\n" +
            "      import code.adapter.soap.customers.{GetCustomer,ListCustomers, ListCustomersQuery, RequestHeaders}\n" +
            "      import code.adapter.soap.accounts.ListAccountsOutput\n" +
            "      import code.customer.CustomerX\n" +
            "      import com.openbankproject.commons.model._\n" +
            "      import code.api.util.{CallContext, DynamicUtil, NewStyle}\n" +
            "      import code.api.util.ErrorMessages._\n" +
            "      import code.util.Helper\n" +
            "      import scala.xml.{Elem, NodeSeq}\n" +
            "      import net.liftweb.common.{Box, Failure, Full}\n" +
            "      import com.openbankproject.commons.model._\n" +
            "      import com.openbankproject.commons.model.enums.StrongCustomerAuthentication\n" +
            "      import scala.concurrent._\n" +
            "      import net.liftweb.common.{Box, Empty, _}\n" +
            "      import net.liftweb.json\n" +
            "      import net.liftweb.json.Extraction.decompose\n" +
            "      import net.liftweb.json.JsonDSL._\n" +
            "      import net.liftweb.json.JsonParser.ParseException\n" +
            "      import net.liftweb.json.{JValue, _}\n" +
            "      import net.liftweb.util.Helpers.tryo\n" +
            "      import net.liftweb.util.Mailer\n" +
            "      import net.liftweb.util.Mailer._\n" +
            "      import org.apache.commons.lang3.StringUtils\n" +
            "      import scala.collection.immutable.List\n" +
            "      import scala.collection.mutable.ArrayBuffer\n" +
            "      import scala.concurrent.duration._\n" +
            "      import scala.concurrent.{Await, Future}\n" +
            "      import scala.language.postfixOps\n" +
            "      import scala.reflect.runtime.universe._\n" +
            "      import scala.xml.{Elem, NodeSeq}\n" +
            "      import code.adapter.soap._\n" +
            "      import scala.concurrent._\n" +
            "      import scala.concurrent.duration._\n" +
            "      import net.liftweb.common.{Box, Failure, Full}\n" +
            "      import java.util.Date\n" +
            "      import scala.util.Success\n" +
            "      import code.context.UserAuthContextProvider\n" +
            "      import code.adapter.soap._\n" +
            "      import code.adapter.soap.customers._\n" +
            "\n" +
            "      val customersService = code.api.v3_0_0.custom.SoapClients.customersService\n" +
            "      val accountsService = code.api.v3_0_0.custom.SoapClients.accountsService\n" +
            "\n" +
            "      for {\n" +
            "        //we need first to get all possible userAuthContext keys:customerId or PIN or TaxpayerId. If none of them is existing, we need to show the error back.\n" +
            "        userAuthContextList <- NewStyle.function.tryons(s\"$InvalidAuthContextUpdateRequestKey. Please check the UserAuthContext, please provide: customerId or PIN or TaxpayerId.\", 400, callContext) {\n" +
            "          callContext.map(_.toOutboundAdapterCallContext.outboundAdapterAuthInfo.map(_.userAuthContext)).flatten.flatten.map(\n" +
            "            userAuthContextList => userAuthContextList.filter(\n" +
            "              userAuthContex => userAuthContex.key.equals(\"customerId\") || userAuthContex.key.equals(\"PIN\")|| userAuthContex.key.equals(\"TaxpayerId\"))\n" +
            "          ).get\n" +
            "        }\n" +
            "\n" +
            "        //If user provide us customerId, we use it directly, else if they provide us the PIN, we need to get it from soap call,\n" +
            "        cbsCustomerIds <- userAuthContextList match {\n" +
            "          case userAuthContextList if(userAuthContextList.find(_.key.equals(\"customerId\")).isDefined) =>\n" +
            "            val customerId= userAuthContextList.find(_.key.equals(\"customerId\")).head.value\n" +
            "            NewStyle.function.tryons(s\"$InvalidAuthContextUpdateRequestKey. Current customerId($customerId) format is invalid. It should be cast to Integer\", 400, callContext) {\n" +
            "              List(customerId.toInt)\n" +
            "            }\n" +
            "          case userAuthContextList if(userAuthContextList.find(_.key.equals(\"PIN\")).isDefined) => {\n" +
            "            val pin = userAuthContextList.find(_.key.equals(\"PIN\")).head.value\n" +
            "            customersService.listCustomers(\n" +
            "              ListCustomers(Some(Some(ListCustomersQuery(PIN = Some(Some(pin)))))\n" +
            "              ),\n" +
            "              Some(code.adapter.soap.customers.RequestHeaders(\n" +
            "                ApplicationKey = Some(\"OB_API_TEST\"),\n" +
            "                RequestId = Some(\"20210301001\"),\n" +
            "              ))\n" +
            "            )//get the customerId from the soap response.\n" +
            "              .map(_.listCustomersResponse.Result.flatten.map(_.Customer.filter(_.isDefined).map(_.get)).getOrElse(Nil).map(_.Id).flatten.filter(_.isDefined).map(_.get))\n" +
            "              .recoverWith {\n" +
            "                case e: Exception => Future.failed(new Exception(s\"$InvalidConnectorResponse Soap listCustomers call failed, current PIN($pin).\", e))\n" +
            "              }\n" +
            "          }\n" +
            "          case userAuthContextList if(userAuthContextList.find(_.key.equals(\"TaxpayerId\")).isDefined) => {\n" +
            "            val taxpayerIdValue = userAuthContextList.find(_.key.equals(\"TaxpayerId\")).head.value\n" +
            "            customersService.listCustomers(\n" +
            "              ListCustomers(Some(Some(ListCustomersQuery(TaxpayerId = Some(Some(taxpayerIdValue)))))\n" +
            "              ),\n" +
            "              Some(code.adapter.soap.customers.RequestHeaders(\n" +
            "                ApplicationKey = Some(\"OB_API_TEST\"),\n" +
            "                RequestId = Some(\"20210301001\"),\n" +
            "              ))\n" +
            "            )//get the customerId from the soap response.\n" +
            "              .map(_.listCustomersResponse.Result.flatten.map(_.Customer.filter(_.isDefined).map(_.get)).getOrElse(Nil).map(_.Id).flatten.filter(_.isDefined).map(_.get))\n" +
            "              .recoverWith {\n" +
            "                case e: Exception => Future.failed(new Exception(s\"$InvalidConnectorResponse Soap listCustomers call failed, current TaxpayerId($taxpayerIdValue)\", e))\n" +
            "              }\n" +
            "          }\n" +
            "          case _ => Future{List.empty[Int]}\n" +
            "        }\n" +
            "\n" +
            "        //Here we update the userAuthContext if the user only provide us the PIN or TaxpayerId\n" +
            "        _ <- NewStyle.function.tryons(s\"$InvalidAuthContextUpdateRequestKey. Please check the UserAuthContext, please provide: customerId or PIN or TaxpayerId.\", 400, callContext) {\n" +
            "          if(userAuthContextList.find(_.key.equals(\"PIN\")).isDefined || userAuthContextList.find(_.key.equals(\"TaxpayerId\")).isDefined) {\n" +
            "            val customerIdUserAuthContext = cbsCustomerIds.map(cbsCustomerId => BasicUserAuthContext(\"customerId\",cbsCustomerId.toString)).toList\n" +
            "            val userId = callContext.map(_.userId).get\n" +
            "            UserAuthContextProvider.userAuthContextProvider.vend.createOrUpdateUserAuthContexts(userId, customerIdUserAuthContext).head\n" +
            "          } else {Future{}}\n" +
            "        }\n" +
            "\n" +
            "        listAccountsServiceResponseFutureList = cbsCustomerIds.map(cbsCustomerId => accountsService.listAccounts(\n" +
            "          ListAccounts(Some(Some(ListAccountsQuery(\n" +
            "            CustomerId = Some(Some(cbsCustomerId)),\n" +
            "          )))),\n" +
            "          Some(code.adapter.soap.accounts.RequestHeaders(\n" +
            "            ApplicationKey = Some(\"OB_API_TEST\"),\n" +
            "            RequestId = Some(\"AK_20210203001\")\n" +
            "          ))).recoverWith {\n" +
            "          case e: Exception => Future.failed(new Exception(s\"$InvalidConnectorResponse Soap listAccounts call failed cbsCustomerId($cbsCustomerId)\", e))\n" +
            "        }).toList\n" +
            "\n" +
            "        listAccountsServiceResponseList <- Future.sequence(listAccountsServiceResponseFutureList.map(_.transform(Success(_)))).map(_.collect{case Success(x)=>x})\n" +
            "        cbsAccounts = listAccountsServiceResponseList.map(_.listAccountsResponse.Result.flatten.map(_.Account.filter(_.isDefined).map(_.get)).getOrElse(Nil).toList).flatten\n" +
            "\n" +
            "//        Filter accounts: only account.type == 100 , account.type == 101, account.type == 200 && account.subtype != 26\n" +
            "        cbsAccountsFiltered= cbsAccounts.filter(cbsAccount =>(\n" +
            "          cbsAccount.Type.equals(Some(Some(100))) ||\n" +
            "            cbsAccount.Type.equals(Some(Some(101))) ||\n" +
            "            (cbsAccount.Type.equals(Some(Some(200))) && !cbsAccount.Subtype.equals(Some(Some(26))))\n" +
            "          )\n" +
            "        )\n" +
            "      } yield {\n" +
            "        (\n" +
            "          Full(cbsAccountsFiltered.map(cbsAccount => InboundAccountCommons(\n" +
            "            bankId = \"finca.ge\",\n" +
            "            accountId = cbsAccount.Id.flatten.getOrElse(\"\").toString,\n" +
            "            viewsToGenerate = List(\"owner\"),\n" +
            "            accountNumber = cbsAccount.AccountNumber.flatten.getOrElse(\"\").toString,\n" +
            "            accountType =cbsAccount.Type.flatten.getOrElse(\"\").toString,\n" +
            "            balanceAmount = cbsAccount.Balance.getOrElse(\"\").toString,\n" +
            "            balanceCurrency = cbsAccount.Ccy.flatten.getOrElse(\"\").toString,\n" +
            "            owners = List(\"\"),\n" +
            "            branchId = cbsAccount.BranchId.flatten.getOrElse(\"\").toString,\n" +
            "            bankRoutingScheme = \"BANK-ID\",\n" +
            "            bankRoutingAddress = \"finca.ge\",\n" +
            "            branchRoutingScheme = \"BRANCH-ID\",\n" +
            "            branchRoutingAddress = cbsAccount.BranchId.flatten.getOrElse(\"\").toString,\n" +
            "            accountRoutingScheme = \"iban\",\n" +
            "            accountRoutingAddress = cbsAccount.IBAN.flatten.getOrElse(\"\").toString,\n" +
            "          )).map(Helper.convertToId(_)), callContext))\n" +
            "      }\n" +
            "    }\n" +
            "\n" +
            "    override def getCustomersByUserId(userId: String, callContext: Option[CallContext]): Future[Box[(List[Customer], Option[CallContext])]] ={\n" +
            "      import code.customer.CustomerX\n" +
            "      import com.openbankproject.commons.model._\n" +
            "      import code.api.util.{CallContext, DynamicUtil, NewStyle}\n" +
            "      import code.api.util.ErrorMessages._\n" +
            "      import code.util.Helper\n" +
            "      import scala.xml.{Elem, NodeSeq}\n" +
            "      import net.liftweb.common.{Box, Failure, Full}\n" +
            "      import com.openbankproject.commons.model._\n" +
            "      import com.openbankproject.commons.model.enums.StrongCustomerAuthentication\n" +
            "      import scala.concurrent._\n" +
            "      import net.liftweb.common.{Box, Empty, _}\n" +
            "      import net.liftweb.json\n" +
            "      import net.liftweb.json.Extraction.decompose\n" +
            "      import net.liftweb.json.JsonDSL._\n" +
            "      import net.liftweb.json.JsonParser.ParseException\n" +
            "      import net.liftweb.json.{JValue, _}\n" +
            "      import net.liftweb.util.Helpers.tryo\n" +
            "      import net.liftweb.util.Mailer\n" +
            "      import net.liftweb.util.Mailer._\n" +
            "      import org.apache.commons.lang3.StringUtils\n" +
            "      import scala.collection.immutable.List\n" +
            "      import scala.collection.mutable.ArrayBuffer\n" +
            "      import scala.concurrent.duration._\n" +
            "      import scala.concurrent.{Await, Future}\n" +
            "      import scala.language.postfixOps\n" +
            "      import scala.reflect.runtime.universe._\n" +
            "      import scala.xml.{Elem, NodeSeq}\n" +
            "      import code.adapter.soap._\n" +
            "      import scala.concurrent._\n" +
            "      import scala.concurrent.duration._\n" +
            "      import net.liftweb.common.{Box, Failure, Full}\n" +
            "      import java.util.Date\n" +
            "      import code.context.UserAuthContextProvider\n" +
            "      import code.adapter.soap._\n" +
            "      import code.adapter.soap.customers._\n" +
            "\n" +
            "      val adapterCallContext = callContext.map(_.toOutboundAdapterCallContext.outboundAdapterAuthInfo.map(_.userAuthContext)).flatten.flatten\n" +
            "      val customerId = adapterCallContext.map(_.find(_.key.equals(\"customerId\"))).flatten.map(_.value).getOrElse(\"\")\n" +
            "\n" +
            "      for {\n" +
            "        customersService <- Future{code.api.v3_0_0.custom.SoapClients.customersService}\n" +
            "\n" +
            "        listCustomersServiceResponse <- customersService.listCustomers(\n" +
            "          ListCustomers(Some(Some(ListCustomersQuery(Id = Some(Some(customerId.toInt)))))\n" +
            "          ),\n" +
            "          Some(code.adapter.soap.customers.RequestHeaders(\n" +
            "            ApplicationKey = Some(\"OB_API_TEST\"),\n" +
            "            RequestId = Some(\"20210301001\"),\n" +
            "          ))\n" +
            "        ).recoverWith {\n" +
            "          case e: Exception => Future.failed(new Exception(s\"$InvalidConnectorResponse Soap listCustomers call failed current customerId($customerId)\", e))\n" +
            "        }\n" +
            "\n" +
            "        cbsCustomers = listCustomersServiceResponse.listCustomersResponse.Result.flatten.map(_.Customer.filter(_.isDefined).map(_.get)).getOrElse(Nil).toList\n" +
            "\n" +
            "      } yield {\n" +
            "        (\n" +
            "          Full(cbsCustomers.map(customer => CustomerCommons(\n" +
            "            customerId = customer.Id.flatten.getOrElse(\"\").toString,\n" +
            "            bankId = \"finca.ge\",\n" +
            "            number = \"String\",\n" +
            "            legalName = \"String\",\n" +
            "            mobileNumber = \"String\",\n" +
            "            email = \"String\",\n" +
            "            faceImage  = CustomerFaceImage(new Date(),\"String\"),\n" +
            "            dateOfBirth = new Date(),\n" +
            "            relationshipStatus = \"String\",\n" +
            "            dependents = 5,\n" +
            "            dobOfDependents = List(new Date()),\n" +
            "            highestEducationAttained = \"String\",\n" +
            "            employmentStatus = \"String\",\n" +
            "            creditRating  = CreditRating(\"String\",\"String\"),\n" +
            "            creditLimit = CreditLimit(\"String\",\"String\"),\n" +
            "            kycStatus = true,\n" +
            "            lastOkDate = new Date(),\n" +
            "            title = \"String\",\n" +
            "            branchId = customer.BranchId.flatten.getOrElse(\"\").toString,\n" +
            "            nameSuffix = \"String\")).map(Helper.convertToId(_)),callContext)\n" +
            "          )\n" +
            "      }\n" +
            "    }\n" +
            "\n" +
            "    override def validateUserAuthContextUpdateRequest(bankId: String,userId: String,key: String,value: String,scaMethod: String, callContext: Option[CallContext]): OBPReturnType[Box[UserAuthContextUpdate]] = {\n" +
            "\n" +
            "      import code.api.util.APIUtil.OBPReturnType\n" +
            "      import code.api.util.{CallContext, DynamicUtil, NewStyle}\n" +
            "      import code.api.util.ErrorMessages._\n" +
            "      import code.util.Helper\n" +
            "      import scala.concurrent.duration._\n" +
            "      import scala.xml.{Elem, NodeSeq}\n" +
            "      import net.liftweb.common.{Box, Failure, Full}\n" +
            "      import com.openbankproject.commons.model._\n" +
            "      import com.openbankproject.commons.model.enums.StrongCustomerAuthentication\n" +
            "\n" +
            "      import scala.concurrent._\n" +
            "      import net.liftweb.common.{Box, Empty, _}\n" +
            "      import net.liftweb.json\n" +
            "      import net.liftweb.json.Extraction.decompose\n" +
            "      import net.liftweb.json.JsonDSL._\n" +
            "      import net.liftweb.json.JsonParser.ParseException\n" +
            "      import net.liftweb.json.{JValue, _}\n" +
            "      import net.liftweb.util.Helpers.tryo\n" +
            "      import net.liftweb.util.Mailer\n" +
            "      import net.liftweb.util.Mailer._\n" +
            "      import org.apache.commons.lang3.StringUtils\n" +
            "      import scala.collection.immutable.List\n" +
            "      import scala.collection.mutable.ArrayBuffer\n" +
            "      import scala.concurrent.duration._\n" +
            "      import scala.concurrent.{Await, Future}\n" +
            "      import scala.language.postfixOps\n" +
            "      import scala.reflect.runtime.universe._\n" +
            "\n" +
            "      import code.adapter.soap._\n" +
            "      import code.adapter.soap.accounts._\n" +
            "      import code.adapter.soap.customers._\n" +
            "\n" +
            "\n" +
            "      val customersService = code.api.v3_0_0.custom.SoapClients.customersService\n" +
            "      for {\n" +
            "\n" +
            "        _ <- Helper.booleanToFuture(s\"$InvalidAuthContextUpdateRequestKey. Current Sandbox only support key == PIN or TaxpayerId\") {\n" +
            "          key.equals(\"PIN\") || key.equals(\"TaxpayerId\")\n" +
            "        }\n" +
            "        //1st: check if the customer is existing\n" +
            "        listCustomersServiceResponse <- if(key.equals(\"PIN\")){\n" +
            "          customersService.listCustomers(\n" +
            "            ListCustomers(Some(Some(ListCustomersQuery(PIN = Some(Some(value)))))\n" +
            "            ),\n" +
            "            Some(code.adapter.soap.customers.RequestHeaders(\n" +
            "              ApplicationKey = Some(\"OB_API_TEST\"),\n" +
            "              RequestId = Some(\"20210301001\"),\n" +
            "            ))\n" +
            "          ).recoverWith {\n" +
            "            case e: Exception => Future.failed(new Exception(s\"$InvalidConnectorResponse Soap listCustomers call failed, current PIN($value)\", e))\n" +
            "          }} else {\n" +
            "            customersService.listCustomers(\n" +
            "              ListCustomers(Some(Some(ListCustomersQuery(TaxpayerId = Some(Some(value)))))\n" +
            "              ),\n" +
            "              Some(code.adapter.soap.customers.RequestHeaders(\n" +
            "                ApplicationKey = Some(\"OB_API_TEST\"),\n" +
            "                RequestId = Some(\"20210301001\"),\n" +
            "              ))\n" +
            "            ).recoverWith {\n" +
            "              case e: Exception => Future.failed(new Exception(s\"$InvalidConnectorResponse Soap listCustomers call failed, current TaxpayerId($value)\", e))\n" +
            "          }\n" +
            "        }\n" +
            "        //2rd: if the customer is existing, we can create the userAuthContextUpdateChallenge\n" +
            "        (userAuthContextUpdate, callContext) <- NewStyle.function.createUserAuthContextUpdate(userId, key, value, callContext)\n" +
            "\n" +
            "        //3rd: send the challenge to the user.\n" +
            "//        customerEmail <- NewStyle.function.tryons(s\"${InvalidAuthContextUpdateRequestKey.replace(\"Request Key.\", \"Request Value.\")} Can not find Email for this PIN($value) \", 400, callContext) {\n" +
            "//          listCustomersServiceResponse.listCustomersResponse.Result.flatten.map(_.Customer.head.map(_.ContactInfo.flatten.map(_.Email))).flatten.flatten.flatten.flatten.head\n" +
            "//        }\n" +
            "\n" +
            "        customerEmail =\"sandbox-test@tesobe.com\"\n" +
            "        tesobeEmailForTesting =\"hongwei@tesobe.com\"\n" +
            "\n" +
            "        _ <- Future {\n" +
            "          val params = List(To(tesobeEmailForTesting)) ++ List(PlainMailBodyType(userAuthContextUpdate.challenge))\n" +
            "            Mailer.sendMail(\n" +
            "                From(\"challenge@tesobe.com\"),\n" +
            "                Subject(\"Challenge request\"),\n" +
            "                params: _*\n" +
            "              )\n" +
            "          }\n" +
            "\n" +
            "        _ <- Future {\n" +
            "          scaMethod match {\n" +
            "            case v if v == StrongCustomerAuthentication.EMAIL.toString => // Send the email\n" +
            "              val params = List(To(customerEmail)) ++ List(PlainMailBodyType(userAuthContextUpdate.challenge))\n" +
            "                Mailer.sendMail(\n" +
            "                From(\"challenge@tesobe.com\"),\n" +
            "                Subject(\"Challenge request\"),\n" +
            "                params: _*\n" +
            "              )\n" +
            "            case v if v == StrongCustomerAuthentication.SMS.toString => // Not implemented\n" +
            "            case _ => // Not handled\n" +
            "          }\n" +
            "        }\n" +
            "      } yield {\n" +
            "        (Full(userAuthContextUpdate), callContext)\n" +
            "      }\n" +
            "\n" +
            "    }";

    @Test(expected = Test.None.class /* no exception expected */)
    public void testEmptyFunction() throws IOException {

        List<ScalaFunction> scalaFunctions = FoundMethodsVisitor.parseScalaFunction(EXCEPTION_STRING);
        assertEquals(2,scalaFunctions.size());
        System.out.println(scalaFunctions.get(1).getCodeText());

    }


    @Test
    public void testHelloWorldFunction() throws IOException {
        assertEquals(1,FoundMethodsVisitor.parseScalaFunction("def hello = println(\"Hello, world!\")").size());
    }

    @Test
    public void testNoErrorFunction() throws IOException {
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
