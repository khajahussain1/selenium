package selenium_interview_questions;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Databaseconnection {
	WebDriver driver;
	private Connection con = null;
	private Statement st = null;
	String dataBaseName = "student";
	String DBPath = "jdbc:oracle:thin:@localhost:1521:xe";
	String DB_username = "khaja";
	String DB_password = "khaja";
	String Query;
	ResultSet rs;
	
	
	/*Class.forName("com.mysql.jdbc.Driver"); //For MySQL
	Class.forName ("oracle.jdbc.driver.OracleDriver"); //For Oracle
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //For MS SQL Server

	Connection con = DriverManager.getConnection("jdbc:myDriver:myDatabase",username,password);
	//For MySQL: myDriver = mysql
	//For SQL Server: myDriver = sqlserver
	//For Oracle: myDriver = oracle
	//myDatabase: database path: e.g - //&lt;systemipadd/Servername&gt;/dataBaseName  */

	@BeforeTest
	public void DBConnection() throws Exception {
		try {
			//step1 load the driver class for Oracle 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//step2 create  the connection object for Oraclr 
			con = DriverManager.getConnection(DBPath, DB_username, DB_password);
			
			//step3 create the statement object 
			st = con.createStatement();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void tc_1() throws Exception {
		try {
			//step4 execute query  
			Query = "Select * from student";
			rs = st.executeQuery(Query);

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.qavalidation.com/demo");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
	

			int i = 1; // to name the screenshot file
			while (rs.next()) // move to the next row in result set, row by row
			{
				
				String FullName = rs.getString("sname");
				System.out.print(FullName+" ");
				String Email = rs.getString("email");
				System.out.print(Email+" ");
                String phone = rs.getString("mobile");
				
				//String ph=Integer.toString(phone);
				System.out.print(phone+" ");
								
				String Gender = rs.getString("gender");
				System.out.print(Gender+" ");
				System.out.println();
				
                //int phone = rs.getInt("mobile");
				
				//String ph=Integer.toString(phone);
				
				
				 driver.findElement(By.id("username")).sendKeys(FullName);
				driver.findElement(By.id("email")).sendKeys(Email);
				
				driver.findElement(By.id("tel")).sendKeys(phone);
				Select se = new Select(driver.findElement(By.name("sgender")));
				se.selectByVisibleText(Gender);
				i++;
				
				//GetScreenShot();
			}

		} catch (Exception e) {
			//GetScreenShot();
			System.out.println(e.getMessage());
			
		}
	}

	@AfterTest
	public void tear() throws SQLException {
		//con = null;
		//con.close();
	}

	public void GetScreenShot() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"/extentreports/screenshot" + ".jpg"));
	}
}