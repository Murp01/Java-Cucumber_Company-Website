package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LandingPageChecks_Page extends BasePage {
	
	public @FindBy(xpath = "//a[contains(text(),'About Us')]") WebElement href_AboutUsPage;
	public @FindBy(xpath = "//a[contains(text(),'Alumni')]") WebElement href_Alumni;
	public @FindBy(xpath = "//a[contains(text(),'At a glance')]") WebElement href_AtAGlance;

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
		case "Alumni":
			Assert.assertTrue(getDriver().getCurrentUrl().equals("https://www.linklaters.com/en/about-us/alumni"));
			break;
		case "At a glance":
			Assert.assertTrue(getDriver().getCurrentUrl().equals("https://www.linklaters.com/en/about-us/our-firm-at-a-glance"));
			break;
		}
		
	}
	
	public void assertPageTitle(String pageTitle) {
		switch(pageTitle) {
		case "About Us":
			Assert.assertTrue(getDriver().getTitle().equals("About Us | Linklaters"));
			break;
		case "Alumni":
			Assert.assertTrue(getDriver().getTitle().equals("Alumni | Linklaters"));
			break;
		case "At a glance":
			Assert.assertTrue(getDriver().getTitle().equals("At a glance | Linklaters"));
			break;
		}
	}
	
	public void clickOnSecondaryNavLink(String primNav, String secNav) {
		switch(secNav) {
		case "Alumni":
			Actions action001 = new Actions(getDriver());
			action001.moveToElement(href_AboutUsPage).build().perform();
			href_Alumni.click();
			break;
		case "At a glance":
			Actions action002 = new Actions(getDriver());
			action002.moveToElement(href_AboutUsPage).build().perform();
			href_AtAGlance.click();
			break;
		}
	}
	


}
