package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObject {

	private By login = By.xpath("//a[contains(text(),'Log In')]");
	private By regLabel = By.xpath("//a[contains(text(),'Register')]");
	private By forgotPassword = By.xpath("//a[contains(text(),'Forgot password?')]");
	private By email = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]");
	private By password = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]");
	private By loginButton = By.xpath("//button[contains(text(),'Log in')]");
	private By errorMessage = By.xpath("//div[contains(text(),'Invalid password entered, please retry. You have ')]");
	private By userLoggedIn = By.xpath("//p[contains(text(), 'Welcome back')]");
	private By balance = By.xpath("//div[contains(text(),'Your Barter Balance')]");
	private By logout = By.xpath("//div[contains(text(),'Log out')]");
	private By transaction = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]");
	private By spending = By.xpath("//div[contains(text(),'Spendings')]");
	private By spendDate = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]");
	private By spendToday = By.xpath("//option[contains(text(),'Today')]");
	private By spendYesterday = By.xpath("//option[contains(text(),'Yesterday')]");
	private By spend7days = By.xpath("//option[contains(text(),'Last 7 days')]");
	private By spendMonth = By.xpath("//option[contains(text(),'This Month')]");
	private By spend30Days = By.xpath("//option[contains(text(),'Last 30 days')]");
	private By spendAllTime = By.xpath("//option[contains(text(),'All Time')]");
	private By spendChart = By.xpath("//canvas[@id='spendingChart']");
	private By spendTotalReceive = By.xpath("//div[contains(text(),'Total money received')]");
	private By spendTotalSpent = By.xpath("//div[contains(text(),'Total money spent')]");
	private By notificationIcon = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/*[1]");




	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
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

	public void ForgotPassword() {

		try{
			driver.findElement(forgotPassword).click();

			System.out.println("Forgot Password Label Linked Was Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickRegister() {

		try{
			driver.findElement(regLabel).click();

			System.out.println("Register Label Is Clicked");

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

	public void ErrorMessageIsDisplayed() {

		try{
			driver.findElement(errorMessage).isDisplayed();

			System.out.println("Error Message Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void UserIsLoggedIn() {

		try{
			driver.findElement(userLoggedIn).isDisplayed();

			System.out.println("User is logged in and can see dashboard");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void BalanceIsReturnedToUser() {

		try{
			driver.findElement(balance).isDisplayed();

			System.out.println("Balance is returned to user");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void TransactionTab () {

		try{
			driver.findElement(transaction).isDisplayed();

			System.out.println("Transaction Tab Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void SpendingTab () {

		try{
			driver.findElement(spending).isDisplayed();

			System.out.println("Spending Tab Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void SpendingChart () {

		try{
			driver.findElement(spendChart).isDisplayed();

			System.out.println("Spending Chart Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickDateFilter () {

		try{
			driver.findElement(spendDate).click();

			System.out.println("Date Filter Is Clicked ");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickDateToday () {

		try{
			driver.findElement(spendToday).click();

			System.out.println("Today Selected From The Date Filter");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickDateYesterday () {

		try{
			driver.findElement(spendYesterday).click();

			System.out.println("Yesterday  Selected From The Date Filter");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickDate7Days () {

		try{
			driver.findElement(spend7days).click();

			System.out.println("7 Days Selected From The Date Filter");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickDateMonth () {

		try{
			driver.findElement(spendMonth).click();

			System.out.println("Month  Selected From The Date Filter");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickDate30Days () {

		try{
			driver.findElement(spend30Days).click();

			System.out.println("30 Days  Selected From The Date Filter");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickDateAllTime () {

		try{
			driver.findElement(spendAllTime).click();

			System.out.println("All Time  Selected From The Date Filter");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void TotalReceive () {

		try{
			driver.findElement(spendTotalReceive).isDisplayed();

			System.out.println("Total Money Received Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void TotalSpent () {

		try{
			driver.findElement(spendTotalSpent).isDisplayed();

			System.out.println("Total Money Spent Is Displayed");

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
	public void ClickNotificationIcon() {

		try{
			driver.findElement(notificationIcon).click();

			System.out.println("Notification Bell Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}



}







