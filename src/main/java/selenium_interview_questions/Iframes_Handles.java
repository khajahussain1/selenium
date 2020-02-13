package selenium_interview_questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframes_Handles {
	WebDriver driver;

	@Test
	public void allframeshandles() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		ArrayList<WebElement> al = new ArrayList<WebElement>();

		List<WebElement> allframes = driver.findElements(By.tagName("iframe"));

		System.out.println(allframes.size());

		Iterator<WebElement> it = allframes.iterator();

		while (it.hasNext()) {
			al.add(it.next());

		}
		driver.switchTo().frame(al.get(0));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("khajahussain");
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='page']/div[1]/header/nav/div/div/form/a")).click();

		// for(int i=0; i<=allframes.size(); i++)
		// {
		//
		// driver.switchTo().frame(allframes.get(i));
		// driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("khajahussain");
		// driver.switchTo().defaultContent();
		// driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("khajahussain");
		//
		// }

	}

}
