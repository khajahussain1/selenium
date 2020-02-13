package selenium_interview_questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Newtest1 {
	WebDriver driver;
	 Java_properties_OR ja = new Java_properties_OR();
	//@FindBy(how=How.XPATH,using="userName")
	//@FindBy(xpath = ja.getLocator("USERNAME"));
	WebElement txtbox;
	/*public Newtest1(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}*/
	//WebElement txtbox = driver.findElement(By.xpath(ja.getLocator("USERNAME")));
	
	
	@Test
	public void khajuh() throws Exception {
		
		//ja.getLocator("USERNAME");
		 System.out.println(ja.getLocator("USERNAME")); 
		 //driver.findElement(By.xpath());
		// driver.findElement(By.xpath(ja.getLocator("USERNAME")));
		 System.out.println("driver"+driver.findElement(ja.getLocator("USERNAME")));
		 
		 
		 
	}

}
