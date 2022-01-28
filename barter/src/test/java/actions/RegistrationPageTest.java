package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.NavigateToURL;
import pages.StartBrowser;
import pages.URL;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.Random;


public class RegistrationPageTest {
	private static WebDriver driver = null;
	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1)
	public void CreateAccountSuccess() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LandingPageObject landingPageObject = new LandingPageObject(driver);
		RegistrationPageObject registrationPageObject = new RegistrationPageObject(driver);

		landingPageObject.ClickCreateAccHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		landingPageObject.CreateAccountDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickFName();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearFName();

		registrationPageObject.EnterFName("Adewale");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickLName();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearLName();

		registrationPageObject.EnterLName("Adetest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearEmail();

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		registrationPageObject.EnterEmail("jptnetworks+"+ randomInt +"@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		registrationPageObject.ClickNumber();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearNumber();

		Random rnd = new Random();
		int number = rnd.nextInt(99999999);
		String numberFormat = String.format("%08d", number);
		registrationPageObject.EnterNumber("080"+ numberFormat);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearPassword();

		registrationPageObject.EnterPassword("Blonde77@1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		registrationPageObject.ClickConfPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearConfPassword();

		registrationPageObject.EnterConfPassword("Blonde77@1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickCountryList();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.SelectNG();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickCreateAccBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ConfirmationDialog();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickOTPField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearOTPField();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.EnterOTPField("123456");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ContinueButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(4000);

		landingPageObject.LoginPageDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(4000);

	}


	@Test(priority = 2)
	public void CreateAccountCountryErrorMessage() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LandingPageObject landingPageObject = new LandingPageObject(driver);
		RegistrationPageObject registrationPageObject = new RegistrationPageObject(driver);

		landingPageObject.ClickCreateAccHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		landingPageObject.CreateAccountDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickFName();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearFName();

		registrationPageObject.EnterFName("Adewale");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickLName();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearLName();

		registrationPageObject.EnterLName("Adetest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearEmail();

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		registrationPageObject.EnterEmail("jptnetworks+"+ randomInt +"@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		registrationPageObject.ClickNumber();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearNumber();

		Random rnd = new Random();
		int number = rnd.nextInt(99999999);
		String numberFormat = String.format("%08d", number);
		registrationPageObject.EnterNumber("080"+ numberFormat);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearPassword();

		registrationPageObject.EnterPassword("Blonde77@1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		registrationPageObject.ClickConfPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearConfPassword();

		registrationPageObject.EnterConfPassword("Blonde77@1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		registrationPageObject.ClickCreateAccBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.CountryErrorMessageIsDisplayed();

	}


	@Test(priority = 3)
	public void CreateAccountEmailAlreadyExist() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LandingPageObject landingPageObject = new LandingPageObject(driver);
		RegistrationPageObject registrationPageObject = new RegistrationPageObject(driver);

		landingPageObject.ClickCreateAccHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		landingPageObject.CreateAccountDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickFName();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearFName();

		registrationPageObject.EnterFName("Adewale");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickLName();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearLName();

		registrationPageObject.EnterLName("Adetest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearEmail();

		registrationPageObject.EnterEmail("jamesohia4+bvn@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		registrationPageObject.ClickNumber();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearNumber();

		Random rnd = new Random();
		int number = rnd.nextInt(99999999);
		String numberFormat = String.format("%08d", number);
		registrationPageObject.EnterNumber("080"+ numberFormat);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearPassword();

		registrationPageObject.EnterPassword("Blonde77@1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		registrationPageObject.ClickConfPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearConfPassword();

		registrationPageObject.EnterConfPassword("Blonde77@1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickCountryList();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.SelectNG();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickCreateAccBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ErrorMessageEmailIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

	}

	@Test(priority = 4)
	public void CreateAccountPhoneNumberExist() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LandingPageObject landingPageObject = new LandingPageObject(driver);
		RegistrationPageObject registrationPageObject = new RegistrationPageObject(driver);

		landingPageObject.ClickCreateAccHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		landingPageObject.CreateAccountDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickFName();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearFName();

		registrationPageObject.EnterFName("Adewale");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickLName();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearLName();

		registrationPageObject.EnterLName("Adetest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearEmail();

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		registrationPageObject.EnterEmail("jptnetworks+"+ randomInt +"@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		registrationPageObject.ClickNumber();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearNumber();


		registrationPageObject.EnterNumber("08021357234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearPassword();

		registrationPageObject.EnterPassword("Blonde77@1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		registrationPageObject.ClickConfPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearConfPassword();

		registrationPageObject.EnterConfPassword("Blonde77@1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickCountryList();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.SelectNG();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickCreateAccBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ErrorMessagePhoneIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

	}


	@Test(priority = 5)
	public void CreateAccountLoginLabel() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LandingPageObject landingPageObject = new LandingPageObject(driver);
		RegistrationPageObject registrationPageObject = new RegistrationPageObject(driver);

		landingPageObject.ClickCreateAccHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		landingPageObject.CreateAccountDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		registrationPageObject.LoginLabel();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		landingPageObject.LoginPageDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);


	}

	@Test(priority = 7)
	public void CreateAccountConfirmationDialog() throws InterruptedException {

		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();


		LandingPageObject landingPageObject = new LandingPageObject(driver);
		RegistrationPageObject registrationPageObject = new RegistrationPageObject(driver);

		landingPageObject.ClickCreateAccHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		landingPageObject.CreateAccountDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickFName();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearFName();

		registrationPageObject.EnterFName("Adewale");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickLName();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearLName();

		registrationPageObject.EnterLName("Adetest");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearEmail();

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(2000);
		registrationPageObject.EnterEmail("jptnetworks+"+ randomInt +"@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		registrationPageObject.ClickNumber();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearNumber();

		Random rnd = new Random();
		int number = rnd.nextInt(99999999);
		String numberFormat = String.format("%08d", number);
		registrationPageObject.EnterNumber("080"+ numberFormat);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearPassword();

		registrationPageObject.EnterPassword("Blonde77@1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);


		registrationPageObject.ClickConfPassword();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClearConfPassword();

		registrationPageObject.EnterConfPassword("Blonde77@1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickCountryList();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.SelectNG();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ClickCreateAccBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.ConfirmationDialog();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(3000);

		registrationPageObject.GetACall();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		registrationPageObject.GetACallSuccessMessage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		registrationPageObject.GetACall();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);

		registrationPageObject.GetACallErrorMessage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(2000);



	}






	@AfterTest

	public void TearDown() {
		driver.close();
		driver.quit();
		System.out.print("Create Account Scenarios Passed");
	}

}






