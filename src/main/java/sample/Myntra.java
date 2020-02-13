package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myntra {
	
	public WebDriver driver;
	public Properties OR;
	
	
	Myntra() throws IOException{
		File fl=new File("C:\\Users\\khaja.h\\Desktop\\BNSF_Training\\selenium\\src\\main\\java\\utility\\OR");
		FileInputStream fi=new FileInputStream(fl);
		OR=new Properties();
		OR.load(fi);
	}
	
	public String getLocator(String WebElementName) throws Exception {

		/*
		 * String a = OR.getProperty(WebElementName); //Split the value which contains
		 * locator type and locator value String locatorType = a.split(":")[0]; String
		 * locatorValue = a.split(":")[1];
		 */
		// Retrieve value from properties file using key
		String a = OR.getProperty(WebElementName);
		//System.out.println(a);

		// extract the locator type and value from the object
		 String s[] = a.split(":");
		String locatorType = s[0];
		System.out.println("locatorType:- "+locatorType);
		
		String locatorValue = s[1];
		System.out.println("locatorValue:- "+locatorValue);
		/*String locatorType = a.split(":")[0];
		String locatorValue = a.split(":")[1];*/

		if (locatorType.toLowerCase().equals("xpath")) {
			return (String) locatorValue;
		/*} else if (locatorType.toLowerCase().equals("name")) {
			return (WebElement) By.name(locatorValue);
		} else if ((locatorType.toLowerCase().equals("classname")) || (locatorType.toLowerCase().equals("class"))) {
			return (WebElement) By.className(locatorValue);
		} else if ((locatorType.toLowerCase().equals("tagname")) || (locatorType.toLowerCase().equals("tag"))) {
			return (WebElement) By.className(locatorValue);
		} else if ((locatorType.toLowerCase().equals("linktext")) || (locatorType.toLowerCase().equals("link"))) {
			return (WebElement) By.linkText(locatorValue);
		} else if (locatorType.toLowerCase().equals("partiallinktext")) {
			return (WebElement) By.partialLinkText(locatorValue);
		} else if ((locatorType.toLowerCase().equals("cssselector")) || (locatorType.toLowerCase().equals("css"))) {
			return (WebElement) By.cssSelector(locatorValue);
		} else if (locatorType.toLowerCase().equals("xpath")) {
			return (WebElement) By.xpath(locatorValue);*/
		} else
			throw new Exception("Locator type '" + locatorType + "' not defined!!");
	}
	
	
	//@BeforeTest
public  void main() {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/lib/chromedriver2.exe");
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/");
	

}
	@Test
	public void order() throws Exception 
	{
		System.out.println(driver.findElement(By.xpath(getLocator("USER_BUTTON"))));
		/*driver.findElement(By.xpath(OR.getProperty("MEN"))).click();
		driver.findElement(By.xpath(OR.getProperty("SECTION"))).click();
		driver.findElement(By.xpath(OR.getProperty("MODEL"))).click();
		driver.findElement(By.xpath(OR.getProperty("SIZE"))).click();
		driver.findElement(By.xpath(OR.getProperty("CONFIRM_ORDER"))).click();
		driver.findElement(By.xpath(OR.getProperty("GO_TO"))).click();
		driver.findElement(By.xpath(OR.getProperty("PLACE_ORDER"))).click();
		driver.findElement(By.xpath(OR.getProperty("GOING"))).click();
		driver.findElement(By.xpath(OR.getProperty("DONE"))).click();*/
		
	}
	@AfterTest
	public void cow()
	{
		//driver.close();
	}
}