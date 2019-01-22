package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Events_Page extends BasePage {
	
	public @FindBy(xpath = "") WebElement textbox_NameSearch;	

	public Events_Page() throws IOException {
		super();
	}

}
