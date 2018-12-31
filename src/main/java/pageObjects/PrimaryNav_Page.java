package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrimaryNav_Page extends BasePage {
	
	public @FindBy(xpath = "//li/a[contains(text(),'About Us')]") WebElement link_AboutUs;


	public PrimaryNav_Page() throws IOException {
		super();
	}

}
