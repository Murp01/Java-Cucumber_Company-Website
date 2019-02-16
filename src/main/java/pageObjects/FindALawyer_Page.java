package pageObjects;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class FindALawyer_Page extends BasePage {
	
	public @FindBy(css = "") WebElement button_LoadMore;
	public @FindBy(xpath = "//input[@placeholder='Name']") WebElement input_SearchName;
	public @FindBy(css = "") WebElement button_PracticeDropdown;
	public @FindBy(css = "") WebElement selector_BusinessTeamDirectory;
	public @FindBy(css = "") WebElement selector_LawyerDirectory;
	
	@FindAll({@FindBy(xpath = "//div[@class='row searchResults effect-4']/div")})
	public List<WebElement> container_RetrievedLawyers;


	public FindALawyer_Page() throws IOException {
		super();

	}
	
	public void assertLawyerPageRetrievedLawyers(String searchTerm) {	
		for (WebElement we: container_RetrievedLawyers) {
			String nameIs = we.getText();
			nameIs = nameIs.toLowerCase();	
			System.out.println("search term is " + searchTerm + " and profile reads as " + nameIs);
			assertTrue(nameIs.contains(searchTerm));
		}
	}
	
	public void enterSearchTermIntoLawyerNameInput(String searchTerm) {
		input_SearchName.sendKeys(searchTerm);
	}


}
