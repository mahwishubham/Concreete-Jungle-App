package com.revature.pages;

import org.bouncycastle.cms.PasswordRecipient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.revature.testrunner.testrunner.driver;

public class UpdateTourPage {
    private static WebDriver driver;

    public UpdateTourPage(WebDriver driver) {
        this.driver = driver;
//        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.typeUsername("mc@a.ca");
        loginPage.typePassword("password");

        loginPage.clickLoginButton();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/button[1]")));

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/button[1]")).click();
    }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/select[1]")
    private WebElement dayDropdown;

    @FindBy(css = "div.hero div.hero__container div:nth-child(2) div.label:nth-child(1) > p:nth-child(1)")
    private static WebElement errorMessage;

    @FindBy(id = "days")
    private WebElement daysDropdown;

    @FindBy(id = "price")
    private WebElement priceInput;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/ul[2]/input[1]\n")
    private WebElement inactiveRadio;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/ul[2]/input[2]")
    private WebElement activeRadio;

    @FindBy(id = "update-Button")
    private WebElement updateButton;

    @FindBy(xpath = "//a[contains(text(),'Stops')]")
    private WebElement stopsButton;

    @FindBy(xpath = "//a[contains(text(),'Guides')]")
    private WebElement guidesButton;

    @FindBy(id = "tours")
    private WebElement myToursButton;

    @FindBy(id = "alltours")
    private WebElement allToursButton;

    @FindBy(id = "logout")
    private WebElement logoutButton;

    public static String getError() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.getText();
    }

    public void clickDayDropdown(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(daysDropdown));
        daysDropdown.click();
    }
    public void typeAmount(String price){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(priceInput));
        priceInput.sendKeys(price);
    }
    public void clickInactiveRadio(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(inactiveRadio));
        inactiveRadio.click();
    }
    public void clickActiveRadio(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(activeRadio));
        activeRadio.click();
    }
    public void clickAddTour(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(updateButton));
        updateButton.click();
    }

    public void typePrice(String price) {
        priceInput.sendKeys(price);
    }

    public void selectDayDropdown(int day) {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(dayDropdown));
        Select se = new Select(dayDropdown);

        se.selectByIndex(day);
    }

    public void clickUpdateTourButton() {
        updateButton.click();
    }

    public void selectRadioButton(int radio) {
        if (radio == 1){
            inactiveRadio.click();
        }
        if (radio == 2){
            activeRadio.click();
        }
    }

    public void clickStopsButton() {
        stopsButton.click();
    }

    public void clickGuidesButton() {
    guidesButton.click();
    }

    public void clickToursButton() {
        myToursButton.click();
    }
    public void clickAllToursButton(){
        allToursButton.click();
    }
    public void clickLogoutButton(){
        logoutButton.click();
    }
}
