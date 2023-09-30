package stepDef;

import org.testng.Assert;

import hooks.DriverInit;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactPage;

public class ContactStepDef {

	ContactPage contacgPageObj = new ContactPage(DriverInit.Driver);
	
	@When("user clicks on send button")
	public void user_clicks_on_send_button() throws InterruptedException
	{
		contacgPageObj.clickOnSendBtn();
	}
	
	
	@Then("this error message {string} should be displayed")
	public void error_message_shuold_be_displayed(String expectedMsg)
	{
		String actualErrorMsg = contacgPageObj.getErrorMsgFromPopup();
		Assert.assertTrue(actualErrorMsg.contains(expectedMsg));
	}
	
}
