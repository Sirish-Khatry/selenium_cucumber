package com.qa.cucumber_selenium.acceptanceTesting;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class bingPage {

	@FindBy(xpath = "//*[@id=\"sb_form_q\"]")
	private WebElement searchElement;
	
	@FindBy(xpath = "//*[@id=\"search_icon\"]/svg")
	private WebElement searchClickElement;
	
	
	public void search(String search) {
		
		searchElement.sendKeys(search);
		searchElement.sendKeys(Keys.ENTER);
		
	}
	
}