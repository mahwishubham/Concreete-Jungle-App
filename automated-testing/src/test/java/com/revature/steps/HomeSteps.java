package com.revature.steps;
import com.revature.testrunner.testrunner;
import com.revature.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.revature.pages.LoginPage;

import java.time.Duration;


import static com.revature.testrunner.testrunner.driver;

public class HomeSteps {

    public HomePage homePage;
    public LoginPage loginPage;

        @Given("I am at the home page")
        public void i_am_at_home_page() {
            driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html");
            homePage = new HomePage(driver);
            loginPage = new LoginPage(driver);
        }

        @When("I click on the tours button")
        public void i_click_tours_button(){
            homePage.clickToursButton();
        }
        @Then("I should be redirected to index.html#home")
        public void redirected_to_index_home(){
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
            wdw.until(ExpectedConditions.urlContains("#home"));

            String actual = driver.getCurrentUrl();
            String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html#home";
            Assert.assertEquals(actual, expected);
        }
        @When("I click on the current tours button")
        public void i_click_current_tours(){
               homePage.clickCurrentButton();
        }
        @Then("I should be redirected to tours.html")
        public void redirected_to_tours(){
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

            wdw.until(ExpectedConditions.urlContains("tours.html"));

            String actual = driver.getCurrentUrl();
            String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/tours.html";
            Assert.assertEquals(actual, expected);
        }
        @When("I click on the stops button")
        public void i_click_stop_button(){
            homePage.clickStopsButton();
        }
        @Then("I should be redirected to index.html#pois")
        public void redirected_to_index_pois(){
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

            wdw.until(ExpectedConditions.urlContains("#pois"));

            String actual = driver.getCurrentUrl();
            String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html#pois";
            Assert.assertEquals(actual, expected);
        }
        @When("I click on the guides button")
        public void i_click_guides_button(){
            homePage.clickGuidesButton();
    }
        @Then("I should be redirected to index.html#guides")
        public void redirected_to_index_guides(){
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
            wdw.until(ExpectedConditions.urlContains("#guides"));
            String actual = driver.getCurrentUrl();
            String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html#guides";
            Assert.assertEquals(actual, expected);
    }
        @When("I click on the register button")
        public void i_click_on_register(){
            homePage.clickRegisterButton();
        }
        @When("I click on the login button")
        public void i_click_login_button(){
            loginPage.clickLoginButton();
        }
        @Then("I should be redirected to com.revature.steps.registration.html")
        public void redirected_to_registration(){
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
            wdw.until(ExpectedConditions.urlContains("com.revature.steps.registration.html"));
            String actual = driver.getCurrentUrl();
            String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/registration.html";
            Assert.assertEquals(actual, expected);
        }
        @Then("I should be redirected to login.html")
        public void redirected_to_login(){
            WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
            wdw.until(ExpectedConditions.urlContains("login.html"));
            String actual = driver.getCurrentUrl();
            String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html";
            Assert.assertEquals(actual, expected);
        }

    @When("I am logged in as a user on home page")
    public void iAmLoggedInAsAUserOnHomePage() {
        homePage.clickLoginButton();
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.urlContains("login.html"));
        homePage.loggedInAsUser();
    }

    @And("I click on the all tours button on home page")
    public void iClickOnTheAllToursButtonOnHomePage() {
            homePage.clickAllToursButton();
    }

    @And("I click on the logout button on home page")
    public void iClickOnTheLogoutButtonOnHomePage() throws InterruptedException {

            homePage.clickLogoutButton();
    }

    @And("I accept the alert on home page")
    public void iAcceptTheAlertOnHomePage() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    @When("I am logged in as a guide on home page")
    public void iAmLoggedInAsAGuideOnHomePage() {
        homePage.clickLoginButton();
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.urlContains("login.html"));
        homePage.loggedInAsGuide();
    }

    @And("I click on the add tour button on home page")
    public void iClickOnTheAddTourButtonOnHomePage() {
            homePage.clickAddTourButton();
    }

    @And("I click on the my tours button")
    public void iClickOnTheMyToursButton() {
            homePage.clickMyToursButton();
    }
}

