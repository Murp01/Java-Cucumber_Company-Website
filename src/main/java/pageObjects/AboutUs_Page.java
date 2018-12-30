package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUs_Page extends BasePage{
	
	public @FindBy(css = "#container-special-offers") WebElement button_SpecialOffers;	
	
	public AboutUs_Page() throws IOException {
		super();
	}

}
