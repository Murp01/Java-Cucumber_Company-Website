package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class YourApplication_Steps extends DriverFactory {
	
	@Given("^When I select the \"([^\"]*)\" tab$")
	public void when_I_select_the_tab(String tab) throws Throwable {
		yourApplicationPage.clickOnOpenOrFutureVacancyTab(tab);
		Thread.sleep(3000);
	}

	@Then("^none of the vacancies will have a closing date that exceeds the current date$")
	public void none_of_the_vacancies_will_have_a_closing_date_that_exceeds_the_current_date() throws Throwable {
		yourApplicationPage.assertOpenVacancyDateNotExpired();
	}


	@When("^I click on a vacancies Apply button$")
	public void i_click_on_a_vacancies_Apply_button() throws Throwable {

	}

	@Then("^the webpage is redirected to the job posting page$")
	public void the_webpage_is_redirected_to_the_job_posting_page() throws Throwable {

	}

	@Then("^upcoming vacancies will be displayed$")
	public void upcoming_vacancies_will_be_displayed() throws Throwable {

	}




}
