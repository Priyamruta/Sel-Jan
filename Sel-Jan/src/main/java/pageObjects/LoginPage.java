package pageObjects;

import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class LoginPage extends SeMethods {

	WebElement usernamefld=locateElement("username");
	WebElement passwordfld = locateElement("password");
	WebElement submit = locateElement("class","decorativeSubmit");
	
	public void Login() {
		type(usernamefld,"DemoSalesManager");
		type(passwordfld, "crmsfa");
		click(submit);
	}

	
	
	
}
