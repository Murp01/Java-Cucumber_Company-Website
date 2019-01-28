package stepDefinitions;

import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class AboutUsSteps extends DriverFactory{
	

	
	@Given("^user navigates to \"([^\"]*)\" website$")
	public void user_navigates_to_website(String url) throws Throwable {
		getDriver().get(url);
	}
	
	
	@Given("^\"([^\"]*)\" is open$")
	public void is_open(String arg1) throws Throwable {
		aboutUsPage.clickOnSingleTab(arg1);
	}
	
	
	@Given("^\"([^\"]*)\" has been opened$")
	public void has_been_opened(String arg1) throws Throwable {

	}
	
	@When("^I click on each closed accordion segment$")
	public void i_click_on_each_closed_accordion_segment() throws Throwable {
		aboutUsPage.clickOnClosedAccordionTabs();
	}
	

	@When("^the user click \"([^\"]*)\"$")
	public void the_user_click(String button) throws Throwable {
		basePage.WaitUntilWebElementIsVisibleUsingByLocator(By.xpath(button));
		getDriver().findElement(By.xpath(button)).click();
	}
	
	
	@When("^I click on each \"([^\"]*)\" accordions segments$")
	public void i_click_on_each_accordions_segments(String styleStatus) throws Throwable {
		aboutUsPage.clickOnOpenClosedAccordionTabs(styleStatus);
	}


	@When("^I go to another page on the same website$")
	public void i_go_to_another_page_on_the_same_website() throws Throwable {
		getDriver().get("https://www.linklaters.com/en/sectors");
	}
	

	@When("^I click the \"([^\"]*)\" browser button$")
	public void i_click_the_browser_button(String arg1) throws Throwable {
		basePage.navigateBrowser(arg1);
		//Thread.sleep(6000);
	}
	

	@Then("^all accordion segments will be closed$")
	public void all_accordion_segments_will_be_closed() throws Throwable {
		aboutUsPage.assertAccordionTextFieldClosed();
	}
	

	@When("^I click on each of the accordions segments$")
	public void i_click_on_each_of_the_accordions_segments() throws Throwable {
		aboutUsPage.clickOnAllAccordTabs();
	}
	

	@When("^I click on each \"([^\"]*)\" accordion segment$")
	public void i_click_on_each_accordion_segment(String styleStatus) throws Throwable {
		aboutUsPage.clickOnOpenClosedAccordionTabs(styleStatus);
	}


	@When("^I click on the \"([^\"]*)\" link from within \"([^\"]*)\"$")
	public void i_click_on_the_link_from_within(String link, String section) throws Throwable {
		aboutUsPage.clickOnLinkWithinAccordionTextbox(link, section);
	}


	@When("^I click o \"([^\"]*)\"$")
	public void i_click_o(String arg1) throws Throwable {

	}
	
	
	@Then("^the webpage will change to \"([^\"]*)\"$")
	public void the_webpage_will_change_to(String webpage) throws Throwable {
		aboutUsPage.webpageChangeTo(webpage);
	}
	

	@Then("^\"([^\"]*)\" will remain open$")
	public void will_remain_open(String openTab) throws Throwable {
		aboutUsPage.assertAccordionTabOpen(openTab);
	}
	

	@Then("^the correct content will be displayed$")
	public void the_correct_content_will_be_displayed() throws Throwable {
		aboutUsPage.assertAccordionTextField();
	}

}
