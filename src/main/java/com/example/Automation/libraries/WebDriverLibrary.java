package com.example.Automation.libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebDriverLibrary {

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    public WebDriver getChromeDriver(){
        return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver getFireFoxDriver(){
        return new FirefoxDriver();
    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "edge")
    public WebDriver getEdgeDriver(){
        return new EdgeDriver();
    }
}
