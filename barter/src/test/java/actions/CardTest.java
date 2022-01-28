package actions;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.*;

public class CardTest {
    private static WebDriver driver = null;
    URL baseUrl = new URL();
    int timer;

    @BeforeTest
    public void startUp() throws IOException {
        timer = 3000;

        StartBrowser openConnection = new StartBrowser(driver);

        driver = openConnection.initializeBrowser();
    }



    @Test(priority = 1)
    public void CreateAndFundCard() throws InterruptedException {

        NavigateToURL startWebsite = new NavigateToURL(driver);

        startWebsite.launchURL();


        CardObject cardObject = new CardObject(driver);

        cardObject.ClickLoginHeader();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickEmail();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClearEmail();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.EnterEmail("jamesohia4+bvn@gmail.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickPassword();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClearPassword();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.EnterPassword("James1997.");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickLogin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(5000);

        //Create a Card
        cardObject.ClickCardTab();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickCreateCard();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClearAmount();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


        cardObject.InputAmount("3");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClearAmount();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


        cardObject.InputAmount("5");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickCreateNewCard();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickPin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClearPin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        cardObject.EnterPin("1234");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickContinuePin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickExitPin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(4000);

        //Fund Card
        cardObject.ClickCardTab();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ScrollPage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickFundCard();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClearFundAmount();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


        cardObject.EnterFundAmount("1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickFundContinue();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);



    }

   /* @Test(priority = 2)
    public void FundBarterBalance() throws InterruptedException {
        timer = 3000;
        NavigateToURL startWebsite = new NavigateToURL(driver);

        startWebsite.launchURL();


        CardObject cardObject= new CardObject(driver);

        cardObject.ClickLoginHeader();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickEmail();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClearEmail();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.EnterEmail("jamesohia4+bvn@gmail.com");

        cardObject.ClickPassword();

        cardObject.ClearPassword();

        cardObject.EnterPassword("James1997.");

        cardObject.ClickLogin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(5000);

        //Fund Barter Wallet
        cardObject.ClickHomeTab();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickFundBarterBalance();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClearBarterAmount();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;


        cardObject.InputBarterAmount("10000");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickAmountContinue();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(7000);

        cardObject.ClickCardNumber();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        cardObject.EnterCardNumber("5531886652142950");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickCardCardExpiration();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        cardObject.EnterCardExpiration("09/32");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickCardCVV();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        cardObject.EnterCardCVV("564");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickPayCard();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(6000);

        cardObject.EnterCardPin("3310");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.EnterCardOTP("12345");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.ClickPayCardOTP();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(6000);

        cardObject.WalletISFunded();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);

        cardObject.Logout();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Thread.sleep(timer);





    }*/

    @AfterTest

    public void TearDown() {
        driver.close();
        driver.quit();
        System.out.print("Test Page Passed");
    }

}






