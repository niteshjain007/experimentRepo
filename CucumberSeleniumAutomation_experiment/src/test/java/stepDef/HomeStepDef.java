package stepDef;

import org.testng.Assert;

import hooks.DriverInit;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactPage;
import pages.HomePage;

public class HomeStepDef {

	HomePage homePageobj = new HomePage(DriverInit.Driver);
	ContactPage contactPageObj = new ContactPage(DriverInit.Driver);
	
	@When("user clicks on contact link")
	public void user_clicks_on_contact_link() {
		
		homePageobj.clickOnContactLink();

	}

	@Then("contact page should be displayed")
	public void contact_page_should_be_displayed() {
		String url = contactPageObj.getCurrentpageUrl();
		Assert.assertTrue(url.contains("/contact"));
		
	}

}
