package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class Fintech_Steps extends DriverFactory {
	
	@When("^I select \"([^\"]*)\" from the location dropdown box$")
	public void i_select_from_the_location_dropdown_box(String option) throws Throwable {
		fintechPage.selectLocationFromFintechPersonLocationSearch(option);		
	}

	@Then("^the lawyers will filter displaying lawyers who match the \"([^\"]*)\"$")
	public void the_lawyers_will_filter_displaying_lawyers_who_match_the(String location) throws Throwable {
		fintechPage.assertAllFilteredFintechLawyersLocations(location);
	}

}
