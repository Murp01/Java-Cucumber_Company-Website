package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class HomePage_Steps extends DriverFactory{	
	
	
	@Given("^I access the websites homepage$")
	public void i_access_the_websites_homepage() throws Throwable {
		homePage.openLinklatersSiteHomepage();
	}
	
	
	@Given("^\"([^\"]*)\" is selected with \"([^\"]*)\" selected$")
	public void is_selected_with_selected(String arg1, String arg2) throws Throwable {

	}
	
	
	@Given("^\"([^\"]*)\" tab is selected$")
	public void tab_is_selected(String category) throws Throwable {
		homePage.selectCarouselTab(category);
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


	@When("^I click on \"([^\"]*)\" tab$")
	public void i_click_on_tab(String slide) throws Throwable {
		homePage.selectSlideFromCarouselTab(slide);
	}


	@When("^I click on the \"([^\"]*)\" link from the slide$")
	public void i_click_on_the_link_from_the_slide(String arg1) throws Throwable {

	}
	

	@Then("^the \"([^\"]*)\" webpage will be opened$")
	public void the_webpage_will_be_opened(String arg1) throws Throwable {

	}
	
	
	@Then("^\"([^\"]*)\" will be displayed$")
	public void will_be_displayed(String arg1) throws Throwable {

	}
	
	
	@Then("^the carousel slide will change$")
	public void the_carousel_slide_will_change() throws Throwable {
		homePage.assertSlideHasChanged();
	}
	
	
}
	

