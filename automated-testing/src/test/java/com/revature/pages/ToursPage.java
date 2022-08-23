package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ToursPage {
    private WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Guides')]")
    private WebElement guidesButton;

    @FindBy(xpath = "//a[contains(text(),'Stops')]")
    private WebElement stopsButton;

    @FindBy(id = "register")
    private WebElement registerButton;

    @FindBy(id = "login")
    private WebElement loginButton;

    @FindBy(id = "home")
    private WebElement homeButton;

    @FindBy(id = "logout")
    private WebElement logoutButton;

    @FindBy(id = "addtours")
    private WebElement addtourButton;

    @FindBy(id = "mytours")
    private WebElement mytoursButton;

    public ToursPage(WebDriver driver) {
        this.driver = driver;
//        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }
    public void ToursPageLoggedUser(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeUsername("jd03@a.ca");
        loginPage.typePassword("password");

        loginPage.clickLoginButton();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.urlContains("tours.html"));
        loginPage.clickHomeButton();
        wdw.until(ExpectedConditions.urlContains("index.html"));
    }
    public void ToursPageLoggedGuide(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeUsername("mc@a.ca");
        loginPage.typePassword("password");

        loginPage.clickLoginButton();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.urlContains("mytours.html"));
        loginPage.clickHomeButton();
        wdw.until(ExpectedConditions.urlContains("index.html"));
    }

    public void clickGuideButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(guidesButton));
        guidesButton.click();
    }

    public void clickStopsButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(stopsButton));
        stopsButton.click();
    }

    public void clickLoginButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public void clickRegisterButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(registerButton));
        registerButton.click();
    }

    public void clickHomeButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(homeButton));
        homeButton.click();
    }

    public void clickLogoutButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
    }


    public void clickAddTourButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(addtourButton));
        addtourButton.click();
    }

    public void clickMyTourButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(mytoursButton));
        mytoursButton.click();
    }
}