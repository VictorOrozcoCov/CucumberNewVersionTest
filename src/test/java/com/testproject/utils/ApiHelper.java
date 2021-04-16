package com.testproject.utils;

import org.json.JSONObject;

import lombok.Data;

@Data
public class ApiHelper {

	private String apiEndpoint;
	private String resource;
	private String request;
	private JSONObject requestJs;
	private JSONObject requestArray;
	private String response;
	
}
