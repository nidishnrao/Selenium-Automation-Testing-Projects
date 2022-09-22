package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("Nidish");	
		driver.findElement(By.name("lastname")).sendKeys("Rao");
		driver.findElement(By.name("reg_email__")).sendKeys("Nidish@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Nidish@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Admin123");
		
		driver.findElement(By.name("birthday_day")).sendKeys("1");
		driver.findElement(By.name("birthday_month")).sendKeys("10");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		
		driver.findElement(By.name("websubmit")).click();
	}

}
