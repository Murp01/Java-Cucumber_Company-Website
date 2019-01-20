package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class CareersPage_Steps extends DriverFactory {
	


	@When("^I click on stacked tab \"([^\"]*)\"$")
	public void i_click_on_stacked_tab(String tab) throws Throwable {
		careersPage.clickOnStackedTab(tab);
	}
	
	@Then("^the content of stacked tab \"([^\"]*)\" will be displayed$")
	public void the_content_of_stacked_tab_will_be_displayed(String content) throws Throwable {
		careersPage.assertStackedTabContentIsDisplayed(content);
	}

}
