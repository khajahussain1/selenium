package selenium_interview_questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



  /*
 * 
 * 1) What is ajax?
      Ajax means dynamic based on input values in suggested list will be refreshed.     
      
      AJAX allows the Web page to retrieve small amounts of data from the server without reloading the entire page.
      To test Ajax application, different wait methods should be applied
       ThreadSleep
       Implicit Wait
       Explicit Wait
       WebdriverWait
       Fluent Wait
      Creating automated test request may be difficult for testing tools as such AJAX application often use different 
      encoding or serialization technique to submit POST data.

      
      WebDriver commands are :-
      get, quit, close
      
      interactive commands are:-
      sendkeys, clear, newselect, click
      
      Information command are :-
      
*/
public class AjaxControl 
{
	WebDriver driver;
	
	@BeforeTest
	public void beforemethod() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
	Thread.sleep(3000);
//String text = driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]")).getText();
		
		//System.out.println(text);
	}
	
	@Test
	public void test1() throws InterruptedException 
	{
		//driver.findElement(By.xpath("//input[@name='q']")).click();
		//driver.findElement(By.cssSelector("#fakebox-input")).sendKeys("Selenium");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/input")).sendKeys("selenium");
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]")).getText();
		
		System.out.println(text);
	}

}
