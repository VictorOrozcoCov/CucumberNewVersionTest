package com.testproject.stepdefinitions;

import com.testproject.utils.ApiHelper;
import com.testproject.utils.PropertiesHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleMapsPOST {

	private ApiHelper base;
	
//	GoogleMapsPOST(ApiHelper base){
//		this.base = base;
//	}
	
	@Given("I point to {string} service")
	public void i_point_to_service(String apiName) throws Throwable{
	    PropertiesHelper.getProperty(apiName);
	}


	@Given("I want to get a random location")
	public void i_want_to_get_a_random_location() {
		
	}


	@Given("I set the information to the resource")
	public void i_set_the_information_to_the_resource() {
		
	}


	@When("I hit api with POST operation")
	public void i_hit_api_with_post_operation() {
		
	}


	@Then("I get the geolocation from that api")
	public void i_get_the_geolocation_from_that_api() {
		
	}

}
