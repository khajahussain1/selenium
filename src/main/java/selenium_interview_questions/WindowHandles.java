package selenium_interview_questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WindowHandles {
	public static WebDriver driver;

	@Test
	public void perform_multiple_windows() throws InterruptedException 
	{		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver2.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@id='button1']")).sendKeys(Keys.ENTER);
		
		List<String> al = new ArrayList<>();

		Set<String> windowid = driver.getWindowHandles();

		Iterator<String> it = windowid.iterator();		

		while (it.hasNext()) {

			al.add(it.next());
		}
		/*if(al.get(0)=="0")
		{
			driver.close();
		}*/
		
		// go to 3rd window
		driver.switchTo().window(al.get(1));
		// perform some actions on 3rd window and close.

		Thread.sleep(200);

		driver.findElement(By.xpath("//a[@class='dt-mobile-menu-icon' and @aria-label='Mobile menu icon']")).sendKeys(Keys.ENTER);
		// driver.close();

		// switchto 2nd window
		// driver.switchTo().window(ids.get(2));

		// perform some actions and close window
		// driver.close();

		// switch back to parent window and perform some action and close
		
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("//button[text()='New Message Window']")).sendKeys(Keys.ENTER);

		// how get coordinates of window

		/*Point position = driver.manage().window().getPosition();
		position.getX();
		position.getY();

		// get position of element

		Point location = driver.findElement(By.xpath("")).getLocation();
		location.getX();
		location.getY();*/
	}
	
	//@Test
			public void test_CloseAllWindowsExceptMainWindow() {
		
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.naukri.com/");
			
			SoftAssert sa = new SoftAssert();
			
			// To get the main window handle
			String windowTitle= getCurrentWindowTitle();
			String mainWindow = getMainWindowHandle(driver);
			//Assert.assertTrue(closeAllOtherWindows(mainWindow));
			//Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"), "Main window title is not matching");
			sa.assertAll();
		}
			
		public String getMainWindowHandle(WebDriver driver) {
			return driver.getWindowHandle();
		}

		public String getCurrentWindowTitle() {
			String windowTitle = driver.getTitle();
			return windowTitle;
		}
		
		//To close all the other windows except the main window.
		public static boolean closeAllOtherWindows(String openWindowHandle) {
			
			Set<String> allWindowHandles = driver.getWindowHandles();
			
			for (String currentWindowHandle : allWindowHandles) {
				
				if (!currentWindowHandle.equals(openWindowHandle)) {
					
					driver.switchTo().window(currentWindowHandle);
					
				//	driver.close();
				}
			}
			
			driver.switchTo().window(openWindowHandle);
			
			if (driver.getWindowHandles().size() == 1)
				
				return true;
			else
				return false;
		}
	}


