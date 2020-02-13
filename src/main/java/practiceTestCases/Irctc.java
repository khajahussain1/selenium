package practiceTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.Document;

public class Irctc {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// driver.get("https://www.spicejet.com");
		// http://toolsqa.com/automation-practice-form

	}

	@Test
	public void f() throws InterruptedException {

		driver.findElement(By.xpath("//*[text()=' REGISTER ']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("khajasa92");
		driver.findElement(By.xpath("//input[@id='usrPwd']")).sendKeys("Welcome1234");
		driver.findElement(By.xpath("//input[@id='cnfUsrPwd']")).sendKeys("Welcome1234");
		driver.findElement(By.xpath("//label[text()='Select Security Question']")).click();
		driver.findElement(By.xpath("//span[text()='What is your pet name?']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Security Answer']")).sendKeys("khajahussain");
		driver.findElement(By.xpath("//label[text()='Select Preferred Language']")).click();
		driver.findElement(By.xpath("//span[text()='English']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("khajahussain");
		driver.findElement(By.xpath("//input[@id='M']")).click();
		driver.findElement(By.xpath(
				"//input[@class='ng-tns-c14-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"))
				.click();

		// select year
		WebElement year = driver
				.findElement(By.xpath("//select[@class='ui-datepicker-year ng-tns-c14-10 ng-star-inserted']"));
		Select yea = new Select(year);
		yea.selectByVisibleText("1899");

		// select month
		WebElement month = driver
				.findElement(By.xpath("//select[@class='ui-datepicker-month ng-tns-c14-10 ng-star-inserted']"));
		Select mon = new Select(month);
		mon.selectByVisibleText("November");

		// select date
		driver.findElement(By.xpath("//a[text()='23']")).click();

		driver.findElement(By.xpath("//label[text()='Select Occupation']")).click();
		driver.findElement(By.xpath("//span[text()='PROFESSIONAL']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hussainonline9@gmail.com");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7358681942");

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Thread.sleep(200);
		// select nationality
		WebElement nationality = driver.findElement(By.xpath("//select[@formcontrolname='nationality']"));

		// WebElement nationality = driver.findElement(By.cssSelector(
		// "#divMain > div > app-user-registration > div.container-fluid > div >
		// div.col-md-9 > div:nth-child(4) > form > div:nth-child(13) >
		// div.col-md-4.col-sm-4.col-xs-12.inlineBlock > select"));
		Select nation = new Select(nationality);
		// nation.selectByValue("94");
		nation.selectByVisibleText("India");

		driver.findElement(By.xpath("//textarea[@id='resAddress1']")).sendKeys("234");
		driver.findElement(By.xpath("//input[@formcontrolname='resPinCode']")).sendKeys("518196");
		driver.findElement(By.xpath("//input[@id='resState']")).click();

		// select city
		WebElement city = driver.findElement(By.xpath("//select[@formcontrolname='resCity']"));
		Select cty = new Select(city);
		// cty.selectByIndex(0);
		cty.selectByValue("Kurnool");

		// select post office
		WebElement postoffice = driver.findElement(By.xpath("//select[@formcontrolname='resPostOff']"));
		Select post = new Select(postoffice);
		// post.selectByIndex(1);
		post.selectByValue("Akumalla S.O");

		driver.findElement(By.xpath("//input[@id='resPhone']")).sendKeys("9290543619");
		Thread.sleep(200);

		// WebElement yes = driver.findElement(By.xpath("//label[text()='Yes']"));
		// executor.executeScript("arguments[0].click();", yes);

		driver.findElement(By.cssSelector(
				"#divMain > div > app-user-registration > div.container-fluid > div > div.col-md-9 > div:nth-child(4) > form > div:nth-child(19) > div:nth-child(2) > input"))
				.click();

		// select check box using java script executor
		WebElement element = driver.findElement(By.xpath(
				"//*[@id=\"divMain\"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[22]/div/input"));

		executor.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//b[text()='REGISTER']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='CANCEL']")).click();

	}

}
