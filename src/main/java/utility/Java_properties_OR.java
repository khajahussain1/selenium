package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class Java_properties_OR {
	
	Properties OR;

	public Java_properties_OR() {

		OR = new Properties();
		try {
			
			FileInputStream fis = new FileInputStream("path of the OR file");
			OR.load(fis);
			fis.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}


	public By getLocator(String WebElementName) throws Exception {

		String str = OR.getProperty(WebElementName);
		
		String locatorType = str.split(":")[0];
		String locatorValue = str.split(":")[1];

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
			throw new Exception("Locator type " + locatorType + "' not defined!!");
	}

	public static void main(String[] args) throws IOException {

		// Properties OR = new Properties();
		//
		// File fi = new File(System.getProperty("user.dir") + "/src/main/java/p/OR1");
		//
		// FileInputStream fil = new FileInputStream(fi);
		//
		// OR.load(fil);
		//
		// System.out.println(OR.getProperty("USER_NAME"));

		// what are the selenium (functions) locator are working in javascript

		// following-seblings
		// preceding-seblings
		// start-with()
		// ends-with()
		// following
		// precedings
		// contains

		// nth-child(1)
		// $(starts-with)
		// ^(ends-with)
		// *(contains)

	}

}
