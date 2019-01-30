package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fintech_Page extends BasePage{
	
	String fintechLocationSearchXpath = "//select[@title='Select Location']/option";
	
	public @FindBy(xpath = "//button[@title='All Locations']") WebElement button_PeopleSearchLocationDropdown;
	public @FindBy(xpath = "") WebElement select_PeopleSearchLocationOption;
	//ul[@class='dropdown-menu inner']/li

	public Fintech_Page() throws IOException {
		super();

	}
	
	
	public void selectLocationFromFintechPersonLocationSearch(String option) throws InterruptedException{
		switch (option){
		case "All Locations":
			selectOptionFromSpecifiedDropDownList(fintechLocationSearchXpath, option);
			break;
		case "France":
			selectOptionFromSpecifiedDropDownList(fintechLocationSearchXpath, option);
			break;
		}
	}

	
}


