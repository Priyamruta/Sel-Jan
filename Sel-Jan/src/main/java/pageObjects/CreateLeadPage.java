package pageObjects;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class CreateLeadPage extends SeMethods {

	WebElement createLeadlink = locateElement("link","Create Lead");
	WebElement compName = locateElement("createLeadForm_companyName");
	WebElement firstName = locateElement("createLeadForm_firstName");
	WebElement sourceDD = locateElement("createLeadForm_dataSourceId");
	WebElement parentId = locateElement("createLeadForm_parentPartyId");
	WebElement sourceDDM = locateElement("createLeadForm_marketingCampaignId");
	WebElement lastName = locateElement("createLeadForm_lastName");	
	WebElement firstNamelocal = locateElement("createLeadForm_firstNameLocal");
	WebElement lastNamelocal = locateElement("createLeadForm_lastNameLocal");
	WebElement salute = locateElement("createLeadForm_personalTitle");
	WebElement Numofemp=locateElement("createLeadForm_numberEmployees");
	WebElement dName = locateElement("createLeadForm_departmentName");
	WebElement aRevenue=locateElement("createLeadForm_annualRevenue");
	WebElement industryDD = locateElement("createLeadForm_industryEnumId");
	WebElement currencyDD = locateElement("createLeadForm_currencyUomId");
	WebElement Ownership = locateElement("createLeadForm_ownershipEnumId");
	WebElement DOB = locateElement("createLeadForm_birthDate");
	WebElement title = locateElement("createLeadForm_generalProfTitle");
	WebElement Sic_code=locateElement("createLeadForm_sicCode");
	WebElement desc=locateElement("createLeadForm_description");
	WebElement ticker=locateElement("createLeadForm_tickerSymbol");
	WebElement impNote=locateElement("createLeadForm_importantNote");
	WebElement countrycode=locateElement("createLeadForm_primaryPhoneCountryCode");
	WebElement areacode=locateElement("createLeadForm_primaryPhoneAreaCode");
	WebElement phonenum=locateElement("createLeadForm_primaryPhoneNumber");
	WebElement person=locateElement("createLeadForm_primaryPhoneAskForName");
	WebElement phoneext=locateElement("createLeadForm_primaryPhoneExtension");
	WebElement email=locateElement("createLeadForm_primaryEmail");
	WebElement weburl=locateElement("createLeadForm_primaryWebUrl");
	WebElement postalcode=locateElement("createLeadForm_generalPostalCode");
	WebElement country = locateElement("createLeadForm_generalCountryGeoId");
	WebElement postalcodeext=locateElement("createLeadForm_generalPostalCodeExt");
	WebElement submitfinal = locateElement("class","smallSubmit");
	WebElement toName=locateElement("createLeadForm_generalToName");
	WebElement Attname=locateElement("createLeadForm_generalAttnName");
	WebElement address1=locateElement("createLeadForm_generalAddress1");
	WebElement address2=locateElement("createLeadForm_generalAddress2");
	WebElement city=locateElement("createLeadForm_generalCity");
	WebElement state=locateElement("createLeadForm_generalStateProvinceGeoId");

	
	public void enterDetails(){
	type(compName, "TCS");
	type(firstName, "Rachel");
	type(lastName, "Greene");
	selectDropDownUsingText(sourceDD, "Direct Mail");
	type(parentId, "10102");
	selectDropDownUsingText(sourceDDM, "eCommerce Site Internal Campaign");
	type(firstNamelocal, "Scarlett");
	type(lastNamelocal, "Johnson");
	type(salute, "Miss");
	type(DOB, "10/12/1990");
	type(title, "Miss");
	type(dName, "Marketing");
	type(aRevenue,"1000000000");
	selectDropDownUsingText(industryDD, "Aerospace");
	selectDropDownUsingText(currencyDD, "INR - Indian Rupee");		
	selectDropDownUsingText(Ownership, "LLC/LLP");		
	type(Numofemp,"12500");
	type(Sic_code,"C10TRP02");
	type(desc,"it's  a  leading  Aerospace  Technology  company.");
	type(ticker,"XRTOPN");
	type(impNote,"NA");
	type(countrycode,"3");
	type(areacode,"25");
	type(phonenum,"8596528962");
	type(person,"Steve");
	type(phoneext,"045");
	type(email,"test@outlook.com");
	type(weburl,"www.google.com");
	type(toName,"Tony");
	type(Attname,"Anthony");
	type(address1,"12 Hanes Street");
	type(address2,"Eastern");
	type(city,"Cuba");
	selectDropDownUsingText(state, "Florida");
	type(postalcode,"12585");
	type(postalcodeext,"562");
	selectDropDownUsingText(country, "Greenland");	
	}
	
	public void submitLead() {
		click(submitfinal);	
	}
	

	
	
}
