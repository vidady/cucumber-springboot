package com.example.Automation.steps;

import com.example.Automation.annotation.LazyAutowired;
import com.example.Automation.pages.HomePage;
import com.example.Automation.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginSteps {

    @LazyAutowired
    private HomePage homePage;
    @LazyAutowired
    private LoginPage loginPage;

    @Given("I click login in Home Page")
    public void iClickLoginInHomePage() {
       this.homePage.ClickLogin();
    }


    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
        //List<String> data = table.transpose().asList(String.class);
        loginPage.Login(table.cell(0,0),table.cell(0,1));
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.ClickLogin();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        System.out.println("Finished test");
    }


}
