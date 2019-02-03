package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Fintech_Page extends BasePage{
	
	String fintechLocationSearchXpath = "//select[@title='Select Location']/option";
	String fintechRetrievedLawyers = "//div[@id='key-contact-results-232f3fad-2271-4c52-8057-fe2c7cf98888']//div[@class='padding-top-10 padding-bottom-10']";
	String fintechRetrievedLawyersHref = "//div[@class='key-contact-results']//div[@class='padding-top-10 padding-bottom-10']/a";
	
	public @FindBy(xpath = "//button[@title='All Locations']") WebElement button_PeopleSearchLocationDropdown;
	public @FindBy(xpath = "//div[@id='key-contact-results-232f3fad-2271-4c52-8057-fe2c7cf98888']") WebElement container_RetrievedFintechLawyers;

	public Fintech_Page() throws IOException {
		super();

	}
	
	
	public void assertAllFilteredFintechLawyersLocations() throws InterruptedException {
		clickOnOnlyDisplayedElement(fintechRetrievedLawyersHref);
		
	}
	
	
	public void clickOnOnlyDisplayedElement(String xpath) throws InterruptedException {
		List<WebElement> filteredLawyers = driver.findElements(By.xpath(xpath));

		if (filteredLawyers.size() > 0) {
			for (WebElement we: filteredLawyers) {
				if (we.isDisplayed()) {
					//jsClick(we);
					Actions action = new Actions(getDriver());
					action.contextClick(we).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
					Thread.sleep(3000);
				}
			}
		}
		else {
			System.out.println("Filtered Lawyer click failed");
		}
			
	}
	
	
	public int countVisibleElements(String xpath) {
		List<WebElement> filteredLawyers = driver.findElements(By.xpath(xpath));
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


