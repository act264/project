package il.co.yad2_new.yad2_auto_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;






public class seleniumExamples {
	
	
	
	
	
	private WebDriver driver;

	
	
	
	@BeforeClass
	public void beforeClass() {

		
		if (driver == null) {
		System.setProperty("webdriver.chrome.driver" , "webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	}


	
	@AfterMethod
	public void afterTest() {
		driver.quit();
		driver=null;
		
	}



	@Test
	public void firstSeleniumTest() throws InterruptedException {




		driver.get("http://google.com");

		WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
		searchBox.sendKeys("selenium");

		Thread.sleep(500);
		WebElement iFeelLuckieButton = driver.findElement(By.cssSelector("div[jsname='VlcLAe'] input[name='btnI']"));
		iFeelLuckieButton.click();


	}
}
