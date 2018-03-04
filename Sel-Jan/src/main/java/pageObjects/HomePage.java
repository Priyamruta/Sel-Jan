package pageObjects;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class HomePage extends SeMethods {

	WebElement crmlink = locateElement("link","CRM/SFA");
	
	
	public void goToCrmPage() {
		click(crmlink);
	
}
}
