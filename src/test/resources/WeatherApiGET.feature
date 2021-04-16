Feature: This is a test feature

  Background: 
    Given I point to "WeatherBit" service

	@test
  Scenario: This is a test scenario
    Given I want to get a random location
    And I set the information to the resource
    When I hit api with POST operation
    Then I get the geolocation from that api

	@test2
  Scenario: This is a test scenario
    Given I want to get information with lat "19.24997" and lon "-103.72714"
    And I set the information to the resource
    When I hit api with GET operation
    Then I get the geolocation from that api
    And the "city_name" should be "Colima"
    
    
    
    
    