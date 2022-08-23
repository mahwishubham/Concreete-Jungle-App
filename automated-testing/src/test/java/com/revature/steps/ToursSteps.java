package com.revature.steps;

import com.revature.pages.LoginPage;
import com.revature.pages.MyToursPage;
import com.revature.pages.ToursPage;
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

public class ToursSteps {
    public ToursPage toursPage;

    @Given("I am at the tours page")
    public void iamatthemytourspage(){
        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/tours.html");
        toursPage = new ToursPage(driver);
    }

    @And("I click on the guides button in tours")
    public void iClickOnTheGuidesButtonInTours() {
        toursPage.clickGuideButton();
    }

    @And("I click on the stops button in tours")
    public void iClickOnTheStopsButtonInTours() {
        toursPage.clickStopsButton();
    }

    @And("I click on the login button in tours")
    public void iClickOnTheLoginButtonInTours() {
        toursPage.clickLoginButton();
    }

    @And("I click on the register button in tours")
    public void iClickOnTheRegisterButtonInTours() {
        toursPage.clickRegisterButton();
    }

    @Then("I should be redirected to register.html")
    public void iShouldBeRedirectedToRegisterHtml() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.urlContains("registration.html"));
        String actual = driver.getCurrentUrl();
        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/registration.html";
        Assert.assertEquals(actual, expected);
    }

    @And("I click on the home button in tours")
    public void iClickOnTheHomeButtonInTours() {
        toursPage.clickHomeButton();
    }

    @When("I am logged in as a user")
    public void iAmLoggedInAsAUser() {
        toursPage.clickLoginButton();
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.urlContains("login.html"));
        toursPage.ToursPageLoggedUser();

    }

    @And("I click on the logout button in tours")
    public void iClickOnTheLogoutButtonInTours() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout")));
        toursPage.clickLogoutButton();
    }

    @And("I accept the alert in tours")
    public void iAcceptTheAlertInTours() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    @When("I am logged in as a guide")
    public void iAmLoggedInAsAGuide() {
        toursPage.clickLoginButton();
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.urlContains("login.html"));
        toursPage.ToursPageLoggedGuide();
    }


    @And("I click on the add tour button in tours")
    public void iClickOnTheAddTourButtonInTours() {
        toursPage.clickAddTourButton();
    }

    @And("I click on the my tour button in tours")
    public void iClickOnTheMyTourButtonInTours() {
        toursPage.clickMyTourButton();
    }
}
