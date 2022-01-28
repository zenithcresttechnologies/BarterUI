package actions;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.NavigateToURL;
import pages.StartBrowser;
import pages.URL;
import pages.*;

public class UserLoginTest {
	private static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void ValidEmailInvalidPassword() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		HomePageObject homePageObject = new HomePageObject(driver);

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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.ClickPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.ClearPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.EnterPassword("James199");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.ClickLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


		homePageObject.ErrorMessageIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);
		driver.close();

	}


	@Test(priority = 2)
	public void UnregisteredEmailAndPassword() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		HomePageObject homePageObject = new HomePageObject(driver);
		LandingPageObject landingPageObject = new LandingPageObject(driver);

		homePageObject.ClickLoginHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.ClearEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.EnterEmail("jptnetworks+unreg@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.ClickPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.ClearPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.EnterPassword("James199");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.ClickLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


		landingPageObject.CreateAccountDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);
		driver.close();

	}

	@Test(priority = 3)
	public void ClickRegisterLabel() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		HomePageObject homePageObject = new HomePageObject(driver);
		LandingPageObject landingPageObject = new LandingPageObject(driver);

		homePageObject.ClickLoginHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		homePageObject.ClickRegister();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		landingPageObject.CreateAccountDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.close();

	}

	@Test(priority = 4)
	public void ValidEmailValidPassword() throws InterruptedException {

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


		homePageObject.Logout();
		driver.close();
	}

	@Test(priority = 5)
	public void ValidPhoneNumberValidPassword() throws InterruptedException {

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

		homePageObject.EnterEmail("08088730310");

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


		homePageObject.Logout();

	}

		@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Login Test Scenarios Passed");
	}

}






