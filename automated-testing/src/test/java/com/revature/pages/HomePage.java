package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    // Selenium locators: id, className, tagName, cssSelector, xpath, linkText, partialLinkText, name

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
//        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
//        ToursPage toursPage = new ToursPage(driver);
    }
    @FindBy(xpath="//body/nav[1]/div[1]/span[1]/div[1]/a[1]")
    private WebElement tourButton;

    @FindBy(xpath="//a[contains(text(),'Stops')]")
    private WebElement stopsButton;

    @FindBy(xpath="//a[contains(text(),'Guides')]")
    private WebElement guidesButton;

    @FindBy(id="login")
    private WebElement loginButton;

    @FindBy(id="register")
    private WebElement registerButton;

    @FindBy(id="tour")
    private WebElement currentButton;

    @FindBy(id = "alltours")
    private WebElement allToursButton;

    @FindBy(id = "logout")
    private WebElement logoutButton;

    @FindBy(id = "mytours")
    private WebElement mytoursbutton;

    @FindBy(id = "addtours")
    private WebElement addtourbutton;


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
    public void clickCurrentButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(currentButton));
        currentButton.click();
    }

    public void loggedInAsUser() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.typeUsername("jd03@a.ca");
        loginPage.typePassword("password");

        loginPage.clickLoginButton();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.urlContains("tours.html"));
        ToursPage toursPage = new ToursPage(driver);
        toursPage.clickHomeButton();
        wdw.until(ExpectedConditions.urlContains("index.html"));
    }

    public void clickLogoutButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutButton.click();
    }

    public void clickAllToursButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(allToursButton));
        allToursButton.click();
    }

    public void loggedInAsGuide() {
//        LoginPage loginPage = new LoginPage(driver);
        MyToursPage toursPage = new MyToursPage(driver);
//        loginPage.typeUsername("mc@a.ca");
//        loginPage.typePassword("password");
//
//        loginPage.clickLoginButton();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.urlContains("mytours.html"));

        toursPage.clickHomeButton();
        wdw.until(ExpectedConditions.urlContains("index.html"));
    }

    public void clickAddTourButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(addtourbutton));
        addtourbutton.click();
    }

    public void clickMyToursButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(mytoursbutton));
        mytoursbutton.click();
    }
}