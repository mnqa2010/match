package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ProfileCreation {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/megha/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.match.com/dnws/registration/registration.aspx");
		
		driver.findElement(By.xpath("//*[@id='postalCode']")).sendKeys("75001");
		
		driver.findElement(By.xpath("//*[@id='progessive']/div[1]/fieldset[1]/button")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='progessive']/div[1]/fieldset[2]/div[2]/input")).sendKeys("jackie.b@mailinator.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='progessive']/div[1]/fieldset[2]/button")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='progessive']/div[1]/fieldset[3]/div[1]/input")).sendKeys("abc_123");
		
		Thread.sleep(5000);
		
		Select dropdown = new Select(driver.findElement(By.id("birthMonth")));
		
		dropdown.selectByIndex(7);
		
		Thread.sleep(5000);
		
		Select dropdown1 = new Select(driver.findElement(By.id("birthDay")));
		
		dropdown1.selectByIndex(10);
		
		Thread.sleep(5000);
		
		Select dropdown2 = new Select(driver.findElement(By.id("birthYear")));
		
		dropdown2.selectByIndex(75);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='progessive']/div[1]/fieldset[3]/div[3]/button")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='submit']/input")).sendKeys("Kerry");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='submit']/button")).click();
		
		
		
		
		
		
		
		
		

	}

}
