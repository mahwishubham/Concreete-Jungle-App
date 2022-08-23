package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    // Selenium locators: id, className, tagName, cssSelector, xpath, linkText, partialLinkText, name

    private WebDriver driver;

    @FindBy(id="email-login-input")
    private WebElement usernameInput;

    @FindBy(id="password-login-input")
    private WebElement passwordInput;

    @FindBy(id="login")
    private WebElement loginButton;

    @FindBy(xpath="//body/nav[1]/div[1]/span[1]/div[1]/a[1]")
    private WebElement tourButton;

    @FindBy(xpath="//a[contains(text(),'Stops')]")
    private WebElement stopsButton;

    @FindBy(xpath="//a[contains(text(),'Guides')]")
    private WebElement guidesButton;

    @FindBy(id="home")
    private WebElement homeButton;

    @FindBy(id="register")
    private WebElement registerButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
//        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    public void typeUsername(String username) {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(usernameInput));
        usernameInput.sendKeys(username);
    }

    public void typePassword(String password) {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.sendKeys(password);
    }
    public void clickLoginButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }
    public void clickToursButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(tourButton));
        tourButton.click();
    }
    public void clickStopsButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(stopsButton));
        stopsButton.click();
    }
    public void clickGuidesButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(guidesButton));
        guidesButton.click();
    }
    public void clickHomeButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(homeButton));
        homeButton.click();
    }
    public void clickRegisterButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(registerButton));
        registerButton.click();
    }

}