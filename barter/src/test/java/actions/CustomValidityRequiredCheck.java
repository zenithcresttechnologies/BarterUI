package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CustomValidityRequiredCheck {
	private static WebDriver driver = null;



	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-extensions");
		WebDriver driver =  new ChromeDriver(options);
		driver.get("http://barterv2.herokuapp.com/signup");
		WebElement nullfieldprompt = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")));
		System.out.println(nullfieldprompt.getAttribute("validationMessage"));

		String expectedPrompt = "Please fill in this field.";
		String actualPrompt = nullfieldprompt.getAttribute("validationMessage");
		Assert.assertEquals(actualPrompt, expectedPrompt, "The Required Prompt Does Not Match The Expected Description");
		driver.quit();
	}
}







