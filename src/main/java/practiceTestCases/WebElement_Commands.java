package practiceTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebElement_Commands {

	public WebDriver driver;

	// clear commands
	// Navigate To Forward Command
	// Navigate To Back Command
	// Navigate To Refresh Command
	// Get Title Command
	// Get Current URL Command
	// Close Command
	// Quit Command
	// IsDisplayed Command
	// IsEnabled Command
	// IsSelected Command
	// select commands
	// getOptions commands
	// Print all the Options commands

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		// driver.get("https://www.spicejet.com");
		// http://toolsqa.com/automation-practice-form

	}
	
	//@Test
	public void clear_commands() throws InterruptedException
	
	{
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("khajahussain");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).clear();
	}
	//@Test
	public void Navigation_commands() throws InterruptedException
	{
		driver.get("https://www.spicejet.com");
		driver.findElement(By.xpath("//li[@id='SpecialAssistanceToPLink']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
				
	}
	//@Test
	public void Get_Title_Command() throws InterruptedException
	{
		driver.get("https://www.spicejet.com");
		Thread.sleep(2000);
		String text = driver.getTitle();
		System.out.println("Get title of spice jet"+text);
		driver.findElement(By.xpath("//li[@id='SpecialAssistanceToPLink']")).click();
		String url = driver.getCurrentUrl();
		System.out.println("URL of current page"+url);
		driver.close();
		
	}
	
	//@Test
	public void IsDisplayed_Command() throws InterruptedException
	{
//		boolean status = driver.findElement(By.xpath("//input[@type='email']")).isDisplayed();
//		System.out.println("IsDisplayed"+status);
//		
//		boolean status1 = driver.findElement(By.xpath("//input[@type='email']")).isEnabled();
//		System.out.println("IsEnabled"+status1);
		
		driver.get("https://www.spicejet.com");
		Thread.sleep(2000);
		boolean status3 = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).isSelected();
		
		System.out.println("ISselected:- "+status3);
		
	}
	
	@Test
	public void select_commands() throws InterruptedException
	{
		driver.get("https://www.spicejet.com");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select se =new Select(element);
		//se.selectByIndex(2);
		//se.selectByVisibleText("USD");
		//se.selectByValue("AED");
		
		List<WebElement> allvalues = se.getOptions();
		
		System.out.println(allvalues.size());
		
		for(int i=0; i<allvalues.size(); i++)
		{
			System.out.println(allvalues.get(i).getText());
		}
		
	}
	
	

}
