package stepdefinations;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.asserts.SoftAssert;

public class CucumberProgram1 {
	WebDriver driver = new ChromeDriver();
	 @Given("browser is open and appb     lication is in login page") 
	 public void browser_is_open_and_application_is_in_login_page() 
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			}

	@When("user enters user name and password") 
	public void user_enters_user_name_and_password() 
	{
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS); //instead of thread.sleep
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}

	@Then ("home page is displayed") 
	public void home_page_is_displayed() 
	{
		WebElement actualresult;
		String expectedresult;
		
		expectedresult = "PIM";
		actualresult = driver.findElement(By.xpath("//img[@alt='client brand logo']"));
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualresult, expectedresult);
		System.out.print("Done");
	}
	 
}
