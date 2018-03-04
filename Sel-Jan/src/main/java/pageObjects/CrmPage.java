package pageObjects;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class CrmPage extends SeMethods {
	
	
			WebElement lead = locateElement("link","Leads");
			
			
			
			
			public void goToCreateLead()
			{
				click(lead);
				WebElement createLeadlink = locateElement("link","Create Lead");
				click(createLeadlink);
				
			}

}
