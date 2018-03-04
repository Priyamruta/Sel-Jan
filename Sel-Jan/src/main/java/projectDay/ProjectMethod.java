package projectDay;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class ProjectMethod extends SeMethods
{
	

	//int i=1;

	public void loginTestLeaf()
	{

		startApp("chrome", "http://leaftaps.com/opentaps");
		startApp("firefox", "http://leaftaps.com/opentaps");
		startApp("IE", "http://leaftaps.com/opentaps");


		//locating and pass username
		WebElement usernamefld = locateElement("username");
		type(usernamefld, "DemoSalesManager");

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

	}

	public void locateEnter(String locator, String locValue,String value)
	{
		WebElement ele = locateElement(locator, locValue);
		type(ele, value);
	}

	public void locateClick(String locator, String locValue)
	{
		WebElement ele = locateElement(locator, locValue);
		ele.click();
	}

	public void pageTitle(String expectedtitle) 
	{
		verifyTitle(expectedtitle);
	}

	public void locateVerifyText(String locator, String locValue, String expectedText)
	{

		WebElement ele = locateElement(locator, locValue);
		verifyExactText(ele,expectedText);
	}

	public void locateCapture(String locator, String locValue)
	{
		WebElement ele = locateElement(locator, locValue);
	}
	public void closeBrowserTestLeaf()
	{
		closeBrowser();
	}
}