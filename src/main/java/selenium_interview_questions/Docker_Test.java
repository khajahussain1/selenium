package selenium_interview_questions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Docker_Test {
	
	static RemoteWebDriver driver;
	
	/*@BeforeMethod
	public void setup() throws MalformedURLException
	{
		System.out.println("running the test docker container chrome");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.LINUX);
		//cap.setVersion("");
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), cap);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
	}*/
	
	@Test
	public void test() throws MalformedURLException
	{
		System.out.println("running the test docker container chrome");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.LINUX);
		//cap.setVersion("");
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:6666/wd/hub"), cap);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.quit();
	}
	
	

}
