package il.co.yad2_new.yad2_auto_tests.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Yad2LandingPage {
	
	private WebDriver driver;	
	//מיפויים	
	private static final By searchBox = By.id("twotabsearchtextbox");
	private static final By buttonPrivateArea = By.xpath("//*[@id=\"__layout\"]/div/header/nav/ul[2]/li[3]/a");

	
	
	//פונקציות
	public Yad2LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void wriToTheSearchbox(String searchTerm) {
		driver.findElement(searchBox);
		
	}
	
	public void  clickButtonPrivateArea() {
		driver.findElement(buttonPrivateArea).click();
	}

}
