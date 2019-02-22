package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class FindALawyerPage_Steps extends DriverFactory {
	
	@And("^I type \"([^\"]*)\" into the Find A Lawyer Page Search Box$")
	public void i_type_into_the_Find_A_Lawyer_Page_Search_Box(String searchTerm) throws Throwable {
		findALawyerPage.enterSearchTermIntoLawyerNameInput(searchTerm);
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
		Thread.sleep(1000);
		findALawyerPage.selectDirectoryCategory(directory);
	}

	@When("^I enter the name of a \"([^\"]*)\" who is in the lawyer team$")
	public void i_enter_the_name_of_a_who_is_in_the_lawyer_team(String arg1) throws Throwable {

	}

	@Then("^the \"([^\"]*)\" profile is retrieved$")
	public void the_profile_is_retrieved(String arg1) throws Throwable {

	}

}
