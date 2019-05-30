package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import il.co.yad2_new.yad2_auto_tests.infra.pages.Yad2LandingPage;


	
public class Yad2Tests {
	private WebDriver driver;
	@BeforeMethod
	
	public void beforeTest() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		}

	public void _001_testSearch() {
	driver.get("http://yad2.co.il");
	Yad2LandingPage yad2LandingPage = new Yad2LandingPage(driver);
	
	String searchTerm = "Apple";
	yad2LandingPage.wriToTheSearchbox(searchTerm);
	
	}
	

}
