package testngexamples;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class HRM {


	@Test(priority=0)
	 public void HRMLogin() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button")).click();
	  }


	@Test(priority=1)
	  public void HRMLogout() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")).click();
			driver.findElement(By.xpath("//a[@href=\"/web/index.php/auth/logout\"]")).click();
	  }
}
