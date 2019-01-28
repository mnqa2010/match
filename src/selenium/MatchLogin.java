package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MatchLogin {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/megha/Desktop/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.match.com/login");

		driver.findElement(By.id("email")).sendKeys("jackie.b@mailinator.com");

		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("abc_123");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='mainContent']/section/form/div/div/div/div[4]/button")).click();// recaptcha

		Thread.sleep(75000);

		// driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/button[2]/span")).click();//let's
		// get started
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/header/nav/div/div[3]/div[1]/button")).click();// profile

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='app']/div[1]/section[2]/div/div[1]/div/div/div")).click();// start
																										// from
																										// height

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='profile-capture-question-cta-self_height-target']/button")).click();// Height

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/div/div[3]/button")).click();// body
																													// type

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/div/div[1]/button")).click();// relationship

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/div/div[1]/button")).click();// kids

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/div/div[2]/button")).click();// want
																													// kids

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/div/div[5]/button")).click();// education

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/div/div[1]/button")).click();// smoke

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/div/div[2]/button")).click();// drink

		Thread.sleep(5000);

		// driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div[1]/div[1]/div/label[4]/span[1]/span")).click();//checkbox
		// ethn

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='profile-capture-question-cta-self_ethnicities-target']/button")).click();// Ethnicity

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='app']/div[1]/section[1]/div/div/a")).click();// skip
																							// link

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='app']/div[1]/section[1]/div/div/a")).click();// salary
																							// skip

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='app']/div[1]/section[1]/div/div/a")).click();// skip

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/button[5]")).click();// Interests
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/button[6]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/button[7]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/button[8]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/button[9]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='profile-capture-question-cta-self_interests-target']/button")).click();// Save
																														// continue
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='profile-capture-question-cta-omni_seek-target']/button")).click();// continue
		Thread.sleep(5000);

		String s = "";
		for (int i = 0; i < 10; i++) {
			s = s.concat("lorem Ipsum");
		}

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/textarea")).sendKeys(s);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='profile-capture-question-cta-self_essay-target']/button")).click();// save&continue

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/section[1]/div/div/a")).click();// skip
																							// profile
																							// pic
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='profile-capture-wrap']/div[2]/div/div/div/a/span")).click();// I'll
																											// join
																											// later
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='aspnetForm']/div[2]/div[1]/div/ul/li[9]/a")).click();

		Thread.sleep(5000);

		// driver.findElements(By.xpath("//*[@id='ctl00_matchHeader_ctl00_PrimaryNavigationRepeater2_ctl08_Repeater2_ctl03_HyperLink4']")).click();

	}

}
