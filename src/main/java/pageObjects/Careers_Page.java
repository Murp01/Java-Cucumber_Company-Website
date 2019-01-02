package pageObjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Careers_Page extends BasePage {
	
	public @FindBy(css = "") WebElement widget_StackedTab;	
	public @FindBy(xpath = "//a[contains(text(),'The Training Contract')]") WebElement button_STabLeft01;
	public @FindBy(xpath = "//div[@class='content col-md-12 active']") WebElement textField_STabLeft01Content;

	
	public Careers_Page() throws IOException {
		super();

	}

	public Careers_Page openCareersSubPage(String page) throws IOException {
		getDriver().get(page);
		return new Careers_Page();
	}
	
	public Careers_Page clickOnStackedTab(String tab) throws IOException {
		switch(tab){
			case "Left01":
				button_STabLeft01.click();
				break;
			case "Left02":
				System.out.println("Add xpath");
				break;
		}		
		return new Careers_Page();	
	}
	
	public Careers_Page assertStackedTabContentIsDisplayed(String content) throws IOException {
		switch(content){
		case "Left01":
			Assert.assertTrue(textField_STabLeft01Content.isDisplayed());
			break;
		case "Left02":
			System.out.println("Add xpath");
			break;
	}		
	return new Careers_Page();	
	}
	
	
	

}
