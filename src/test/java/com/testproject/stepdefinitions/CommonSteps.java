package com.testproject.stepdefinitions;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

import com.testproject.utils.ApiHelper;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class CommonSteps {

	private ApiHelper base;
	
	public CommonSteps(ApiHelper base) {
		this.base=base;
	}
	
	@After
	public void printApiInformation(Scenario scenario) {
		try {
			scenario.write("URL: "+ base.getApiEndpoint()+base.getResource());
			if(StringUtils.isNotBlank(base.getRequest()))scenario.write("EndPoint: "+ base.getApiEndpoint());
			scenario.write("Response: "+ new JSONObject(base.getResponse()));
		}catch(Exception ex){
			System.err.println("Error in @After statement");
			ex.getMessage();
		}
	}
	
}
