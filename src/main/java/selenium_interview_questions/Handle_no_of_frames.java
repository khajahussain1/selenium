package selenium_interview_questions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handle_no_of_frames {
	public WebDriver driver;

	// @Test
	public void frames() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(js.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);

		// By finding all the web elements using iframe tag
		
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());

		for (int i = 0; i <= iframeElements.size() - 1; i++) {
			System.out.println(iframeElements.get(i).getText());

		}

	}

	 //@Test
	public void switchframes() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");

		// We can switch the frames 3 ways
		// By Index
		// By Name or Id
		// By Web Element

		// driver.switchTo().frame(0);
		driver.switchTo().frame("iframe1");
		// driver.switchTo().frame("id of the element");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//input[@name='firstname']"));
		js.executeScript("arguments[0].scrollIntoView()", element);

		WebElement Element = driver.findElement(
				By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[2]/a/strong"));
		js.executeScript("arguments[0].scrollIntoView()", Element);

		/* now find the First name field */
		WebElement firstName = driver.findElement(By.xpath("//*[@id='content']/form/fieldset/div[1]/p[3]/input"));

		/* now find the Last name field */
		WebElement lastName = driver.findElement(By.xpath("//*[@id='content']/form/fieldset/div[1]/p[4]/input"));
		firstName.sendKeys("Virender");
		lastName.sendKeys("Singh");

		// switch to main page
		// driver.switchTo().parentFrame();
		// driver.switchTo().defaultContent();

	}

	@Test
	public void count_no_of_img_in_each_frame() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
		System.out.println(allframes.size());

		for (int i = 0; i <= allframes.size(); i++) {
			driver.switchTo().frame(i);
			List<WebElement> allimgs = driver.findElements(By.xpath("html/body/a/img"));
			System.out.println(allimgs.size());
			driver.switchTo().defaultContent();
		}
	}

}
