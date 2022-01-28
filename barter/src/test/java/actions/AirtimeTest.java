package actions;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.NavigateToURL;
import pages.*;
import pages.StartBrowser;
import pages.URL;




public class AirtimeTest {
	private static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void AirtimePurchaseTest() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		HomePageObject homePageObject = new HomePageObject(driver);
		AirtimePageObject airtimePageObject = new AirtimePageObject(driver);

		homePageObject.ClickLoginHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		homePageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		homePageObject.ClearEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		homePageObject.EnterEmail("jamesohia4+bvn@gmail.com");

		homePageObject.ClickPassword();

		homePageObject.ClearPassword();

		homePageObject.EnterPassword("James1997.");

		homePageObject.ClickLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		homePageObject.UserIsLoggedIn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		homePageObject.BalanceIsReturnedToUser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		airtimePageObject.ClickAirtimeHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.AirtimeRechargeScreenIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		airtimePageObject.ClickTheXButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.ClickAirtimeHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.AirtimeRechargeScreenIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		airtimePageObject.ClickAirtimeAmountField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.EnterAmount("100");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.ClickPhoneNumberField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.EnterPhoneNumber("07039426925");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.ClickContinueButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.PinModalIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().refresh();

		airtimePageObject.ClickAirtimeHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.AirtimeRechargeScreenIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		airtimePageObject.ClickAirtimeAmountField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.EnterAmount("100");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.ClickPhoneNumberField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.EnterPhoneNumber("07039426925");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.ClickContinueButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.PinModalIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		airtimePageObject.ClickPinField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.EnterPin("1234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.ClickPinContinueButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.AirtimePurchase();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		airtimePageObject.CloseAirtimePurchaseMessage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.close();
	}

	@Test(priority = 2)
	public void InvalidAirtimeAmount() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		HomePageObject homePageObject= new HomePageObject(driver);
		AirtimePageObject airtimePageObject= new AirtimePageObject(driver);

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

		airtimePageObject.ClickAirtimeHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		airtimePageObject.AirtimeRechargeScreenIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

		airtimePageObject.ClickAirtimeAmountField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		airtimePageObject.EnterAmount("0");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		airtimePageObject.ClickPhoneNumberField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.EnterPhoneNumber("07039426925");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.ClickContinueButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);


		airtimePageObject.ZeroAmount();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		driver.close();

	}

	@Test(priority = 3)
	public void MaximumAirtimeAmount() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		HomePageObject homePageObject= new HomePageObject(driver);
		AirtimePageObject airtimePageObject= new AirtimePageObject(driver);

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

		airtimePageObject.ClickAirtimeHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		airtimePageObject.AirtimeRechargeScreenIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

		airtimePageObject.ClickAirtimeAmountField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		airtimePageObject.EnterAmount("200,000");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		airtimePageObject.ClickPhoneNumberField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.EnterPhoneNumber("07039426925");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.ClickContinueButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.PinModalIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		airtimePageObject.ClickPinField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.EnterPin("1234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		airtimePageObject.ClickPinContinueButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		airtimePageObject.MaximumAmount();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(5000);

		driver.close();
	}


		@Test(priority = 4)
		public void IncorrectPin() throws InterruptedException {

			NavigateToURL startWebsite = new NavigateToURL(driver);

			startWebsite.launchURL();


			HomePageObject homePageObject = new HomePageObject(driver);
			AirtimePageObject airtimePageObject = new AirtimePageObject(driver);

			homePageObject.ClickLoginHeader();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

			homePageObject.ClickEmail();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

			homePageObject.ClearEmail();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

			homePageObject.EnterEmail("jamesohia4+bvn@gmail.com");

			homePageObject.ClickPassword();

			homePageObject.ClearPassword();

			homePageObject.EnterPassword("James1997.");

			homePageObject.ClickLogin();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

			homePageObject.UserIsLoggedIn();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			homePageObject.BalanceIsReturnedToUser();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			airtimePageObject.ClickAirtimeHeader();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

			airtimePageObject.AirtimeRechargeScreenIsDisplayed();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			airtimePageObject.ClickAirtimeAmountField();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

			airtimePageObject.EnterAmount(String.valueOf(100));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

			airtimePageObject.ClickPhoneNumberField();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

			airtimePageObject.EnterPhoneNumber("07039426925");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

			airtimePageObject.ClickContinueButton();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

			airtimePageObject.PinModalIsDisplayed();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


			airtimePageObject.ClickPinField();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

			airtimePageObject.EnterPin("1111");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

			airtimePageObject.ClickPinContinueButton();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(3000);

			airtimePageObject.WrongPin();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}




			@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Test Page Passed");
	}

}






