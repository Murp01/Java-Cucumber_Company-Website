package pageObjects;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs_Page extends BasePage {
	
	public @FindBy(xpath = "//div[@class='mapContact__controlContainer bg-brand-magenta-dark']") WebElement container_ContactUsBox;
	public @FindBy(xpath = "//button[@title='Select location']") WebElement button_LocationDropdown;

	
	public ContactUs_Page() throws IOException {
		super();
	}
	
	
	public void assertLocationDetailsAppearinBox(String location) {
		
	}
	
	
	public ContactUs_Page selectLocationFromDropDown(String location) throws IOException, InterruptedException {
		button_LocationDropdown.click();
		driver.findElement(By.linkText(location)).click();;		
		return new ContactUs_Page();	
	}
	


}
