package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePageTest {
	private static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void HomepageTest() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		HomePageObject homePageObject= new HomePageObject(driver);
		LandingPageObject landingPageObject = new LandingPageObject(driver);

		landingPageObject.IconDisplayed();

		homePageObject.ClickLoginHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		landingPageObject.LoginPageDisplayed();

		homePageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.ClearEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.EnterEmail("jamesohia4+bvn@gmail.com");

		homePageObject.ClickPassword();

		homePageObject.ClearPassword();

		homePageObject.EnterPassword("James1997.");

		homePageObject.ClickLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(4000);

		homePageObject.UserIsLoggedIn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


		homePageObject.BalanceIsReturnedToUser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

		homePageObject.SpendingTab();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

		homePageObject.TransactionTab();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

		homePageObject.TotalReceive();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

		homePageObject.TotalSpent();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

		homePageObject.SpendingChart();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

		homePageObject.ClickDateFilter();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		homePageObject.ClickDateYesterday();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		homePageObject.ClickDateFilter();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		homePageObject.ClickDate7Days();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		homePageObject.ClickDateFilter();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		homePageObject.ClickDate30Days();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		homePageObject.ClickDateFilter();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		homePageObject.ClickDateMonth();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		homePageObject.ClickDateFilter();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		homePageObject.ClickDateAllTime();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		homePageObject.ClickDateFilter();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		homePageObject.ClickDateToday();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		homePageObject.Logout();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.LoginPageDisplayed();

	}

		@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Homepage Test Scenarios Passed");
	}

}






