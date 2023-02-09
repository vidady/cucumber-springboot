package com.example.Automation.pages;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
public class MainPage extends BasePage{

    public MainPage() {
        System.out.println("In Main Page");
    }

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;

    @Value("${app.url}")
    private String appUrl;


    public void PerformLogin() {

        System.out.println("Login:" + appUrl);
        navigateToApp(appUrl);
        homePage.ClickLogin();
        loginPage.Login("admin", "adminpassword23432");
        loginPage.ClickLogin();
    }
}
