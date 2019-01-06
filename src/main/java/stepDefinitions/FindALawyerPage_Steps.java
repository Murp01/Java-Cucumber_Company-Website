package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class FindALawyerPage_Steps extends DriverFactory {
	
	@And("^I type \"([^\"]*)\" into the Find A Lawyer Page Search Box$")
	public void i_type_into_the_Find_A_Lawyer_Page_Search_Box(String arg1) throws Throwable {

	}

	@Then("^all retrieved profiles will contain the term \"([^\"]*)\"$")
	public void all_retrieved_profiles_will_contain_the_term(String arg1) throws Throwable {

	}


}
