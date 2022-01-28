package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SettingPageTest {
	private static WebDriver driver = null;
	URL baseUrl = new URL();

	private int timer = 5000;

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void SettingsTest() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		HomePageObject homePageObject= new HomePageObject(driver);
		SettingsPageObject settingsPageObject= new SettingsPageObject(driver);


		settingsPageObject.ClickLoginHeader();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

		settingsPageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClearEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.EnterEmail("jamesohia4+bvn@gmail.com");

		settingsPageObject.ClickPassword();

		settingsPageObject.ClearPassword();

		homePageObject.EnterPassword("James1997.");

		homePageObject.ClickLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.HomePageIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickSettings();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ProfileSettingsIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickChangeYourPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		//Change password Valid Current Password

		settingsPageObject.ClickCurrentPassword();

		settingsPageObject.ClearCurrentPassword();

		settingsPageObject.EnterCurrentPassword("James1997.");

		settingsPageObject.ClickNewPassword();

		settingsPageObject.ClearNewPassword();

		settingsPageObject.EnterNewPassword("James1997.");

		settingsPageObject.ClickConfirmPassword();

		settingsPageObject.ClearConfirmPassword();

		settingsPageObject.EnterConfirmPassword("James1997.");

		settingsPageObject.ClickSaveChangesBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.PasswordChangedIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		//Invalid Old password
		settingsPageObject.EnterCurrentPassword("James1997543.");

		settingsPageObject.ClickNewPassword();

		settingsPageObject.ClearNewPassword();

		settingsPageObject.EnterNewPassword("James1997.");

		settingsPageObject.ClickConfirmPassword();

		settingsPageObject.ClearConfirmPassword();

		settingsPageObject.EnterConfirmPassword("James1997.");

		settingsPageObject.ClickSaveChangesBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.InvalidOldPasswordIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		//Change transaction pin "Valid Current Pin"
		settingsPageObject.ClickChangeTransactionPin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickCurrentPin();

		settingsPageObject.ClearCurrentPin();

		settingsPageObject.EnterCurrentPin("1234");

		settingsPageObject.ClickNewPin();

		settingsPageObject.ClearNewPin();

		settingsPageObject.EnterNewPin("1234");

		settingsPageObject.ClickSaveChangesBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.PinChangedIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		// Invalid current pin
		settingsPageObject.ClickCurrentPin();

		settingsPageObject.ClearCurrentPin();

		settingsPageObject.EnterCurrentPin("1222");

		settingsPageObject.ClickNewPin();

		settingsPageObject.ClearNewPin();

		settingsPageObject.EnterNewPin("1234");

		settingsPageObject.ClickSaveChangesBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.InvalidCurrentPinIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		// Invalid Pin less than 4 digits
		settingsPageObject.ClickCurrentPin();

		settingsPageObject.ClearCurrentPin();

		settingsPageObject.EnterCurrentPin("122");

		settingsPageObject.ClickNewPin();

		settingsPageObject.ClearNewPin();

		settingsPageObject.EnterNewPin("1234");

		settingsPageObject.ClickSaveChangesBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.PinLessThanFour();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		//Alphabetic Pin
		settingsPageObject.ClickCurrentPin();

		settingsPageObject.ClearCurrentPin();

		settingsPageObject.EnterCurrentPin("ABCD");

		settingsPageObject.ClickNewPin();

		settingsPageObject.ClearNewPin();

		settingsPageObject.EnterNewPin("1234");

		settingsPageObject.ClickSaveChangesBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.AlphabeticPin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickAccountStatement();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickSelectStatement();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickSelectBarter();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickStartDate();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickSelectStartDate();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickEndDate();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickSelectEndDate();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickSubmitBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.StatementSuccessIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickSelectCard();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickSelectCardField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickCard();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.ClickSubmitBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		settingsPageObject.CardStatementSuccess();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);


		homePageObject.Logout();

	}



		@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Test Page Passed");
	}

}






