package com.example.Automation.libraries;

import com.example.Automation.annotation.LazyConfiguration;
import com.example.Automation.annotation.ThreadScopeBean;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;

import java.net.URL;

@Profile("remote")
@LazyConfiguration
public class RemoteWebDriverLibrary {

    @Value("${grid.url}")
    public URL gridUrl;

    @ThreadScopeBean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    public WebDriver getChromeRemoteWebDriver() {
        ChromeOptions chromeOptions = new ChromeOptions().addArguments("platformName", "Windows");
        return new RemoteWebDriver(gridUrl,chromeOptions);
    }

    @ThreadScopeBean
    @ConditionalOnProperty(name = "browser", havingValue = "edge")
    public WebDriver getEdgeRemoteWebDriver() {
        EdgeOptions edgeOptions = new EdgeOptions().addArguments("platformName", "Windows");
        return new RemoteWebDriver(gridUrl,edgeOptions);
    }

    @ThreadScopeBean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver getFireFoxRemoteWebDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions().addArguments("platformName", "Windows");
        return new RemoteWebDriver(gridUrl,firefoxOptions);
    }
}
