package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
	
	WebDriver dr ;
	public ContactPage(WebDriver driver)
	{
		this.dr= driver;
	}

	By sendBtn = By.cssSelector("button[class *= 'btn-send']");
	By popupMsg = By.cssSelector("div.msgprint");
	                      // div[class='msgprint']
	
	
	public void clickOnSendBtn() throws InterruptedException
	{
		dr.findElement(sendBtn).click();
		Thread.sleep(4000);
	}
	
	public String getErrorMsgFromPopup()
	{
		
		String errorMsg = dr.findElement(popupMsg).getText();
		return errorMsg;
	}
	
	
	public String getCurrentpageUrl()
	{
		return dr.getCurrentUrl();
	}
	
	
	
}
