package testNG_learn2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class MergeLeadInter extends SeMethods{

	@Test(invocationTimeOut=20000)
	public void mergeLeadInter() throws InterruptedException
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

		//click Merge lead
		WebElement mLead=locateElement("link","Merge Leads");
		click(mLead);

		//clickimage1
		WebElement fromlead=locateElement("xpath","//a[contains(@href, 'partyIdFrom')]/img");
		click(fromlead);

		//switchtowindow1
		switchToWindow(1);

		String fromLead = "10354";
		//LeadID
		WebElement leadIDfrom = locateElement("name","id");
		type(leadIDfrom, fromLead);

		//ClickFindleads
		WebElement Findleadsfrom=locateElement("xpath","//button[text()='Find Leads']");
		click(Findleadsfrom);


		try {
			//ClickFirstvalue
			WebElement firstvalue=locateElement("xpath","//a[contains(@href,'"+fromLead+"')]");
			click(firstvalue);}

		catch(Exception e) {
			WebElement firstvalue=locateElement("xpath","//a[contains(@href,'"+fromLead+"')]");
			click(firstvalue);
		}
		//switchtowindow0
		switchToWindow(0);

		//clickimage2
		WebElement toLead=locateElement("xpath","//a[contains(@href, 'partyIdTo')]/img");
		click(toLead);

		//switchtowindow1
		switchToWindow(1);

		//LeadID
		String toLead1="10353";
		WebElement leadIDto = locateElement("name","id");
		type(leadIDto,toLead1 );
		//ClickFindleads
		WebElement Findleadsto=locateElement("xpath","//button[text()='Find Leads']");
		click(Findleadsto);
		try
		{
			//clickfirstvalue
			WebElement firstvalue=locateElement("xpath","//a[contains(@href,'"+toLead1+"')]");
			click(firstvalue);
		}
		catch(Exception e) {
			WebElement firstvalue=locateElement("xpath","//a[contains(@href,'"+toLead1+"')]");
			click(firstvalue);
		}


		//switchtowindow0
		switchToWindow(0);

		//clickMergebutton
		WebElement Mergebutton=locateElement("class","buttonDangerous");
		click(Mergebutton);

		//acceptalert
		acceptAlert();

		//checkforpresenceofmergedrecord
		
		WebElement fromleadcheck=locateElement("link","Find Leads");
		click(fromleadcheck);

		//LeadIDcheck
		WebElement leadIdcheck = locateElement("name","id");
		type(leadIdcheck, fromLead);



		//clickmergebuttonforcheck
		WebElement Mergebuttonforcheck=locateElement("xpath","//button[text()='Find Leads']");
		click(Mergebuttonforcheck);
		Thread.sleep(3000);

		WebElement records=locateElement("xpath","//div[contains(text(),'No records to display')]");
		Thread.sleep(3000);
		closeBrowser();
		System.out.println("pass");
	}

}
