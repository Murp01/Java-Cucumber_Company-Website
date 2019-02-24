package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LandingPageChecks_Steps extends DriverFactory {
	
	@Given("^I am on the \"([^\"]*)\" page$")
	public void i_am_on_the_page(String startPage) throws Throwable {
		//
		getDriver().get(startPage);
		Thread.sleep(9000);
	}
	
	@Given("^I start on the \"([^\"]*)\" page$")
	public void i_start_on_the_page(String startPage) throws Throwable {
		landingPageChecksPage.openStartPage(startPage);
	}

	@When("^I click on \"([^\"]*)\" from the primary navigation$")
	public void i_click_on_from_the_primary_navigation(String primNavLink) throws Throwable {
		landingPageChecksPage.clickOnPrimaryNavLink(primNavLink);
	}
	
	
	@When("^I hover over \"([^\"]*)\" and select \"([^\"]*)\" from the secondary navigation$")
	public void i_hover_over_and_select_from_the_secondary_navigation(String primNav, String secNav) throws Throwable {
		landingPageChecksPage.clickOnSecondaryNavLink(primNav, secNav);
	}
	

	@Then("^the \"([^\"]*)\" and \"([^\"]*)\" will be correctly formatted$")
	public void the_and_will_be_correctly_formatted(String pageURL, String pageTitle) throws Throwable {
		landingPageChecksPage.assertPageUrl(pageURL);
		landingPageChecksPage.assertPageTitle(pageTitle);
	}

	
	@Given("^I hover over \"([^\"]*)\" from the primary nav and click on all secondary nav titles$")
	public void i_hover_over_from_the_primary_nav_and_click_on_all_secondary_nav_titles(String primaryNavTitle) throws Throwable {
		landingPageChecksPage.clickOnAllSecTitlesAndPrintTitleUrl(primaryNavTitle);
	}

	@When("^I click on each of the secondary navs links and capture the titles and urls of the new tabs$")
	public void i_click_on_each_of_the_secondary_navs_links_and_capture_the_titles_and_urls_of_the_new_tabs() throws Throwable {

	}

	@Then("^the urls and titles will all be formatted correctly$")
	public void the_urls_and_titles_will_all_be_formatted_correctly() throws Throwable {

	}
	


}
