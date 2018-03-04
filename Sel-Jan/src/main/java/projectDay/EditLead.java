package projectDay;

import org.testng.annotations.Test;

//import org.junit.Test;

public class EditLead extends ProjectMethod {
	
	@Test
	public void EditLead() throws InterruptedException
	{
	
	loginTestLeaf();
	locateClick("link", "Leads");
	locateClick("link","Find Leads");
	locateEnter("xpath","(//input[@name='firstName'])[3]", "an");
	click(locateElement("xpath","//button[text()='Find Leads']"));
	Thread.sleep(3000);
	
	click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	
	verifyTitle("View Lead | opentaps CRM");
	click(locateElement("link","Edit"));
	
	type(locateElement("id","updateLeadForm_companyName"),"microsoft");
	
	click(locateElement("xpath","(//input[@class='smallSubmit'])[1]"));
	
	verifyPartialText(locateElement("id","viewLead_companyName_sp"),"microsoft");
	closeBrowser();
}
}
