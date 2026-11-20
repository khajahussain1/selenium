package Appium_interview_questions;

public class Appium_Interview_quesions {

    /*
    For a 11+ years Mobile Automation Testing (Android & iOS) Interview, interviewers usually focus on
    framework design, Appium architecture, parallel execution, CI/CD, cloud execution, coding, API
    integration, reporting, mobile testing concepts, and leadership experience.

    1. Tell me about your Mobile Automation experience.
    Answer: "I have 11+ years of QA experience with around X years in Mobile Automation Testing using
    Appium, Selenium, Java, TestNG, Cucumber BDD, Maven, Jenkins, Git, Docker, and cloud platforms such
    as BrowserStack and Sauce Labs.

    I have designed automation frameworks from scratch using Page Object Model, Page Factory and BDD.
    I have implemented parallel execution for Android and iOS devices, integrated frameworks with Jenkins
    CI/CD pipelines, generated Extent and Allure reports, and reduced regression execution time
    significantly through distributed execution."

    2. What is Appium?
    Answer: Appium is an open-source mobile automation tool used for automating:
    Native Apps
    Hybrid Apps
    Mobile Web Apps

    Supported Platforms: Android and iOS

    Supported Languages:
    Java
    Python
    C#
    JavaScript
    Ruby

    Appium follows the WebDriver protocol.

    3. Explain Appium Architecture.
    Answer: sArchitecture Flow:

    Test Script
        ↓
    Appium Client Libraries
        ↓
    Appium Server
        ↓
    UiAutomator2(XCUITest)
        ↓
    Android/iOS Device

    For Android: UiAutomator2 Driver
    For iOS: sXCUITest Driver

    Appium server converts WebDriver commands into platform-specific commands.

    4. Difference between Native, Hybrid and Web Apps?
    Native App	Hybrid App	Mobile Web App
    Installed on device	Combination of Native + Web	Opens in browser
    Faster	Medium	Depends on network
    Full device access	Partial access	Limited access

    Examples:
    Native: WhatsApp
    Hybrid: Amazon
    Web: m.facebook.com

    5. What locators do you use in Mobile Automation?
    Answer: Preferred order:
    Accessibility ID
    ID
    XPath
    ClassName
    AndroidUIAutomator
    iOS Predicate String
    iOS Class Chain

    Avoid: Absolute XPath
    because it is slow and unstable.

    6. Difference between Accessibility ID and XPath?
    Accessibility ID	XPath
    Faster	            Slower
    Stable	            Fragile
    Recommended	        Last option
    Cross Platform	    Platform dependent

    7. How do you inspect mobile elements?
     Android
     Appium Inspector
     UIAutomatorViewer
     Layout Inspector

     iOS
     Appium Inspector
     Xcode Accessibility Inspector

    8. How do you get appPackage and appActivity?
    Shell: adb shell dumpsys window | grep mCurrentFocus
                OR
    Shell: adb shell dumpsys activity activities

    9. How do you find Android device UDID?
    Shell: adb devices
    Example:
    R58M12345ABC device

    10. How do you find iOS UDID?
    Simulator:--> Shell: xcrun simctl list devices
    Real Device:--> Shell: idevice_id -l

    11. Explain Desired Capabilities.
    Answer: Desired Capabilities provide information to Appium server.
    Example: Java
    UiAutomator2Options options = new UiAutomator2Options();
    options.setPlatformName("Android");
    options.setDeviceName("Pixel");
    options.setAutomationName("UiAutomator2");
    options.setApp("/apps/demo.apk");

    12. Difference between AppiumDriver, AndroidDriver and IOSDriver?
    Java
         AppiumDriver
            |
        ---------------------
         |                   |
    AndroidDriver       IOSDriver

    AppiumDriver -> Generic methods
    AndroidDriver -> Android-specific methods
    IOSDriver -> iOS-specific methods

    13. Explain POM Framework.
    Answer:- Page Object Model separates:
    Page Classes
    Java
    LoginPage
    HomePage
    CartPage
    Test Classes
    Java
    LoginTest
    CheckoutTest

    Benefits:- Reusability and Maintainability and Readability

    14. Why PageFactory?
    Answer:- PageFactory initializes elements automatically.
    Java
    @AndroidFindBy(id="username")
    MobileElement username;
    Java
    PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    15. What challenges did you face in Mobile Automation?
    Dynamic XPath:
    Solution:
    Java
    Accessibility ID
    Resource ID

    Element Synchronization:-
    Solution:
    Java
    WebDriverWait
    ExpectedConditions

    Stale Elements:
    Solution:
    Re-locate element.

    App Crashes:
    Solution: Retry mechanism and proper exception handling.

    16. How do you handle mobile gestures?
    Tap:- driver.executeScript("mobile: clickGesture",Map.of());
    Swipe:- driver.executeScript("mobile: swipeGesture");
    Scroll:- driver.executeScript("mobile: scrollGesture");
    Long Press:- driver.executeScript("mobile: longClickGesture");

    17. How do you switch between Native and WebView?
    Set<String> contexts = driver.getContextHandles();
    driver.context("WEBVIEW");
    Back: driver.context("NATIVE_APP");

    18. How do you handle OTP in automation?
    Answer: Approaches:
    Database Validation
    API Retrieval
    Test Environment Static OTP
    Mail Service Integration
    Avoid real SMS validation in automation.

    19. How do you achieve Parallel Testing?
    Answer:
    Using:
    TestNG Parallel
    Multiple Appium Servers
    ThreadLocal Drivers
    private static ThreadLocal<AppiumDriver> driver= new ThreadLocal<>();
    driver.set(androidDriver);
    driver.get();

    Benefits:
    Faster execution
    Multiple devices execution

    20. Explain ThreadLocal in Appium.
    Answer:
    Each thread gets its own driver instance.
    Thread 1 → Android Driver
    Thread 2 → Android Driver
    Thread 3 → IOS Driver
    No driver collision.

    21. How do you run Android and iOS in parallel?
    Answer: Framework contains:
    AndroidDeviceManager
    IOSDeviceManager
    DriverFactory
    ThreadLocal
    TestNG Parallel

    Each device:
    Unique UDID
    Unique Port
    Unique WDA Port
    Unique System Port
    Example:
    Android1 -> 8201
    Android2 -> 8202
    IOS1 -> 8101
    IOS2 -> 8102

    22. What is WDA?
    Answer: WebDriverAgent is an Apple automation server used by Appium to communicate with iOS devices.

    Appium
        ↓
    WebDriverAgent
        ↓
    iOS Device

    23. Explain CI/CD integration.
    Answer:
    Tools Used:
    Git
    Jenkins
    Maven
    Appium
    Allure
    Docker

    Pipeline:
    Code Commit
        ↓
        Git
        ↓
    Jenkins
        ↓
    Maven Build
        ↓
    Execute Tests
        ↓
    Allure Report
        ↓
    Email Notification

    24. How do you generate reports?
    Extent Reports
    ExtentSparkReporter
    ExtentReports
    Allure Reports
    Shell: allure serve

    25. Explain Appium Inspector.
    Answer: Used for:
    Element inspection
    XPath generation
    Accessibility ID retrieval
    Real-time page source viewing

    26. Difference between Implicit Wait and Explicit Wait?
    Implicit	        Explicit
    Global	            Specific
    Less control	    More control
    Applied to all elements	Applied to target element
    Recommended: WebDriverWait

    27. How do you handle hidden elements?
      JavascriptExecutor
        OR
      scrollIntoView()
            OR
      gesture scrolling.

    28. Explain Docker usage in Mobile Automation.
    Answer: Docker provides:
    Consistent environments
    Easy scalability
    Faster setup
    Selenium Grid integration

    Used with:
    Appium
    Android Emulator
    Selenium Grid

    29. Difference between Appium Grid and Selenium Grid?
        Appium Grid	            Selenium Grid
        Mobile execution	    Web execution
        Android/iOS	            Browser
        Real Devices	        Chrome/Firefox/Edge

    30. What framework architecture have you designed?
    Answer:
        Framework
        │
        ├── Features
        ├── StepDefinitions
        ├── Runners
        ├── Pages
        ├── Utilities
        ├── DriverFactory
        ├── DeviceManager
        ├── Hooks
        ├── Config
        ├── Reports
        └── TestData

    Technology Stack:
    Appium
    Selenium
    TestNG
    Cucumber
    Maven
    Jenkins
    Git
    Allure
    Extent
    Docker
    BrowserStack

    Scenario-Based Questions
    Q31. One Android device runs but another device doesn't run in parallel. What will you check?
    Answer:
    Check:
    Different UDIDs
    Different Appium ports
    Different systemPort values
    Device availability
    Shell: adb devices

    Example:
    device 1 → systemPort=8201
    device 2 → systemPort=8202

    Q32. Cucumber Scenarios returned empty array.
    Answer:
    Check:
    @DataProvider(parallel=true)
    Feature path.
    Glue path.
    Runner configuration.

    Q33. App not launching in iOS.
    Answer:
    Check:
    WDA installation
    Xcode version
    Signing Certificate
    UDID
    Platform Version
    Bundle ID
    Coding Questions
    Count Characters

    Coding Questions
    1. Count Characters
    Input:- AAABBBBCCCCC
    Output:
    A=3
    B=4
    C=5

    String str="AAABBBBCCCCC";
    Map<Character,Integer> map=new LinkedHashMap<>();
    for(char c:str.toCharArray()){
    map.put(c,map.getOrDefault(c,0)+1);
    }
    System.out.println(map);

    2. Find Duplicate Characters
    String str = "automation";

Set<Character> unique = new HashSet<>();

for(char ch : str.toCharArray()) {
    if(!unique.add(ch)) {
        System.out.println(ch);
    }
}

    3. Count Words in String
    String str = "Appium Selenium Java";

String[] words = str.split("\\s+");

System.out.println(words.length);

    4. Remove Duplicate Characters
    //input: aabbccdd and output: abcd
    String str = "aabbccdd";

StringBuilder sb = new StringBuilder();

for(char ch : str.toCharArray()) {
    if(sb.indexOf(String.valueOf(ch)) == -1) {
        sb.append(ch);
    }
}

System.out.println(sb);

    5. Prime Number
    int num = 17;

boolean prime = true;

for(int i = 2; i <= num / 2; i++) {
    if(num % i == 0) {
        prime = false;
        break;
    }
}

System.out.println(prime);

    5. Automation Framework Coding Questions
    11. Singleton Driver Pattern
    public class DriverManager {

    private static AppiumDriver driver;

    private DriverManager() {}

    public static AppiumDriver getDriver() {

        if(driver == null) {
            driver = createDriver();
        }

        return driver;
    }
}
    6. Sort Array
    int[] numbers = {50,20,90,10};

Arrays.sort(numbers);

System.out.println(Arrays.toString(numbers));

    7. Find Second Largest Number
    int[] arr = {10,90,40,60};

Arrays.sort(arr);

System.out.println(arr[arr.length - 2]);

    8. HashMap Interview Program
    Map<String, Integer> map =
new HashMap<>();

map.put("Android", 10);
map.put("IOS", 20);

for(Map.Entry<String, Integer> entry :
map.entrySet()) {

    System.out.println(entry.getKey() +
            "=" +
            entry.getValue());
}

    9. Lambda Expression
    List<String> devices =
Arrays.asList("Pixel","Samsung","iPhone");

devices.forEach(System.out::println);
    10. Java Streams
    List<Integer> nums =
Arrays.asList(2,4,6,8,10);

nums.stream()
.filter(n -> n > 5)
.forEach(System.out::println);

    11. Framework Design Coding Question: "Design a DriverFactory for Android and iOS."
    public static AppiumDriver getDriver(
         String platform) {

    if(platform.equalsIgnoreCase("android")) {
        return AndroidDriverManager
               .createDriver();
    }

    if(platform.equalsIgnoreCase("ios")) {
        return IOSDriverManager
               .createDriver();
    }

    throw new RuntimeException(
          "Invalid Platform");
}

Frequently Asked Coding Questions for 11+ Years
Java Programs
Reverse String
Palindrome
Fibonacci
Prime Number
Anagram
Remove Duplicates
Count Characters
Largest/Second Largest Number
Sort Array
HashMap Programs
Framework Coding
ThreadLocal Driver
DriverFactory Design
BaseTest Design
Retry Analyzer
Listeners Implementation
Parallel Execution Framework
Read Properties File
Read Excel using Apache POI
Cucumber Hooks
Dynamic Device Manager
Appium Coding
Swipe Utility Method
Scroll Utility Method
AndroidDriver Manager
IOSDriver Manager
Dynamic Capabilities Builder
Start Appium Server Programmatically
Parallel Android & iOS Execution
Deep Link Automation
Hybrid App Context Switching
Screenshot Utility

For an 11+ years Senior Mobile Automation / QA Architect role, expect about 40% Java coding, 40% framework architecture, and 20% Appium/mobile troubleshooting and parallel execution questions. The most important topics are ThreadLocal, Parallel TestNG, DriverFactory, Design Patterns, Collections, Streams, Appium Architecture, Android/iOS Capability Management, and CI/CD integration with Jenkins/Docker.


    Manager Round Question
    Why should we hire you?
    Answer:- "I bring over 11 years of QA experience with strong expertise in Mobile Automation for Android
     and iOS. I have built scalable Appium frameworks from scratch, implemented parallel execution across
     multiple devices, integrated automation into CI/CD pipelines, mentored team members, and driven
     automation adoption that reduced regression testing effort and improved release quality.
     I can contribute both as a hands-on automation engineer and as a technical leader."

     what is difference between parallel testing with appium selenium java without selenium grid and
    appium grid android and ios device and parallel testing android and ios using docker and
    selenum appium java with selenium grid and appium gride and which one is preferable

    For Appium + Selenium Java parallel testing, there are three common approaches:

    1. Parallel Testing WITHOUT Selenium Grid or Appium Grid
        Architecture
            Machine-1
        ├── Appium Server (Port 4723) -> Android Device-1
        ├── Appium Server (Port 4725) -> Android Device-2
        ├── Appium Server (Port 4727) -> iPhone Simulator-1
        └── TestNG Parallel Threads

        How it works
        Start multiple Appium servers manually.
        Each device gets:
        unique Appium port
        unique systemPort (Android)
        unique wdaLocalPort (iOS)
        TestNG executes tests in parallel.
        DriverManager dynamically assigns devices.
    Pros
    ✅ Easy to setup
    ✅ Best for learning
    ✅ Fast execution
    ✅ No Grid complexity
    ✅ Perfect for 2-10 devices

    Cons
    ❌ Single machine limitation
    ❌ Difficult to scale to many machines
    ❌ Manual Appium management

    Best Use Case
    Most automation teams with:
    2 Android devices
    2 iOS simulators
    Local execution

    This is probably what you're already building in your BDD TestNG Appium framework.
    2. Appium Grid + Selenium Grid
        Architecture
             Selenium Grid Hub
                    |
        --------------------------------
       |              |              |
    Node-1         Node-2         Node-3
    Android-1      Android-2      iPhone-1
    Appium         Appium         Appium

    How it works
    Selenium Grid Hub manages sessions.
    Appium nodes register to Grid.
    Tests connect to the Grid URL.

    Example:- new AndroidDriver(new URL("http://grid-hub:4444/wd/hub"), options);

     Pros
    ✅ Multiple machines supported
    ✅ Centralized execution
    ✅ Device farm capability
    ✅ Easier resource allocation

    Cons
    ❌ More setup complexity
    ❌ Grid maintenance
    ❌ Additional configuration
    ❌ Extra troubleshooting

    Best Use Case
    10-50 devices
    Dedicated QA infrastructure
    Enterprise teams

    3. Docker + Selenium Grid + Appium
    Architecture:-

        Docker Host
    ┌─────────────────────┐
    │ Selenium Hub        │
    └─────────────────────┘
    ┌─────────────────────┐
    │ Android Container 1 │
    └─────────────────────┘
    ┌─────────────────────┐
    │ Android Container 2 │
    └─────────────────────┘
    ┌─────────────────────┐
    │ Appium Container    │
    └─────────────────────┘

    Kubernetes
         |
    Docker Containers
         |
    Selenium Grid
         |
    Appium Nodes
         |
    Real Devices / Emulators

    Pros
    ✅ Fully scalable
    ✅ CI/CD friendly
    ✅ Jenkins integration
    ✅ GitHub Actions integration
    ✅ Easy environment replication
    ✅ Cloud-ready

    Cons
    ❌ Highest complexity
    ❌ Requires Docker knowledge
    ❌ iOS limitations
    ❌ Maintenance overhead

    Best Use Case
    Large enterprise projects
    50+ parallel executions
    Cloud infrastructure
    DevOps teams
    Android vs iOS in Docker

    Android
    Docker works very well:
    ✅ Android Emulator
    ✅ Real Android Devices
    ✅ Selenium Grid
    ✅ Appium
    ✅ Jenkins

    iOS
    Docker support is limited because:
    Xcode only runs on macOS
    WebDriverAgent requires macOS
    Simulators require macOS

    So for iOS:
        Mac Mini
          |
        Appium
          |
    iPhone Simulator

    What is Recommended?
    For Your Situation

    Based on your recent work:
    Java
    Appium 3.x
    Selenium
    Cucumber
    TestNG
    Android + iOS
    Multiple devices
    MacBook Pro M1

    ✅ I strongly recommend:
    Appium + Selenium Java
        +
    TestNG Parallel
        +
    Multiple Appium Servers
        +
    DeviceManager
        +
    No Selenium Grid

    Architecture:
    TestNG Parallel
       |
    DriverManager
       |
    --------------------------
    |            |           |
    Android1   Android2    iPhone1
    4723       4725        4727

    When should you move to Grid?

    Move to Selenium Grid + Appium Grid only when:
    More than 10-15 devices
    Multiple execution machines
    Dedicated CI/CD infrastructure
    Team size grows significantly

    My recommendation for 2026
    Best for your current framework: ✅ Appium + TestNG Parallel (No Grid)
    Best for enterprise labs: ✅ Selenium Grid + Appium Grid
    Best for very large-scale cloud execution: ✅ Docker + Selenium Grid + Appium Grid (and usually
    Kubernetes)

    For your Android + iOS BDD Cucumber TestNG framework on a MacBook Pro, Option 1 (parallel
    execution without Grid) gives the best balance of performance, simplicity, and maintenance
    effort.

    lk*/
}
