package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/rerun.txt", 
				glue = "com.app.stepdefinition",
						plugin = {"pretty","html:target/cucumber-reports.html",
								"json:target/cucumber.json",
								}
				

)
public class ReRun_Failed {

}
