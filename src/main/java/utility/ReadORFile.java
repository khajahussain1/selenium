package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ReadORFile {
	Properties OR;
	
	//private String path = System.getProperty("user.dir")"";

	// COnstructor to load properties file
	public ReadORFile(String path) {

		OR = new Properties();
		try {
			FileInputStream fis = new FileInputStream(path);
			OR.load(fis);
			fis.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	// Method to get locator type

	public By getLocator(String WebElementName) throws Exception {

		/*
		 * String a = OR.getProperty(WebElementName); //Split the value which contains
		 * locator type and locator value String locatorType = a.split(":")[0]; String
		 * locatorValue = a.split(":")[1];
		 */
		// Retrieve value from properties file using key
		String a = OR.getProperty(WebElementName);

		// extract the locator type and value from the object
		// String s[] = a.split(":");
		// String locatorType = s[0];
		// String locatorValue = s[1];
		String locatorType = a.split(":")[0];
		String locatorValue = a.split(":")[1];

		if (locatorType.toLowerCase().equals("id")) {
			return By.id(locatorValue);
		} else if (locatorType.toLowerCase().equals("name")) {
			return By.name(locatorValue);
		} else if ((locatorType.toLowerCase().equals("classname")) || (locatorType.toLowerCase().equals("class"))) {
			return By.className(locatorValue);
		} else if ((locatorType.toLowerCase().equals("tagname")) || (locatorType.toLowerCase().equals("tag"))) {
			return By.className(locatorValue);
		} else if ((locatorType.toLowerCase().equals("linktext")) || (locatorType.toLowerCase().equals("link"))) {
			return By.linkText(locatorValue);
		} else if (locatorType.toLowerCase().equals("partiallinktext")) {
			return By.partialLinkText(locatorValue);
		} else if ((locatorType.toLowerCase().equals("cssselector")) || (locatorType.toLowerCase().equals("css"))) {
			return By.cssSelector(locatorValue);
		} else if (locatorType.toLowerCase().equals("xpath")) {
			return By.xpath(locatorValue);
		} else
			throw new Exception("Locator type '" + locatorType + "' not defined!!");
	}
}
