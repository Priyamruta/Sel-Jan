package testNG_learn2;

import org.testng.annotations.Test;

import projectDay.ProjectMethod;
import wdMethods.SeMethods;

//import org.junit.Test;

public class DeleteLead extends ProjectMethod {

	@Test(dependsOnMethods="testNG_Learn.Create_Lead_inter.Create_LeadMeth")
	public void deleteLead() throws InterruptedException
	{
		loginTestLeaf();
		locateClick("link", "Leads");
		locateClick("link","Find Leads");
		//locateEnter("xpath","(//input[@name='firstName'])[3]", "an");
		//click(locateElement("xpath","//button[text()='Find Leads']"));
		Thread.sleep(3000);
		String captureFL=getText(locateElement("xpath","//div[1]/table//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));

		click(locateElement("xpath","//div[1]/table//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));

		click(locateElement("xpath","(//div/a[@class='subMenuButtonDangerous'])"));

		click(locateElement("xpath","//a[text()='Find Leads']"));
		type(locateElement("name","id"),captureFL);
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		locateElement("xpath","//div[contains(text(),'No records to display')]");
		Thread.sleep(3000);
		System.out.println("The record is not present");
	}
}
