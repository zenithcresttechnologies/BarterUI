package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class CardObject {

    private By login = By.xpath("//a[contains(text(),'Log In')]");
    private By email = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]");
    private By password = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]");
    private By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    private By logout = By.xpath("//div[contains(text(),'Log out')]");

    //Fund Barter Balance
    private By clickHomeTab = By.xpath("//div[contains(text(),'Home')]");
    private By clickFundBarterBalance = By.xpath("//button[contains(text(),'Fund Barter balance')]");
    private By enterBarterAmount = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]");
    private By clickAmountContinue = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]");
    private By clickCardNumber = By.id("card-number");
    private By clickCardExpiration = By.id("expiration");
    private By clickCardCVV = By.id("cvv");
    private By payCard = By.id("paycard-btn");
    private By enterCardPin = By.id("card-pin-state");
    private By enterOTP = By.id("card_otp");
    private By payCardOtp = By.id("paycardotp-btn");
    private By walletIsFunded = By.xpath("//div[contains(text(),'Barter Balance Funded Successfully')]");

    //Create Card
    private By cardTab = By.xpath("//div[contains(text(),'Cards')]");
    private By createCard = By.xpath("//a[contains(text(),'Create new card')]");
    private By inputAmount = By.xpath("//input[@type = \"tel\"]");
    private By createNewCard = By.xpath("//button[contains(text(),'Create new card')]");
    private By enterPin = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]");
    private By continuePin = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]");
    private By exitPin = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/button[1]");

    //Fund Card
    private By clickFundCard = By.xpath("//button[contains(text(),'Fund this card')]");
    private By inputFund = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]");
    private By clickFundContinue = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]");
    private By clickExitCard = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/button[1]");



    private WebDriver driver;

    public CardObject(WebDriver driver) {
        this.driver = driver;
    }

    public void ScrollPage(){
        //JavascriptExecutor ObjectName = (JavascriptExecutor) webdriver;
        JavascriptExecutor js = (JavascriptExecutor) driver;//Launches the javascriptexecutor
        js.executeScript("window.scrollBy(0, 100)");
    }

    public void ClickLoginHeader() {

        try{
            driver.findElement(login).click();

            System.out.println("Header Login Button Clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }
    public void ClickEmail() {

        try{
            driver.findElement(email).click();

            System.out.println("Email Input field was Clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClearEmail() {

        try{
            driver.findElement(email).clear();

            System.out.println("Email Input field was Cleared");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void EnterEmail(String text) {

        try{
            driver.findElement(email).sendKeys(text);

            System.out.println("Email was entered into the text field");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickPassword() {

        try{
            driver.findElement(password).click();

            System.out.println("password Input field was Clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClearPassword() {

        try{
            driver.findElement(password).clear();

            System.out.println("Password Input field was Cleared");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void EnterPassword(String text) {

        try{
            driver.findElement(password).sendKeys(text);

            System.out.println("Password was entered into the text field");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickLogin() {

        try{
            driver.findElement(loginButton).click();

            System.out.println("Login Button was Clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }





    public void Logout() {

        try{
            driver.findElement(logout).click();

            System.out.println("Logout button was clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }


    //Create Card
    public void ClickCardTab() {

        try{
            driver.findElement(cardTab).click();

            System.out.println("Card Tab button was clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickCreateCard() {

        try{
            driver.findElement(createCard).click();

            System.out.println("Create Card button was clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClearAmount() {

        try{
            driver.findElement(inputAmount).clear();

            System.out.println("Amount Input field was Cleared");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void InputAmount(String text) {

        try{
            driver.findElement(inputAmount).sendKeys(text);

            System.out.println("Amount was entered into the text field");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickCreateNewCard() {

        try{
            driver.findElement(createNewCard).click();

            System.out.println("Create New Card button was clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickPin() {

        try{
            driver.findElement(enterPin).click();

            System.out.println("Pin was clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClearPin() {

        try{
            driver.findElement(enterPin).clear();

            System.out.println("Pin field was Cleared");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void EnterPin(String text) {

        try{
            driver.findElement(enterPin).sendKeys(text);

            System.out.println("Pin was entered into the text field");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickContinuePin() {

        try{
            driver.findElement(continuePin).click();

            System.out.println("Continue Pin Button was Clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickExitPin() {

        try{
            driver.findElement(exitPin).click();

            System.out.println("Exit Pin Button was Clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    //Fund Card
    public void ClickFundCard() {

        try{
            driver.findElement(clickFundCard).click();

            System.out.println("Fund Card Button was Clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClearFundAmount() {

        try{
            driver.findElement(inputFund).clear();

            System.out.println("Fund field was Cleared");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void EnterFundAmount(String text) {

        try{
            driver.findElement(inputFund).sendKeys(text);

            System.out.println("Pin was entered into the text field");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickFundContinue() {

        try{
            driver.findElement(clickFundContinue).click();

            System.out.println("Fund Continue Button was Clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickExitFund() {

        try{
            driver.findElement(clickExitCard).click();

            System.out.println("Exit Fund Button was Clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    //Fund Barter Wallet
    public void ClickHomeTab() {

        try{
            driver.findElement(clickHomeTab).click();

            System.out.println("Home Tab button was clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickFundBarterBalance() {

        try{
            driver.findElement(clickFundBarterBalance).click();

            System.out.println("Fund Barter Balance button was clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClearBarterAmount() {

        try{
            driver.findElement(enterBarterAmount).clear();

            System.out.println("Barter Amount field was Cleared");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void InputBarterAmount(String text) {

        try{
            driver.findElement(enterBarterAmount).sendKeys(text);

            System.out.println("Barter Amount was entered into the text field");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickAmountContinue() {

        try{
            driver.findElement(clickAmountContinue).click();

            System.out.println("Amount Continue button was clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickCardNumber() {

        try{
            driver.findElement(clickCardNumber).click();

            System.out.println("Card Number was clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void EnterCardNumber(String text) {

        try{
            driver.findElement(clickCardNumber).sendKeys(text);

            System.out.println("Card Number was entered");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickCardCardExpiration() {

        try{
            driver.findElement(clickCardExpiration).click();

            System.out.println("Card Expiration date was clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void EnterCardExpiration(String text) {

        try{
            driver.findElement(clickCardExpiration).sendKeys(text);

            System.out.println("Card Expiration Date was entered");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickCardCVV() {

        try{
            driver.findElement(clickCardCVV).click();

            System.out.println("Card CVV was clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void EnterCardCVV(String text) {

        try{
            driver.findElement(clickCardExpiration).sendKeys(text);

            System.out.println("Card CVV was entered");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickPayCard() {

        try{
            driver.findElement(payCard).click();

            System.out.println("Pay Card was clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void EnterCardPin(String text) {

        try{
            driver.findElement(enterCardPin).sendKeys(text);

            System.out.println("Card Pin was entered");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void EnterCardOTP(String text) {

        try{
            driver.findElement(enterOTP).sendKeys(text);

            System.out.println("Card Pin was entered");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void ClickPayCardOTP() {

        try{
            driver.findElement(payCardOtp).click();

            System.out.println("Authorize payment was clicked");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void WalletISFunded() {

        try{
            driver.findElement(walletIsFunded).isDisplayed();

            System.out.println("Barter Balance Funded Successfully");

        }
        catch(Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }
}







