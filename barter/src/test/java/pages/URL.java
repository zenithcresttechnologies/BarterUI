package pages;

import org.openqa.selenium.WebDriver;

public class URL {
	private WebDriver driver = null;

	private String BASE_URL = "https://barterv2.herokuapp.com/";

	//Used only when home is UAT
	String HomeUrl() {
		// TODO Auto-generated method stub
		return BASE_URL;
	}

	public void launchURL(){
		//URL baseUrl = new URL();
		driver.get(HomeUrl());
		driver.manage().window().maximize();
	}

}
