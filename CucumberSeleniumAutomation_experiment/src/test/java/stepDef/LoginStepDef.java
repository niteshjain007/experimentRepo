package stepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import helperUtilities.Utility;
import hooks.DriverInit;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDef {

	
	LoginPage loginPageObj = new LoginPage(DriverInit.Driver);

	HomePage homepageObj = new HomePage(DriverInit.Driver);

	@Given("user is on home page")
	public void user_is_on_home_page() {
		homepageObj.navigatetoSpecificUrl("https://test.techlift.in/");

	}

	@When("^user navigate to login page$")
	public void user_navigate_to_login_page() {
		homepageObj.navigateToLoginPage();

	}

	@And("^user specifies invalid crdential$")
	public void user_specifies_invalid_crdential() throws InterruptedException {
		// specifyEmail
		Utility uobj = new Utility();
		// loginPageObj = PageFactory.initElements(dr, LoginPage.class);
		loginPageObj.specifyEmail(uobj.getDate());
		Thread.sleep(6000);
		// specifyPassword
		loginPageObj.specifyPassword(uobj.getRandomNumnber(4) + "___");
		Thread.sleep(6000);

	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
		// clickOnLogin
		loginPageObj.clickOnLoginBtn();
		Thread.sleep(4000);
	}

	@Then("^error invalid login should be displayed$")
	public void error_should_be_displayed() {
		// GetErrorMsg
		String actualErrorMsg = loginPageObj.getErrorMsg();
		String expectedErrorMsg = "Invalid Login. Try again.";

		Assert.assertTrue(actualErrorMsg.equals(expectedErrorMsg), "error msg not equal");

	}

	@When("user specifies valid crdential")
	public void user_specifies_valid_crdential() {
		// specifyEmail

		// loginPageObj = PageFactory.initElements(dr, LoginPage.class);
		loginPageObj.specifyEmail("nitesh_iiitm@yahoo.com");
		// specifyPassword
		loginPageObj.specifyPassword("Test@123");
		
	}

	@When("user specifies email as {string}")
	public void user_specifies_email_as(String emailVal) throws InterruptedException {
		loginPageObj.specifyEmail(emailVal);
		Thread.sleep(2000);
		
	}

	@When("user specifies password as {string}")
	public void user_specifies_password_as(String passwordVal) throws InterruptedException {
		loginPageObj.specifyPassword(passwordVal);
		Thread.sleep(6000);

	}

	@When("user specifies the valid creadential as below")
	public void user_specifies_valid_creadential_as_below(DataTable data) throws InterruptedException
	{
		loginPageObj.specifyEmail(data.asMaps().get(0).get("userid"));
		Thread.sleep(2000);
		loginPageObj.specifyPassword(data.asMaps().get(0).get("password"));
		Thread.sleep(6000);

	}
}
