package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.revature.testrunner.testrunner.driver;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
//        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/p[1]/p[1]")
    private WebElement errorMessage;

    @FindBy(id = "email-input")
    private WebElement emailInput;

    @FindBy(id = "password-input")
    private WebElement passwordInput;

    @FindBy(id = "firstname-input")
    private WebElement firstnameInput;

    @FindBy(id = "lastname-input")
    private WebElement lastnameInput;

    @FindBy(id = "phone-input")
    private WebElement phoneInput;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    private WebElement registerButton;

    public void typeEmail(String email){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(emailInput));
        emailInput.sendKeys(email);
    }
    public void typePassword(String password){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.sendKeys(password);
    }
    public void typeFirstName(String name){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(firstnameInput));
        firstnameInput.sendKeys(name);
    }
    public void typeLastName(String lastname){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(lastnameInput));
        lastnameInput.sendKeys(lastname);
    }
    public void typePhone(String phone){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(passwordInput));
        phoneInput.sendKeys(phone);
    }
    public void clickRegister(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(registerButton));
        registerButton.click();
    }
    public String getError(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/p[1]/p[1]")));
        return errorMessage.getText();
    }
}
