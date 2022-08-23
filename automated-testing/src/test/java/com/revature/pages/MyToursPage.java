package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyToursPage {

    private WebDriver driver;

    public MyToursPage(WebDriver driver) {
        this.driver = driver;
//        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeUsername("mc@a.ca");
        loginPage.typePassword("password");

        loginPage.clickLoginButton();
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.urlContains("mytours.html"));
        }
    @FindBy(id="email-login-input")
    private WebElement usernameInput;

    @FindBy(id="password-login-input")
    private WebElement passwordInput;

    @FindBy(xpath = "//a[contains(text(),'Stops')]\n")
    private WebElement stopButton;

    @FindBy(xpath = "//a[contains(text(),'Guides')]")
    private WebElement guideButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/button[1]")
    private WebElement updateFirstButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/button[2]")
    private WebElement deleteFirstButton;

    @FindBy(id = "logout")
    private WebElement logoutButton;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement homeButton;

    @FindBy(xpath = "//a[contains(text(),'All Tours')]")
    private WebElement allTourButton;

    @FindBy(linkText = "Add Tour")
    private WebElement addTourButton;

    @FindBy(id="login")
    private WebElement loginButton;

    public void typeUsername() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(usernameInput));
        usernameInput.sendKeys("mc@a.ca");
    }

    public void typePassword() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.sendKeys("password");
    }
    public void clickStopButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(stopButton));
        stopButton.click();
    }
    public void clickGuideButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(guideButton));
        guideButton.click();
    }
    public void clickLoginButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public void clickUpdateFirstButton(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(updateFirstButton));
        updateFirstButton.click();
    }
    public void clickDeleteFirstButton(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(deleteFirstButton));
        deleteFirstButton.click();
    }
    public void clickLogoutButton(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
    }
    public void clickHomeButton(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(homeButton));
        homeButton.click();
    }
    public void clickAllTours(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(allTourButton));
        allTourButton.click();
    }
    public void clickAddTour(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(addTourButton));
        addTourButton.click();
    }
}