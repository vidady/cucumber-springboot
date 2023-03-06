package com.example.Automation.pages;


import com.example.Automation.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Page
public class MainPage extends BasePage{

    public MainPage() {
        System.out.println("In Main Page");
    }

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;
    @Autowired
    private WebDriver webDriver;
    @Value("${app.url}")
    private String appUrl;


    public void PerformLogin() {

        System.out.println("Login:" + appUrl);
        webDriver.navigate().to("http://eaapp.somee.com");
        homePage.ClickLogin();
        loginPage.Login("admin", "adminpassword23432");
        loginPage.ClickLogin();
    }
}
