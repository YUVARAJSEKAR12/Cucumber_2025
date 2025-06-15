package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\eclipse-workspace"
		+ "\\Develop\\new\\Oct_Cucumber\\src\\test\\java\\com\\app\\feature", 
		glue = "com.app.stepdefinition",
		dryRun = false,
		tags = "@Smoke",
		publish = true,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports.html",
				"json:target/cucumber.json",
				"rerun:target/rerun.txt"}
		)
public class Runner {

}
