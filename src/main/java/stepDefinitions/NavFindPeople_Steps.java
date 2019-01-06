package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class NavFindPeople_Steps extends DriverFactory {
	
	@When("^I hover over the \"([^\"]*)\" title in the primary navigation and click the \"([^\"]*)\"$")
	public void i_hover_over_the_title_in_the_primary_navigation_and_click_the(String title, String webElement) throws Throwable {
		navFindPeoplePage.clickInNavFindPeopleSearchBox(title, webElement);
	}
	
	@When("^I enter the following search term \"([^\"]*)\" into the Search Box$")
	public void i_enter_the_following_search_term_into_the_Search_Box(String searchTerm) throws Throwable {
		navFindPeoplePage.sendKeysToNavLawyerSearch(searchTerm);
	}	
	
	@Then("^all retrieved results will contain the the term \"([^\"]*)\"$")
	public void all_retrieved_results_will_contain_the_the_term(String arg1) throws Throwable {

	}

}
