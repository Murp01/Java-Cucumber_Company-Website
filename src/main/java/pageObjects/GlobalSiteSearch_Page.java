package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlobalSiteSearch_Page extends BasePage{
	
	public @FindBy(css = "") WebElement button_SearchName;

	public GlobalSiteSearch_Page() throws IOException {
		super();

	}

}
