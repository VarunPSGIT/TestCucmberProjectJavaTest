package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefination.Hooks;
import stepDefination.stepDefination;

public class LoginPageObject {
	
	WebDriver driver=Hooks.getDriver();

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="userName")
	public WebElement txtUsername;
	
	@FindBy(id="password")
	public WebElement txtPassword;
	
	@FindBy(xpath="//button[@class='btn btn-info']")
	public WebElement btnSubmit;
	

	public void enterUserName(String username) {
		txtUsername.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickSubmit() {
		btnSubmit.click();
	}
	
	public void performLogin(String username,String password) {
		enterUserName(username);
		enterPassword(password);
	}
	
	
}
