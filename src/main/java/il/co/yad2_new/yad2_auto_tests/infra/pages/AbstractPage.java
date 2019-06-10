package il.co.yad2_new.yad2_auto_tests.infra.pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage (WebDriver driver) {
		this.driver = driver;
		
	}
}
