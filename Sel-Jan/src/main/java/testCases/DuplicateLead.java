package testCases;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class DuplicateLead extends SeMethods {

	@Test
	public void duplicate() throws InterruptedException
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

		//FindLeads
		WebElement findLead = locateElement("link","Find Leads");
		click(findLead);


		//clickemail
		WebElement emailtab=locateElement("xpath","//span[contains(text(),'Email')]");
		click(emailtab);

		//enteremail

		WebElement emailadd = locateElement("name","emailAddress");
		type(emailadd, "@gmail.com");

		//ClickFindleads
		WebElement Findleads=locateElement("xpath","//button[text()='Find Leads']");
		click(Findleads);
		
		Thread.sleep(3000);		
		String captureFN=getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a"));
		   
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a"));

		click(locateElement("link","Duplicate Lead"));

		verifyTitle("View Lead | opentaps CRM");

		click(locateElement("name","submitButton"));
		
		verifyExactText(locateElement("id","viewLead_firstName_sp"), captureFN);















	}
}
