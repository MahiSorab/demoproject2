package testcases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1 {

	public static ChromeDriver driver;

	@BeforeMethod
	public void launchDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test
	public void Test1() {
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
		System.out.println("Test 1 title is " + driver.getTitle());
	}
	
	@Test
	public void Test2() {
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
		System.out.println("Test 2 title is " + driver.getTitle());
	}
	
	@Test
	public void Test3() {
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
		System.out.println("Test 3 title is " + driver.getTitle());
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
		//if test case fail then log the defect in JIRA
	}
}
