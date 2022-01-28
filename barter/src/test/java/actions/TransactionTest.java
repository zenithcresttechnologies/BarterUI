package actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;


import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class TransactionTest {
	private static WebDriver driver = null;
	private int timer = 3000;

	URL baseUrl = new URL();

	@BeforeTest
	public void startUp() throws IOException {

		StartBrowser openConnection = new StartBrowser(driver);

		driver = openConnection.initializeBrowser();
	}

	@Test(priority = 1) //all transactions text and time period text test


	public void TestAllTransactions() throws InterruptedException {
		timer = 3000;
		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();

		HomePageObject homePageObject= new HomePageObject(driver);
		TransactionPageObject transactionPageObject= new TransactionPageObject(driver);


		homePageObject.ClickLoginHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(timer);

		homePageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		homePageObject.ClearEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		homePageObject.EnterEmail("jamesohia4+bvn@gmail.com");

		homePageObject.ClickPassword();

		homePageObject.ClearPassword();

		homePageObject.EnterPassword("James1997.");

		homePageObject.ClickLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(5000);

		transactionPageObject.Clicktransactionmodal();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.ClickTimePeriodText();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.ClickAllTransactionsText();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		homePageObject.Logout();
		driver.close();
	}

	@Test(priority = 2) //valid date transactions test

	public void TestValidDateTransactions() throws InterruptedException {
		timer = 3000;
		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();

		HomePageObject homePageObject= new HomePageObject(driver);
		TransactionPageObject transactionPageObject= new TransactionPageObject(driver);


		homePageObject.ClickLoginHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(timer);

		homePageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		homePageObject.ClearEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		homePageObject.EnterEmail("jamesohia4+bvn@gmail.com");

		homePageObject.ClickPassword();

		homePageObject.ClearPassword();

		homePageObject.EnterPassword("James1997.");

		homePageObject.ClickLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		homePageObject.UserIsLoggedIn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.Clicktransactionmodal();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.Clickfromdate();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.Clickfirstjanuary2022();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.Clicktodate();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.Clickfourthjanuary2022();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.TransactionsIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);




		//Signout
		homePageObject.Logout();
		driver.close();
	}


	@Test(priority = 3) //Invalid date transactions test


	public void TestInvalidDateTransactions() throws InterruptedException {
		timer = 3000;
		NavigateToURL startWebsite = new NavigateToURL(driver);

		startWebsite.launchURL();

		HomePageObject homePageObject= new HomePageObject(driver);
		TransactionPageObject transactionPageObject= new TransactionPageObject(driver);


		homePageObject.ClickLoginHeader();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(timer);

		homePageObject.ClickEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		homePageObject.ClearEmail();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		homePageObject.EnterEmail("jamesohia4+bvn@gmail.com");

		homePageObject.ClickPassword();

		homePageObject.ClearPassword();

		homePageObject.EnterPassword("James1997.");

		homePageObject.ClickLogin();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		homePageObject.UserIsLoggedIn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.Clicktransactionmodal();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.Clickfromdate();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.Clickfirstjanuary2022();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.Clicktodate();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.Clickfirstdecember2021();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);

		transactionPageObject.ErrorMessageIsDisplayed();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);


		transactionPageObject.ScrollDownPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		Thread.sleep(timer);


		//Signout
		homePageObject.Logout();

	}





	@AfterTest

		public void TearDown() {
			driver.close();
			driver.quit();
			System.out.print("Test Page Passed");
		}

	}





