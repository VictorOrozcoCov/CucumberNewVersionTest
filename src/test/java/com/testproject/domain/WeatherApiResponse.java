package com.testproject.domain;

import lombok.Data;

@Data
public class WeatherApiResponse {

	private String cityName;
	private String countryCode;
	private String timeZone;
	private float lon;
	private float lat;

}