package projectDay;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;



public class CreateIncident extends SeMethods
{

	@Test
	public void VerifyIncident() throws InterruptedException
	{
		startApp("chrome","https://dev16355.service-now.com/");
		switchToFrame(locateElement("gsft_main"));
		type(locateElement("user_name"),"admin");

		type(locateElement("user_password"),"Chennai@123");
		click(locateElement("sysverb_login"));
		Thread.sleep(3000);
		type(locateElement("filter"),"Incident");
		Thread.sleep(3000);
		

		click(locateElement("xpath","(//div[text()='Incidents'])[1]"));
		switchToFrame(locateElement("gsft_main"));
		Thread.sleep(3000);
		click(locateElement("xpath","(//button[@type='submit'])[1]"));
		Thread.sleep(3000);
		WebElement ele1=locateElement("xpath", "//input[@id='incident.number']");
		String IncNumBeforeCreation=ele1.getAttribute("value");
		System.out.println(IncNumBeforeCreation);

		type(locateElement("incident.short_description"),"TestAutomation");
		click(locateElement("xpath","(//button[@id='sysverb_insert'])[2]"));
		Thread.sleep(3000);
		switchDefaultContent();
		switchToFrame(locateElement("gsft_main"));
		Thread.sleep(3000);
		switchDefaultContent();
		switchToFrame(locateElement("gsft_main"));
		Thread.sleep(3000);
		String IncNumAfterCreation=getText(locateElement("xpath","//tr[1]/td[@class='vt']/a"));
		System.out.println(IncNumAfterCreation);

		if(IncNumBeforeCreation.equals(IncNumAfterCreation))
		{
			System.out.println("The incident before and after matches");

		}
 
		else
		{
			System.out.println("The incident before and after does not match");
		}

		closeBrowser();
	}
}
