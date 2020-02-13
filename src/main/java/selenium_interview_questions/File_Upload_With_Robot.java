package selenium_interview_questions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class File_Upload_With_Robot {

	public WebDriver driver = null;

	//@Test
	public void fileupload_using_robot() throws Exception {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.id("imagesrc")).click();

		Robot r = new Robot();
		r.setAutoDelay(2000);
		r.delay(1500);

		StringSelection ss = new StringSelection("C:\\Users\\khaja.h\\Desktop\\webservice.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		r.setAutoDelay(1000);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.setAutoDelay(1000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	//@Test
	public void fileupload_using_selenium() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");

		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\khaja.h\\Desktop\\webservice.txt");

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.name("send")).click();

	}

	@Test
	public void File_dowload_using_selenium() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/yahoo.html");
		
		WebElement downloadButton = driver.findElement(By.id("messenger-download"));
		
		String sourceLocation = downloadButton.getAttribute("href");
		
		String wget_command = "cmd /c C:\\Wget\\wget.exe -P C: --no-check-certificate " + sourceLocation;

		try {
			Process exec = Runtime.getRuntime().exec(wget_command);
			
			int exitVal = exec.waitFor();
			
			System.out.println("Exit value: " + exitVal);
			
		} catch (InterruptedException | IOException ex) {
			System.out.println(ex.toString());
		}
	}

}
