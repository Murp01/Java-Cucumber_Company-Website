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
	public @FindBy(xpath = "") WebElement button_PracticeDropdown;
	public @FindBy(css = "") WebElement selector_BusinessTeamDirectory;
	public @FindBy(css = "") WebElement selector_LawyerDirectory;
	public @FindBy(xpath = "//a[@class='is-active']") WebElement selector_CurrentDirectory;
	
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
	
	
	public void assertLawyerPageRetrievedLawyersTwoAlphabetButtons(String alphabetButtonA, String alphabetButtonB) {	
		for (WebElement we: container_RetrievedLawyers) {
			String nameIs = we.getText();	//gets iterated name from website. 
			alphabetButtonA = alphabetButtonA.toLowerCase();	//Takes argument a and converts to lowercase
			alphabetButtonB = alphabetButtonB.toLowerCase();	// Takes argument b and converts to lowercase
			nameIs = nameIs.toLowerCase();	//takes name from element in website and converts to lowercase
			System.out.println("search term is " + alphabetButtonA + " and profile reads as " + nameIs);
			System.out.println("search term is " + alphabetButtonB + " and profile reads as " + nameIs);
			Assert.assertTrue(nameIs.contains(alphabetButtonA) || nameIs.contains(alphabetButtonB));  //tell zach changed assertThat to true and it worked
		}
	}
	
	
	public void clickOnAlphabetButton(String alphabetButton) throws InterruptedException {
		for (WebElement we: button_AlphabetButtons) {
			String buttonIs = we.getText();
			alphabetButton = alphabetButton.toLowerCase();
			buttonIs = buttonIs.toLowerCase();
			if (buttonIs.equals(alphabetButton)) {
				we.click();
				//Thread.sleep(1000);
			}
		}
	}
	
	
	public void clickOnTwoAlphabetButtons(String alphabetButtonA, String alphabetButtonB) throws InterruptedException{
		for (WebElement we: button_AlphabetButtons) {
			String buttonIs = we.getText();
			alphabetButtonA = alphabetButtonA.toLowerCase();
			alphabetButtonB = alphabetButtonB.toLowerCase();
			buttonIs = buttonIs.toLowerCase();
			if (buttonIs.equals(alphabetButtonA)) {
				we.click();
				Thread.sleep(1000);
			}
			if (buttonIs.equals(alphabetButtonB)){
				we.click();
				Thread.sleep(2000);
			}
		}
	}
	
	
	public void enterSearchTermIntoLawyerNameInput(String searchTerm) {
		input_SearchName.sendKeys(searchTerm);
	}
	
	
	public void selectDirectoryCategory(String directory){
		//check if arg category is selected, if not click it
		String selectedDirectory = selector_CurrentDirectory.getText();
		switch(directory){
			case "Lawyer Directory":
				if(selector_LawyerDirectory.isSelected()){
					System.out.println("Excellent");
				}
				else{
					
				}
				break;
			case "":
				if(selector_BusinessTeamDirectory.isSelected()){
					
				}
				else{
					//Can probably do this in one if statement instead of switch case
				}
		}

	}


}
