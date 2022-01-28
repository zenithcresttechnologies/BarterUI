package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AirtimePageObject {

	private By airtimeHeader = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[1]/div[2]/div[2]");
	private By airtimeRecharge = By.xpath("//div[contains(text(),'Airtime Recharge')]");
	private By airtimeXButton= By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/button[1]/*[1]");
	private By airtimeAmountField = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]");
	private By phoneNumberField = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]");
	private By airtimeContinueButton = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]");
	private By pin = By.xpath("//div[contains(text(),'Pin')]");
	private By pinXButton = By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[4]/div[1]/div[1]/div[1]/button[1]/svg[1]/path[1]");
	private By pinField = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]");
	private By pinContinueButton = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]");
	private By incorrectPin = By.xpath("//div[contains(text(),'Transaction pin is not correct, 2 attempt(s) left')]");
	private By airtimePurchase = By.xpath(" //div[contains(text(),'Airtime Purchased successfully')]");
	private By zeroAirtime = By.xpath("//span[contains(text(),'Value cannot be 0')]");
	private By airtimePurchaseXButton = By.xpath("//body/div[3]/div[1]/div[1]/button[1]");
	private By pinModal= By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[4]/div[1]/div[1]/div[2]");
	private By inputPin= By.xpath("//div[@id='pinRequest']");
	private By maximumAirtime = By.xpath("//div[contains(text(), 'You've exceeded the total amount of airtime you can buy today')]");
	private By maximum= By.xpath("//div[contains(text(),\"You've exceeded the total amount of airtime you ca\")]");





	private static WebDriver driver;

	public AirtimePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void ClickAirtimeHeader() {

		try{
			driver.findElement(airtimeHeader).click();

			System.out.println("Airtime Header Button Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	public  void AirtimeRechargeScreenIsDisplayed() {

		try{
			driver.findElement(airtimeRecharge).click();

			System.out.println("Airtime Recharge Screen Displayed");

		}
		catch(Exception e) 
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	public  void ClickTheXButton() {

		try{
			driver.findElement(airtimeXButton).click();

			System.out.println("Airtime Recharge Screen was closed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	public void ClickAirtimeAmountField() {

		try{
			driver.findElement(airtimeAmountField).clear();

			System.out.println("Airtime Amount Field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public  void EnterAmount(String text) {

		try{
			driver.findElement(airtimeAmountField).sendKeys(text);

			System.out.println("Amount was entered into the Airtime Amount field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	public  void ZeroAmount() {

		try{
			driver.findElement(zeroAirtime).isDisplayed();

			System.out.println("Invalid Amount Entered in Amount Field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void MaximumAmount() {

		try{
			driver.findElement(maximum).isDisplayed();;

			System.out.println("You've exceeded the total amount of airtime purchase");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	public void ClickPhoneNumberField() {

		try{
			driver.findElement(phoneNumberField).click();

			System.out.println("Phone Number field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public  void EnterPhoneNumber(String text) {

		try{
			driver.findElement(phoneNumberField).sendKeys(text);

			System.out.println("Phone Number entered into Phone Number field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public  void ClickContinueButton() {

	try{
		driver.findElement(airtimeContinueButton).click();

		System.out.println("Continue Button was Clicked");

	}
		catch(Exception e)
	{
		throw new RuntimeException(e.getMessage());
	}
}


	public  void PinModalIsDisplayed() {

		try{
			driver.findElement(pinModal).isDisplayed();

			System.out.println("Pin Modal Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public  void ClosePinModal() {

		try{
			driver.findElement(pinXButton).click();

			System.out.println("Pin Modal was closed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	public  void ClickPinField() {

		try{
			driver.findElement(pinField).click();

			System.out.println("Pin Field was clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public  void EnterPin(String text) {

		try{
			driver.findElement(pinField).sendKeys(text);

			System.out.println("Pin entered in Pin Field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	public  void WrongPin() {

		try{
			driver.findElement(incorrectPin).isDisplayed();

			System.out.println("Incorrect Pin entered in Pin Field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public  void ClickPinContinueButton() {

		try{
			driver.findElement(pinContinueButton).click();

			System.out.println("Continue Button was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public  void AirtimePurchase() {

		try{
			driver.findElement(airtimePurchase).isDisplayed();

			System.out.println("Airtime Purchase Successful");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public  void CloseAirtimePurchaseMessage() {

		try{
			driver.findElement(airtimePurchaseXButton).click();

			System.out.println("Airtime Purchase Successful Message was closed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
}







