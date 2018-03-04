package projectDay;

import org.testng.annotations.Test;

import pageObjects.CreateLeadPage;
import pageObjects.CrmPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import wdMethods.SeMethods;

public class Create_Lead_POM extends SeMethods {

	@Test
	public void Create_LeadMeth()
	{
		startApp("chrome","http://leaftaps.com/opentaps");
		
		LoginPage loginPage = new LoginPage();
		loginPage.Login();
		
		HomePage homepage=new HomePage();
		homepage.goToCrmPage();
		
		
		CrmPage crmpage=new CrmPage();
		crmpage.goToCreateLead();
	
		CreateLeadPage createLeadPage = new CreateLeadPage();
		
		createLeadPage.enterDetails();
		createLeadPage.submitLead();
	
	}
	
	
}
