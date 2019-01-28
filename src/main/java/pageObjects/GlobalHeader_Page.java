package pageObjects;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class GlobalHeader_Page extends BasePage {
	
	public @FindBy(xpath = "//span[@class='ctaLoadMore__text']") WebElement button_LoadMore;
	public @FindBy(xpath = "//button[@class='header__searchToggle']") WebElement button_SearchIcon;	
	public @FindBy(xpath = "//div[@class='header__searchBar--results row']") WebElement container_SearchPredictions;
	public @FindBy(xpath = "//div[@class='row searchResults effect-4']") WebElement container_SearchResults;
	public @FindBy(xpath = "//span[contains(text(),'View all the results')]") WebElement href_ViewAllResults;
	public @FindBy(xpath = "//div[@class='header__searchBar--results row']/div") WebElement href_SearchPredictions;		
	public @FindBy(xpath = "//input[@id='search']") WebElement input_GlobalSearch;
	public @FindBy(xpath = "//div[@class='col-xs-12 siteSearch__resultItem']") WebElement list_SearchPredictions;

	

	public GlobalHeader_Page() throws IOException {
		super();
	}
	
	
	public void assertAllSearchPredictionsContainSearchTerm(String searchTerm) throws InterruptedException {
		Thread.sleep(4000);
		Assert.assertTrue(container_SearchPredictions.isDisplayed());
		List<WebElement> predictionResults = driver.findElements(By.xpath("//div[@class='col-xs-12 siteSearch__resultItem']"));
		for (WebElement we: predictionResults){
			String predictedResult = we.getText();
			predictedResult = predictedResult.toLowerCase();
			Assert.assertTrue(predictedResult.contains(searchTerm));
			//This test only works if search term is entered in lower case - look into making it ignore contain
		}
	}
	
	
	public void assertPredictionsAreDisplayedBelowWhenSearchTermIsEntered(){
		Assert.assertTrue(container_SearchPredictions.isDisplayed());
	}
	
	
	public void assertLoadMoreButtonClickableUntilAllResultsDisplayed() throws InterruptedException {
		//Should I assert more are loaded?
		while (button_LoadMore.isDisplayed()){
			button_LoadMore.click();
			Thread.sleep(3000);
		}		
	}
	
	
	public void assertSearchResultsPageIsDisplayed() throws InterruptedException {
		Assert.assertTrue(getDriver().getCurrentUrl().contains("https://www.linklaters.com/search?query="));
		Assert.assertTrue(container_SearchResults.isDisplayed());
	}
	
	
	public void inputSearchTermIntoGlobalSiteSearch(String searchTerm) throws InterruptedException {
		button_SearchIcon.click();
		input_GlobalSearch.sendKeys(searchTerm);
		Thread.sleep(3000);
	}
	
	
	public void inputSearchTermIntoGlobalSiteSearchViewAllResults(String searchTerm) throws InterruptedException {
		button_SearchIcon.click();
		input_GlobalSearch.sendKeys(searchTerm);
		Thread.sleep(5000);
		href_ViewAllResults.click();
	}
	


}
