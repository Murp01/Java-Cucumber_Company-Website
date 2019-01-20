package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPageChecks_Page extends BasePage {
	
	public @FindBy(xpath = "//h2[@id='ui-id-1']") WebElement href_AboutUsPage;

	public LandingPageChecks_Page() throws IOException {
		super();
	}

}
