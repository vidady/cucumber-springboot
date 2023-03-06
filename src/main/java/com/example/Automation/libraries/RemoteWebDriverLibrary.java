package com.example.Automation.libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebDriverLibrary {

    public WebDriver getChromeRemoteWebDriver(){
        return new RemoteWebDriver()
    }
}
