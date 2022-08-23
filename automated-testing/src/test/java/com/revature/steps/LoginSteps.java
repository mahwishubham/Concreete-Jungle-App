package com.revature.steps;

import com.revature.pages.LoginPage;
import com.revature.pages.HomePage;
import com.revature.pages.MyToursPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.revature.testrunner.testrunner.driver;

public class LoginSteps {
    public LoginPage loginPage;


    @Given("I am at the login page")
    public void i_am_at_login_page(){
        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
        loginPage = new LoginPage(driver);

    }
    @When("I type in a valid username {string}")
    public void i_type_valid_username(String username){loginPage.typeUsername(username);
    }
    @And("I type in a valid password {string}")
    public void i_type_valid_password(String password){
        loginPage.typePassword(password);
    }

    @And("I click on the home button")
    public void iClickOnTheHomeButton() {

        loginPage.clickHomeButton();
    }

    @And("I should be redirected to index.html")
    public void iShouldBeRedirectedToIndexHtml() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.urlContains("index.html"));
        String actual = driver.getCurrentUrl();
        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html";
        Assert.assertEquals(actual, expected);
    }

    @And("I click on the login button in login")
    public void iClickOnTheLoginButtonInLogin() throws InterruptedException {loginPage.clickLoginButton();
    }

    @Then("I should be redirected to mytours.html")
    public void redirected_to_mytours(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.urlContains("mytours.html"));

        String actual = driver.getCurrentUrl();
        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/mytours.html";
        Assert.assertEquals(actual, expected);
    }

    @When("I click on the tours button in login")
    public void iClickOnTheToursButtonInLogin() {
        loginPage.clickToursButton();
    }

    @When("I click on the stops button in login")
    public void iClickOnTheStopsButtonInLogin() {
        loginPage.clickStopsButton();
    }

    @When("I click on the guides button in login")
    public void iClickOnTheGuidesButtonInLogin() {
    loginPage.clickGuidesButton();
    }

    @When("I click on the home button in login")
    public void iClickOnTheHomeButtonInLogin() {

    loginPage.clickHomeButton();
    }

    @When("I click on the register button in login")
    public void iClickOnTheRegisterButtonInLogin() {
        loginPage.clickRegisterButton();
    }


    @Then("I should be redirected to index.html#guides from login")
    public void iShouldBeRedirectedToIndexHtmlGuidesFromLogin() {


    }

    @Then("I should be redirected to registration.html")
    public void iShouldBeRedirectedToRegistrationHtml() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.urlContains("registration.html"));

        String actual = driver.getCurrentUrl();
        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/registration.html";
        Assert.assertEquals(actual, expected);
    }
}
