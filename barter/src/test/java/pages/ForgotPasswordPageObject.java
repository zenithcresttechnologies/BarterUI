package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPageObject {

	private By login = By.xpath("//a[contains(text(),'Login')]");
	private By forgotPasswordPage = By.xpath("//h1[contains(text(),'Forgot Password')]");
	private By emailNumField = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]");
	private By continueBtn = By.xpath("//button[contains(text(),'Continue')]");
	private By retrieveMsg = By.xpath("//div[contains(text(),'Customer details could not be retrieved')]");
	private By otpText = By.xpath("//p[contains(text(),'Please enter the OTP sent to email and phone numbe')]");
	private By otpField = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]");
	private By enterPassword = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]");
	private By resetPassBtn = By.xpath("//button[contains(text(),'Reset Password')]");
	private By invalidOTPMessage = By.xpath("//div[contains(text(),'OTP specified is invalid.')]");
	private By successOTPMessage = By.xpath("//div[contains(text(),'New password was created successfully')]");


	private WebDriver driver;

	public ForgotPasswordPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void Login() {

		try {
			driver.findElement(login).click();

			System.out.println("The Login Label Was Clicked");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ForgotPasswordDisplayed() {

		try {
			driver.findElement(forgotPasswordPage).isDisplayed();

			System.out.println("The Forgot Password Page Displayed");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickEmailNumField() {

		try {
			driver.findElement(emailNumField).click();

			System.out.println("The Email/Phone Number Field Clicked Successfully");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearEmailNumField() {

		try {
			driver.findElement(emailNumField).click();

			System.out.println("The Email/Phone Number Field Cleared Successfully");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterEmailNumField(String text) {

		try {
			driver.findElement(emailNumField).sendKeys(text);

			System.out.println("The Email/Phone Number Was Entered Successfully");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickContinueBtn() {

		try {
			driver.findElement(continueBtn).click();

			System.out.println("The Continue Button Was Clicked");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickLoginLabel() {

		try {
			driver.findElement(login).click();

			System.out.println("The Login Label Was Clicked");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void UnableToRetrieveDetails() {

		try {
			driver.findElement(retrieveMsg).isDisplayed();

			System.out.println("Unable To Retrieve User Details Message Displayed");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void OTPScreenDisplayed() {

		try {
			driver.findElement(otpText).isDisplayed();

			System.out.println("The Enter OTP Screen Is Displayed");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickOTPField() {

		try {
			driver.findElement(otpField).click();

			System.out.println("The OTP Field Clicked Successfully");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearOTPField() {

		try {
			driver.findElement(otpField).click();

			System.out.println("The OTP Field Cleared Successfully");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterOTPField(String text) {

		try {
			driver.findElement(otpField).sendKeys(text);

			System.out.println("The OTP Was Entered Successfully");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickPasswordField() {

		try {
			driver.findElement(enterPassword).click();

			System.out.println("The Password Field Clicked Successfully");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearPasswordField() {

		try {
			driver.findElement(enterPassword).click();

			System.out.println("The Password Field Cleared Successfully");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterPasswordField(String text) {

		try {
			driver.findElement(enterPassword).sendKeys(text);

			System.out.println("The Password Was Entered Successfully");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickResetPasswordBtn() {

		try {
			driver.findElement(resetPassBtn).click();

			System.out.println("The Reset Password Button Was Clicked");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void OTPSuccessDisplayed() {

		try {
			driver.findElement(successOTPMessage).isDisplayed();

			System.out.println("Password Changed Success Message Is Displayed");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

	}

	public void OTPErrorMsgDisplayed() {

		try {
			driver.findElement(invalidOTPMessage).isDisplayed();

			System.out.println("Invalid OTP Message Is Displayed");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

	}

}







