package com.qa.cucumber_selenium;

import io.cucumber.java.Before;
import selenium_cucumber.calculator.Calculator;

public class CalculatorHooks {
	
	private Calculator calculator;
	
	@Before()
	public void setup() {
		this.calculator = new Calculator();
	}
	
	public Calculator getCalculator() {
		return this.calculator;
	}

}
