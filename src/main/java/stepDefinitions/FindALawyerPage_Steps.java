package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class FindALawyerPage_Steps extends DriverFactory {
	
	@And("^I type \"([^\"]*)\" into the Find A Lawyer Page Search Box$")
	public void i_type_into_the_Find_A_Lawyer_Page_Search_Box(String searchTerm) throws Throwable {
		findALawyerPage.inputSearchTermIntoLawyerNameInput(searchTerm);
		Thread.sleep(2000);
	}

	@Then("^all retrieved profiles will contain the term \"([^\"]*)\"$")
	public void all_retrieved_profiles_will_contain_the_term(String searchTerm) throws Throwable {
		findALawyerPage.assertLawyerPageRetrievedLawyers(searchTerm);
	}
	
	@When("^I click on the \"([^\"]*)\" alphabet button$")
	public void i_click_on_the_alphabet_button(String alphabetButton) throws Throwable {
		findALawyerPage.clickOnAlphabetButton(alphabetButton);
		Thread.sleep(3000);
	}

	@Then("^all retrieved results will contain \"([^\"]*)\"$")
	public void all_retrieved_results_will_contain(String alphabetButton) throws Throwable {
		findALawyerPage.assertLawyerPageRetrievedLawyers(alphabetButton);
	}
	
	@Then("^all retrieved results will contain \"([^\"]*)\" and \"([^\"]*)\"$")
	public void all_retrieved_results_will_contain_and(String alphabetButtonA, String alphabetButtonB) throws Throwable {
		findALawyerPage.assertLawyerPageRetrievedLawyersTwoAlphabetButtons(alphabetButtonA, alphabetButtonB);
	}
	
	@When("^I click on the \"([^\"]*)\" and \"([^\"]*)\" alphabetbuttons$")
	public void i_click_on_the_and_alphabetbuttons(String alphabetButtonA, String alphabetButtonB) throws Throwable {
		findALawyerPage.clickOnTwoAlphabetButtons(alphabetButtonA, alphabetButtonB);
	}
	
	
	@Given("^the \"([^\"]*)\" tab is selected$")
	public void the_tab_is_selected(String directory) throws Throwable {
		findALawyerPage.selectDirectoryCategory(directory);
	}

	@When("^I enter the name of a \"([^\"]*)\" who is in the lawyer team$")
	public void i_enter_the_name_of_a_who_is_in_the_lawyer_team(String searchTerm) throws Throwable {
		findALawyerPage.inputSearchTermIntoLawyerNameInput(searchTerm);
	}

	@Then("^the \"([^\"]*)\" profile is retrieved$")
	public void the_profile_is_retrieved(String searchTerm) throws Throwable {
		findALawyerPage.assertLawyerPageRetrievedLawyers(searchTerm);
	}
	
	@When("^I enter the name of a \"([^\"]*)\" who is in the business team and not a lawyer$")
	public void i_enter_the_name_of_a_who_is_in_the_business_team_and_not_a_lawyer(String searchTerm) throws Throwable {
		findALawyerPage.inputSearchTermIntoLawyerNameInput(searchTerm);
	}

	@Then("^the \"([^\"]*)\" profile is not retrieved$")
	public void the_profile_is_not_retrieved(String searchTerm) throws Throwable {
		findALawyerPage.assertSearchResultsError();
	}
	
	
	@When("^I select \"([^\"]*)\" from the Location dropdown field$")
	public void i_select_from_the_Location_dropdown_field(String option) throws Throwable {
		findALawyerPage.selectOptionFromCountryDropdownBox(option);
	}

	@Then("^a disclaimer will be displayed above the retrieved lawyers$")
	public void a_disclaimer_will_be_displayed_above_the_retrieved_lawyers() throws Throwable {
		findALawyerPage.assertJapaneseLegalDisclaimerText();
	}
	
	
	@Given("^the default \"([^\"]*)\" results will be displayed by default$")
	public void the_default_results_will_be_displayed_by_default(int countProfiles) throws Throwable {
		findALawyerPage.assertCountOfDisplayedProfiles(countProfiles);
	}

	@When("^I click on the \"([^\"]*)\" button$")
	public void i_click_on_the_button(String arg1) throws Throwable {
		//I was going to use a common method might not bother
		findALawyerPage.clickLoadMoreButtonOnce();
		Thread.sleep(1000);
	}

	@Then("^a further \"([^\"]*)\" retrieved results will be displayed$")
	public void a_further_retrieved_results_will_be_displayed(int countProfiles) throws Throwable {
		findALawyerPage.assertCountOfDisplayedProfilesAfterClickingLoadMore(countProfiles);
	}

}
