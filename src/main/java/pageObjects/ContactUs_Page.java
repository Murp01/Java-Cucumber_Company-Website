package pageObjects;

import java.io.IOException;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs_Page extends BasePage {
	
	public @FindBy(xpath = "//button[@title='Select location']") WebElement dropBox_Select;

	public ContactUs_Page() throws IOException {
		super();
	}
	
	public ContactUs_Page selectLocationFromDropDown(String location) throws IOException, InterruptedException {
		//Select dropLocation = new Select(driver.findElement(By.className("mapContact__citySelect")));
		dropBox_Select.click();
		driver.findElement(By.linkText(location)).click();;
		
		return new ContactUs_Page();	
	}

}
