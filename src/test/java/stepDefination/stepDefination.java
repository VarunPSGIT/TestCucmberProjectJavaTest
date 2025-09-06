package stepDefination;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import stepDefination.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPageObject;

public class stepDefination {
	
	WebDriver driver=Hooks.getDriver();
	LoginPageObject actions= new LoginPageObject(driver);
	
	@When("I Enter Username {string} and Password {string}")
	public void i_enter_username_and_password(String username,String password) {
		actions.performLogin(username, password);
	}
	
	
	@When("I click on Login Button")
	public void i_click_on_login_button() {
		actions.clickSubmit();
	}
	
	@Then("I verify Login is successfull")
	public void i_verify_login_is_successfull() {
		org.junit.Assert.assertEquals(driver.getTitle(), "Student-details");
	}
	
	@Then("I verify Error Message {string} on Screen")
	public void i_verify_ErrorMessage(String errorMessage) {
		org.junit.Assert.assertEquals(driver.findElement(By.id("errorMessage")).getText(), errorMessage);
	}
	
	@And("I kill my browser")
	public void KillBrowser() {
		driver.quit();
	}
	
	@Given("i do the data base setup for execution")
	public void setup(){
		System.out.println("Database setup comepleted!!");
	}
	
	@Given("i do the rollback database setup")
	public void rollback(){
		System.out.println("Rollback Database setup comepleted!!");
	}
	
	
	
	@Given("I Enter the details for the Data1 {string} Data2 {string}")
	public void TestData1_Data2(String data1,String data2){
		System.out.println(data1 + " "+data2);
	}
	
	

}
