package practiceTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTable_Drag_and_Drop {

	WebDriver driver;

	// Actions class
	// Drag and drop
	// Moove to element
	// webtable

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.toolsqa.com/automation-practice-table/");
		// driver.get("https://www.toolsqa.com/iframe-practice-page/");
		// driver.get("http://demo.guru99.com/test/drag_drop.html");//drag and drop
		// http://money.rediff.com/gainers/bsc/daily/groupa? //webtable
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	
	//@Test
	public void Actions_classs() throws InterruptedException
	{
		/*driver.get("https://www.spicejet.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).build().perform();
		Thread.sleep(200);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='SpiceClub Members']"))).build().perform();
		Thread.sleep(200);*/
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Actions action = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		WebElement target= driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		
		action.dragAndDrop(source, target).build().perform();
		
	}
	
	@Test
	public void webtable()
	{
		
		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
		
		List<WebElement> totalrows = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr/td[3]"));
		
		System.out.println("total rows:- "+totalrows.size());
		
		List<WebElement> totalcols = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[4]/td"));
		
		System.out.println("total cols:- "+totalcols.size());
		
		for(int i=1; i<=totalrows.size(); i++)
		{
			for(int j=1; j<=totalcols.size(); j++)
			{
				//get total rows and cols data
				//String data = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				
				//get particular row data
				//String data = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[3]/td["+j+"]")).getText();
				
				
				//get particual cols datra
				String data = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]")).getText();
				
				System.out.println("   "+data);
				break;
			}
			
			//System.out.println();
		}
		
	}

}
