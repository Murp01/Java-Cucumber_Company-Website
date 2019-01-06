package stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class PrimaryNav_Steps extends DriverFactory {
	
	@When("^I click on \"([^\"]*)\" from the primary navigation header$")
	public void i_click_on_from_the_primary_navigation_header(String title) throws Throwable {
		getDriver().findElement(By.xpath("//li/a[contains(text(),'" + title  + "')]")).click();
	}

	@Then("^the link will open the \"([^\"]*)\" page$")
	public void the_link_will_open_the_page(String pageURL) throws Throwable {
		Assert.assertTrue(getDriver().getCurrentUrl().equals(pageURL));
		System.out.println(getDriver().getCurrentUrl());
	}
	
	@When("^I hover over the \"([^\"]*)\" title in the primary navigation$")
	public void i_hover_over_the_title_in_the_primary_navigation(String title) throws Throwable {

		
	}
	


}
