package Appium_interview_questions;

public class App_Activities
{
	
	/*
	 * 
	 * 1. How to get App Activities
       Ans:- 
            Install App:- driver.installApp("/Users/johndoe/path/to/app.apk"); 
            Check whether the specified app is installed on the device:- driver.isAppInstalled("com.example.AppName");
            Launch the app-under-test on the device:- driver.launchApp();
            Send the currently running app for this session to the background:- driver.runAppInBackground(Duration.ofSeconds(10));
            Close an app on device:- driver.closeApp();
            Reset the currently running app for this session:- driver.resetApp();
            Remove an app from the device:- driver.removeApp("com.example.AppName");

       2. How to Get Clipboard
       Ans:- 
             Get the content of the system clipboard:- driver.getClipboard(ClipboardContentType.PLAINTEXT); // get plaintext
                                                       driver.getClipboardText();
             Set the content of the system clipboard:- driver.setClipboard("label", ClipboardContentType.PLAINTEXT, base64Content);
                                                       driver.setClipboardText("happy testing");
                                               
        3. How to Emulate power state
        Ans:- 
              Emulate power state change on the connected emulator:- driver.setPowerAC(PowerACState.OFF);
              Emulate power capacity change on the connected emulator:- driver.setPowerCapacity(100);
              
        4. How to Push File into device
        Ans:- 
             Place a file onto the device in a particular place:- driver.pushFile("/path/to/device/foo.bar", 
                                                                        new File("/Users/johndoe/files/foo.bar"));
             Retrieve a file from the device's file system:- byte[] fileBase64 = driver.pullFile("/path/to/device/foo.bar");
             Retrieve a folder from the device's file system:- byte[] folder = driver.pullFolder("/path/to/device/foo.bar");

        5. How to Perform a shake action on the device
        Ans:- driver.shake();
             Lock the device:- driver.lockDevice();

             Unlock the device:- driver.unlockDevice();
             Check whether the device is locked or not:- boolean isLocked = driver.isDeviceLocked();
             Rotate the device in three dimensions:- driver.rotate(new DeviceRotation(10, 10, 10));
             















                                                           

      



                                               



                                          














 




     

*
*
*/

}
