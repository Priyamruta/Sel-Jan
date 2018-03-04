package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;



public class SeMethods implements WdMethods{

	static RemoteWebDriver driver;
	int i=1;
	public void startApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
			driver = new ChromeDriver();	
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");		
			driver = new FirefoxDriver();	
		}
			else 
				if(browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", ".drivers/MicrosoftWebDriver.exe");
				driver=new EdgeDriver();
			}
		
	
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser "+browser+" is launched");
	}

	public WebElement locateElement(String locator, String locValue) {
		switch (locator){
		case "id":
			return driver.findElementById(locValue);
		case "name":
			return driver.findElementByName(locValue);
		case "class":
			return driver.findElementByClassName(locValue);
		case "xpath":
			return driver.findElementByXPath(locValue);
		case "link":
			return driver.findElementByLinkText(locValue);
		default: return null;
		}

	}

	public WebElement locateElement(String locValue) {
		return locateElement("id", locValue);

	}

	public void type(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		System.out.println("The text field is entered with data "+data);
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked");
	}

	public void clickWithoutSnap(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked without snap");

	}

	public String getText(WebElement ele) {

		return ele.getText();
	}

	public void selectDropDownUsingText(WebElement ele, String value) {

		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText(value);
		System.out.println("the selected value is" +value);
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {

		Select dropdown = new Select(ele);
		dropdown.selectByIndex(index);
		System.out.println("the selected value is" +index);
	}

	public boolean verifyTitle(String expectedTitle) {
		if(driver.getTitle().equalsIgnoreCase(expectedTitle))
		{

			System.out.println("the title matches");
		}
		else
		{


			System.out.println("the title does not matches");
		}
		return false;
	}



	public void verifyExactText(WebElement ele, String expectedText) {
		if(ele.getText().equals(expectedText)) {
			System.out.println("the text matches");

		}

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		if(ele.getText().contains(expectedText))
		{
			System.out.println("the text is contained in the string");
		}

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {

		if(ele.getAttribute(attribute).equals(value))
		{
			System.out.println("the attribute matches");
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).contains(value))
		{
			System.out.println("the string contains the attribute");
		}

	}

	public void verifySelected(WebElement ele) {
		ele.isSelected();
		System.out.println("the element is selected" +ele);

	}

	public void verifyDisplayed(WebElement ele) {
		ele.isDisplayed();
		System.out.println("The element is displayed"+ele);

	}

	public void switchToWindow(int index) {
		Set<String> allwindows = driver.getWindowHandles();
		List<String> windowlist = new ArrayList<String>();
		windowlist.addAll(allwindows);
		driver.switchTo().window(windowlist.get(index));
		System.out.println("The window selected"+index);

	}

	public void switchToFrame(WebElement ele) {

		driver.switchTo().frame(ele);

	}

	public void switchDefaultContent() {

		driver.switchTo().defaultContent();

	}

	public void switchToFrameByName(String name) {

		driver.switchTo().frame(name);

	}
	public void switchToFrameById(String id) {


		driver.switchTo().frame(locateElement(id));

	}

	public void acceptAlert() {


		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {

		driver.switchTo().alert().dismiss();
	}

	public String getAlertText() {

		return driver.switchTo().alert().getText();
	}

	public void takeSnap() {

		try {
			File snapSrcFile = driver.getScreenshotAs(OutputType.FILE);

			File snapDestFile = new File("./snaps/snap"+  i+".jpeg1");
			FileUtils.copyFile(snapSrcFile, snapDestFile);
			i++;
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Path not Found");
			//e.printStackTrace();
		}	 
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The driver is not instantiated");
			//e.printStackTrace();
		}

	}

	public void typenTab(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data,Keys.TAB);
		System.out.println("The text field is entered with data " + data);
	}


	public void typenEnter(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		ele.sendKeys(Keys.ENTER);
		System.out.println("The text field is entered with data " + data);
	}

	public void switchToFrame(String ele) {
		driver.switchTo().frame(ele);
		System.out.println("Switch to frame");
	}

	public void switchToDef(String ele) {
		driver.switchTo().defaultContent();
		System.out.println("Switch to default");
	}


	public void closeBrowser() {

		driver.close();
	}

	public void closeAllBrowsers() {

		driver.quit();
	}

}
