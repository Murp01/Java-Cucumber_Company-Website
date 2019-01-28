package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class EventPage_Steps extends DriverFactory {
	
	
	@Given("^all filters have been changed and the search query has been returned$")
	public void all_filters_have_been_changed_and_the_search_query_has_been_returned() throws Throwable {

	}
	
	
	@Given("^search results have been retrieved$")
	public void search_results_have_been_retrieved() throws Throwable {
		String xpath = "//div[@class='btn-group bootstrap-select show-tick']//select[@title='Practice']/option";	
		basePage.selectOptionFromSpecifiedDropDownList(xpath, "Corporate/M&A");
	}
	
	@When("^I enter \"([^\"]*)\" into the Event Widgets Name field$")
	public void i_enter_into_the_Event_Widgets_Name_field(String name) throws Throwable {
		eventsPage.inputTextIntoNameField(name);
	}



	@When("^I enter a search term that matches no events$")
	public void i_enter_a_search_term_that_matches_no_events() throws Throwable {
		eventsPage.inputTextIntoNameField("faspdofjap;;;;''@");
	}


	@When("^I select \"([^\"]*)\" from the practice dropdown box$")
	public void i_select_from_the_practice_dropdown_box(String option) throws Throwable {
		eventsPage.selectOptionFromPracticeDropDownList(option);
	}
	

	@When("^I select \"([^\"]*)\" from the locations dropdown box$")
	public void i_select_from_the_locations_dropdown_box(String option) throws Throwable {
		eventsPage.selectOptionFromLocationDropDownList(option);
	}
	

	@When("^I select \"([^\"]*)\" from the events in future box$")
	public void i_select_from_the_events_in_future_box(String option) throws Throwable {
		eventsPage.selectOptionFromTenseDropDownList(option);
	}
	

	@When("^I select \"([^\"]*)\" from the topics dropdown box$")
	public void i_select_from_the_topics_dropdown_box(String option) throws Throwable {
		eventsPage.selectOptionFromTopicDropDownList(option);
	}
	

	@When("^I select \"([^\"]*)\" from the type dropdown box$")
	public void i_select_from_the_type_dropdown_box(String option) throws Throwable {
		eventsPage.selectOptionFromTypeDropDownList(option);
	}
	

	@When("^I select \"([^\"]*)\" from the speaker dropdown box$")
	public void i_select_from_the_speaker_dropdown_box(String option) throws Throwable {
		eventsPage.selectOptionFromSpeakerDrownList(option);
	}


	@When("^I select \"([^\"]*)\" from the sort dropdown box$")
	public void i_select_from_the_sort_dropdown_box(String option) throws Throwable {
		eventsPage.selectOptionFromSortDrownList(option);
	}


	@When("^I click on the Edit Search button$")
	public void i_click_on_the_Edit_Search_button() throws Throwable {

	}


	@When("^I click on the events title$")
	public void i_click_on_the_events_title() throws Throwable {

	}


	@When("^I click on the events view link$")
	public void i_click_on_the_events_view_link() throws Throwable {

	}
	
	
	@Then("^all retrieved search results will meet the search criteria$")
	public void all_retrieved_search_results_will_meet_the_search_criteria() throws Throwable {
		String searchterm = null;
		String practiceoption = null;
		String locationoption = null;
		String occuranceoption = null;
		String topicoption = null;
		String typeoption = null;
		String speakeroption = null;
		eventsPage.assertMultipleSearchResultsRetreiveCorrectArticles(searchterm, practiceoption, locationoption, occuranceoption, topicoption, typeoption, speakeroption);
	}
	
	
	@Then("^the filters will be reset and the default search results are displayed$")
	public void the_filters_will_be_reset_and_the_default_search_results_are_displayed() throws Throwable {

	}
	
	
	@Then("^a message alerting the user that there are no search results will be displayed$")
	public void a_message_alerting_the_user_that_there_are_no_search_results_will_be_displayed() throws Throwable {
		eventsPage.assertNoResultsFoundMessage();
	}
	
	
	@Then("^the results will be sorted in \"([^\"]*)\" order$")
	public void the_results_will_be_sorted_in_order(String arg1) throws Throwable {

	}
	
	
	@Then("^the correct events page will open$")
	public void the_correct_events_page_will_open() throws Throwable {

	}
	

	@Then("^all retrieved search results will contain the \"([^\"]*)\"$")
	public void all_retrieved_search_results_will_contain_the(String name) throws Throwable {
		eventsPage.assertEventsNameSearchResultsContainString(name);
	}

}
