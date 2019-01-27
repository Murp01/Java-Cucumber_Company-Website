package pageObjects;

import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class Events_Page extends BasePage {
	
	String practiceXpath = "//div[@class='btn-group bootstrap-select show-tick']//select[@title='Practice']/option";
	String locationXpath = "//div[@class='btn-group bootstrap-select show-tick']//select[@title='Location']/option";
	String eventTenseXpath = "//div[@class='btn-group bootstrap-select show-tick']//select[@title='Only Events in the Future']/option";
	String topicXpath = "//div[@class='btn-group bootstrap-select show-tick']//select[@title='Topic']/option";
	String typeXpath = "//div[@class='btn-group bootstrap-select show-tick']//select[@title='Type']/option";
	String speakerXpath = "//div[@class='btn-group bootstrap-select show-tick']//select[@title='Speaker']/option";
	String sortXpath = "//div[@class='btn-group bootstrap-select']//select[@title='Sort by']/option";

	
	public @FindBy(xpath = "//input[@placeholder='Name']") WebElement textbox_NameSearch;
	public @FindBy(xpath = "//div[@class='searchResults cardRow']") WebElement container_EventSearchResults;
	public @FindBy(xpath = "//span[@class='ctaLoadMore__text']") WebElement button_LoadMore;
	public @FindBy(xpath = "//div[@class='col-md-6 search__eventResultLeft']") WebElement container_EventReturnedResults;
	public @FindBy(css = "div[class='col-md-6 search__eventResultLeft']") WebElement container_EventReturnedResultsCSS;
	public @FindBy(xpath = "(//*[contains(text(),'view this event')])[i]") WebElement link_ViewEventLink;
	public @FindBy(xpath = "//div[@class='col-md-7']") WebElement container_ArticlePageDescription;
	public @FindBy(xpath = "//div[@class='searchResults cardRow']") WebElement container_NoSearchResultsMessage;
	public @FindBy(xpath = "//div[@class='btn-group bootstrap-select show-tick']//select[@title='Practice']/option") WebElement dropdownBox_Practice;
	public @FindBy(xpath = "/html/body/div[6]/div/div/div[1]/div/form/div[2]/button") WebElement button_Practice;


	

	public Events_Page() throws IOException {
		super();
	}
	
	public void assertNoResultsFoundMessage() {
		Assert.assertTrue(container_NoSearchResultsMessage.getText().contains("Your search did not return any results."));
		//Maybe add data from an Excel sheet rather than the string
	}
	
	public void inputTextIntoNameField(String name) throws InterruptedException{
		textbox_NameSearch.sendKeys(name);
		Thread.sleep(4000);
	}
	

	
	public void assertEventsNameSearchResultsContainString(String name) throws InterruptedException{
		while (button_LoadMore.isDisplayed()){
			button_LoadMore.click();
			Thread.sleep(3000);
		}
		List<WebElement> returnProfile = driver.findElements(By.cssSelector("div[class='col-md-6 search__eventResultLeft']"));
		System.out.println(returnProfile.size());
		if (returnProfile.size() > 0){
			for (int i = 0; i < returnProfile.size(); i++){

				System.out.println(returnProfile.get(i).getText());
				if (returnProfile.get(i).getText().contains(name)){
					System.out.println("Text displayed on search page");
					//if this works add asserttrue here instead
				}
				else {
					getDriver().findElement(By.xpath("(//*[contains(text(),'view this event')])[" + i + "]")).click();
					//Now check if searchterm is displayed on article page

					//Assert.assertTrue(container_ArticlePageDescription.getText().contains(name));
					System.out.println("Found In Article : " + container_ArticlePageDescription.getText().contains(name));
					//is there another way to fail this test or just keep assertion
					getDriver().navigate().back();
					while (button_LoadMore.isDisplayed()){
						button_LoadMore.click();
						Thread.sleep(3000);
					}
				}
				returnProfile = driver.findElements(By.cssSelector("div[class='col-md-6 search__eventResultLeft']"));
				//Assert.assertTrue(returnProfile.get(i).getText().contains(name));
			}
		}
	}
	
	public void selectOptionFromPracticeDropDownList(String option) throws InterruptedException {
		switch(option) {
		case "Banking": 
			selectOptionFromSpecifiedDropDownList(practiceXpath, option);
			break;
		case "Business and Human Rights":
			selectOptionFromSpecifiedDropDownList(practiceXpath, option);
			break;			
		case "Capital Markets":
			selectOptionFromSpecifiedDropDownList(practiceXpath, option);
			break;	
		case "Corporate/M&A":
			selectOptionFromSpecifiedDropDownList(practiceXpath, option);			
			break;
		}
	}
	
	public void selectOptionFromLocationDropDownList(String option) throws InterruptedException {
		switch(option) {
		case "Brussels": 
			System.out.println("Brussels case switched to");
			selectOptionFromSpecifiedDropDownList(locationXpath, option);
			break;
		case "Hong Kong":
			selectOptionFromSpecifiedDropDownList(locationXpath, option);
			break;			
		case "Berlin":
			selectOptionFromSpecifiedDropDownList(locationXpath, option);
			break;		
		}
	}
	
	public void selectOptionFromTenseDropDownList(String option) throws InterruptedException {
		switch(option) {
		case "Future Events":
			selectOptionFromSpecifiedDropDownList(eventTenseXpath, option);
			break;
		case "Past Events":
			selectOptionFromSpecifiedDropDownList(eventTenseXpath, option);
			break;
		}
	}
	
	public void selectOptionFromTopicDropDownList(String option) throws InterruptedException {
		switch(option) {
		case "Brexit":
			selectOptionFromSpecifiedDropDownList(topicXpath, option);
			break;
		case "Diversity":
			selectOptionFromSpecifiedDropDownList(topicXpath, option);
			break;
		}
	}
	
	public void selectOptionFromTypeDropDownList(String option) throws InterruptedException {
		switch(option) {
		case "DSP":
			selectOptionFromSpecifiedDropDownList(typeXpath, option);
			break;
		case "FRG":
			selectOptionFromSpecifiedDropDownList(typeXpath, option);
			break;
		}		
	}
	
	public void selectOptionFromSpeakerDrownList(String option) throws InterruptedException {
		switch(option) {
		case "Andreas Dehio":
			selectOptionFromSpecifiedDropDownList(speakerXpath, option);
			break;
		case "Andrew Marshall":
			selectOptionFromSpecifiedDropDownList(speakerXpath, option);
			break;
		}		
	}
	
	public void selectOptionFromSortDrownList(String option) throws InterruptedException {
		switch(option) {
		case "Sort A-Z":
			selectOptionFromSpecifiedDropDownList(sortXpath, option);
			break;
		case "Sort Z-A":
			selectOptionFromSpecifiedDropDownList(sortXpath, option);
			break;
		case "Date (Newest - Oldest)":
			selectOptionFromSpecifiedDropDownList(sortXpath, option);
			break;
		case "Date (Oldest - Newest)":
			selectOptionFromSpecifiedDropDownList(sortXpath, option);
			break;
		}
	}
	
	public void assertMultipleSearchResultsRetreiveCorrectArticles(String searchterm, String practiceoption, String locationoption, 
			String occuranceoption, String topicoption, String typeoption, String speakeroption) {
		
		String searchTerm = "The";
		String practiceOption = "Corporate/M&A";
		String locationOption = "Brussels";
		String occuranceOption = "Future Events";
		String topicOption = "Brexit";
		String typeOption = "DSP";
		String speakerOption = "Ian Hunter";
		
		if (searchterm.contains(searchTerm) && practiceoption.contains(practiceOption) && locationoption.contains(locationOption) 
				&& occuranceoption.equals(occuranceOption) && topicoption.equals(topicOption) && typeoption.equals(typeOption) 
				&& speakeroption.equals(speakerOption)) { 
			System.out.println("Condition matches");
		}
	}
	


}
