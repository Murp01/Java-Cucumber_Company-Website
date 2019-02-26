package pageObjects;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LandingPageChecks_Page extends BasePage {
	
	public @FindBy(xpath = "//div[@class='header__navDesktop']//a[contains(text(),'About Us')]") WebElement href_AboutUsPage;
	public @FindBy(xpath = "//ul[@class='col-sm-3']//a[contains(text(),'Alumni')]") WebElement href_Alumni;
	public @FindBy(xpath = "//a[contains(text(),'At a glance')]") WebElement href_AtAGlance;
	public @FindBy(xpath = "//div[@class='header__navDesktop']//a[contains(text(),'Client Services')]") WebElement href_ClientServices;
	public @FindBy(xpath = "//a[contains(text(),'Banking')]") WebElement href_Banking;	
	public @FindBy(xpath = "//div[@class='header__navDesktop']//a[contains(text(),'Sectors')]") WebElement href_Sectors;
	public @FindBy(xpath = "//a[contains(text(),'Automotive')]") WebElement href_Automotive;	
	public @FindBy(xpath = "//div[@class='header__navDesktop']//a[contains(text(),'Locations')]") WebElement href_Locations;
	public @FindBy(xpath = "//a[@href='/en/locations/africa']") WebElement href_Africa;	
	public @FindBy(xpath = "//div[@class='header__navDesktop']//a[contains(text(),'Insights')]") WebElement href_Insights;	
	public @FindBy(xpath = "//a[contains(text(),'Blogs')]") WebElement href_Blogs;	
	
	
	@FindAll({@FindBy(xpath = "//div[@class='row nav__list is-active']/ul//a")})
	public List<WebElement> href_AboutUsSecondaryHrefList;	
	
	@FindAll({@FindBy(xpath = "//div[@class='row nav__list is-active']/ul//a")})
	public List<WebElement> href_ActiveSecondaryHrefList;	
	

	public LandingPageChecks_Page() throws IOException {
		super();
	}
	
	
	public void clickOnAllSecTitlesAndPrintTitleUrl(String primaryNavTitle) throws InterruptedException {
		Actions action = new Actions(getDriver());  
		switch(primaryNavTitle) {
		case "About Us":		 
			  action.moveToElement(href_AboutUsPage).build().perform();
			  basePage.waitForElementToAppear(href_Alumni);
			  openEachLinkInTabPrintTitleUrlCloseTab();
			break;
		case "Client Services":
			  action.moveToElement(href_ClientServices).build().perform();
			  basePage.waitForElementToAppear(href_Banking);
			  openEachLinkInTabPrintTitleUrlCloseTab();				
			break;
		case "Sectors":
			action.moveToElement(href_Sectors).build().perform();
			basePage.waitForElementToAppear(href_Automotive);
			openEachLinkInTabPrintTitleUrlCloseTab();
			break;
		case "Locations":
			action.moveToElement(href_Locations).build().perform();
			basePage.waitForElementToAppear(href_Africa);
			openEachLinkInTabPrintTitleUrlCloseTab();			
			break;
		case "Insights":
			action.moveToElement(href_Insights).build().perform();
			basePage.waitForElementToAppear(href_Blogs);
			openEachLinkInTabPrintTitleUrlCloseTab();		
			break;
		}
	}
	
	
	public void openEachLinkInTabPrintTitleUrlCloseTab() {
		for (WebElement we: href_ActiveSecondaryHrefList) {
			String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
			we.sendKeys(selectLinkOpeninNewTab);
			
			Set <String> st= driver.getWindowHandles();
			Iterator<String> it = st.iterator();
			
			String parent =  it.next();
			String child =it.next();
			
			getDriver().switchTo().window(child);
			
			System.out.println(getDriver().getTitle());
			System.out.println(getDriver().getCurrentUrl());
			
			getDriver().close();
			getDriver().switchTo().window(parent);
		}
	}
	
	
	public void assertPageTitle(String pageTitle) {
		switch(pageTitle) {
		case "About Us":
			System.out.println(pageTitle + "Page title is displayed as " + getDriver().getTitle());
			Assert.assertTrue(getDriver().getTitle().equals("About Us | Linklaters"));
			break;
		case "Alumni":
			System.out.println(pageTitle + "Page title is displayed as " + getDriver().getTitle());
			Assert.assertTrue(getDriver().getTitle().equals("Alumni | Linklaters"));
			break;
		case "At a glance":
			System.out.println(pageTitle + "Page title is displayed as " + getDriver().getTitle());
			Assert.assertTrue(getDriver().getTitle().equals("At a glance | Linklaters"));
			break;
		}
	}
	
	
	public void assertPageUrl(String pageURL) {
		switch(pageURL) {
		case "About Us":
			Assert.assertTrue(getDriver().getCurrentUrl().equals("https://www.linklaters.com/en/about-us"));
			break;
		case "Alumni":
			Assert.assertTrue(getDriver().getCurrentUrl().equals("https://www.linklaters.com/en/about-us/alumni"));
			break;
		case "At a glance":
			Assert.assertTrue(getDriver().getCurrentUrl().equals("https://www.linklaters.com/en/about-us/our-firm-at-a-glance"));
			break;
		}
		
	}
	
		
	public void clickOnPrimaryNavLink(String primNavLink) {
		switch(primNavLink) {
		case "About Us":
			href_AboutUsPage.click();
			break;
		case "":
			break;
		}
	}
	
	

	public void clickOnSecondaryNavLink(String primNav, String secNav) throws InterruptedException {
		switch(secNav) {
		case "Alumni":
			Actions action001 = new Actions(getDriver());
			action001.moveToElement(href_AboutUsPage).build().perform();
			basePage.waitAndClickElement(href_Alumni);
			break;
		case "At a glance":
			Actions action002 = new Actions(getDriver());
			action002.moveToElement(href_AboutUsPage).build().perform();
			basePage.waitAndClickElement(href_AtAGlance);
			break;
		}
	}
	
	
	public void openStartPage(String startPage) {
		switch(startPage) {
		case "homepage":
			getDriver().get("https://www.linklaters.com/");
			break;
		case "careershomepage":
			getDriver().get("https://careers.linklaters.com/");
			break;
		}
	}
	


}
