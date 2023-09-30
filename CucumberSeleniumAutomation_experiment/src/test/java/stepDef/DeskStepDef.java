package stepDef;

import org.testng.Assert;

import hooks.DriverInit;
import io.cucumber.java.en.Then;
import pages.DeskPage;

public class DeskStepDef {
	
	DeskPage deskPageObj = new DeskPage(DriverInit.Driver);
	
	@Then("desk page should be displayed")
	public void desk_page_should_be_displayed() {
	   
		String actualUrl= deskPageObj.getCurrentPageUrl();
		Assert.assertTrue(actualUrl.contains("desk"));
		//hard assertion
	}

	@Then("selling module should be visible")
	public void selling_module_should_be_visible()
	{
		Assert.assertTrue(deskPageObj.isSellingModulePresent());
	}

}
