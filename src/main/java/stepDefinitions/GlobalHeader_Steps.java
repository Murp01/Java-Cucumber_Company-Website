package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class GlobalHeader_Steps extends DriverFactory {
	
	@When("^I type \"([^\"]*)\" into the global site search field$")
	public void i_type_into_the_global_site_search_field(String searchTerm) throws Throwable {
		globalHeaderPage.enterSearchTermIntoGlobalSiteSearch(searchTerm);
	}

	@Then("^the results will appear below the global site search field as I type the characters in$")
	public void the_results_will_appear_below_the_global_site_search_field_as_I_type_the_characters_in() throws Throwable {

	}

	@When("^I type \"([^\"]*)\" into the global site search field and click on the search button$")
	public void i_type_into_the_global_site_search_field_and_click_on_the_search_button(String searchTerm) throws Throwable {
		globalHeaderPage.enterSearchTermIntoGlobalSiteSearchViewAllResults(searchTerm);
		Thread.sleep(9000);
	}

	@Then("^the search results screen will display a message stating no results have been returned$")
	public void the_search_results_screen_will_display_a_message_stating_no_results_have_been_returned() throws Throwable {

	}
	
	@Then("^a \"([^\"]*)\" button will appear below the last retrieved article if there are more than (\\d+) results$")
	public void a_button_will_appear_below_the_last_retrieved_article_if_there_are_more_than_results(String arg1, int arg2) throws Throwable {
		
	}

	@Then("^a message will display below the site search field stating no results have been returned$")
	public void a_message_will_display_below_the_site_search_field_stating_no_results_have_been_returned() throws Throwable {

	}
	

	
	@Then("^the search results screen will open displaying up to (\\d+) articles$")
	public void the_search_results_screen_will_open_displaying_up_to_articles(int arg1) throws Throwable {
		globalHeaderPage.assertSearchResultsPageIsDisplayed();
	}

}
