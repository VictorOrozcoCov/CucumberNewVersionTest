Feature: This is a test feature

  Background: 
    Given I point to "GoogleMaps" service

	@test
  Scenario: This is a test scenario
    Given I want to get a random location
    And I set the information to the resource
    When I hit api with POST operation
    Then I get the geolocation from that api
