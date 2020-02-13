package selenium_interview_questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_all_links_in_webpage {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@type='radiobutton']"));

		List<WebElement> dropdown = driver.findElements(By.tagName("select"));

		// java.util.List<WebElement> textboxes =
		// driver.findElements(By.xpath("//input[@type='text'[@class='inputtext']"));
		// System.out.println(textboxes.size());
		System.out.println(dropdown.size());
		System.out.println(links.size());
		System.out.println(checkboxes.size());
		System.out.println(radiobuttons.size());

		for (int i = 0; i <= links.size(); i++)

		{

			//to get all links like :-https://www.spicejet.com/Default.aspx
			System.out.println("get href :- "+links.get(i).getAttribute("href"));
			//to get all links text 
			System.out.println("get text:- "+links.get(i).getText());

		}
		
		/*List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());

		for (int i = 0; i <= iframeElements.size() - 1; i++) {
			System.out.println(iframeElements.get(i).getText());

		}*/


	}

}
