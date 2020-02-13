package selenium_interview_questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Explicitywait {

	public static WebDriver driver;

	public static void main(String[] args) {

		// ######### implicitywait
		// It is aplying for entair page

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		// ####### Explicitywait ##########
		//Explicitywaits are two types WebDriver wait and Fluent wait
		// it is checking every 1 second
		
		//Explicity wait  below conditions
		
		/*
		 * 1. alertIsPresent()
           2. elementSelectionStateToBe()
           3. elementToBeClickable()
           4. elementToBeSelected()
           5. frameToBeAvaliableAndSwitchToIt()
           6. invisibilityOfTheElementLocated()
           7. invisibilityOfElementWithText()
           8. presenceOfAllElementsLocatedBy()
           9. presenceOfElementLocated()
           10. textToBePresentInElement()
           11. textToBePresentInElementLocated()
           12. textToBePresentInElementValue()
           13. titleIs()
           14. titleContains()
           15. visibilityOf()
           16. visibilityOfAllElements()
           17. visibilityOfAllElementsLocatedBy()
           18. visibilityOfElementLocated()*/

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));

		// ############# polling interval ######################
		// it is checking evering 5 seconds

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.pollingEvery(5, TimeUnit.SECONDS);
		wait1.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));

		// ################# fluentwait #############
		
		/*FluentWait can define the maximum amount of time to wait for a specific condition and frequency with which to check the 
		 * condition before throwing an “ElementNotVisibleException” exception.
		 * We use FluentWait commands mainly when we have web elements which sometimes visible in few seconds and some times 
		 * take more time than usual. Mainly in Ajax applications. We could set the default pooling period based on our 
		 * requirement. We could ignore any exception while polling an element.
		 * 
		 * FluentWait uses two parameters mainly – timeout value and polling frequency. In the above syntax we took time out 
		 * value as 45 seconds and polling frequency as 5 seconds. The maximum amount of time (45 seconds) to wait for a 
		 * condition and the frequency (5 seconds) to check the success or failure of a specified condition. If the element is
		 *  located with in this time frame it will perform the operations else it will throw an “ElementNotVisibleException”
		 * */

		
		WebElement wait3 = new FluentWait<WebDriver>(driver)
				.withTimeout(60, TimeUnit.SECONDS)
				.pollingEvery(3, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		wait3.click();

		// ########## page load time out###########
		// It is applying for only loading page
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// ############# javascript ready state ##########

		ExpectedCondition<Boolean> javascriptwait = new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}

		};
		try {
			System.out.println("Wait for page to load");
			/*WebDriverWait wait4 = new WebDriverWait(driver, 60);
			wait4.until(javascriptwait);*/

		} catch (Throwable error) {
			System.out.println("Time waiting for page load request to complete after " + 60 + "Seconds");
			Assert.assertFalse(true, "Time waiting for page load request to complete");
		}

	}

}
