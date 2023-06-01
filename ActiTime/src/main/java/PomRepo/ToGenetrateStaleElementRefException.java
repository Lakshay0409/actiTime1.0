package PomRepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenetrateStaleElementRefException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
	 driver.findElement(By.id("username"));
		
	 driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		 driver.findElement(By.id("username")).sendKeys("trainee");
	}

}
