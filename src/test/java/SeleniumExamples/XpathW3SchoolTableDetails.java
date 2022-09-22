package SeleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathW3SchoolTableDetails {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS); 
		
		String text = driver.findElement(By.xpath("//table//tr[3]//td[1]")).getText();	
		
		System.out.print(text);

	}

}
