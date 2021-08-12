package com.qa.cucumber_selenium.setdefs;

import static org.junit.Assert.assertEquals;

import com.qa.cucumber_selenium.CalculatorHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium_cucumber.calculator.Calculator;

public class CalculatorStepDefs {

	private Double num1, num2, actualResult;
	private Calculator calculator;

	public CalculatorStepDefs(CalculatorHooks hooks) {
		this.calculator = hooks.getCalculator();
	}

	@Given("the number {double}")
	public void theNumber(Double double1) {
		this.num1 = double1;

	}

	@Given("the second number {double}")
	public void theSecondNumber(Double double1) {
		this.num2 = double1;

	}

	@When("the numbers are added")
	public void theNumbersAreAdded() {
		this.actualResult = this.calculator.add(num1, num2);
	}

	@Then("the result should be {double}")
	public void theResultShouldBe(Double expectedResult) {
		Double actualDoubleResult = Math.round(actualResult * 100) / 100.0;
		assertEquals(expectedResult, actualDoubleResult);
	}

}
