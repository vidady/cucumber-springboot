package com.example.Automation.pages;


import com.example.Automation.annotation.LazyAutowired;
import com.example.Automation.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

@Page
public class HomePage extends BasePage {

    @LazyAutowired
    private WebDriver webDriver;

    public HomePage() {
        System.out.println("In Home Page");
    }

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    public LoginPage ClickLogin() {
        PageFactory.initElements(this.webDriver,this);
        lnkLogin.click();
        System.out.println("Click the home page login");
        return new LoginPage();
    }

    public void ClickEmployeeList() {lnkEmployeeList.click();}

}
