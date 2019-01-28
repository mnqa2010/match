package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Logout {

public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "/Users/megha/Desktop/chromedriver");
	
	WebDriver driver = new ChromeDriver();
				
	driver.get("https://www.match.com/login");
				
	driver.findElement(By.id("email")).sendKeys("jackie.b@mailinator.com");
			
	Thread.sleep(2000);

	driver.findElement(By.id("password")).sendKeys("abc_123");

	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id='mainContent']/section/form/div/div/div/div[4]/button")).click();//recaptcha

	Thread.sleep(75000);
	
	//driver.findElement(By.xpath("///*[@id='aspnetForm']/div[2]/div[1]/div/ul/li[9]/a")).click();
	
	driver.get("https://www.match.com/logout/?lid=3");
	
	Thread.sleep(5000);
	
	

	}

}
