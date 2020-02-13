package selenium_interview_questions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Headless_driver {
	
	/*
	 *  Benefits of Html Unit Driver:
Since it is not using any GUI to test, your tests will run in background without any visual interruption
Compared to all other instances execution is faster
To run your tests through HtmlUnit driver you can also select other browser versions
It is platform independent and easier to run several tests concurrently. Ideal for Load Testing.

*
*/

	@Test
	public void test() throws InterruptedException {

		// Declaring and initialising the HtmlUnitWebDriver

		//WebDriver divers = new HtmlUnitDriver();

		// open google.com webpage
		//divers.get("http://google.com");
		Thread.sleep(2000);

		//System.out.println("Title of the page is -> " + divers.getTitle());

		// find the search edit box on the google page
		// WebElement searchBox = diver.findElement(By.id("fakebox-input"));

		// type in Selenium
		// searchBox.sendKeys("Selenium");

		// find the search button
		/*
		 * WebElement button = diver.findElement(By.name("gbqfba"));
		 * 
		 * // Click the button button.click();
		 * 
		 * System.out.println("Title of the page is -> " + diver.getTitle());
		 */

	}
}
