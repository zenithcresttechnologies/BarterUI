package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingsPageObject {


	private By login = By.xpath("//a[contains(text(),'Log In')]");
	private By email = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]");
	private By password = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]");
	private By loginButton = By.xpath("//button[contains(text(),'Log in')]");
	private By homePage = By.xpath("//span[contains(text(),'james ohia')]");
	private By settings = By.xpath("//div[contains(text(),'Settings')]");
	private By profileSettings = By.xpath("//div[contains(text(),'Profile Settings')]");
	private By changePassword = By.xpath("//a[contains(text(),'Change your password')]");
	private By currentPassword = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[1]/input[1]");
	private By newPassword = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[2]/input[1]");
	private By confirmPassword = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[3]/input[1]");
	private By saveChangedBtn = By.xpath("//button[contains(text(),'Save Changes')]");
	private By passwordChanged = By.xpath("//div[contains(text(),'Password Changed Successfully')]");
	private By invalidOldPassword = By.xpath("//span[contains(text(),'Invalid old password entered. Please check and try')]");
	private By changeTransactionPin = By.xpath("//a[contains(text(),'Change your transaction pin')]");
	private By currentPin = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[1]/input[1]");
	private By newPin = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[2]/input[1]");
	private By pinChanged = By.xpath("//div[contains(text(),'Pin Changed Successfully')]");
	private By invalidCurrentPin = By.xpath("//span[contains(text(),'Transaction pin is not correct')]");
	private By pinLessThanFour = By.xpath("//span[contains(text(),'Transaction pin MUSt be exactly 4 digit long')]");
	private By alphabeticPin = By.xpath("//span[contains(text(),'Only digits are allowed as pin')]");
	private By accountStatement = By.xpath("//a[contains(text(),'Account Statement')]");
	private By selectStatement = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[1]/div[1]/select[1]");
	private By selectBarter = By.xpath("//option[contains(text(),'Barter')]");
	private By selectCard = By.xpath("//option[contains(text(),'Card')]");
	private By startDate = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
	private By selectStartDate = By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]");
	private By endDate = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[2]/div[2]/div[1]/div[1]/input[1]");
	private By selectEndDate = By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]");
	private By submitBtn = By.xpath("//button[contains(text(),'Submit')]");
	private By statementSuccess = By.xpath("//div[contains(text(),'Statement has been successfully sent to your email')]");
	private By selectCardField = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/select[1]");
	private By card = By.xpath("//option[contains(text(),'1354')]");
	private By cardStatementSuccess = By.xpath("//div[contains(text(),'Card Statement has been successfully sent to your email')]");

	private By logout = By.xpath("//div[contains(text(),'Log out')]");




	private WebDriver driver;

	public SettingsPageObject(WebDriver driver) {
		this.driver = driver;
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



	public void HomePageIsDisplayed() {

		try{
			driver.findElement(homePage).isDisplayed();

			System.out.println("The Home page is displayed to user");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public void ClickSettings() {

		try{
			driver.findElement(settings).click();

			System.out.println("Settings was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ProfileSettingsIsDisplayed() {

		try{
			driver.findElement(profileSettings).isDisplayed();

			System.out.println("Profile Settings Screen is displayed to user");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickChangeYourPassword() {

		try{
			driver.findElement(changePassword).click();

			System.out.println("Change your Password button was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickCurrentPassword() {

		try{
			driver.findElement(currentPassword).click();

			System.out.println("Current Password field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearCurrentPassword() {

		try{
			driver.findElement(currentPassword).clear();

			System.out.println("Current Password field was Cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterCurrentPassword(String text) {

		try{
			driver.findElement(currentPassword).sendKeys(text);

			System.out.println("Password was entered into the text field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickNewPassword() {

		try{
			driver.findElement(newPassword).click();

			System.out.println("New Password field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearNewPassword() {

		try{
			driver.findElement(newPassword).clear();

			System.out.println("New Password field was Cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterNewPassword(String text) {

		try{
			driver.findElement(newPassword).sendKeys(text);

			System.out.println("Password was entered into the text field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickConfirmPassword() {

		try{
			driver.findElement(confirmPassword).click();

			System.out.println("Confirm Password field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearConfirmPassword() {

		try{
			driver.findElement(confirmPassword).clear();

			System.out.println("Confirm Password field was Cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterConfirmPassword(String text) {

		try{
			driver.findElement(confirmPassword).sendKeys(text);

			System.out.println("Password was entered into the text field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSaveChangesBtn() {

		try{
			driver.findElement(saveChangedBtn).click();

			System.out.println("Save Changes button was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void PasswordChangedIsDisplayed() {

		try{
			driver.findElement(passwordChanged).isDisplayed();

			System.out.println("Password Changed Successfully is displayed to user");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void InvalidOldPasswordIsDisplayed() {

		try{
			driver.findElement(invalidOldPassword).isDisplayed();

			System.out.println("Invalid old password entered. Please check and try is displayed to user");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickChangeTransactionPin() {

		try{
			driver.findElement(changeTransactionPin).click();

			System.out.println("Change Transaction Pin button was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickCurrentPin() {

		try{
			driver.findElement(currentPin).click();

			System.out.println("Current Pin field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearCurrentPin() {

		try{
			driver.findElement(currentPin).clear();

			System.out.println("Current Pin field was Cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterCurrentPin(String text) {

		try {
			driver.findElement(currentPin).sendKeys(text);

			System.out.println("Current Pin was entered into the  field");

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickNewPin() {

		try{
			driver.findElement(newPin).click();

			System.out.println("New Pin field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClearNewPin() {

		try{
			driver.findElement(newPin).clear();

			System.out.println("New Pin field was Cleared");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void EnterNewPin(String text) {

		try{
			driver.findElement(newPin).sendKeys(text);

			System.out.println("New Pin was entered into the field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void PinChangedIsDisplayed() {

		try{
			driver.findElement(pinChanged).isDisplayed();

			System.out.println("Pin Changed Successfully is displayed to user");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void InvalidCurrentPinIsDisplayed() {
        try{
			driver.findElement(invalidCurrentPin).isDisplayed();
            System.out.println("Transaction pin is not correct is displayed to user");
		}
        catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void PinLessThanFour() {
		try{
			driver.findElement(pinLessThanFour).isDisplayed();
			System.out.println("Transaction pin MUSt be exactly 4 digit long is displayed to user");
		}
		catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void AlphabeticPin() {
		try{
			driver.findElement(alphabeticPin).isDisplayed();
			System.out.println("Only digits are allowed as pin is displayed to user");
		}
		catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickAccountStatement() {

		try{
			driver.findElement(accountStatement).click();

			System.out.println("Account Statement button was clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSelectStatement() {

		try{
			driver.findElement(selectStatement).click();

			System.out.println("Select Statement button was clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSelectBarter() {

		try{
			driver.findElement(selectBarter).click();

			System.out.println("Barter option was selected");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickStartDate() {

		try{
			driver.findElement(startDate).click();

			System.out.println("Start Date field was clicked was selected");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSelectStartDate() {

		try{
			driver.findElement(selectStartDate).click();

			System.out.println("Start date was selected");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickEndDate() {

		try{
			driver.findElement(endDate).click();

			System.out.println("End Date field was clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSelectEndDate() {

		try{
			driver.findElement(selectEndDate).click();

			System.out.println("End Date was selected");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSubmitBtn() {

		try{
			driver.findElement(submitBtn).click();

			System.out.println("Submit button was clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void StatementSuccessIsDisplayed() {

		try{
			driver.findElement(statementSuccess).isDisplayed();

			System.out.println("Statement has been successfully sent to your email is displayed to user");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSelectCard() {

		try{
			driver.findElement(selectCard).click();

			System.out.println("Card option was selected");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSelectCardField() {

		try{
			driver.findElement(selectCardField).click();

			System.out.println("Select Card drop down field was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickCard() {

		try{
			driver.findElement(card).click();

			System.out.println("Card was selected from the Select Card dropdown field");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void CardStatementSuccess() {

		try{
			driver.findElement(cardStatementSuccess).isDisplayed();

			System.out.println("Card Statement has been successfully sent to your email");

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


}







