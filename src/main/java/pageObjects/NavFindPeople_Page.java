package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class NavFindPeople_Page extends BasePage {
	
	public @FindBy(xpath = "") WebElement navLinKFindPeople;
	public @FindBy(xpath = "//li/a[contains(text(),'Find People')]") WebElement title_FindPeople;
	public @FindBy(xpath = "//input[@id='lawyer-search-term-nav']") WebElement textField_FPSearch;
	public @FindBy(xpath = "//div[@class='row lawyerSearch__results']") WebElement container_RetrievedLawyers;
	public @FindBy(xpath = "//div[@class='row lawyerSearch__results']") WebElement resultItem_RetrievedLawyers;

	public NavFindPeople_Page() throws IOException {
		super();
	}
	
	public NavFindPeople_Page clickInNavFindPeopleSearchBox(String title, String webElement) throws IOException {
		Actions action = new Actions(getDriver());
		action.moveToElement(title_FindPeople).moveToElement(textField_FPSearch).click().build().perform();					
		return new NavFindPeople_Page();		
	}
	
	public NavFindPeople_Page sendKeysToNavLawyerSearch(String searchTerm) throws Exception {
		sendKeysToWebElement(textField_FPSearch, searchTerm);
		return new NavFindPeople_Page();		
	}
	
	public NavFindPeople_Page assertRetrievedResultsContainSearchTerm(String searchTerm) throws Exception {

		return new NavFindPeople_Page();		
	}
	/*locate all elements
	 * Create an array for all elements
	 * Create a for loop that uses an element
	 * gets the name text from element
	 * Checks if the name string contains the search term
	 * If search term is contained in name then move to next element
	 * else step fails (exception?)
	 */

}
