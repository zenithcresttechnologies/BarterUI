package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.NavigateToURL;
import pages.StartBrowser;
import pages.URL;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LandingPageTest {
	private static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void LandingPage () throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);
		LandingPageObject landingPageObject = new LandingPageObject(driver);

		startWebsite.launchURL();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(1000);


		landingPageObject.IconDisplayed();

		landingPageObject.ClickSecondSliderBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.ClickFirstSliderBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.ClickStdAmbHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.StudentAmbDisplayed();

		startWebsite.BackArrow();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.IconDisplayed();

		landingPageObject.ClickSupportHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.SupportDisplayed();

		startWebsite.BackArrow();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.IconDisplayed();

		landingPageObject.ClickGPlayBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.GooglePlayDisplayed();

		startWebsite.BackArrow();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.IconDisplayed();

		landingPageObject.ClickAppStoreBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.AppStoreDisplayed();

		startWebsite.BackArrow();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.IconDisplayed();

		landingPageObject.ClickLoginHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.LoginPageDisplayed();

		startWebsite.BackArrow();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.IconDisplayed();

		landingPageObject.ClickCreateAccHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.CreateAccountDisplayed();

		startWebsite.BackArrow();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		landingPageObject.IconDisplayed();


	}

		@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Landing  Page Scenarios  Passed Successfully ");
	}

}






