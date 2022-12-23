package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\Features",glue ={"Stepdefinition","Hooks"},
tags = "@TC101" , plugin = {"html:target\\report\\Adactin_report.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
dryRun = false)


public class Runner {


}
