package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PrimaryNav_Page extends BasePage {
	
	public @FindBy(xpath = "//li/a[contains(text(),'About Us')]") WebElement title_AboutUs;
	public @FindBy(xpath = "//li/a[contains(text(),'Find People')]") WebElement title_FindPeople;


	public PrimaryNav_Page() throws IOException {
		super();
	}
	


}
