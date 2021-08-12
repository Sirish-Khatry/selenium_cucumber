package com.qa.cucumber_selenium.setdefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

import com.qa.cucumber_selenium.SeleniumHooks;
import com.qa.cucumber_selenium.acceptanceTesting.bingPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectItemStepDefs {

	private WebDriver driver;

	public SelectItemStepDefs(SeleniumHooks hooks) {
		this.driver = hooks.getDriver();

	}

	@Given("I navigtate to {string}")
	public void iNavigateTo(String url) {
		this.driver.get(url);
	}

	@When("I select item {int}")
	public void iSelectAnItem(Integer int1) {
		String select = "#selectable > li:nth-child("+ int1 +")";
		this.driver.findElement(By.cssSelector(select)).click();
	}

	@Then("the highlighted result should be {string}")
	public void theHighlightedResultShouldBe(String expected) {
		assertEquals(driver.findElement(By.className("ui-selected")).getText(), expected);
	}

}
