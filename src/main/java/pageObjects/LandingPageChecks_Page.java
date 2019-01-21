package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPageChecks_Page extends BasePage {
	
	public @FindBy(xpath = "//a[contains(text(),'About Us')]") WebElement href_AboutUsPage;

	public LandingPageChecks_Page() throws IOException {
		super();
	}
	
	public void openStartPage(String startPage) {
		switch(startPage) {
		case "homepage":
			getDriver().get("https://www.linklaters.com/");
			break;
		case "careershomepage":
			getDriver().get("https://careers.linklaters.com/");
			break;
		}
	}		
	
	public void clickOnPrimaryNavLink(String primNavLink) {
		switch(primNavLink) {
		case "About Us":
			href_AboutUsPage.click();
			break;
		case "":
			break;
		}
	}
	
	public void assertPageUrl(String pageURL) {
		switch(pageURL) {
		case "About Us":
			Assert.assertTrue(getDriver().getCurrentUrl().equals("https://www.linklaters.com/en/about-us"));
			break;
		case "":
			break;
		}
	}
	
	public void assertPageTitle(String pageTitle) {
		switch(pageTitle) {
		case "About Us":
			Assert.assertTrue(getDriver().getTitle().equals("About Us | Linklaters"));
			break;
		case "":
			break;
		}
	}
	
	public void clickOnSecondaryNavLink(String secNav) {
		switch(secNav) {
		case "Alumni":
			//add hover and click
			break;
		}
	}
	


}
