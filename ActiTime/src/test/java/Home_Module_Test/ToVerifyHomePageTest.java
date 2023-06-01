package Home_Module_Test;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class ToVerifyHomePageTest extends Baseclass{
	@Test
	public void verifyhomepagetest() {
	
		
		
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Enter"));
	
		String homepageTitle = driver.getTitle();
	
		Assert.assertTrue(homepageTitle.contains("Enter"));
		System.out.println("pass: the home page has been verified");
		
		
		
	}
	}
