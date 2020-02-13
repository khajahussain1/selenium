package selenium_interview_questions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		/*
		 * 
		 * What is the difference between build().perform() and perform()
*/
		
		//mouse over the webelement
		Actions a = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath(""));
		a.moveToElement(ele).build().perform();
		
		//drag and drop
		
		Actions a1 = new Actions(driver);
		WebElement source = driver.findElement(By.xpath(""));
		WebElement target = driver.findElement(By.xpath(""));		
		a1.dragAndDrop(source, target).build().perform();
		
		//other way of mouse over and drag and drop
		WebElement element =driver.findElement(By.xpath(""));
		
		a1.clickAndHold(element).moveToElement(element).release(element).build().perform();
		
		//other way of mouse over and drag and drop
		Actions a2 = new Actions(driver);
		a2.moveToElement(driver.findElement(By.xpath("//*[@id='dragable']")));
		a2.keyDown(Keys.CONTROL);
		a2.moveToElement(driver.findElement(By.xpath("//*[@dropable]")));
		a2.keyDown(Keys.CONTROL);
		a2.build().perform();
		a2.doubleClick();
		
		//how to perform double click
		
		
		
		
		//how to perform keys in selenium using key calss
		
		a2.sendKeys(Keys.ENTER);
		a2.sendKeys(Keys.F6);
		
		//how to perform Right-click in Selenium
		//method-1
		a2.contextClick(element).build().perform();
		
		//method-2
		a2.moveToElement(element).contextClick().build().perform();
		
		
		//how to perform Double click in Selenium
		//method-1
		a2.doubleClick(element).build().perform();
		
		//method-2
		a2.moveToElement(element).doubleClick().build().perform();
		
		
		
	}

}
