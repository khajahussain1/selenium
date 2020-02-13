package java_interview_questions;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A2 {

	WebDriver driver;

	public static final int FIVE_SECONDS = 5000;
	public static final int MAX_Y = 400;
	public static final int MAX_X = 400;
	
	// @Test
		public void test() throws InterruptedException {

			for (int i = 0; i <= 100000; i++) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				driver.get("https://www.toolsqa.com/automation-practice-form/");

				Thread.sleep(30000);				

				driver.close();
				
			}
		}

		@Test
		public void reboot() throws InterruptedException, AWTException {
			System.out.println("---------started-----------");
			Robot robot = new Robot();
			Random random = new Random();
			while (true) {
				robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
				Thread.sleep(FIVE_SECONDS);
			}
		}

	}

	/*
	 * driver.get() : It's used to go to the particular website , But it doesn't
	 * maintain the browser History and cookies so , we can't use forward and
	 * backward button , if we click on that , page will not get schedule
	 * 
	 * driver.navigate() : it's used to go to the particular website , but it
	 * maintains the browser history and cookies, so we can use forward and backward
	 * button to navigate between the pages during the coding of Testcase
	 * 
	 * Actions action = new Actions(driver);
action.sendKeys(Keys.ESCAPE);
action.sendKeys(Keys.ESCAPE).perform();
Actions action = new Actions(driver);
action.sendKeys(Keys.ESCAPE).build().perform();

Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_ESCAPE);
robot.keyRelease(KeyEvent.VK_ESCAPE);

******** Press Enter/Return Key in Selenium *******

Keyboard's Key	       Keys enum's value

Arrow Key - Down	   Keys.ARROW_DOWN
Arrow Key - Up	       Keys.ARROW_LEFT
Arrow Key - Left	   Keys.ARROW_RIGHT
Arrow Key - Right	   Keys.ARROW_UP
Backspace	           Keys.BACK_SPACE
Ctrl Key	           Keys.CONTROL
Alt key	               Keys.ALT
DELETE	               Keys.DELETE
Enter Key	           Keys.ENTER
Shift Key	           Keys.SHIFT
Spacebar	           Keys.SPACE
Tab Key	               Keys.TAB
Equals Key	           Keys.EQUALS
Esc Key	               Keys.ESCAPE
Home Key	           Keys.HOME
Insert Key	           Keys.INSERT
PgUp Key	           Keys.PAGE_UP
PgDn Key	           Keys.PAGE_DOWN
Function Key F1	       Keys.F1
Function Key F2	       Keys.F2
Function Key F3	       Keys.F3
Function Key F4	       Keys.F4
Function Key F5	       Keys.F5
Function Key F6	       Keys.F6
Function Key F7	       Keys.F7
Function Key F8	       Keys.F8
Function Key F9	       Keys.F9
Function Key F10	   Keys.F10
Function Key F11	   Keys.F11
Function Key F12	   Keys.F12

	 */

	
