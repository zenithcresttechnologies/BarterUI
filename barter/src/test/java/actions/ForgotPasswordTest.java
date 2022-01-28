package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;


import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class ForgotPasswordTest {
	private static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void ForgotPasswordSuccessEmail() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LandingPageObject landingPageObject = new LandingPageObject(driver);
		HomePageObject homePageObject = new HomePageObject(driver);
		ForgotPasswordPageObject forgotPasswordPageObject = new ForgotPasswordPageObject(driver);

		landingPageObject.ClickLoginHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		landingPageObject.LoginPageDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.ForgotPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);


		forgotPasswordPageObject.ForgotPasswordDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		forgotPasswordPageObject.Login();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		landingPageObject.LoginPageDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.ForgotPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);


		forgotPasswordPageObject.ForgotPasswordDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);


		forgotPasswordPageObject.ClickEmailNumField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		forgotPasswordPageObject.ClearEmailNumField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		forgotPasswordPageObject.EnterEmailNumField("jptnetworks@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		forgotPasswordPageObject.ClickContinueBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		forgotPasswordPageObject.OTPScreenDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		forgotPasswordPageObject.ClickOTPField();

		forgotPasswordPageObject.ClearOTPField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		forgotPasswordPageObject.EnterOTPField("123456");

		forgotPasswordPageObject.ClickPasswordField();

		forgotPasswordPageObject.ClearPasswordField();

		Random rnd = new Random();
		int number = rnd.nextInt(999);
		String newpass = "Blonde77@" + number;
		forgotPasswordPageObject.EnterPasswordField(newpass);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);


		forgotPasswordPageObject.ClickResetPasswordBtn();


		forgotPasswordPageObject.OTPSuccessDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		landingPageObject.LoginPageDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.ClearEmail();


		homePageObject.EnterEmail("jptnetworks@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.ClickPassword();

		homePageObject.ClearPassword();

		homePageObject.EnterPassword(newpass);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.ClickLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(4000);

		homePageObject.UserIsLoggedIn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);


		homePageObject.BalanceIsReturnedToUser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.Logout();
		driver.close();
	}

	@Test(priority = 2)
	public void ForgotPasswordSuccessNumber() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LandingPageObject landingPageObject = new LandingPageObject(driver);
		HomePageObject homePageObject = new HomePageObject(driver);
		ForgotPasswordPageObject forgotPasswordPageObject = new ForgotPasswordPageObject(driver);

		landingPageObject.ClickLoginHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		landingPageObject.LoginPageDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.ForgotPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);


		forgotPasswordPageObject.ForgotPasswordDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		forgotPasswordPageObject.Login();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		landingPageObject.LoginPageDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.ForgotPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);


		forgotPasswordPageObject.ForgotPasswordDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);


		forgotPasswordPageObject.ClickEmailNumField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		forgotPasswordPageObject.ClearEmailNumField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		forgotPasswordPageObject.EnterEmailNumField("08021357234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		forgotPasswordPageObject.ClickContinueBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		forgotPasswordPageObject.OTPScreenDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		forgotPasswordPageObject.ClickOTPField();

		forgotPasswordPageObject.ClearOTPField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		forgotPasswordPageObject.EnterOTPField("123456");

		forgotPasswordPageObject.ClickPasswordField();

		forgotPasswordPageObject.ClearPasswordField();

		Random rnd = new Random();
		int number = rnd.nextInt(999);
		String newpass = "Blonde77@" + number;
		forgotPasswordPageObject.EnterPasswordField(newpass);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);


		forgotPasswordPageObject.ClickResetPasswordBtn();


		forgotPasswordPageObject.OTPSuccessDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		landingPageObject.LoginPageDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		homePageObject.ClearEmail();


		homePageObject.EnterEmail("08021357234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.ClickPassword();

		homePageObject.ClearPassword();

		homePageObject.EnterPassword(newpass);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.ClickLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(4000);

		homePageObject.UserIsLoggedIn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);


		homePageObject.BalanceIsReturnedToUser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.Logout();
		driver.close();
	}

	@Test(priority = 3)
	public void ForgotPasswordInvalidOTP() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LandingPageObject landingPageObject = new LandingPageObject(driver);
		HomePageObject homePageObject = new HomePageObject(driver);
		ForgotPasswordPageObject forgotPasswordPageObject = new ForgotPasswordPageObject(driver);

		landingPageObject.ClickLoginHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		landingPageObject.LoginPageDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.ForgotPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);


		forgotPasswordPageObject.ForgotPasswordDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		forgotPasswordPageObject.ClickEmailNumField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		forgotPasswordPageObject.ClearEmailNumField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		forgotPasswordPageObject.EnterEmailNumField("jptnetworks@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		forgotPasswordPageObject.ClickContinueBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		forgotPasswordPageObject.OTPScreenDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		forgotPasswordPageObject.ClickOTPField();

		forgotPasswordPageObject.ClearOTPField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		forgotPasswordPageObject.EnterOTPField("123400");

		forgotPasswordPageObject.ClickPasswordField();

		forgotPasswordPageObject.ClearPasswordField();

		Random rnd = new Random();
		int number = rnd.nextInt(999);
		String newpass = "Blonde77@" + number;
		forgotPasswordPageObject.EnterPasswordField(newpass);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);


		forgotPasswordPageObject.ClickResetPasswordBtn();


		forgotPasswordPageObject.OTPErrorMsgDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.close();
	}

	@Test(priority = 4)
	public void ForgotPasswordUnregisteredEmail() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LandingPageObject landingPageObject = new LandingPageObject(driver);
		HomePageObject homePageObject = new HomePageObject(driver);
		ForgotPasswordPageObject forgotPasswordPageObject = new ForgotPasswordPageObject(driver);

		landingPageObject.ClickLoginHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		landingPageObject.LoginPageDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		homePageObject.ForgotPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);


		forgotPasswordPageObject.ForgotPasswordDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		forgotPasswordPageObject.ClickEmailNumField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		forgotPasswordPageObject.ClearEmailNumField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);


		forgotPasswordPageObject.EnterEmailNumField("jptnetworks+never@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		forgotPasswordPageObject.ClickContinueBtn();

		forgotPasswordPageObject.UnableToRetrieveDetails();

	}



	@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Forgot Password Scenarios Passed");
	}

}






