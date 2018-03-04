package testNG_learn2;

import java.util.List;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Login extends SeMethods{

	@Test
	@Parameters("browser")
	public void login(String browserName) throws InterruptedException {	
		
		
		if(browserName.equalsIgnoreCase("firefox")) {
		startApp("firefox", "http://leaftaps.com/opentaps");
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
		WebElement password = locateElement("password");
		type(password, "crmsfa");
		WebElement submit = locateElement("class", "decorativeSubmit");
		click(submit);	
		closeBrowser();
	}
		if(browserName.equalsIgnoreCase("chrome")) {
			startApp("chrome", "http://leaftaps.com/opentaps");
			WebElement userName = locateElement("username");
			type(userName, "DemoSalesManager");
			WebElement password = locateElement("password");
			type(password, "crmsfa");
			WebElement submit = locateElement("class", "decorativeSubmit");
			click(submit);	
			closeBrowser();

}
		if(browserName.equalsIgnoreCase("edge")) {
			startApp("edge", "http://leaftaps.com/opentaps");
			WebElement userName = locateElement("username");
			type(userName, "DemoSalesManager");
			WebElement password = locateElement("password");
			type(password, "crmsfa");
			WebElement submit = locateElement("class", "decorativeSubmit");
			click(submit);	
			closeBrowser();
}
}
}
