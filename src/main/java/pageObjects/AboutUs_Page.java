package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUs_Page extends BasePage{
	
	public @FindBy(css = "#container-special-offers") WebElement button_SpecialOffers;	
	public @FindBy(css = "//div[contains(@class,'ui-accordion ui-widget ui-helper-reset')]") WebElement widget_Accordion;
	
	public AboutUs_Page() throws IOException {
		super();
	}
	
	public void checkAccordionWidgetIsClosed() {
		String accodordionClosed = widget_Accordion.getAttribute("data-open");
		Assert.assertTrue(accodordionClosed.equals(true));		
	}

}
