package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageObject {

	private By login = By.xpath("//a[contains(text(),'Log In')]");
	private By icon = By.xpath("//h1[contains(text(),'Be truly borderless')]");
	private By fSlider = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[@id='landing']/div[2]/div[2]/div[1]/main[1]/div[1]/div[2]/button[1]");
	private By sSlider = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[@id='landing']/div[2]/div[2]/div[1]/main[1]/div[1]/div[2]/button[2]");
	private By gPlay = By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[@id='landing']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/a[1]/*[1]");
	private By appStore =  By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[@id='landing']/div[2]/div[2]/div[1]/main[1]/div[1]/div[1]/a[2]/*[1]");
	private By stdAmb = By.xpath("//a[contains(text(),'Student Ambassador')]");
	private By support = By.xpath("//a[contains(text(),'Support')]");
	private By createAcc = By.xpath("//a[contains(text(),'Create account')]");
	private By stdAmbPageTxt = By.xpath("//h1[contains(text(),'Earn up to $1500 as a Barter ambassador.')]");
	private By supportPageTxt = By.xpath("//h1[contains(text(),'Everything Barter')]");
	private By loginPageTxt = By.xpath("//h1[contains(text(),'Login to your barter account')]");
	private By createAccPage = By.xpath("//h1[contains(text(),'Create your barter account')]");
	private By gPlayPage = By.xpath("//span[contains(text(),'Barter by Flutterwave')]");
	private By appStorePage = By.xpath("//header/h1[1]");






	private WebDriver driver;

	public LandingPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void ClickStdAmbHeader() {

		try{
			driver.findElement(stdAmb).click();

			System.out.println("Student Ambassador Header Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	public void ClickSupportHeader() {

		try{
			driver.findElement(support).click();

			System.out.println("Support Header Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}


	public void ClickCreateAccHeader() {

		try{
			driver.findElement(createAcc).click();

			System.out.println("Create Account Header  Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
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

	public void ClickGPlayBtn() {

		try{
			driver.findElement(gPlay).click();

			System.out.println("Header Login Button Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickAppStoreBtn() {

		try{
			driver.findElement(appStore).click();

			System.out.println("Header Login Button Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickFirstSliderBtn() {

		try{
			driver.findElement(fSlider).click();

			System.out.println("Header Login Button Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void ClickSecondSliderBtn() {

		try{
			driver.findElement(sSlider).click();

			System.out.println("Header Login Button Clicked");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void IconDisplayed() {

		try{
			driver.findElement(icon).isDisplayed();

			System.out.println("The Barter Icon Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void StudentAmbDisplayed() {

		try{
			driver.findElement(stdAmbPageTxt).isDisplayed();

			System.out.println("The Student Ambassador Page Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void SupportDisplayed() {

		try{
			driver.findElement(supportPageTxt).isDisplayed();

			System.out.println("The Support Page  Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void LoginPageDisplayed() {

		try{
			driver.findElement(loginPageTxt).isDisplayed();

			System.out.println("The Login Page  Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void CreateAccountDisplayed() {

		try{
			driver.findElement(createAccPage).isDisplayed();

			System.out.println("The Create Account Page  Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	public void GooglePlayDisplayed() {

		try{
			driver.findElement(gPlayPage).isDisplayed();

			System.out.println("The Google Play Page  Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public void AppStoreDisplayed() {

		try{
			driver.findElement(appStorePage).isDisplayed();

			System.out.println("The App Store Page  Is Displayed");

		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

}







