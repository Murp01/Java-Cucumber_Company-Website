package pageObjects;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;


public class FindALawyer_Page extends BasePage {
	
	public @FindBy(css = "") WebElement button_LoadMore;
	public @FindBy(xpath = "//input[@placeholder='Name']") WebElement input_SearchName;
	public @FindBy(css = "") WebElement button_PracticeDropdown;
	public @FindBy(css = "") WebElement selector_BusinessTeamDirectory;
	public @FindBy(css = "") WebElement selector_LawyerDirectory;
	
	@FindAll({@FindBy(xpath = "//div[@class='btn-group bootstrap-select show-tick alphabator']//ul[@class='dropdown-menu inner']/li")})
	public List<WebElement> button_AlphabetButtons;	
	
	@FindAll({@FindBy(xpath = "//div[@class='row searchResults effect-4']/div")})
	public List<WebElement> container_RetrievedLawyers;


	public FindALawyer_Page() throws IOException {
		super();

	}
	
	//could potentially click load more each time the lawyer list is generated.  It's own test?
	
	public void assertLawyerPageRetrievedLawyers(String searchTerm) {	
		for (WebElement we: container_RetrievedLawyers) {
			String nameIs = we.getText();
			searchTerm = searchTerm.toLowerCase();
			nameIs = nameIs.toLowerCase();	
			//System.out.println("search term is " + searchTerm + " and profile reads as " + nameIs);
			assertTrue(nameIs.contains(searchTerm));
		}
	}
	
	
	public void clickOnAlphabetButton(String alphabetButton) throws InterruptedException {
		for (WebElement we: button_AlphabetButtons) {
			String buttonIs = we.getText();
			alphabetButton = alphabetButton.toLowerCase();
			buttonIs = buttonIs.toLowerCase();
			if (buttonIs.equals(alphabetButton)) {
				we.click();
				Thread.sleep(3000);
			}
		}
	}
	
	
	public void enterSearchTermIntoLawyerNameInput(String searchTerm) {
		input_SearchName.sendKeys(searchTerm);
	}


}
