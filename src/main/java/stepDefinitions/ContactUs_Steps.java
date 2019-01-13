package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ContactUs_Steps extends DriverFactory {
	
	@When("^I select the \"([^\"]*)\" location from the Contact Us drop down box$")
	public void i_select_the_location_from_the_Contact_Us_drop_down_box(String arg1) throws Throwable {
		contactUsPage.selectLocationFromDropDown(arg1);
	}

	@Then("^the details for the \"([^\"]*)\" location will be displayed in the Contact Us box$")
	public void the_details_for_the_location_will_be_displayed_in_the_Contact_Us_box(String arg1) throws Throwable {

	}

}
