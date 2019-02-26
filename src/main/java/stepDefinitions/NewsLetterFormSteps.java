package stepDefinitions;

import java.util.List;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class NewsLetterFormSteps extends DriverFactory {
	
	@When("^I subscribe to the following items$")
	public void i_subscribe_to_the_following_items1(DataTable subscriptionAnswers) throws Throwable {
		List<List<String>> data = subscriptionAnswers.raw();
	}

	@Then("^the following subscribed items will be displayed in the pg(\\d+) subscribed to box$")
	public void the_following_subscribed_items_will_be_displayed_in_the_pg_subscribed_to_box1(int arg1, DataTable arg2) throws Throwable {
		List<List<String>> data = arg2.raw();

	}

	@Given("^I subscribe to the following items$")
	public void i_subscribe_to_the_following_items(DataTable arg1) throws Throwable {

	}

	@When("^I click on the continue link$")
	public void i_click_on_the_continue_link1() throws Throwable {

	}

	@Then("^the Address form will be displayed$")
	public void the_Address_form_will_be_displayed1() throws Throwable {

	}

	@Given("^I click on the continue link$")
	public void i_click_on_the_continue_link() throws Throwable {

	}

	@Given("^the Address form will be displayed$")
	public void the_Address_form_will_be_displayed() throws Throwable {

	}

	@Given("^the following subscribed items will be displayed in the pg(\\d+) subscribed to box$")
	public void the_following_subscribed_items_will_be_displayed_in_the_pg_subscribed_to_box(int arg1, DataTable arg2) throws Throwable {

	}

	@Given("^I click on page(\\d+) Return to Step one link$")
	public void i_click_on_page_Return_to_Step_one_link(int arg1) throws Throwable {

	}

	@Then("^I subscribe to the following checkboxes$")
	public void i_subscribe_to_the_following_checkboxes(DataTable arg1) throws Throwable {

	}

	@Then("^I unsubscribe to the following items$")
	public void i_unsubscribe_to_the_following_items(DataTable arg1) throws Throwable {

	}

}
