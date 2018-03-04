package projectDay;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MergeLead extends ProjectMethod {
	@Test
	public void mergeLead() throws InterruptedException {
	
		loginTestLeaf();
		locateClick("link", "Leads");
		locateClick("link","Find Leads");
		Thread.sleep(3000);
		
		locateClick("link","Merge Leads");
		locateClick("xpath","//a[contains(@href, 'partyIdFrom')]/img");
		switchToWindow(1);
		String fromLead = "10229";
		type(locateElement("name","id"),fromLead);
		locateClick("xpath","//button[text()='Find Leads']");
		
		try {
			
			click(locateElement("xpath","//a[contains(@href,'"+fromLead+"')]"));
			}

		catch(Exception e) {
			click(locateElement("xpath","//a[contains(@href,'"+fromLead+"')]"));
			
		}
		
		switchToWindow(0);
		locateClick("xpath","//a[contains(@href, 'partyIdTo')]/img");
		
		switchToWindow(1);
		String toLead = "10286";
		type(locateElement("name","id"),toLead);
		locateClick("xpath","//button[text()='Find Leads']");
		
		try {
			
			click(locateElement("xpath","//a[contains(@href,'"+toLead+"')]"));
			}

		catch(Exception e) {
			click(locateElement("xpath","//a[contains(@href,'"+toLead+"')]"));
			
		}
		switchToWindow(0);
		click(locateElement("class","buttonDangerous"));
		acceptAlert();
		click(locateElement("link","Find Leads"));
	

	
		type(locateElement("name","id"),fromLead);




		
		click(locateElement("xpath","//button[text()='Find Leads']"));
	
		Thread.sleep(3000);

		locateElement("xpath","//div[contains(text(),'No records to display')]");
		Thread.sleep(3000);
		closeBrowser();
		System.out.println("pass");
		
		
		
		
	
	}
}
