package com.qa.cucumber_selenium.setdefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.cucumber_selenium.SeleniumHooks;
import com.qa.cucumber_selenium.acceptanceTesting.demoPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoLoginStepDefs {

	private WebDriver driver;
	private demoPage page;

	public DemoLoginStepDefs(SeleniumHooks hooks) {
		this.driver = hooks.getDriver();
		page = PageFactory.initElements(this.driver, demoPage.class);
	}

	@Given("I navigate to {string}")
	public void iNavigateTo(String url) {
		this.driver.get(url);
	}

	@When("I provide username {string} and password {string} to register")
	public void iProvideUsernameAndPassword(String user, String pass) {
		page.addUser(user, pass);
	}

	@When("I login with username {string} and password {string}")
	public void iLoginWithUsernameAndPassword(String username, String password) {
		page.login(username, password);
	}
	
	@Then("the alert should be {string}")
	public void theAlertShouldBe(String expected) {
		assertEquals(page.alert(), expected);
	}

}
