package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUs_Page extends BasePage{
	
	public @FindBy(css = "#container-special-offers") WebElement button_SpecialOffers;	
	public @FindBy(xpath = "//div[contains(@class,'ui-accordion ui-widget ui-helper-reset')]") WebElement widget_Accordion;
	public @FindBy(xpath = "//h2[@id='ui-id-1']") WebElement tab_Accordion01;
	public @FindBy(xpath = "//h2[@id='ui-id-3']") WebElement tab_Accordion02;
	public @FindBy(xpath = "//h2[@id='ui-id-5']") WebElement tab_Accordion03;
	public @FindBy(xpath = "//div[@id='ui-id-2']") WebElement textfield_Accordion01;
	public @FindBy(xpath = "//div[@id='ui-id-4']") WebElement textfield_Accordion02;
	public @FindBy(xpath = "//div[@id='ui-id-6']") WebElement textfield_Accordion03;
	
	
	public AboutUs_Page() throws IOException {
		super();
	}
	
	public void assertAccordionTextField() {
		String accordionText01 = "We work with companies, financial institutions, funds and governments to";
		String accordionText02 = "We are a people business. Being best in class in the eyes of our clients means ";
		String accordionText03 = "Investing in our clients and empowering our teams – whilst vital – are not enough to ";
		
		Assert.assertTrue(textfield_Accordion01.getText().contains(accordionText01));
		Assert.assertTrue(textfield_Accordion02.getText().contains(accordionText02));
		Assert.assertTrue(textfield_Accordion03.getText().contains(accordionText03));
	}
	
	public void checkAccordionWidgetIsClosed() {
		String accodordionClosed = widget_Accordion.getAttribute("data-open");
		Assert.assertTrue(accodordionClosed.equals(true));		
	}
	
	public void clickOnClosedAccordionTabs() throws InterruptedException {
		if (!textfield_Accordion01.isDisplayed()) {
			jsClick(tab_Accordion01);
		}
		else {
			System.out.println("already open");
		}
		if (!textfield_Accordion02.isDisplayed()) {
			jsClick(tab_Accordion02);
		}
		else {
			System.out.println("already open");
		}
		if (!textfield_Accordion03.isDisplayed()) {
			jsClick(tab_Accordion03);
			Thread.sleep(9000);
		}
		else {
			System.out.println("already open");
		}
	}


}
