package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fintech_Page extends BasePage{
	
	public @FindBy(xpath = "//button[@title='All Locations']") WebElement button_PeopleSearchLocationDropdown;
	public @FindBy(xpath = "") WebElement select_PeopleSearchLocationOption;
	//ul[@class='dropdown-menu inner']/li

	public Fintech_Page() throws IOException {
		super();

	}
	
	public void selectLocationFromLocationSearchDropdown(String option){
		List<WebElement> myElements01 = driver.findElements(By.xpath("//ul[@class='dropdown-menu inner']/li/a/span"));
		for (WebElement e : myElements01) {
			String selectionOption = e.getText();
			System.out.println(selectionOption);
			if (e.getText().equalsIgnoreCase(option)) {
				e.click(); 
			}
		}
	}

	
}


