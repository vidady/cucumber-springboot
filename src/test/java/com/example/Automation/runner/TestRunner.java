package com.example.Automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/com/example/Automation/features"},
        glue = "com.example.Automation.steps"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
