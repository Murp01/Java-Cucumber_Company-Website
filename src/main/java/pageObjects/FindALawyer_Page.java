package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindALawyer_Page extends BasePage {
	
	public @FindBy(css = "") WebElement button_SearchName;
	public @FindBy(css = "") WebElement container_RetrievedProfiles;
	public @FindBy(css = "") WebElement button_LoadMore;
	public @FindBy(css = "") WebElement selector_LawyerDirectory;
	public @FindBy(css = "") WebElement selector_BusinessTeamDirectory;
	public @FindBy(css = "") WebElement dropdown_Practice;

	public FindALawyer_Page() throws IOException {
		super();

	}
	
	


}
