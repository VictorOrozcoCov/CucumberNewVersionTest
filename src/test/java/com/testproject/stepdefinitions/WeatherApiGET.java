package com.testproject.stepdefinitions;

import java.util.Random;

import com.testproject.domain.WeatherApiRequest;
import com.testproject.enums.ApiPaths;
import com.testproject.utils.ApiHelper;
import com.testproject.utils.PropertiesHelper;
import com.testproject.utils.formaters.ResourceUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WeatherApiGET {

	private ApiHelper base;
	private WeatherApiRequest request = new WeatherApiRequest();
	
	public WeatherApiGET(ApiHelper base){
		this.base = base;
	}
	
	@Given("I point to {string} service")
	public void i_point_to_service(String apiName) throws Throwable{
	    PropertiesHelper.getProperty(apiName);
	}
	
	@Given("I want to get information with lat {string} and lon {string}")
	public void i_want_to_get_information_with_lat_and_lon(String latitude, String longitude) {
		request.setLat(latitude);
		request.setLon(longitude);
	}


	@Given("I want to get a random location")
	public void i_want_to_get_a_random_location() {
		Random rand = new Random();
		request.setLat((String) String.valueOf(rand.nextFloat()));
		request.setLon((String) String.valueOf(rand.nextFloat()));
	}


	@Given("I set the information to the resource")
	public void i_set_the_information_to_the_resource() {
		base.setResource(ResourceUtils.valuesAsResource(ApiPaths.WEATHER_API_GET, ResourceUtils.weatherApiGetResourceInArray(request)));
	}


	@When("I hit api with POST operation")
	public void i_hit_api_with_post_operation() {
		
	}

	@When("I hit api with GET operation")
	public void i_hit_api_with_get_operation() {
		
	}

	@Then("I get the geolocation from that api")
	public void i_get_the_geolocation_from_that_api() {
		
	}

	@Then("the {string} should be {string}")
	public void the_should_be(String node, String value) {
		
	}


}
