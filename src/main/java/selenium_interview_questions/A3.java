package selenium_interview_questions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A3 {

	WebDriver driver;

	@Test
	public void test() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver2.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-table/");

		List<WebElement> totalrows = driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr"));

		System.out.println("total rows are:- " + totalrows.size());

		List<WebElement> totalcols = driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr[1]/td"));
		System.out.println("total cols are:- " + totalcols.size());

		String str = "Clock Tower Hotel";
		String str1 = "Mecca";

		for (int i = 1; i < totalrows.size(); i++) {
			String text = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();

			if (text.equals(str)) {
				for (int j = 1; j < totalcols.size(); j++) {

					String celldata = driver
							.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" + i + "]/td[" + j + "]"))
							.getText();

					if (celldata.equals(str1)) {
						System.out.println(celldata);
						break;

					}
				}

			}
		}

	}

	//@Test
	public void test1() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {

			WebElement element = links.get(i);

			String url = element.getAttribute("href");

			System.out.println(element.getAttribute("href"));

			URL linkurl = new URL(url);

			HttpURLConnection httpcon = (HttpURLConnection) linkurl.openConnection();

			httpcon.setConnectTimeout(20000);

			httpcon.connect();

			System.out.println(linkurl);

		}
	}

}
