package pageObjects;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourApplication_Page extends BasePage {
	
	String closeDateFormat = "dd MMMM yyyy";  //add date format 11 December 2018
	
	public @FindBy(xpath = "//p[contains(text(),'Open vacancies')]") WebElement button_OpenVacancies;
	public @FindBy(xpath = "//p[contains(text(),'Future vacancies')]") WebElement button_FutureVacancies;
	public @FindBy(xpath = "//div[@class='right']") WebElement container_OpenVacancyDateBoxList;

	

	public YourApplication_Page() throws IOException {
		super();
	}
	
	
	public void assertOpenVacancyDateNotExpired(){
		//Date date = new Date();
		List<WebElement> dateBox = driver.findElements(By.xpath("//div[@class='right']"));
		for (WebElement we: dateBox){
			System.out.println("Contents of date box " + we.getText());
			//System.out.println("The actual date is " + date);
			DateFormat dateTimeFormat = new SimpleDateFormat(closeDateFormat);
			String dateYo = dateTimeFormat.format(new Date());
			System.out.println(dateYo);

		}
	}
	
	public String simpleDateFormatter(String date){
		DateFormat dateTimeFormat = new SimpleDateFormat(closeDateFormat);
		return date;
		
	}
	
	
	public void clickOnOpenOrFutureVacancyTab(String tab){
		switch (tab){
		case "Open vacancies":
			button_OpenVacancies.click();
			System.out.println("Open Vacancies was selected");
			break;
		case "Future Vacancies":
			button_FutureVacancies.click();
			break;			
		}
	}
	
	

}
