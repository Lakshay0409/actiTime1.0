package GenericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	@BeforeSuite
	public void bs() {
		System.out.println("Data base connections has been established");
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("The browser hasa been launched");
		System.out.println("The URL has been navigated");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("Logged in to the application");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("Logged out from the application");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("The browser has been closed");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("The Database connection has been closed");
	}
	
}
