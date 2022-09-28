package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathOrangeHRMApplyLeave  {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[3]//span")).click(); 	 //Leave selection from side bar
		Thread.sleep(1000);
		driver.findElement(By.xpath("//nav/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//div[@class=\"oxd-select-text--after\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		
		driver.findElement(By.xpath("//form//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys("2022-9-30");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea")).sendKeys("Family Function");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

	 

}