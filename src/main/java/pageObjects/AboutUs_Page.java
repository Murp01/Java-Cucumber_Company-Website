package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUs_Page extends BasePage{
	
	public @FindBy(css = "#container-special-offers") WebElement button_SpecialOffers;	
	public @FindBy(xpath = "//div[@id='ui-id-2']") WebElement container_Accordion01;
	public @FindBy(xpath = "//div[@id='ui-id-4']") WebElement container_Accordion02;
	public @FindBy(xpath = "//div[@id='ui-id-6']") WebElement container_Accordion03;
	public @FindBy(css = "#ui-id-2") WebElement container_Accordion01css;
	public @FindBy(xpath = "//a[contains(text(),'responsible business section')]") WebElement href_ResponsibleBusinessSection;	
	public @FindBy(xpath = "//h2[@id='ui-id-1']") WebElement tab_Accordion01;
	public @FindBy(xpath = "//h2[@id='ui-id-3']") WebElement tab_Accordion02;
	public @FindBy(xpath = "//h2[@id='ui-id-5']") WebElement tab_Accordion03;
	public @FindBy(xpath = "//div[contains(@class,'ui-accordion ui-widget ui-helper-reset')]") WebElement widget_Accordion;
	
	
	
	public AboutUs_Page() {
		super();
	}
	
	
	public void assertAccordionWidgetIsClosed() {
		String accodordionClosed = widget_Accordion.getAttribute("data-open");
		Assert.assertTrue(accodordionClosed.equals(true));		
	}
	
	
	public void assertAccordionTabOpen(String openTab) {
		switch(openTab) {
		case "segment01":
			Assert.assertTrue(container_Accordion01css.getAttribute("style").contains("block"));
			break;
		case "segment02":
			Assert.assertTrue(container_Accordion02.getAttribute("style").contains("block"));
			break;
		case "segment03":
			Assert.assertTrue(container_Accordion03.getAttribute("style").contains("block"));
			break;
		}

	}
	
	
	public void assertAccordionTextField() { 
		Assert.assertTrue(container_Accordion01css.getAttribute("style").contains("block"));		
		Assert.assertTrue(container_Accordion02.getAttribute("style").contains("block"));
		Assert.assertTrue(container_Accordion03.getAttribute("style").contains("block"));
	}
	
	
	public void assertAccordionTextFieldClosed() {
		Assert.assertTrue(container_Accordion01css.getAttribute("style").contains("none"));
		Assert.assertTrue(container_Accordion02.getAttribute("style").contains("none"));
		Assert.assertTrue(container_Accordion03.getAttribute("style").contains("none"));		
	}
	


	
	
	public void clickOnAllAccordTabs() throws InterruptedException {
		jsClick(tab_Accordion01);
		jsClick(tab_Accordion02);
		jsClick(tab_Accordion03);
	}
	
	
	public void clickOnClosedAccordionTabs() throws InterruptedException {
		if (!container_Accordion01.isDisplayed()) {
			jsClick(tab_Accordion01);
		}
		else {
			System.out.println("already open");
		}
		if (!container_Accordion02.isDisplayed()) {
			jsClick(tab_Accordion02);
		}
		else {
			System.out.println("already open");
		}
		if (!container_Accordion03.isDisplayed()) {
			jsClick(tab_Accordion03);
			Thread.sleep(9000);
		}
		else {
			System.out.println("already open");
		}
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
	
	
	public void clickOnOpenClosedAccordionTabs(String tabStyle) throws InterruptedException {
		switch(tabStyle) {
			case "closed":
				if (container_Accordion01css.getAttribute("style").contains("none")) {
					jsClick(tab_Accordion01);
				}
				else {
					System.out.println("already open");
				}
				if (container_Accordion02.getAttribute("style").contains("none")) {
					jsClick(tab_Accordion02);
				}
				else {
					System.out.println("already open");
				}
				if (container_Accordion03.getAttribute("style").contains("none")) {
					jsClick(tab_Accordion03);
					Thread.sleep(3000);
					//waitForElementToDisappear(container_Accordion03);  This fails... why
				}
				else {
					System.out.println("already open");
				}
				break;
		
			case "open":
				if (container_Accordion01css.getAttribute("style").contains("block")) {
					jsClick(tab_Accordion01);
				}
				else {
					System.out.println("already open");
				}
				if (container_Accordion02.getAttribute("style").contains("block")) {
					jsClick(tab_Accordion02);
				}
				else {
					System.out.println("already open");
				}
				if (container_Accordion03.getAttribute("style").contains("block")) {
					jsClick(tab_Accordion03);
					Thread.sleep(3000);
					//waitForElementToAppear(container_Accordion03);
				}
				else {
					System.out.println("already open");
				}
				break;
		}
	}
	
		
		public void clickOnOpenedAccordionTabs() throws InterruptedException {
			if (container_Accordion01css.getAttribute("style").contains("block")) {
				jsClick(tab_Accordion01);
			}
			else {
				System.out.println("already open");
			}
			if (container_Accordion02.getAttribute("style").contains("block")) {
				jsClick(tab_Accordion02);
			}
			else {
				System.out.println("already open");
			}
			if (container_Accordion03.getAttribute("style").contains("block")) {
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
				if (!container_Accordion01.isDisplayed()) {
					jsClick(tab_Accordion01);
					WaitUntilWebElementIsVisible(container_Accordion01);
					//Thread.sleep(3000);
					Assert.assertTrue(container_Accordion01.getText().contains(accordionText01));
				}
				break;
			case "segment02":
				if (!container_Accordion02.isDisplayed()) {
					jsClick(tab_Accordion02);
					Assert.assertTrue(container_Accordion02.getText().contains(accordionText02));
				}
				break;
			case "segment03":
				if (!container_Accordion03.isDisplayed()) {
					jsClick(tab_Accordion03);
					Assert.assertTrue(container_Accordion03.getText().contains(accordionText03));
				}
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
	

	

		
	
}
		
		




