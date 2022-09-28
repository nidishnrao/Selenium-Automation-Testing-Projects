package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form/div/input[@name=\"otracker\"]")).sendKeys("6362468208");	
		driver.findElement(By.xpath("//form/div/input[@name=\"otracker1\"]")).sendKeys("NIDISH123456");	

		driver.findElement(By.xpath("//form/div[4]/button")).click();

	}

}
