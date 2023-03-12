package com.example.Automation.pages;

import com.example.Automation.annotation.LazyAutowired;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import javax.annotation.PostConstruct;

public class BasePage {

    @LazyAutowired
    protected WebDriver webDriver;

    @PostConstruct
    public void InitPage(){
        PageFactory.initElements(webDriver,this);
    }

    public void navigateToApp(String url){
        webDriver.navigate().to(url);
    }
}
