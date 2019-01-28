package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Home_Page extends BasePage {
	
	public @FindBy(xpath = "//div[@class='slide slick-slide slick-current slick-active']//span[@class='icon-link-arrow-right']") WebElement button_CarouselNavRight;
	public @FindBy(xpath = "//div[@class='slide slick-slide slick-current slick-active']//span[@class='icon-link-arrow-left']") WebElement button_CarouselNavLeft;
	public @FindBy(css = "") WebElement slide_Current;
	public @FindBy(css = "#slide-3cd12c03-b989-49a1-994a-39244c7aa792") WebElement slide_Index01;
	public @FindBy(css = "#slide-7caba8a6-9070-400f-b587-e810aeb49a15") WebElement slide_Index02;
	public @FindBy(css = "#slide-b98b1d54-2569-43ee-b8b1-d3b9fe44b8ce") WebElement slide_Index03;
	public @FindBy(xpath = "//div[contains(text(), 'Forward Thinking')]") WebElement tab_Carousel01;	
	public @FindBy(xpath = "//p[contains(text(),'Global Issues')]") WebElement tab_Carousel02;	
	public @FindBy(xpath = "//p[contains(text(),'Ground-breaking Deals')]") WebElement tab_Carousel03;
	public @FindBy(xpath = "//p[contains(text(),'Responsible Business')]") WebElement tab_Carousel04;	
	public @FindBy(xpath = "//div[@class='slide slick-slide slick-current slick-active']//li[@class='slick-active']//button") WebElement slide_tab01Slide01;
	

	public Home_Page() throws IOException {
		super();
	}
	
	
	public void assertSlideHasChanged() throws Exception {
		/*need to capture the current slide, click arrow, and assert slide after click has changed.
		 * Capture current slide in string variable, click arrow, assert string variable has changed
		 * Should we check the order. No matter what I do the element is found?
		 * */
		//String slideHidden = slide_Index01.getText().toString();
		//Why haven't I added page object in method declaration? Do I need to if not returning?
		
		WebElement element = getDriver().findElement(By.cssSelector("#slide-3cd12c03-b989-49a1-994a-39244c7aa792"));
		button_CarouselNavRight.click();
		Assert.assertFalse(element.isEnabled());	
	}
	
	
	public Home_Page openLinklatersSiteHomepage() throws IOException {
		getDriver().get("https://www.linklaters.com/");
		return new Home_Page();		
	}
	
	
	public void selectCarouselTab(String category) {
		switch(category) {
		case "category01":
			tab_Carousel01.click();
			break;
		case "category02":
			tab_Carousel02.click();
			break;
		case "category03":
			tab_Carousel03.click();
			break;
		case "category04":
			tab_Carousel04.click();
			break;
		}
	}
	
	
	public void selectSlideFromCarouselTab(String slide) {
		switch(slide) {
		case "slide01":
			slide_tab01Slide01.click();
			break;
		}
	}
	

}
