package stepDefinitions;

import cucumber.api.java.en.Given;
import utils.DriverFactory;

public class LandingPageChecks_Steps extends DriverFactory {
	
	@Given("^I am on the \"([^\"]*)\" page$")
	public void i_am_on_the_page(String startPage) throws Throwable {
		//landingPageChecksPage.openStartPage(startPage);
		getDriver().get("https://www.linklaters.com/");
		Thread.sleep(9000);
	}

}
