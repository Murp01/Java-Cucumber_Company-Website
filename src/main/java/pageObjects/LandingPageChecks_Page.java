package pageObjects;

import java.io.IOException;

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

}
