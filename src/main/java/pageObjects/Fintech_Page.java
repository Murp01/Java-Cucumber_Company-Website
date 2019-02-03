package pageObjects;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
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
	String contactListDetailsLocation = "(//span[@class='listDetails__info'])[1]";
	
	public @FindBy(xpath = "//button[@title='All Locations']") WebElement button_PeopleSearchLocationDropdown;
	public @FindBy(xpath = "//div[@id='key-contact-results-232f3fad-2271-4c52-8057-fe2c7cf98888']") WebElement container_RetrievedFintechLawyers;
	public @FindBy(xpath = "(//span[@class='listDetails__info'])[1]") WebElement container_ContactListDetailsLocation;
	public @FindBy(xpath = "//ul[@class='listDetails']") WebElement container_ContactListDetailsBox;

	public Fintech_Page() throws IOException {
		super();
	}
	
	
	public void assertAllFilteredFintechLawyersLocations(String location) throws InterruptedException {
		String xpath = fintechRetrievedLawyersHref;
		List<WebElement> filteredLawyers = driver.findElements(By.xpath(xpath));

		if (filteredLawyers.size() > 0) {
			for (WebElement we: filteredLawyers) {
				if (we.isDisplayed()) {
					String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
					we.sendKeys(selectLinkOpeninNewTab);			
					Set <String> st= driver.getWindowHandles();
					Iterator<String> it = st.iterator();
					
					String parent =  it.next();
					String child =it.next();
					
					getDriver().switchTo().window(child);				
					Thread.sleep(3000);				
					waitAndClickElement(container_ContactListDetailsBox);
					
					//assert location is present on page
					if (location.equals("All Locations")) {
						System.out.println("Any Location");
					}
					else {
						Assert.assertTrue(location.equalsIgnoreCase(container_ContactListDetailsLocation.getText()));
						System.out.println(container_ContactListDetailsLocation.getText());
					}
					
					getDriver().close();
					Thread.sleep(3000);
					getDriver().switchTo().window(parent);
					Thread.sleep(4000);

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


