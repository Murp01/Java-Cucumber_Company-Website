package pageObjects;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends BasePage {
	public @FindBy(xpath = "//input[@id='orb-search-q']") WebElement textField_SearchBar;


	public Home_Page() throws IOException {
		super();
	}
	
	public Home_Page getBBCHomepage() throws IOException {
		getDriver().get("https://www.bbc.co.uk/news");
		return new Home_Page();		
	}
	
	public Home_Page clickOnSearchBar() throws IOException {
		textField_SearchBar.click();
		return new Home_Page();		
	}
	


}
