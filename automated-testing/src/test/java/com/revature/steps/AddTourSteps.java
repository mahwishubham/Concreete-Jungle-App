package com.revature.steps;

import com.revature.pages.AddTourPage;
import com.revature.pages.LoginPage;
import com.revature.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.revature.testrunner.testrunner.driver;

public class AddTourSteps {
    public AddTourPage addTourPage;


    @Given("I am at the add tours page")
    public void iamatheaddtourspage(){
        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
        addTourPage = new AddTourPage(driver);


    }


    @When("I select {int} for day")
    public void iSelectForDay(int day) throws InterruptedException {
        addTourPage.selectDayDropdown(day);

    }


    @And("I select {int} {int} {int} for three valid options")
    public void iSelectForTheFirstOption(int op1, int op2, int op3) {
        addTourPage.selectAllOptions(op1, op2, op3);
    }


    @And("I type in a valid price of {string}")
    public void iTypeInAValidPriceOf(String price) {
        addTourPage.typePrice(price);
    }

    @And("I type in a valid title of {string}")
    public void iTypeInAValidTitleOf(String tourname) {
        addTourPage.typeTitle(tourname);
    }

    @And("I click on the add tour button in add tours")
    public void iClickOnTheAddTourButtonInAddTours() {
        addTourPage.clickAddTourButton();
    }

    @Then("I should get an alert")
    public void iShouldGetAnAlert() {
    }

    @Then("I should receive an alert with the error {string}")
    public void iShouldReceiveAnErrorError(String error) {
        String actual = addTourPage.getError();
        Assert.assertEquals(actual, error);
    }

    @And("I select {int} {int} {int} {int} {int} {int} for six valid options")
    public void iSelectForThreeValidOptions(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
    addTourPage.selectAllOptions(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @And("I select {int} {int} {int} {int} {int} for five valid options")
    public void iSelectOptionOptionOptionOptionOptionForThreeValidOptions(int arg0, int arg1, int arg2, int arg3, int arg4) {
    addTourPage.selectAllOptions(arg0, arg1, arg2, arg3, arg4);
    }

    @And("I select {int} {int} {int} {int} for four valid options")
    public void iSelectOptionOptionOptionOptionForFourValidOptions(int arg0, int arg1, int arg2, int arg3) {
        addTourPage.selectAllOptions(arg0, arg1, arg2, arg3);
    }

    @When("I click on the stops button in add tours")
    public void iClickOnTheStopsButtonInAddTours() {
        addTourPage.clickStopsButton();
    }

    @When("I click on the guides button in add tours")
    public void iClickOnTheGuidesButtonInAddTours() {
        addTourPage.clickGuidesButton();
    }

    @When("I click on the my tours button in add tours")
    public void iClickOnTheMyToursButtonInAddTours() {
        addTourPage.clickMyToursButton();
    }

    @When("I click on the home button in add tours")
    public void iClickOnTheHomeButtonInAddTours() {
        addTourPage.clickHomeButton();
    }

    @When("I click on the logout button in add tours")
    public void iClickOnTheLogoutButtonInAddTours() {
        addTourPage.clickLogoutButton();
    }
}
