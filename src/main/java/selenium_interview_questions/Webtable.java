package selenium_interview_questions;

import java.io.File;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtable {
	static WebDriver driver;

	//@Test
	public void No_of_rows_and_cols() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");

		List<WebElement> tcol = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("No of cols are : " + tcol.size());

		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("No of rows are : " + rows.size());

		List<WebElement> noofrowsnoofcolums = driver
				.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td"));

		System.out.println("no of rows * no of columes are : " + noofrowsnoofcolums.size());

	}

	//@Test
	public void Row_and_Cell() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver2.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		// WebElement baseTable = driver.findElement(By.tagName("table"));

		// To find third row text of table

		List<WebElement> tolcol = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr[1]/th"));

		System.out.println(tolcol.size());

		for (int i = 1; i <= tolcol.size(); i++) {

			String rowtext = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[" + i + "]"))
					.getText();

			System.out.println("Third row of table : " + rowtext);
		}

		// To find third columns text of table

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[3]"));

		for (int i = 1; i < rows.size(); i++) {
			
			String tablecol = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[" + i + "]/td[3]"))
					.getText();

			System.out.println("thired col of table : " + tablecol);
		}

		// to get 3rd row's 2nd column data
		String text = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[2]")).getText();

		System.out.println("Cell value is : " + text);

	}

	 //@Test
	public void Max_price_From_Table() throws ParseException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bsc/daily/groupa?");

		String max;
		double m = 0, r = 0;

		// No. of Columns
		List<WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));

		System.out.println("Total No of columns are : " + col.size());

		// No.of rows
		List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));

		System.out.println("Total No of rows are : " + rows.size());

		for (int i = 1; i < rows.size(); i++) {
			
			max = driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[" + (i + 1) + "]/td[4]"))
					.getText();

			NumberFormat formater = NumberFormat.getNumberInstance();

			Number n = formater.parse(max);

			max = n.toString();

			m = Double.parseDouble(max);

			if (m > r)

			{
				r = m;
			}
		}
		System.out.println("Maximum current price is : " + r);
	}

	// @Test
	public static void captureScreenMethod() throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,
				new File("F:\\Workspace_Seetest\\SELENIUM1\\screenshots\\SoftwareTestingMaterial.png"));
		driver.close();
		driver.quit();
	}

	// @Test
	public void get_particular_rowvalue() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		
		

		String str = "Clock Tower Hotel";

		for (int i = 1; i < 5; i++) {
			
			String svalue = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();

			if (svalue.equalsIgnoreCase(str)) {

				System.out.print(svalue + " : ");

				for (int j = 1; j <= 5; j++) {

					String cellvalue = driver
							.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" + i + "]/td[" + j + "]"))
							.getText();

					System.out.println(" " + cellvalue);
					break;

				}

				break;

			}
			System.out.println();
		}

	}
	 
	 //@Test
		public void get_particular_cellvalue() {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver1.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.toolsqa.com/automation-practice-table/");

			String str = "Clock Tower Hotel";

			List<WebElement> trows = driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr"));

			// System.out.println("total rows are:- "+trows.size());

			List<WebElement> tcols = driver.findElements(By.xpath("//*[@id='content']/table/tbody/tr[1]/td"));

			// System.out.println("total cols are :- "+tcols.size());

			for (int i = 1; i <= trows.size(); i++) {
				
				String text = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();

				//System.out.println("rows text:- " + text);

				if (text.equals(str)) {
					
					System.out.println("rows text:- " + text);

					for (int j = 1; j <= tcols.size(); j++) {
						
						//here get 1, 2, 6 cell values 

						if (j == 1 || j == 2 || j == 6) {

							String text1 =

									driver.findElement(
											By.xpath("//*[@id='content']/table/tbody/tr[" + i + "]/td[" + j + "]"))
											.getText();

							System.out.print("cols no:- "+j+" text:- " + text1);

						}
						//break;
					}
					break;
				}

			}
		}
		
		//click on dynamic link in a webtable using href attribute
		//@Test
		public void clickLinkByHref() {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver2.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");
			
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        Iterator<WebElement> it = links.iterator();

	        while(it.hasNext()) {
	            WebElement anchor = it.next();
	            if(anchor.getAttribute("href").contains("//money.rediff.com/companies/sagar-cements/11520009")) {
	                anchor.click();
	                break;
	            }
	        }
	    }
		
		//click on dynamic link in a webtable using link text or partial link text
		//@Test
		public void test() throws InterruptedException 
		{

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver4.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");
			
			List<WebElement> totalrows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
			
			System.out.println("total rows are:- "+totalrows.size());
			
			List<WebElement> totalcols = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td"));
			System.out.println("total cols are:- "+totalcols.size());
			
			
			driver.findElement(By.partialLinkText("Sagar Cements")).click();
			
			/*for(int i=1; i<totalrows.size(); i++)
			{
				for(int j=1; j<totalcols.size(); j++)
				{
					String text = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
					String str = "Sagar Cements";
					if(text.equals(str))
					{
						driver.findElement(By.partialLinkText("Sagar Cements")).click();
						break;
					}
				}
				System.out.println();
			}*/
			
			}

}
