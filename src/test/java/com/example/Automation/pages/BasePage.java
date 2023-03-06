package com.example.Automation.pages;

import com.example.Automation.annotation.LazyAutowired;
import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
