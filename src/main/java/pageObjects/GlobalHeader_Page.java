package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class GlobalHeader_Page extends BasePage {
	public @FindBy(xpath = "//button[@class='header__searchToggle']") WebElement button_SearchIcon;
	public @FindBy(xpath = "//input[@id='search']") WebElement textBox_GlobalSearch;
	public @FindBy(xpath = "//span[contains(text(),'View all the results')]") WebElement link_ViewAllResults;
	public @FindBy(xpath = "//div[@class='row searchResults effect-4']") WebElement container_SearchResults;
	public @FindBy(xpath = "//span[@class='ctaLoadMore__text']") WebElement button_LoadMore;
	public @FindBy(xpath = "//div[@class='header__searchBar--results row']") WebElement container_SearchPredictions;
	public @FindBy(xpath = "//div[@class='header__searchBar--results row']/div") WebElement list_SearchPredictions;	


	public GlobalHeader_Page() throws IOException {
		super();
	}
	
	public void enterSearchTermIntoGlobalSiteSearchViewAllResults(String searchTerm) throws InterruptedException {
		button_SearchIcon.click();
		textBox_GlobalSearch.sendKeys(searchTerm);
		Thread.sleep(5000);
		link_ViewAllResults.click();
	}
	
	public void assertSearchResultsPageIsDisplayed() throws InterruptedException {
		Assert.assertTrue(getDriver().getCurrentUrl().contains("https://www.linklaters.com/search?query="));
		Assert.assertTrue(container_SearchResults.isDisplayed());
	}
	
	public void assertLoadMoreButtonClickableUntilAllResultsDisplayed() throws InterruptedException {
		//Should I assert more are loaded?
		while (button_LoadMore.isDisplayed()){
			button_LoadMore.click();
			Thread.sleep(3000);
		}		
	}
	
	public void enterSearchTermIntoGlobalSiteSearch(String searchTerm) throws InterruptedException {
		button_SearchIcon.click();
		textBox_GlobalSearch.sendKeys(searchTerm);
		Thread.sleep(3000);
	}
	
	public void assertAllSearchPredictionsContainSearchTerm() {
		Assert.assertTrue(container_SearchPredictions.isDisplayed());
	}


}
