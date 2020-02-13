package practiceTestCases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Windows_Frames_Alerts {

	WebDriver driver;

	// How to handle multiple windows
	// How to handlw multiple frames
	// How to Alert popups

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		//driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	//@Test
	public void handle_multiple_windows() throws InterruptedException

	{
//		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
//		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
//		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
		
		ArrayList<String> al =new ArrayList<String>(); 
		
		Set<String> windowid = driver.getWindowHandles();
		
		Iterator<String> it = windowid.iterator();
		
		while(it.hasNext())
		{
			al.add(it.next());
		}
		
//		driver.switchTo().window(al.get(3));
//		Thread.sleep(200);
//		driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/header/div/a/img")).click();
//		
//		driver.switchTo().window(al.get(0));
//		driver.findElement(By.xpath("//button[@id='button1']")).click();
		driver.switchTo().window(al.get(1));
		String text= driver.findElement(By.xpath("//body[text()='Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.']")).getText();
		
		System.out.println(text);
	}
	
	//@Test
	public void handlw_multiple_frames() throws InterruptedException
	{
		List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
		
		ArrayList<WebElement> al = new ArrayList<WebElement>();
		
		Iterator<WebElement> it =allframes.iterator();
		
		while(it.hasNext())
		{
			al.add(it.next());
		}
		
		driver.switchTo().frame(al.get(0));
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("khajahussain");
		//driver.findElement(By.xpath("//input[@id='photo']")).click();
		Thread.sleep(200);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/header/div/a/img")).click();
		
	}
	
	@Test
	public void Alertpopups() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		//click on ok button
		alt.accept();
		//click on cancle button
		alt.dismiss();
		
		driver.findElement(By.xpath("")).sendKeys("");
	}

}
