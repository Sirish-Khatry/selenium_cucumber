package com.qa.cucumber_selenium.setdefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.qa.cucumber_selenium.SeleniumHooks;

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
	
	@Given("I navigate to alert site {string}")
	public void iNavigateToAlertSite(String url) {
		this.driver.get(url);
	}
	
	@Given("I click on input alert button")
	public void iClickOnAlertButton() {
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
	}
	
	@When("I click on button and input {string}")
	public void iClickOnButtonAndInput(String string) {
    driver.findElement(By.xpath("/html/body/button")).click();
    Alert alert = driver.switchTo().alert();
		alert.sendKeys(string);
		alert.accept();
	}

	@Then("the result will be {string}")
	public void theResultWillBe(String string) {
		assertEquals(string, driver.findElement(By.id("demo")).getText());
	}

}
