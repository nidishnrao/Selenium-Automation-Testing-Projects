package testngexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRMCssSelector {

	
		@Test(priority=0)
		 public void HRMLogin() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
				driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button ")).click();
			
		  }


	}






