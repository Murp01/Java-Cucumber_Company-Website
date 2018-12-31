package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Home_Page extends BasePage {
	
	public @FindBy(xpath = "//div[@class='slide slick-slide slick-current slick-active']//span[@class='icon-link-arrow-right']") WebElement button_CarouselNavRight;
	public @FindBy(xpath = "//div[@class='slide slick-slide slick-current slick-active']//span[@class='icon-link-arrow-left']") WebElement button_CarouselNavLeft;
	public @FindBy(css = "#slide-3cd12c03-b989-49a1-994a-39244c7aa792") WebElement slide_Index01;
	public @FindBy(css = "#slide-7caba8a6-9070-400f-b587-e810aeb49a15") WebElement slide_Index02;
	public @FindBy(css = "#slide-b98b1d54-2569-43ee-b8b1-d3b9fe44b8ce") WebElement slide_Index03;
	public @FindBy(css = "") WebElement slide_Current;





	public Home_Page() throws IOException {
		super();
	}
	
	public Home_Page getLLHomepage() throws IOException {
		getDriver().get("https://www.linklaters.com/");
		return new Home_Page();		
	}
	
	public void assertSlideHasChanged() throws Exception {
		/*need to capture the current slide, click arrow, and assert slide after click has changed.
		 * Capture current slide in string variable, click arrow, assert string variable has changed
		 * Should we check the order. No matter what I do the element is found?
		 * */
		//String slideHidden = slide_Index01.getText().toString();
		
		WebElement element = getDriver().findElement(By.cssSelector("#slide-3cd12c03-b989-49a1-994a-39244c7aa792"));
		button_CarouselNavRight.click();
		Assert.assertFalse(element.isDisplayed());
	
		
	}
	

	


}
