package pageObjects;

import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Events_Page extends BasePage {
	
	public @FindBy(xpath = "//input[@placeholder='Name']") WebElement textbox_NameSearch;
	public @FindBy(xpath = "//div[@class='searchResults cardRow']") WebElement container_EventSearchResults;
	public @FindBy(xpath = "//span[@class='ctaLoadMore__text']") WebElement button_LoadMore;
	public @FindBy(xpath = "//div[@class='col-md-6 search__eventResultLeft']") WebElement container_EventReturnedResults;
	public @FindBy(css = "div[class='col-md-6 search__eventResultLeft']") WebElement container_EventReturnedResultsCSS;
	public @FindBy(xpath = "(//*[contains(text(),'view this event')])[i]") WebElement link_ViewEventLink;
	public @FindBy(xpath = "//div[@class='col-md-7']") WebElement container_ArticlePageDescription;
	

	

	public Events_Page() throws IOException {
		super();
	}
	
	public void inputTextIntoNameField(String name) throws InterruptedException{
		textbox_NameSearch.sendKeys(name);
		Thread.sleep(10000);
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
					if (container_ArticlePageDescription.getText().contains(name)){
						//return to search page and search result (can I just go back by browser button?
						System.out.println("Searchterm found in article page");
					}
					else{
						Assert.assertTrue(container_ArticlePageDescription.getText().contains(name));
						//is there another way to fail this test or just keep assertion
					}
					
				}
				returnProfile = driver.findElements(By.cssSelector("div[class='col-md-6 search__eventResultLeft']"));
				//Assert.assertTrue(returnProfile.get(i).getText().contains(name));
			}
		}

	}

}
