package projectDay;

import org.junit.Test;

import wdMethods.SeMethods;

public class AssignNewIncidentsToUser extends SeMethods {

	@Test
	public void VerifyIncident() throws InterruptedException
	{
		String incidentNumber = "INC0000039";
		String assignedTo = "ITIL User";
		String stateValue = "In Progress";
		startApp("chrome","https://dev46355.service-now.com/");
		switchToFrame(locateElement("gsft_main"));
		type(locateElement("user_name"),"admin");

		type(locateElement("user_password"),"Chennai@1");
		click(locateElement("sysverb_login"));
		Thread.sleep(3000);
		type(locateElement("filter"),"Incident");
		Thread.sleep(3000);
		
		click(locateElement("xpath","//div[text()='Open - Unassigned']"));
		switchToFrame(locateElement("gsft_main"));
		typenEnter(locateElement("xpath","//*[@placeholder='Search'][@class='form-control']"),"incidentNumber");
		Thread.sleep(3000);
		
		click(locateElement("link",incidentNumber));
		Thread.sleep(3000);
		switchToFrame(locateElement("gsft_main"));
		selectDropDownUsingText(locateElement("incident.state"),"stateValue");
		
		click(locateElement("sysverb_update"));
		Thread.sleep(3000);
		click(locateElement("xpath","//div[text()='Open']"));
		typenEnter(locateElement("xpath","//input[text()='Search']"),"INC0010004 ");
		
		String IncNumAfterCreation=getText(locateElement("xpath","//tr[1]/td[@class='vt']/a"));
		System.out.println(IncNumAfterCreation);

		
		closeBrowser();
	}

}
