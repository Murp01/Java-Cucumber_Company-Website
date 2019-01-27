package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlobalHeader_Page extends BasePage {
	public @FindBy(xpath = "//button[@class='header__searchToggle']") WebElement button_SearchIcon;
	public @FindBy(xpath = "//input[@id='search']") WebElement textBox_GlobalSearch;

	public GlobalHeader_Page() throws IOException {
		super();
	}
	
	public void enterSearchTermIntoGlobalSiteSearch(String searchTerm) {
		button_SearchIcon.click();
		textBox_GlobalSearch.sendKeys(searchTerm);
	}

}
