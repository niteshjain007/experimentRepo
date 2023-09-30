package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DeskPage {
	
	WebDriver driver = null;
	public DeskPage(WebDriver driver)
	{
		this.driver = driver;
		
	}

	// desk page elements
	By sellingModuleLink = By.xpath("//a//h4//div[contains(text(),'Selling')]");
	
	public String getCurrentPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean isSellingModulePresent()
	{
		return driver.findElement(sellingModuleLink).isDisplayed();
	}
	
	public void navigateToSellingModule()
	{
		driver.findElement(sellingModuleLink).click();
	}
}
