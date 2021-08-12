package com.qa.cucumber_selenium.setdefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.cucumber_selenium.SeleniumHooks;
import com.qa.cucumber_selenium.acceptanceTesting.bingPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BingSearchStepDefs {
	
	private WebDriver driver;
	private bingPage page;
	
	public BingSearchStepDefs(SeleniumHooks hooks) {
		this.driver = hooks.getDriver();
		this.page = PageFactory.initElements(this.driver, bingPage.class);
		
	}
	
	@When("I request {string}")
	public void iRequest(String url) {
		this.driver.get(url);
	}

	@When("I search for {string}")
	public void iSearchFor(String search) {
		page.search(search);
	}

	@Then("the result should be {string}")
	public void theResultShouldBe(String expected) {
		assertEquals(this.driver.getTitle(), expected);
	}

}
