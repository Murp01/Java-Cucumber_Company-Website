package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fintech_Page extends BasePage{
	
	String fintechLocationSearchXpath = "//select[@title='Select Location']/option";
	String fintechRetrievedLawyers = "//div[@id='key-contact-results-232f3fad-2271-4c52-8057-fe2c7cf98888']//div[@class='padding-top-10 padding-bottom-10']";
	
	public @FindBy(xpath = "//button[@title='All Locations']") WebElement button_PeopleSearchLocationDropdown;
	public @FindBy(xpath = "//div[@id='key-contact-results-232f3fad-2271-4c52-8057-fe2c7cf98888']") WebElement container_RetrievedFintechLawyers;

	public Fintech_Page() throws IOException {
		super();

	}
	
	
	public void assertAllFilteredFintechLawyersLocations() {
/*		Capture all retrieved lawyers, count integer and use for a for loop.  The for loop will capture a method
		that will open profile into a new tab. In the profile assert the location matches the parameter, then 
		close the tab, select next lawyer*/
/*		List<WebElement> filteredLawyers = driver.findElements(
				By.xpath("//div[@id='key-contact-results-232f3fad-2271-4c52-8057-fe2c7cf98888']//div[@class='padding-top-10 padding-bottom-10']"));
		int visibleFintechLawyer = 0;
		if (filteredLawyers.size() > 0) {
			for (WebElement we: filteredLawyers) {
				if (we.isDisplayed()) {
					visibleFintechLawyer++;
				}
			}
			System.out.println("There were " + visibleFintechLawyer + " Fintech Lawyers");
		}
		else {
			System.out.println("There were no retrieved Fintech Lawyers");
		}*/
		
		System.out.println(countVisibleElements(fintechRetrievedLawyers));
		
	}
	
	
	public int countVisibleElements(String xpath) {
		List<WebElement> filteredLawyers = driver.findElements(
				By.xpath(xpath));
		int visibleElements = 0;
		if (filteredLawyers.size() > 0) {
			for (WebElement we: filteredLawyers) {
				if (we.isDisplayed()) {
					visibleElements++;
				}
			}
		}
		else {
			return 0;
		}
		return visibleElements;		
	}
	

	
	
	public void selectLocationFromFintechPersonLocationSearch(String option) throws InterruptedException{
		switch (option){
		case "All Locations":
			selectOptionFromSpecifiedDropDownList(fintechLocationSearchXpath, option);
			break;
		case "France":
			selectOptionFromSpecifiedDropDownList(fintechLocationSearchXpath, option);
			break;
		}
	}
	
	


	
}


