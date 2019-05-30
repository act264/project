package il.co.yad2_new.yad2_auto_tests.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLandingPage {
	
	private WebDriver driver;
	private  static final By searchBox = By.id("twotabsearchtextbox");
	private  static final By goButton = By.xpath("//input[@value='Go']");
	
	public AmazonLandingPage(WebDriver driver) {
		this.driver = driver;
		
		
	}

	public void writeToSearchbox(String searchTerm) {
		
		driver.findElement(searchBox).sendKeys(searchTerm);
		
	}
	
	public void clickButton() {
		driver.findElement(goButton).click();
	}
	
	
}
