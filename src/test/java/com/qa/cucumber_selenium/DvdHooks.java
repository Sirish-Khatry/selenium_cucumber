package com.qa.cucumber_selenium;

import io.cucumber.java.Before;
import selenium_cucumber.calculator.DvdStore;

public class DvdHooks {
	private DvdStore dvds;

	@Before()
	public void setup() {
		this.dvds = new DvdStore();
	}

	public DvdStore getDvdStore() {
		return this.dvds;
	}

}
