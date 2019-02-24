package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class PrimaryNav_Steps extends DriverFactory {
	
	@When("^I click on \"([^\"]*)\" from the primary navigation header$")
	public void i_click_on_from_the_primary_navigation_header(String title) throws Throwable {
		getDriver().findElement(By.xpath("//li/a[contains(text(),'" + title  + "')]")).click();
	}
	
	
	@When("^I hover over the \"([^\"]*)\" title in the primary navigation$")
	public void i_hover_over_the_title_in_the_primary_navigation(String title) throws Throwable {
		
	}
	

	@Then("^the link will open the \"([^\"]*)\" page$")
	public void the_link_will_open_the_page(String pageURL) throws Throwable {
		Assert.assertTrue(getDriver().getCurrentUrl().equals(pageURL));
		System.out.println(getDriver().getCurrentUrl());
	}
	
	@When("^I click on the Linklaters log at the top right of the webpage$")
	public void i_click_on_the_Linklaters_log_at_the_top_right_of_the_webpage() throws Throwable {

	}

	@Then("^I will be returned to the homepage$")
	public void i_will_be_returned_to_the_homepage() throws Throwable {

	}

	@When("^I click on all primary header links$")
	public void i_click_on_all_primary_header_links() throws Throwable {
		//primaryNavPage.clickOnAllPrimaryNaveLinks();
		primaryNavPage.assertSitemapPage();
	}

	@Then("^all primary header pages will contain the correct title$")
	public void all_primary_header_pages_will_contain_the_correct_title() throws Throwable {

	}
	
	

}
