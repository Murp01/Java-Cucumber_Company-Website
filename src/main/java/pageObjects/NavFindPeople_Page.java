package pageObjects;

import static org.junit.Assert.assertTrue;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class NavFindPeople_Page extends BasePage {
	
	public @FindBy(xpath = "") WebElement navLinKFindPeople;
	public @FindBy(xpath = "//li/a[contains(text(),'Find People')]") WebElement title_FindPeople;
	public @FindBy(xpath = "//input[@id='lawyer-search-term-nav']") WebElement textField_FPSearch;
	public @FindBy(xpath = "//div[@class='row lawyerSearch__results']") WebElement container_RetrievedLawyers;
	public @FindBy(xpath = "//div[@class='col-sm-4 lawyerSearch__resultItem']/*/span[1]") WebElement resultItem_RetrievedLawyers;

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
		Thread.sleep(3000);
		List<WebElement> profileName = driver.findElements(By.xpath("//div[@class='col-sm-4 lawyerSearch__resultItem']/*/span[1]"));
		for (WebElement we: profileName) {
			String nameIs = we.getText();
			nameIs = nameIs.toLowerCase();	
			System.out.println("search term is " + searchTerm + " and profile reads as " + nameIs);
			assertTrue(nameIs.contains(searchTerm));
		}	
		return new NavFindPeople_Page();		
	}

}
