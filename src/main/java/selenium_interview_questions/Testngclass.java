package selenium_interview_questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testngclass {
	public WebDriver driver;

	@Test(invocationCount = 5, invocationTimeOut = 20000)
	public void invocationCount() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
	}

	// @Test(alwaysRun=true)
	public void alwaysRun() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("http://www.spicejet.com/");
	}
}
