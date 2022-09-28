package SeleniumExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadApacheFacebookLogin {

	public static void main(String[] args) throws IOException {

	
		String filePath="//D:";
		String fileName="FaceBookLogin.xlsx";
		String sheetName="Sheet1";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS); 


	    File file = new File(filePath+"\\"+fileName);


	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook workBook = null;


	    String fileExtensionName = fileName.substring(fileName.indexOf("."));


	    if(fileExtensionName.equals(".xlsx")){

	    	workBook = new XSSFWorkbook(inputStream);

	    }


	    else if(fileExtensionName.equals(".xls")){


	    	workBook = new XSSFWorkbook(inputStream);

	    }


	    Sheet sheet = workBook.getSheet(sheetName);


	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    System.out.println("Row count " +rowCount);
	    

	    for (int i = 1; i < rowCount+1; i++) {

 
	       
	    driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();
	    driver.findElement(By.xpath("//input[@name=\"pass\"]")).clear();

	        
	        	 String email = sheet.getRow(i).getCell(0).getStringCellValue();
	        	 String pass = sheet.getRow(i).getCell(1).getStringCellValue();
	        	 System.out.println(email);
	        	 System.out.println(pass);
	     	    
	 
	            driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(email);	 
	    		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS); 
	    		
	    		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys(pass);		
	    		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS); 
	    		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();

	        
	      

	        System.out.println();
	    } 
	  

	}
	}
