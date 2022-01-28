package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegistrationPageObject {
	private By fName = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	private By lName = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/input[1]");
	private By email = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
	private By number = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/input[1]");
	private By password = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]");
	private By confirmPassword = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[2]/div[1]/input[1]");
	private By country = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/select[1]");
	private By referral = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[2]/div[1]/input[1]");
	private By nigeria = By.xpath("//option[contains(text(),'Nigeria')]");
	private By errorCountry = By.xpath("//span[contains(text(),'Field cannot be empty')]");
	private By createAccButton = By.xpath("//button[contains(text(),'Create Your Barter Account')]");
	private By loginLabel = By.xpath("//a[contains(text(),'Login')]");
	private By errorMessageField = By.xpath("//a[contains(text(),'Please fill')]");
	private By errorMessageEmail = By.xpath("//div[contains(text(),'The email address already exist.')]");
	private By errorMessagePhone = By.xpath("//div[contains(text(),'The mobile number already exist.')]");
	private By confirmationDialog = By.xpath("//div[contains(text(),'Confirmation')]");
	private By confirmationOTP = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]");
	private By getACall = By.xpath("//span[contains(text(),'Get a phone call')]");
	private By getACallMessage = By.xpath("//div[contains(text(),'Please hold, A call is being')]");
	private By getACallError = By.xpath("//div[contains(text(),'Please wait for')]");
	private By confContinueBtn = By.xpath("//button[contains(text(),'Continue')]");





	private WebDriver driver;

	public RegistrationPageObject(WebDriver driver) {
		this.driver = driver;
	}


	public void ClickFName() {

		try{
			driver.findElement(fName).click();

			System.out.println("First Name Input field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearFName() {

		try{
			driver.findElement(fName).clear();

			System.out.println("First Name Input field was Cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterFName(String text) {

		try{
			driver.findElement(fName).sendKeys(text);

			System.out.println("First Name was entered into the text field");

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
	public void ClickLName() {

		try{
			driver.findElement(lName).click();

			System.out.println("First Name Input field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearLName() {

		try{
			driver.findElement(lName).clear();

			System.out.println("First Name Input field was Cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterLName(String text) {

		try{
			driver.findElement(lName).sendKeys(text);

			System.out.println("First Name was entered into the text field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickNumber() {

		try{
			driver.findElement(number).click();

			System.out.println("Phone Number Input field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearNumber() {

		try{
			driver.findElement(number).clear();

			System.out.println("Phone Number Input field was Cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterNumber(String text) {

		try{
			driver.findElement(number).sendKeys(text);

			System.out.println("Phone Number was entered into the text field");

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

	public void ClickConfPassword() {

		try{
			driver.findElement(confirmPassword).click();

			System.out.println("Confirm Password Input field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearConfPassword() {

		try{
			driver.findElement(confirmPassword).clear();

			System.out.println("Confirm Password Input field was Cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterConfPassword(String text) {

		try{
			driver.findElement(confirmPassword).sendKeys(text);

			System.out.println("Confirm Password was entered into the text field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickReferral() {

		try{
			driver.findElement(referral).click();

			System.out.println("Referral Input field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearReferral() {

		try{
			driver.findElement(referral).clear();

			System.out.println("Referral Input field was Cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterReferral(String text) {

		try{
			driver.findElement(referral).sendKeys(text);

			System.out.println("Referral Code was entered into the text field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickCreateAccBtn() {

		try{
			driver.findElement(createAccButton).click();

			System.out.println("Create Account Button was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ErrorMessageEmailIsDisplayed() {

		try{
			driver.findElement(errorMessageEmail).isDisplayed();

			System.out.println("Email Already Exist Message Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ErrorMessagePhoneIsDisplayed() {

		try{
			driver.findElement(errorMessagePhone).isDisplayed();

			System.out.println("Phone Number Already Exist Message Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ErrorMessageFieldIsDisplayed() {

		try{
			driver.findElement(errorMessageField).isDisplayed();

			System.out.println("Error Message Is Displayed For Field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void CountryErrorMessageIsDisplayed() {

		try{
			driver.findElement(errorCountry).isDisplayed();

			System.out.println("Error Message Is Displayed For Country Not Selected");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickCountryList() {

		try{
			driver.findElement(country).click();

			System.out.println("Country Option List Is Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void SelectNG() {

		try{
			driver.findElement(nigeria).click();

			System.out.println("Nigeria Is Selected From The List Of Country");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void LoginLabel() {

		try {
			driver.findElement(loginLabel).click();

			System.out.println("Login Label Is Clicked");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ConfirmationDialog() {

			try{
				driver.findElement(confirmationDialog).isDisplayed();

				System.out.println("The OTP Confirmation Dialog Is Displayed");

			}
			catch(Exception e)
			{
				throw new RuntimeException(e.getMessage());
			}
		}


	public void ClickOTPField() {

		try{
			driver.findElement(confirmationOTP).click();

			System.out.println("Confirmation OTP Input field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearOTPField() {

		try{
			driver.findElement(confirmationOTP).clear();

			System.out.println("Confirmation OTP Input field was Cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterOTPField(String text) {

		try{
			driver.findElement(confirmationOTP).sendKeys(text);

			System.out.println("Confirmation OTP  was entered into the text field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void GetACall() {

		try{
			driver.findElement(getACall).click();

			System.out.println("Get A Call Label Is Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void GetACallSuccessMessage() {

		try{
			driver.findElement(getACallMessage).isDisplayed();

			System.out.println("Get A Call Success Message Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void GetACallErrorMessage() {

		try{
			driver.findElement(getACallError).isDisplayed();

			System.out.println("Get A Call Error Message Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ContinueButton() {

		try{
			driver.findElement(confContinueBtn).click();

			System.out.println("The Confirmation Dialog Continue Button Is Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}




}







