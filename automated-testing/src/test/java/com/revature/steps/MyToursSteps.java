package com.revature.steps;

import com.revature.pages.LoginPage;
import com.revature.pages.MyToursPage;
import com.revature.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.revature.testrunner.testrunner.driver;

public class MyToursSteps {
    public MyToursPage myToursPage;
    public LoginPage loginPage;

    @Given("I am at the my tours page")
    public void iamatthemytourspage(){
        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
        myToursPage = new MyToursPage(driver);
        loginPage = new LoginPage(driver);
    }

    @And("I click on the add tour button")
    public void iClickOnTheAddTourButton() throws InterruptedException {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.id("addtour")));
        myToursPage.clickAddTour();
    }

    @Then("I should be redirected to addTour.html")
    public void iShouldBeRedirectedToAddTourHtml() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.urlContains("addTour.html"));

        String actual = driver.getCurrentUrl();
        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/addTour.html";
        Assert.assertEquals(actual, expected);
    }

    @And("I should be redirected to mytours.html from login")
    public void iShouldBeRedirectedToMytoursHtmlFromLogin() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.urlContains("addtours.html"));
        String actual = driver.getCurrentUrl();
        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/addtours.html";
        Assert.assertEquals(actual, expected);
    }

    @And("I click on the all tours button")
    public void iClickOnTheAllToursButton() {
        myToursPage.clickAddTour();
    }

    @And("I click on the first update button")
    public void iClickOnTheFirstUpdateButton() {
        myToursPage.clickUpdateFirstButton();
    }

    @Then("I should be redirected to update.html")
    public void iShouldBeRedirectedToUpdateHtml() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.urlContains("update.html"));
        String actual = driver.getCurrentUrl();
        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/update.html";
        Assert.assertEquals(actual, expected);
    }

    @And("I click on the first delete button")
    public void iClickOnTheFirstDeleteButton() {
        myToursPage.clickDeleteFirstButton();
    }

    @And("I click on the home button in mytours")
    public void iClickOnTheHomeButtonInMytours() {myToursPage.clickHomeButton();
    }

    @And("I click on the stops button in mytours")
    public void iClickOnTheStopsButtonInMytours() {myToursPage.clickStopButton();
    }

    @And("I click on the guides button in my tours")
    public void iClickOnTheGuidesButtonInMyTours() {myToursPage.clickGuideButton();
    }

    @And("I click on the all tours button in mytours")
    public void iClickOnTheAllToursButtonInMytours() {myToursPage.clickAllTours();
    }

    @Then("I click on the logout button in my tours")
    public void iClickOnTheLogoutButtonInMyTours() {
    myToursPage.clickLogoutButton();
    }

    @And("I accept the alert")
    public void iAcceptTheAlert() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

    }

}
