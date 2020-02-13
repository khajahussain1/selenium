package selenium_interview_questions;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scrolldown_scrollup_with_javasript {
	public static WebDriver driver;

	// @Test
	public void click() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		// driver.get("http://www.google.com/");
		driver.get("https://www.amazon.com/");

		 JavascriptExecutor js = (JavascriptExecutor) driver;
		// passing the value into text box
		//js.executeScript("document.getElementById('lst-ib').value = 'selenium'");
		// click on button
		// js.executeScript("document.getElementById('gb_70').click()");
		// refresh the current page
		// js.executeScript("history.go(0)");
		
		// get the text from particularwebelement
		
		// String particularwebelement=js.executeScript("return document.getElementById('gb_70').innerHTML").toString();
		
		// System.out.println(particularwebelement);

		// get webpage title
		// String webpagetitle=js.executeScript("return document.title").toString();
		// System.out.println(webpagetitle);

		// scroll end of the page
		// js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		// scroll particular webelement
		// js.executeScript("document.getElementById('staticImage').scrollIntoView()");
		// navigate to back
		js.executeScript("window.history.back()");
		Thread.sleep(20000);
		js.executeScript("window.history.forward()");
	}

	// @Test
	public void x_and_y_axis() throws Exception

	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.seleniumhq.org/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 4500)");// scroll down
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, -4500)");// scroll up
	}

	// @Test
	public void ByVisibleElement() throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("http://demo.guru99.com/test/guru99home/");

		// Method-1

		// Find element by link text and store in variable "Element"
		WebElement element = driver.findElement(By.linkText("Linux"));

		// This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView()", element);

		// method-2
		// scroll particular webelement
		// js.executeScript("document.getElementById('staticImage').scrollIntoView()");

	}

	//@Test
	public void ByPage() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/");

		// This will scroll the web page till end.
		js.executeScript("window.scroll(0, document.body.scrollHeight)");
	}

	 //@Test
	public void ScrollHorizontally() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");

		WebElement Element = driver.findElement(By.linkText("VBScript"));

		// This will scroll the page Horizontally till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}

}

/*
 * 1. If you want to scroll the page vertically to perform some action, you can
 * do it using the following JavaScript. 
 * ((JavascriptExecutor)driver).executeScript(�window.scrollTo(0,document.body.scrollHeight)�);
 * 
 * Where �JavascriptExecutor� is an interface, which helps executing JavaScript
 * through Selenium WebDriver. You can use the following code to import.
 * 
 * import org.openqa.selenium.JavascriptExecutor;
 * 
 * ########################################
 * 
 * 2. If you want to scroll at a particular element, you need to use the
 * following JavaScript.
 * 
 * WebElement element =driver.findElement(By.xpath(�//input [@id=�email�]�));
 * 
 * ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
 * 
 * Where �element� is the locator where you want to scroll.
 * ######################################################
 * 
 * 3. If you want to scroll at a particular coordinate, use the following
 * JavaScript.
 * 
 * ((JavascriptExecutor)driver).executeScript(�window.scrollBy(200,300)�);
 * 
 * Where �200,300� are the coordinates. ########################################
 * 
 * 4. If you want to scroll up in a vertical direction, you can use the
 * following JavaScript.
 * ((JavascriptExecutor)driver).executeScript(�window.scrollTo(document.body.
 * scrollHeight,0)�); ############################################
 * 
 * 5. If you want to scroll horizontally in the right direction, use the
 * following JavaScript.
 * ((JavascriptExecutor)driver).executeScript(�window.scrollBy(2000,0)�);
 * ###################################################
 * 
 * 6. If you want to scroll horizontally in the left direction, use the
 * following JavaScript.
 * ((JavascriptExecutor)driver).executeScript(�window.scrollBy(-2000,0)�);
 */