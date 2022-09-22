package SeleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathTableDetails {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/ASUS/Downloads/WebTable.html");
	
	
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS); 
		
		driver.findElement(By.xpath("//table//tr[5]//td[1]//input[@type=\"checkbox\"]")).click();	
		
	
	}


}
