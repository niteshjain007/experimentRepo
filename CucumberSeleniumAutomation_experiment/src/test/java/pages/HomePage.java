package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By contactLink = By.linkText("Contact");
	By loginLink = By.linkText("Login");
	By exploreBtn = By.linkText("Explore");
	
	public void navigateToLoginPage()
	{
		driver.findElement(loginLink).click();
	}
	
	public void clickOnExpoloreToNavigateToAllProductPage()
	{
		driver.findElement(exploreBtn).click();
	}

	public void navigatetoSpecificUrl(String url)
	{
		driver.navigate().to(url);
	}
	
	public void clickOnContactLink()
	{
		driver.findElement(contactLink).click();
	}
}
