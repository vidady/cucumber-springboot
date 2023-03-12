package com.example.Automation.steps;

import com.example.Automation.annotation.LazyAutowired;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;



public class Hooks {

    @LazyAutowired
    private WebDriver webDriver;


    @BeforeAll
    public static void before_all(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
    }

    @Before
    public void before(Scenario scenario){
        this.webDriver.navigate().to("http://eaapp.somee.com");
    }

    @After
    public void after(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println(scenario.getName());
        }
        this.webDriver.quit();
    }


}
