package Appium_interview_questions;

public class Appium_Concepts {
	
	
	/*
	 * 1. let’s see different locators supported by the Appium driver.

          Finding elements by ID
          Finding elements by name
          Finding elements by className
          Finding elements by AccessibilityId
          Finding elements by AndroidUIAutomator
          Finding elements by Xpath

          syntax of id : driver.findElement(By.id(“resource-id Value”));

          syntax of name : driver.findElement(By.name(text of element));

          syntax of class name : driver.findElement(By.className(“android.widget.Button”));

     2. How to click + button using class name in calculator
     Ans:- we need to store all the elements having that className and store it in a list. The syntax would be like:
         List<MobileElement> plusButton=driver.findElements(By.className(“android.widget.Button”));
         Here, the ‘+’ button has an index value 16, so we have to pass an index value of 16 to take perform action(Just count
         the buttons in rows) 
         plusButton.get(16).click();
         
     3. How to find  AccessibilityId
     Ans:- Accessibility ID usually have text associated with element. As per Appium Docs, accessibility id: a string 
      corresponding to a recursive element search using the Id/Name that the native Accessibility options utilize. This is how 
      the syntax for AccessibilityId looks: driver.findElement(By.AccessibilityId(AccessibilityId value));
     
      Syntax of AccessibilityId:- driver.findElement(By.AccessibilityId("content-desc"));  
      
    4. How to find x-path in Appium
    Ans:- Just like in Selenium, we can use Xpath to locate an element. We can also customize xpath using axis. Though xpath 
        works bit slower compared to ID, this helps us in locating exact element. Syntax would be like:
        driver.findElement(By.xpath(xpath of element)); 
        
       A):-  XPath using class name and ‘text’
          driver.findElement(By.xpath(“//android.widget.Button[@text=’5′]”))
          
          In above ‘android.widget.Button’ is a classname and text value is ‘5’
          
       B): b. Xpath using ‘contains’
           driver.findElement(By.xpath(“//android.widget.Button[contains(@resource-id,’digit5′)]”));   
           
           In above command we are using contains to locate an element having ‘android.widget.Button’ class name and having 
           ‘resource-id’ = ‘digit5’
           
       C):- c. Xpath using ‘contains’ and ‘and’ to club locator values
             driver.findElement(By.xpath(“//android.widget.Button[contains(@resource-id,’digit5′) and @text=’5′]”));
             
             In above command, we are locating an element having class name ‘android.widget.Button’ which contains ID 
             ‘resource-id’ and having ‘text’  
             
      5. Finding elements by AndroidUIAutomator & UISelector
        AndroidUIAutomator is a very powerful locator to find an element. It uses UIselector to find an element. Syntax looks 
        like: driver.findElementByAndroidUIAutomator(“String”);
         If you would like to get a tag name of an element then 
         WebElement element = driver.findElementByAndroidUIAutomator(“new UiSelector().index(0)”);
         assertEquals(“android.widget.FrameLayout”, element.getTagName());

         Here I have passed UISelector as an argument. UiSelector has many more methods in-built. You can verify whether 
         element is scrollable, clickable etc..

         To pick ‘content-desc‘ as equals,then syntax looks like
         WebElement test=driver. findElementBy.AndroidUIAutomator(“new UiSelector().description(\”equals\”)”);   
         
      6. How to create new session
      Ans:- DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            cap.setCapability(MobileCapabilityType.APP, "/path/to/ios/app.zip");

           URL url = new URL("http://127.0.0.1:4723/wd/hub");

           IOSDriver driver = new IOSDriver(url, cap);
            String sessionId = driver.getSessionId().toString();
            
     7. How to get session capabilities
     Ans:- Map<String, Object> caps = driver.getSessionDetails();
     
    8. How to get Get Page Source
    Ans:- String pageSource = driver.getPageSource();
    
   9. How to get Get Orientation and set Orientation
   Ans:- Get Orientation:- ScreenOrientation orientation = driver.getOrientation(); 
         set Orientation:- driver.rotate(ScreenOrientation.LANDSCAPE);    
         
   10. How to Get Geolocation and Set Geolocation
   Ans:- Get Geolocation:- Location location = driver.location(); // Must be a driver that implements LocationContext
         Set Geolocation:- driver.setLocation(new Location(49, 123, 10)); // Must be a driver that implements LocationContext

   11. How to Get available log types
   Ans:-  Get available log types:- Set<String> logTypes = driver.manage().logs().getAvailableLogTypes();
          Get Logs:-  LogEntries logEntries = driver.manage().logs().get("driver");
   
   12. How to Update Device Settings
   Ans:- Update Device Settings:- driver.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, Duration.ofSeconds(5));
         Retrieve Device Settings:- Map<String, Object> settings = driver.getSettings();
         
   13. How to Start Activity
   Ans:- Start Activity:- driver.startActivity(new Activity("com.example", "ActivityName"));
         Get Current Activity:- String activity = driver.currentActivity();
         Get Current Package:- String activity = driver.currentActivity();
         
   


      
         


 
 
 
 
 
 
 
 
 
 
 
 
 
 

*/
}
