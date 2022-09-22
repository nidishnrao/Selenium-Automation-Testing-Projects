package SeleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathFacebookSignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.xpath("//form//div[5]//a")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS); 
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Nidish");	 //using xpath
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Rao");		//using xpath
		
		driver.findElement(By.name("reg_email__")).sendKeys("Nidish@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Nidish@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Admin123");

		WebElement day = driver.findElement(By.name("birthday_day"));
		Select select=new Select(day);
		select.selectByVisibleText("1");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select select1=new Select(month);
		select1.selectByVisibleText("Sep");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select select2=new Select(year);
		select2.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
		
		driver.findElement(By.name("websubmit")).click();
	}

}
