package practiceTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Selenium {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");

	}

	@Test
	public void f() throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("khajahussain");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aish@1234");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

	}

	@AfterMethod
	public void afterMethod() {

		// driver.close();

	}

}
