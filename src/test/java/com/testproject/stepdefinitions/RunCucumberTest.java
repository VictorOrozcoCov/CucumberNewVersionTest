package com.testproject.stepdefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty"}
		,features={"src/test/resources"}
		,glue={"com.testproject.stepdefinitions"}
		//,tags={@test2}
		//,tags = { "@test2" }
		,monochrome = false)
public class RunCucumberTest {

}
