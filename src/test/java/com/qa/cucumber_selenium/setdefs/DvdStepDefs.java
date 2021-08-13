package com.qa.cucumber_selenium.setdefs;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.qa.cucumber_selenium.DvdHooks;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium_cucumber.calculator.Dvd;
import selenium_cucumber.calculator.DvdStore;

public class DvdStepDefs {
	private List<String> expected, actual;
	private List<Dvd> dvds;
	private DvdStore dvdStore;

	public DvdStepDefs(DvdHooks hooks) {
		this.dvdStore = hooks.getDvdStore();  
		this.dvds = new ArrayList<>();
		this.expected = new ArrayList<>();
		this.actual = new ArrayList<>();
	}

	@DataTableType
	public Dvd dvdEntry(Map<String, String> inputData) {
		return new Dvd(inputData.get("Title"), inputData.get("Year"), inputData.get("Actor"));

	}

	@Given("the following new DVDs")
	public void theFollowingNewDVDs(List<Dvd> inputDvds) {
		dvds = inputDvds;
	}

	@Given("the expected outputs")
	public void theExpectedOutputs(List<String> expectedOutput) {
		expected = expectedOutput;

	}

	@When("the new DVDs are added to the store")
	public void theNewDVDsAreAddedToTheStore() {
		for(Dvd dvd : dvds){
			dvdStore.addDvd(dvd);
		}
	}

	@Then("the get dvd list request should return the expected outputs")
	public void theGetDvdListRequestShouldReturnTheExpectedOutputs() {
		List<Dvd> returned = dvdStore.getAllDvds();
		for(Dvd d : returned) {
			actual.add(String.valueOf(d));
		}
	
		assertEquals(expected, actual);
	}
}
