package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LandingPageChecks_Steps extends DriverFactory {
	
	@Given("^I am on the \"([^\"]*)\" page$")
	public void i_am_on_the_page(String startPage) throws Throwable {
		//
		getDriver().get(startPage);
		Thread.sleep(9000);
	}
	
	@Given("^I start on the \"([^\"]*)\" page$")
	public void i_start_on_the_page(String startPage) throws Throwable {
		landingPageChecksPage.openStartPage(startPage);
	}

	@When("^I click on \"([^\"]*)\" from the primary navigation$")
	public void i_click_on_from_the_primary_navigation(String arg1) throws Throwable {

	}

	@Then("^the \"([^\"]*)\" and \"([^\"]*)\" will be correctly formatted$")
	public void the_and_will_be_correctly_formatted(String arg1, String arg2) throws Throwable {

	}

}
