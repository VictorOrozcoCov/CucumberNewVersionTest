package com.testproject.utils.formaters;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;

import com.testproject.domain.WeatherApiRequest;

public class ResourceUtils {

	
	public static JSONArray weatherApiGetResourceInArray(WeatherApiRequest request) {
		JSONArray array = new JSONArray();
		if(StringUtils.isNotBlank(request.getLat())) {array.put("lat="+request.getLat());}
		if(StringUtils.isNotBlank(request.getLon())) {array.put("lon="+request.getLon());}
		return array;
	}
	
	
	public static String valuesAsResource(String apiResource, JSONArray params) {
		String resource="";
		if(params.length()>0) {
			try {
				apiResource+= "?";
				for(int i =0; i<params.length();i++) {
					apiResource+="&"+params.getInt(i);
				}
			}catch(JSONException ex) {
				//ex.getMessage();
				ex.printStackTrace();
			}
		}
		
		
		return resource;
	}
	
	
}
