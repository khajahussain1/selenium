package practiceTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser_Commands {
	
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	 
	  
	  // Storing the Application Url in the String variable
	  String url = "https://www.spicejet.com/";
	  
	 // String url = "http://www.store.demoqa.com";
	  
	  //Launch the ToolsQA WebSite
	  driver.get(url);
	  
	  // Storing Title name in the String variable
	  String title = driver.getTitle();
	  
	  // Storing Title length in the Int variable
	  int titleLength = driver.getTitle().length();
	  
	  // Printing Title & Title length in the Console window
	  System.out.println("Title of the page is : " + title);
	  System.out.println("Length of the title is : "+ titleLength);
	  
	  // Storing URL in String variable
	  String actualUrl = driver.getCurrentUrl();
	  
	  if (actualUrl.equals(url)){
		  
	  System.out.println("Verification Successful - The correct Url is opened.");
	  
	  }else{
		  
	  System.out.println("Verification Failed - An incorrect Url is opened.");
	  
	  //In case of Fail, you like to print the actual and expected URL for the record purpose	  
	  System.out.println("Actual URL is : " + actualUrl);
	  
	  System.out.println("Expected URL is : " + url);
	  
	  }
	  
	  	  
	  //Closing browser
	 // driver.close();
	  }
	 }
