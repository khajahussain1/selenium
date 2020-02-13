package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;


    public class ExcelUtils {
                private static XSSFSheet s;
                private static XSSFWorkbook wb;
                private static org.apache.poi.ss.usermodel.Cell Cell;
                private static XSSFRow Row;
                public static Properties OR;
                WebDriver driver;
               
                
                
           public static Object[][] setExcelFile(String Filepath, String SheetName)throws Exception
           {
        	   String totalrowandcol[][]=null; 
        	   try {
        		   FileInputStream fi=new FileInputStream(Filepath);
        		   
        		   wb = new XSSFWorkbook(fi);

    			   s = wb.getSheet(SheetName);
    			   
    			   int startrow=1;
    			   int startcol=1;  			   
    			   
    			   int totalrows=s.getLastRowNum();
    			  int totalcol=2;
    			   //int totalcol=s.getRow(2).getLastCellNum();
    			   
    			   totalrowandcol=new String[totalrows][totalcol];
    			   
    			   int ri=0;
    			   for(int i=startrow; i<=totalrows; i++, ri++)
    			   {
    				   int cj=0;
    				   
    				   for(int j=startcol; j<=totalcol; j++, cj++)
    				   {
    					  // totalrowandcol[ri][cj]= getCelldata(i,j);
    					   
    					   System.out.print(totalrowandcol[ri][cj]);
    					   
    					  /*if(ExcelUtils.getCelldata(i, j).equalsIgnoreCase(sTestCasesName))
    						{
    							break;
    						}*/
    				   }
    				   System.out.println();
    			   }
        	   }catch(FileNotFoundException e) {
        		   System.out.println("Could not read the Excel sheet");

   				e.printStackTrace();
        	   }
        	   catch (IOException e){

   				System.out.println("Could not read the Excel sheet");

   				e.printStackTrace();

   				}

   			return(totalrowandcol);

   			}

		/*public static String getCelldata(int RowNum, int ColNum) throws Exception
		{
			try {
				
				Cell= s.getRow(RowNum).getCell(ColNum);
				int dataType= Cell.getCellType();
				
				if(dataType==3)
				{
					return null;
				}else {
					String CellData = Cell.getStringCellValue();

					return CellData;}
					
				}catch (Exception e) {
					System.out.println(e.getMessage());

					throw (e);
				}
			}*/
		
		public static String getTestCaseName(String sTestCase)throws Exception{
		String value = sTestCase;
		try{
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			
			posi = value.lastIndexOf(".");	
			value = value.substring(posi + 1);
			
			return value;
				}catch (Exception e){throw (e);
					}
			}
			
		
		public String getScreenShot(String imageName) throws IOException {
			// in case you don't want to supply screen shot name
			if (imageName.equals("")) {
				imageName = "blank";
			}
			File image = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			String imagelocation = System.getProperty("user.dir") + "/src/main/java/resources/screenshot/";

			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

			String actualImageName = imagelocation + imageName + "_" + formater.format(calendar.getTime()) + ".png";
			
			File destFile = new File(actualImageName);
			
			Files.copy(image, destFile);
			
			return actualImageName;
		}
		}
    
    
   /* public static int getRowContains(String sTestCasesName, int colNum) throws Exception
	{
		int i;
		try {
			int rowcount=ExcelUtils.getRowUsed();
			for(i=0; i<rowcount; i++)
			{
				if(ExcelUtils.getCellData(i, colNum).equalsIgnoreCase(sTestCasesName))
				{
					break;
				}
			}
			return i;
			
		}catch(Exception e) {throw (e);}

}
	public static int getRowUsed() throws Exception
	{
		try {
			int RowCount=s.getLastRowNum();
			return RowCount;
			
		}catch(Exception e) {throw (e);}
	}    
    	*/
    
    