package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class TransactionPageObject {

    //Add Beneficiary Test

    private By transactionmodal = By.xpath("//a[@href = \"/dashboard/transactions\"]");
    private By transactiontimeperiod = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]");
    private By alltransactionstab = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]");
    private By fromdate = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]");
    private By todate = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]");
    private By displaytransactions = By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]");
    private By firstjanuary2022 = By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]");
    private By fourthjanuary2022 = By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[3]");
    private By firstdecember2021 = By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]");
    private By errormessage = By.xpath("//div[contains(text(),'You have no transactions')]");
    private By alltransactionstext = By.xpath("//div[contains(text(),'All Transactions')]");
    private By timeperiodtext = By.xpath("//div[contains(text(),'Time Period')]");


    private WebDriver driver;

    public TransactionPageObject(WebDriver driver) {
        this.driver = driver;
    }


    public void Clicktransactionmodal() {
        try {
            driver.findElement(transactionmodal).click();
            System.out.println("Transaction menu modal was clicked");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ScrollDownPage(){
        //JavascriptExecutor ObjectName = (JavascriptExecutor) webdriver;
        JavascriptExecutor js = (JavascriptExecutor) driver;//Launches the javascriptexecutor
        js.executeScript("window.scrollBy(0, +1000)");
    }
    

    public void ClickAllTransactionsText() {
        try {
            driver.findElement(alltransactionstext).click();
            System.out.println("All Transactions text is displayed");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    public void ClickTimePeriodText() {
        try {
            driver.findElement(timeperiodtext).click();
            System.out.println("Transaction time period text is displayed");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void Clickfromdate() {
        try {
            driver.findElement(fromdate).click();
            System.out.println("From date was selected");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void Clickfirstjanuary2022() {
        try {
            driver.findElement(firstjanuary2022).click();
            System.out.println("From date was selected");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void Clicktodate() {
        try {
            driver.findElement(todate).click();
            System.out.println("To date was selected");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    public void Clickfourthjanuary2022() {
        try {
            driver.findElement(fourthjanuary2022).click();
            System.out.println("To date was selected");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }



    public void Clickfirstdecember2021() {
        try {
            driver.findElement(firstdecember2021).click();
            System.out.println("To date was selected");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void TransactionsIsDisplayed() {
        try{
            driver.findElement(displaytransactions).isDisplayed();
            System.out.println("Transactions was displayed to user");
        }
        catch (Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }


    public void ErrorMessageIsDisplayed() {
        try{
            driver.findElement(errormessage).isDisplayed();
            System.out.println("You have no transactions was displayed to user");
        }
        catch (Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

}