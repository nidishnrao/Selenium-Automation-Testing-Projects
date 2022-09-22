package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MethodOverloadingOrangeHRM  {
	static WebDriver driver = new ChromeDriver(); //Global Declaration
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		Thread.sleep(1000); 
		search("Admin"); // Searching Records via Username
		Thread.sleep(1000);		
		search("Admin","Paul Collings"); // Searching Records via Username , 
		driver.close(); //Closing the driver after completing task
	}

	 static void search(String username) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span")).click(); 	 //Admin selection from side bar
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[1]/div/div[1]/div/div[2]/input[1]")).sendKeys(username);  //User Name 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[2]")).click(); 	//Search button
		Thread.sleep(10000);									//Waiting for 10 seconds until it resets the record
		driver.findElement(By.xpath("//div[2]/button[1]")).click();	//Reset button
	
		}
//We are resetting the record to access next input
	 
	static void search(String username, String empname) throws InterruptedException {
		driver.findElement(By.xpath("//form/div[1]/div/div[1]/div/div[2]/input[1]")).sendKeys(username);
		driver.findElement(By.xpath("//form/div[1]/div/div[3]/div/div[2]/div/div/input")).sendKeys(empname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[2]")).click(); 	//Search button
		Thread.sleep(10000); 	//Waiting for 10 seconds until it resets the record
		driver.findElement(By.xpath("//div[2]/button[1]")).click();	//Reset button
	}


}
