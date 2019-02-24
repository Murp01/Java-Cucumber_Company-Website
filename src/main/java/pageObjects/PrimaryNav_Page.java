package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PrimaryNav_Page extends BasePage {
	
	public @FindBy(xpath = "//li/a[contains(text(),'About Us')]") WebElement title_AboutUs;
	public @FindBy(xpath = "//li/a[contains(text(),'Find People')]") WebElement title_FindPeople;
	public @FindBy(xpath = "") WebElement title_Sectors;
	
	//ul[@class='col-sm-3']//a - All Sec Nav links nearly


	public PrimaryNav_Page() throws IOException {
		super();
	}
	
	
	public void assertSitemapPage()
	{
		String beforeClickingTitle = null;
		String afterClickingNew;
				
		WebElement globalFooter = driver.findElement(By.xpath("//div[@class='footerBottom']"));
		int footerSize = (globalFooter.findElements(By.tagName("a")).size());
		for (int i=0; i < footerSize; i++) {			
			System.out.println(globalFooter.findElements(By.tagName("a")).get(i).getText());
			if (globalFooter.findElements(By.tagName("a")).get(i).getText().contains("Sitemap")) {
				beforeClickingTitle = driver.getTitle();
				System.out.println("Before clicking on the link the title is '" + 
				beforeClickingTitle + "'");				
				globalFooter.findElements(By.tagName("a")).get(i).click();
				break;			
			}						
		}
		afterClickingNew = driver.getTitle();
		System.out.println("After clicking on the link the title is '" + afterClickingNew + "'");
		if (beforeClickingTitle != afterClickingNew) {			
			Boolean titleDisplayed = driver.findElement(By.xpath("//h1[text()='Sitemap']")).isDisplayed();
			if (titleDisplayed == true) {
			System.out.println("SUCCESS");
			}
		}
		else {			
			System.out.println("FAIL");
		}
		
	}
	
	

	public void clickOnAllPrimaryNaveLinks()
	{
		int count = driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).get(i).click();
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			String pageUrl = driver.getCurrentUrl();
			System.out.println(pageUrl);
		}		
	}
	

}
