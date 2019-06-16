package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
	@Test
	public void _001_testSearch() {
	driver.get("http://yad2.co.il");
	Yad2LandingPage yad2LandingPage = new Yad2LandingPage(driver);
	
	//String searchTerm = "Apple";
	//yad2LandingPage.wriToTheSearchbox(searchTerm);
	
	}
	
	public void clickButton() {
		driver.findElement(By.xpath("//li[@class='no_sub_menu private_zone desktop_only']")).click();
	}
}
