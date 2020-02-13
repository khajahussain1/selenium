package practiceTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser_Navigation_Commands {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  // Open ToolsQA web site
	  String appUrl = "https://www.spicejet.com/";
	  
	  driver.get(appUrl);
	  
	  // Click on SpiceClub link
	  driver.findElement(By.xpath("//a[@href='SpiceClub.aspx']")).click();
	  
	  // Go back to Home Page
	  driver.navigate().back();
	  
	  // Go forward to SpiceClub page
	  driver.navigate().forward();
	  
	  // Go back to Home page
	  driver.navigate().to(appUrl);
	  
	  // Refresh browser
	  driver.navigate().refresh();
	  
	  // Close browser
	 // driver.close();
	  }
	 
  }

