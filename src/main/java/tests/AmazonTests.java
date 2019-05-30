package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTests {
	private WebDriver driver;

	
	
	@BeforeClass
	public void beforeClass() {

		
		if (driver == null) {
		System.setProperty("webdriver.chrome.driver" , "webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	}
	
	/*
	 * @Test public void amazonSearchTest() { String searchTerm = "Samsung"; String
	 * expectedWordInFirstResult = "Samsung";
	 * 
	 * driver.get("http://amazon.com");
	 * 
	 * //הזנה לשדה חיפוש WebElement searchBox =
	 * driver.findElement(By.id("twotabsearchtextbox"));
	 * searchBox.sendKeys(searchTerm);
	 * 
	 * //לחיצה על כפתור חיפוש
	 * driver.findElement(By.xpath("//input[@value='Go']")).click();
	 * 
	 * //איתור של תוצא ראשוננה בין התוצאות אשר אינה פרסומת String
	 * firstNonSponsoredResultTitle =
	 * driver.findElement(By.xpath("//div[@data-index='0']")).getText();
	 * 
	 * Assert.assertTrue(firstNonSponsoredResultTitle.contains(
	 * expectedWordInFirstResult),"The first result do not contains " +
	 * expectedWordInFirstResult);
	 * 
	 * 
	 * }
	 */	
	
	
	@Test
	public void _002_logInToAmazon() {
		
		driver.get("http://amazon.com");
				
		Actions action = new Actions(driver);
		WebElement helloSignInLink = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(helloSignInLink).build().perform();
		
		driver.findElement(By.xpath("//div[@id='nav-al-signin']//span[text()='Sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("as342d@.com");
		driver.findElement(By.id("ap_password")).sendKeys("asdewr");
		driver.findElement(By.id("signInSubmit")).click();
		
		WebElement warningMassageTitle = driver.findElement(By.xpath("//div[@id = 'auth-warning-message-box']//h4"));
		String warningMassageTitleText = warningMassageTitle.getText();
		
		Assert.assertEquals(warningMassageTitleText, "Important Message! || " , "Wrong warning massage ");


		
	
	}
	
	
	

}
