package pageObjects;

import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class Events_Page extends BasePage {
	
	public @FindBy(xpath = "//input[@placeholder='Name']") WebElement textbox_NameSearch;
	public @FindBy(xpath = "//div[@class='searchResults cardRow']") WebElement container_EventSearchResults;
	public @FindBy(xpath = "//span[@class='ctaLoadMore__text']") WebElement button_LoadMore;
	public @FindBy(xpath = "//div[@class='col-md-6 search__eventResultLeft']") WebElement container_EventReturnedResults;
	public @FindBy(css = "div[class='col-md-6 search__eventResultLeft']") WebElement container_EventReturnedResultsCSS;
	public @FindBy(xpath = "(//*[contains(text(),'view this event')])[i]") WebElement link_ViewEventLink;
	public @FindBy(xpath = "//div[@class='col-md-7']") WebElement container_ArticlePageDescription;
	public @FindBy(xpath = "//div[@class='searchResults cardRow']") WebElement container_NoSearchResultsMessage;
	public @FindBy(xpath = "//select[@name='practice']") WebElement dropdownBox_Practice;
	public @FindBy(xpath = "/html/body/div[6]/div/div/div[1]/div/form/div[2]/button") WebElement button_Practice;
	
	
	//*[contains(text(), 'Practice')]/span

	

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
			button_Practice.click();
			driver.findElement(By.xpath("//div[@class='btn-group bootstrap-select show-tick dropup open']//li[@data-original-index='0']//a[@tabindex='0']")).click();
/*			Thread.sleep(4000);
			Select drpBox = new Select(driver.findElement(By.xpath("//select[@name='practice']")));
			drpBox.selectByVisibleText(option);			
			Thread.sleep(9000);
			break;*/
		case "Business and Human Rights":
			
			break;
			
		case "Capital Markets":
			
			break;
			
		}
	}
	


}
