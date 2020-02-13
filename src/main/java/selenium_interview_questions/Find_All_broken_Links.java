package selenium_interview_questions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* 
 * Let’s see some of the HTTP status codes:

   200 – valid Link, OK

   400 – Bad Request

   401 – Unauthorized
   
   404 – Link Not Found

   500 – Internal error
   
   How to check the Broken Links and images
   For checking the broken links, 

   you will need to do the following steps.

   Collect all the links in the web page based on <a> tag.
   Send HTTP request for the link and read HTTP response code.
   Find out whether the link is valid or broken based on HTTP response code.
   Repeat this for all the links captured.
   
   */

public class Find_All_broken_Links {

	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.get("https://www.softwaretestingmaterial.com");

		driver.get("https://www.google.com/");

		// driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

		// driver.get("https://www.uvdesk.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links are " + links.size());

		for (int i = 0; i < links.size(); i++) {

			//WebElement element = links.get(i);

			// By using "href" attribute, we could get the url of the requried link

			String url = links.get(i).getAttribute("href");

			// calling verifyLink() method here. Passing the parameter as url which we
			// collected in the above link
			// See the detailed functionality of the verifyLink(url) method below
			try {
				URL linkurl = new URL(url);

				HttpURLConnection httpcon = (HttpURLConnection) linkurl.openConnection();

				httpcon.setConnectTimeout(2000);

				httpcon.connect();

				System.out.println(linkurl);

				if (httpcon.getResponseCode() == 200) {
					System.out.println(linkurl + "--->" + httpcon.getResponseMessage() + " is a valid link");
				} else if (httpcon.getResponseCode() >= 400) {
					System.out.println(linkurl + " ---> " + httpcon.getResponseMessage() + " ---> "
							+ HttpURLConnection.HTTP_NOT_FOUND + "--->" + " is a broken link");

				}
			} catch (Exception e) {
			}
		}
	}
}

/*
 * public static void verifyLink(String urlLink) {
 * 
 * try {
 * 
 * URL link = new URL(urlLink);
 * 
 * // Create a connection using URL object (i.e., link)
 * 
 * HttpURLConnection httpCon = (HttpURLConnection) link.openConnection();
 * 
 * // Set the timeout for 2 seconds httpCon.setConnectTimeout(2000);
 * 
 * // connect using connect method httpCon.connect();
 * 
 * // use getResponseCode() to get the response code. if
 * (httpCon.getResponseCode() == 200) {
 * 
 * System.out.println(urlLink + " ---> " + httpCon.getResponseMessage() + "--->"
 * + " is a valid link"); } else if (httpCon.getResponseCode() >= 400) {
 * 
 * System.out.println(urlLink + " ---> " + httpCon.getResponseMessage() +
 * " ---> " + HttpURLConnection.HTTP_NOT_FOUND + "--->" + " is a broken link");
 * }
 * 
 * if (httpCon.getResponseCode() == 401) { System.out.println(urlLink + " - " +
 * httpCon.getResponseMessage()); }
 * 
 * if (httpCon.getResponseCode() == 404) { System.out.println(urlLink + " - " +
 * httpCon.getResponseMessage()); }
 * 
 * if (httpCon.getResponseCode() == 500) { System.out.println(urlLink + " - " +
 * httpCon.getResponseMessage()); } }
 * 
 * catch (Exception e) { } }
 */