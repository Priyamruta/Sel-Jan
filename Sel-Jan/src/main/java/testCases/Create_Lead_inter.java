package testCases;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Create_Lead_inter extends SeMethods {

	@Test
	public void Create_LeadMeth()
	{
		//startapp mtd
		startApp("chrome","http://leaftaps.com/opentaps");


		//locating and pass username
		WebElement usernamefld=locateElement("username");
		type(usernamefld,"DemoSalesManager");

		//locating and pass pwd
		WebElement passwordfld = locateElement("password");
		type(passwordfld, "crmsfa");

		//click submit
		WebElement submit = locateElement("class","decorativeSubmit");
		click(submit);


		//click crm link
		WebElement crmlink = locateElement("link","CRM/SFA");
		click(crmlink);


		//click lead link
		WebElement lead = locateElement("link","Leads");
		click(lead);

		//click lead link
		WebElement createLeadlink = locateElement("link","Create Lead");
		click(createLeadlink);

		//locating and pass company name
		WebElement compName = locateElement("createLeadForm_companyName");
		type(compName, "TCS");

		//locating and pass first name
		WebElement firstName = locateElement("createLeadForm_firstName");
		type(firstName, "Rachel");

		//locating and pass last name
		WebElement lastName = locateElement("createLeadForm_lastName");
		type(lastName, "Greene");


		//Locate source DD, click,select by text
		WebElement sourceDD = locateElement("createLeadForm_dataSourceId");
		selectDropDownUsingText(sourceDD, "Direct Mail");

		//parentid
		WebElement parentId = locateElement("createLeadForm_parentPartyId");
		type(parentId, "10102");

		//Marketing DD
		WebElement sourceDDM = locateElement("createLeadForm_marketingCampaignId");
		selectDropDownUsingText(sourceDDM, "eCommerce Site Internal Campaign");

		//firstnamelocal
		WebElement firstNamelocal = locateElement("createLeadForm_firstNameLocal");
		type(firstNamelocal, "Scarlett");

		//lastnamelocal
		WebElement lastNamelocal = locateElement("createLeadForm_lastNameLocal");
		type(lastNamelocal, "Johnson");
		//salutation
		WebElement salute = locateElement("createLeadForm_personalTitle");
		type(salute, "Miss");
		//DOB
		WebElement DOB = locateElement("createLeadForm_birthDate");
		type(DOB, "10/12/1990");
		//title
		WebElement title = locateElement("createLeadForm_generalProfTitle");
		type(title, "Miss");

		//Market
		WebElement dName = locateElement("createLeadForm_departmentName");
		type(dName, "Marketing");

		//Revenue
		WebElement aRevenue=locateElement("createLeadForm_annualRevenue");
		type(aRevenue,"1000000000");


		//Locate source industryDD, click,select by text
		WebElement industryDD = locateElement("createLeadForm_industryEnumId");
		selectDropDownUsingText(industryDD, "Aerospace");

		//Locate source currencyDD, click,select by text
		WebElement currencyDD = locateElement("createLeadForm_currencyUomId");
		selectDropDownUsingText(currencyDD, "INR - Indian Rupee");		

		//Locate source Ownership, click,select by text
		WebElement Ownership = locateElement("createLeadForm_ownershipEnumId");
		selectDropDownUsingText(Ownership, "LLC/LLP");		

		//Numofemp
		WebElement Numofemp=locateElement("createLeadForm_numberEmployees");
		type(Numofemp,"12500");

		//siccode
		WebElement Sic_code=locateElement("createLeadForm_sicCode");
		type(Sic_code,"C10TRP02");

		//description
		WebElement desc=locateElement("createLeadForm_description");
		type(desc,"it's  a  leading  Aerospace  Technology  company.");

		//tickersymbol
		WebElement ticker=locateElement("createLeadForm_tickerSymbol");
		type(ticker,"XRTOPN");

		//impnote
		WebElement impNote=locateElement("createLeadForm_importantNote");
		type(impNote,"NA");

		//countrycode
		WebElement countrycode=locateElement("createLeadForm_primaryPhoneCountryCode");
		type(countrycode,"3");

		//Areacode
		WebElement areacode=locateElement("createLeadForm_primaryPhoneAreaCode");
		type(areacode,"25");

		//phonenumber
		WebElement phonenum=locateElement("createLeadForm_primaryPhoneNumber");
		type(phonenum,"8596528962");

		//Person
		WebElement person=locateElement("createLeadForm_primaryPhoneAskForName");
		type(person,"Steve");

		//phoneext
		WebElement phoneext=locateElement("createLeadForm_primaryPhoneExtension");
		type(phoneext,"045");

		//email
		WebElement email=locateElement("createLeadForm_primaryEmail");
		type(email,"test@outlook.com");

		//weburl
		WebElement weburl=locateElement("createLeadForm_primaryWebUrl");
		type(weburl,"www.google.com");

		//toName
		WebElement toName=locateElement("createLeadForm_generalToName");
		type(toName,"Tony");

		//Attname
		WebElement Attname=locateElement("createLeadForm_generalAttnName");
		type(Attname,"Anthony");

		//address1
		WebElement address1=locateElement("createLeadForm_generalAddress1");
		type(address1,"12 Hanes Street");

		//address2
		WebElement address2=locateElement("createLeadForm_generalAddress2");
		type(address2,"Eastern");

		//city
		WebElement city=locateElement("createLeadForm_generalCity");
		type(city,"Cuba");

		//state
		WebElement state=locateElement("createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingText(state, "Florida");
		
		
		//postalcode
		WebElement postalcode=locateElement("createLeadForm_generalPostalCode");
		type(postalcode,"12585");

		//country
		WebElement country = locateElement("createLeadForm_generalCountryGeoId");
		selectDropDownUsingText(country, "Greenland");	

		//postalcodeext
		WebElement postalcodeext=locateElement("createLeadForm_generalPostalCodeExt");
		type(postalcodeext,"562");
		
		//click submit
		WebElement submitfinal = locateElement("class","smallSubmit");
		click(submitfinal);


	}

}
