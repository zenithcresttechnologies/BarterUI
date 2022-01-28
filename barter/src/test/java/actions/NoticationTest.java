package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import pages.NavigateToURL;
import pages.StartBrowser;
import pages.URL;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class NoticationTest {
	private static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void LoginTest() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		HomePageObject homePageObject= new HomePageObject(driver);

		homePageObject.ClickLoginHeader();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(3000);

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
		Thread.sleep(3000);

		homePageObject.UserIsLoggedIn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

		homePageObject.BalanceIsReturnedToUser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


		homePageObject.ClickNotificationIcon();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

		homePageObject.Logout();

	}


		@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Test Page Passed");
	}

}






