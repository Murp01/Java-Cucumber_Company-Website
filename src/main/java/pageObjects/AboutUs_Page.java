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
	public @FindBy(css = "#ui-id-2") WebElement textfield_Accordion01css;
	public @FindBy(xpath = "//a[contains(text(),'responsible business section')]") WebElement href_ResponsibleBusinessSection;
	
	
	public AboutUs_Page() throws IOException {
		super();
	}
	

	
	public void assertAccordionTextField() { 
		Assert.assertTrue(textfield_Accordion01css.getAttribute("style").contains("block"));		
		Assert.assertTrue(textfield_Accordion02.getAttribute("style").contains("block"));
		Assert.assertTrue(textfield_Accordion03.getAttribute("style").contains("block"));
	}
	
	public void assertAccordionTextFieldClosed() {
		Assert.assertTrue(textfield_Accordion01css.getAttribute("style").contains("none"));
		Assert.assertTrue(textfield_Accordion02.getAttribute("style").contains("none"));
		Assert.assertTrue(textfield_Accordion03.getAttribute("style").contains("none"));		
	}
	
	public void assertAccordionTabOpen(String openTab) {
		switch(openTab) {
		case "segment01":
			Assert.assertTrue(textfield_Accordion01css.getAttribute("style").contains("block"));
			break;
		case "segment02":
			Assert.assertTrue(textfield_Accordion02.getAttribute("style").contains("block"));
			break;
		case "segment03":
			Assert.assertTrue(textfield_Accordion03.getAttribute("style").contains("block"));
			break;
		}

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
		
		public void clickOnOpenedAccordionTabs() throws InterruptedException {
			if (textfield_Accordion01css.getAttribute("style").contains("block")) {
				jsClick(tab_Accordion01);
			}
			else {
				System.out.println("already open");
			}
			if (textfield_Accordion02.getAttribute("style").contains("block")) {
				jsClick(tab_Accordion02);
			}
			else {
				System.out.println("already open");
			}
			if (textfield_Accordion03.getAttribute("style").contains("block")) {
				jsClick(tab_Accordion03);
				Thread.sleep(9000);
			}
			else {
				System.out.println("already open");
			}
	}
	
	public void clickOnSingleTab(String tabNumber) throws InterruptedException {
		String accordionText01 = "We work with companies, financial institutions, funds and governments to";
		String accordionText02 = "We are a people business. Being best in class in the eyes of our clients means ";
		String accordionText03 = "Investing in our clients and empowering our teams – whilst vital – are not enough to ";
		switch(tabNumber) {
			case "segment01":
				if (!textfield_Accordion01.isDisplayed()) {
					jsClick(tab_Accordion01);
					Thread.sleep(3000);
					Assert.assertTrue(textfield_Accordion01.getText().contains(accordionText01));
				}
				break;
			case "segment02":
				if (!textfield_Accordion02.isDisplayed()) {
					jsClick(tab_Accordion02);
					Assert.assertTrue(textfield_Accordion02.getText().contains(accordionText02));
				}
				break;
			case "segment03":
				if (!textfield_Accordion03.isDisplayed()) {
					jsClick(tab_Accordion03);
					Assert.assertTrue(textfield_Accordion03.getText().contains(accordionText03));
				}
				break;
		}		
	}
		
	public void clickOnAllAccordTabs() throws InterruptedException {
		jsClick(tab_Accordion01);
		jsClick(tab_Accordion02);
		jsClick(tab_Accordion03);
		Thread.sleep(9000);
	}
	
	public void clickOnLinkWithinAccordionTextbox(String link, String section) throws InterruptedException {
		System.out.println(section);
		System.out.println(link);
		switch(section) {		
			case "segment01":
				href_ResponsibleBusinessSection.click();
				break;
			case "segment02":
				System.out.println("You'd be lucky");
				break;
		}
		
	}
	
	public void webpageChangeTo(String webpage) {
		//move to basepage
		switch(webpage) {
			case "https://www.linklaters.com/en/about-us/responsibility":
				System.out.println(webpage);
				Assert.assertTrue(webpage.equals("https://www.linklaters.com/en/about-us/responsibility"));				
				break;
			case "template":
				Assert.assertTrue(webpage.equals(""));
				break;
		}
		
	}
	
	public void clickOnOpenClosedAccordionTabs(String tabStyle) throws InterruptedException {
		switch(tabStyle) {
			case "closed":
				if (textfield_Accordion01css.getAttribute("style").contains("none")) {
					jsClick(tab_Accordion01);
				}
				else {
					System.out.println("already open");
				}
				if (textfield_Accordion02.getAttribute("style").contains("none")) {
					jsClick(tab_Accordion02);
				}
				else {
					System.out.println("already open");
				}
				if (textfield_Accordion03.getAttribute("style").contains("none")) {
					jsClick(tab_Accordion03);
					Thread.sleep(9000);
				}
				else {
					System.out.println("already open");
				}
				break;
		
			case "open":
				if (textfield_Accordion01css.getAttribute("style").contains("block")) {
					jsClick(tab_Accordion01);
				}
				else {
					System.out.println("already open");
				}
				if (textfield_Accordion02.getAttribute("style").contains("block")) {
					jsClick(tab_Accordion02);
				}
				else {
					System.out.println("already open");
				}
				if (textfield_Accordion03.getAttribute("style").contains("block")) {
					jsClick(tab_Accordion03);
					Thread.sleep(9000);
				}
				else {
					System.out.println("already open");
				}
				break;
		}
	}
	

		
	
}
		
		




