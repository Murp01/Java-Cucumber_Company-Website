package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BasePage;
import pageObjects.Careers_Page;
import pageObjects.ContactUs_Page;
import pageObjects.Events_Page;
import pageObjects.FindALawyer_Page;
import pageObjects.Fintech_Page;
import pageObjects.GlobalHeader_Page;
import pageObjects.Home_Page;
import pageObjects.LandingPageChecks_Page;
import pageObjects.NavFindPeople_Page;
import pageObjects.NewsLetterForm_Page;
import pageObjects.PrimaryNav_Page;
import pageObjects.YourApplication_Page;
import pageObjects.AboutUs_Page;

public class DriverFactory {

	public static WebDriver driver;
	public static BasePage basePage;
	public static Home_Page homePage;
	public static AboutUs_Page aboutUsPage;
	public static PrimaryNav_Page primaryNavPage;
	public static Careers_Page careersPage;
	public static NavFindPeople_Page navFindPeoplePage;
	public static FindALawyer_Page findALawyerPage;
	public static Fintech_Page fintechPage;
	public static ContactUs_Page contactUsPage;	
	public static Events_Page eventsPage;
	public static GlobalHeader_Page globalHeaderPage;
	public static YourApplication_Page yourApplicationPage;
	public static LandingPageChecks_Page landingPageChecksPage;
	public static NewsLetterForm_Page newsLetterFormPage;

	public WebDriver getDriver() {

		try {
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + 
					"\\src\\main\\java\\properties\\config.properties");
			p.load(fi);
			String browserName = p.getProperty("browser");


			switch (browserName) {

			case "firefox":
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;

			case "chrome":
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					// CHROME OPTIONS
					// ChromeOptions options = new ChromeOptions();
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;

			case "ie":
				if (null == driver) {
					// DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
					// caps.setCapability("ignoreZoomSetting", true);
					driver = new InternetExplorerDriver();
					driver.manage().window().maximize();
				}
			}

		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			homePage = PageFactory.initElements(driver, Home_Page.class);
			aboutUsPage = PageFactory.initElements(driver, AboutUs_Page.class);
			basePage = PageFactory.initElements(driver, BasePage.class);
			primaryNavPage = PageFactory.initElements(driver, PrimaryNav_Page.class);
			careersPage = PageFactory.initElements(driver, Careers_Page.class);
			navFindPeoplePage = PageFactory.initElements(driver, NavFindPeople_Page.class);
			findALawyerPage = PageFactory.initElements(driver, FindALawyer_Page.class);
			contactUsPage = PageFactory.initElements(driver, ContactUs_Page.class);		
			eventsPage = PageFactory.initElements(driver, Events_Page.class);
			globalHeaderPage = PageFactory.initElements(driver, GlobalHeader_Page.class);
			yourApplicationPage = PageFactory.initElements(driver, YourApplication_Page.class);
			landingPageChecksPage = PageFactory.initElements(driver, LandingPageChecks_Page.class);
			fintechPage = PageFactory.initElements(driver, Fintech_Page.class);
			newsLetterFormPage = PageFactory.initElements(driver, NewsLetterForm_Page.class);
		}
		return driver;

	}

}
