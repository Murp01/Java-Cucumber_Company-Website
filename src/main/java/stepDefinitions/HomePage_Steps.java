package stepDefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class HomePage_Steps extends DriverFactory{	
	
	
	@Given("^I access the websites homepage$")
	public void i_access_the_websites_homepage() throws Throwable {
		homePage.getLLHomepage();
	}

	@When("^I scroll the carousel feature by clicking on the \"([^\"]*)\" border arrow$")
	public void i_scroll_the_carousel_feature_by_clicking_on_the_border_arrow(String navDir) throws Throwable {
		if(navDir.equals("Left")) {
			homePage.button_CarouselNavLeft.click();
		}
		else {
			homePage.button_CarouselNavRight.click();
		}
		Thread.sleep(3000);
	}

	@Then("^the carousel slide will change$")
	public void the_carousel_slide_will_change() throws Throwable {
		homePage.assertSlideHasChanged();
	}
}
	

