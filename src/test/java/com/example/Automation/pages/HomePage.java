package com.example.Automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage {

    public HomePage() {
        System.out.println("In Home Page");
    }

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    public LoginPage ClickLogin() {
        lnkLogin.click();
        System.out.println("Click the home page login");
        return new LoginPage();
    }

    public void ClickEmployeeList() {lnkEmployeeList.click();}

}
