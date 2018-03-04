package projectDay;

import org.testng.annotations.Test;

//import org.junit.Test;

public class DuplicateLead extends ProjectMethod {

	@Test
	public void duplicateLead() throws InterruptedException
	{
		loginTestLeaf();
		locateClick("link", "Leads");
		locateClick("link","Find Leads");
		Thread.sleep(3000);

		locateClick("xpath","//span[contains(text(),'Email')]");
		type(locateElement("name","emailAddress"),"@gmail.com");

		locateClick("xpath","//button[text()='Find Leads']");
		Thread.sleep(3000);		
		String captureFN=getText(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a"));

		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a"));

		click(locateElement("link","Duplicate Lead"));

		verifyTitle("View Lead|opentaps CRM");

		click(locateElement("name","submitButton"));

		verifyExactText(locateElement("id","viewLead_firstName_sp"), captureFN);

	}
}