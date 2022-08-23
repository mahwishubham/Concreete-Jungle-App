package com.revature.steps;

import com.revature.pages.ToursPage;
import com.revature.pages.UpdateTourPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.revature.testrunner.testrunner.driver;

public class UpdateSteps {

        public UpdateTourPage updateTourPage;

        @Given("I am at the update page")
        public void iamatthemytourspage(){
            driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
            updateTourPage = new UpdateTourPage(driver);
        }

    @When("I select {int} for day in update")
    public void iSelectDayForDayInUpdate(int day) {
        updateTourPage.selectDayDropdown(day);
    }

    @And("I type in a valid price of {string} in update")
    public void iTypeInAValidPriceOfInUpdate(String price) {
            updateTourPage.typePrice(price);
    }

    @And("I select {int}")
    public void iSelectRadio(int radio) {
            updateTourPage.selectRadioButton(radio);
    }

    @And("I click on update tours button")
    public void iClickOnUpdateToursButton() {
            updateTourPage.clickUpdateTourButton();
    }


    @Then("I should get the error {string} in update")
    public void iShouldGetTheErrorInUpdate(String error) {
        String actual = UpdateTourPage.getError();
        Assert.assertEquals(actual, error);
    }

    @When("I click on the stops button in update")
    public void iClickOnTheStopsButtonInUpdate() {
            updateTourPage.clickStopsButton();
    }

    @When("I click on the guides button in update")
    public void iClickOnTheGuidesButtonInUpdate() {
            updateTourPage.clickGuidesButton();

    }

    @When("I click on the my tours button in update")
    public void iClickOnTheMyToursButtonInUpdate() {
            updateTourPage.clickToursButton();
    }


    @When("I click on the logout button in update")
    public void iClickOnTheLogoutButtonInUpdate() {
            updateTourPage.clickLogoutButton();
    }

    @When("I click on the all tours button in update")
    public void iClickOnTheAllToursButtonInUpdate() {
            updateTourPage.clickAllToursButton();
    }
}
