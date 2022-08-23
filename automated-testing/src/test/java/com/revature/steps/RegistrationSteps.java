package com.revature.steps;
import com.revature.pages.LoginPage;
import com.revature.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.revature.testrunner.testrunner.driver;

public class RegistrationSteps {

    public RegisterPage registerPage;
    public LoginPage loginPage;


    @Given("I am at the registration page")
    public void iamatheregistrationpage(){
        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/registration.html");
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
    }

    @When("I type in {string} for email")
            public void type_in_email(String email){
        registerPage.typeEmail(email);

        }


    @And("I type in {string} for password")
    public void iTypeInForPassword(String password) {
        registerPage.typePassword(password);

    }

    @And("I type in {string} for first name")
    public void iTypeInForFirstName(String firstname) {
        registerPage.typeFirstName(firstname);
    }

    @And("I type in {string} for last name")
    public void iTypeInForLastName(String lastname) {
        registerPage.typeLastName(lastname);
    }

    @And("I type in {string} for phone number")
    public void iTypeInForPhoneNumber(String phone) {
        registerPage.typePhone(phone);
    }

    @Then("I should get the error {string}")
    public void iShouldGetTheError(String error) {
    String actual = registerPage.getError();
        Assert.assertEquals(actual, error);
    }

    @And("I click on the register button in register")
    public void iClickOnTheRegisterButtonInRegister() {
        registerPage.clickRegister();
    }

    @When("I click on the home button in register")
    public void iClickOnTheHomeButtonInRegister() {
        loginPage.clickHomeButton();
    }

    @When("I click on the login button in register")
    public void iClickOnTheLoginButtonInRegister() {
        loginPage.clickLoginButton();
    }


}