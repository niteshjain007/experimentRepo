package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver = null;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	By emailTxtBox = By.id("login_email");
	By passwordTxtBox = By.id("login_password");
	By loginBtn = By.cssSelector("button[class *= 'btn-login'][type='submit']");
	By errorMsg = By.cssSelector(".page-card-head .red.indicator");
	By contactLink = By.xpath("//div[@id='navbarSupportedContent']//li[@class='nav-item']//a[contains(text(),'Contact')]");
	
	public void specifyEmail(String email)
	{
		waitforElementTobeVisible(emailTxtBox);
		driver.findElement(emailTxtBox).sendKeys(email);
	}
	public void specifyPassword(String passwd)
	{
		waitforElementTobeVisible(passwordTxtBox);
		driver.findElement(passwordTxtBox).sendKeys(passwd);
	}
	private void waitforElementTobeVisible(By element) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
	}
	public void clickOnLoginBtn()
	{
		waitforElementTobeVisible(loginBtn);
		driver.findElement(loginBtn).click();
	}
	
	public String getErrorMsg()
	{
		return driver.findElement(errorMsg).getText();
				
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	 
	public  boolean isContactLinkPresent()
	{
		return driver.findElement(contactLink).isDisplayed();
				
	}
	
}
