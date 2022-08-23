package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.Objects;

import static com.revature.testrunner.testrunner.driver;

public class AddTourPage {
    // Selenium locators: id, className, tagName, cssSelector, xpath, linkText, partialLinkText, name

    private WebDriver driver;

    public AddTourPage(WebDriver driver) {
        this.driver = driver;
//        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
//        LoginPage loginPage = new LoginPage(driver);
        MyToursPage myToursPage = new MyToursPage(driver);

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.urlContains("mytours.html"));
        myToursPage.clickAddTour();
        wdw.until(ExpectedConditions.urlContains("addTour.html"));

    }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/ul[1]/div[1]/select[1]")
    private WebElement dayDropdown;

    @FindBy(css = "div.hero div.hero__container ul:nth-child(4) div.label > div.multiselect-dropdown:nth-child(3)")
    private WebElement poiDropdown;

    @FindBy(xpath = "//body/div[@id='home']/div[1]/ul[1]/div[1]/div[1]/div[1]/input[1]")
    private WebElement poiInput;

    @FindBy(xpath = "//span[contains(text(),'Tour')]")
    private WebElement randomClick;

    @FindBy(id = "price")
    private WebElement priceInput;

    @FindBy(id = "title")
    private WebElement titleInput;

    @FindBy(css = "body:nth-child(2) div.hero div.hero__container div.label:nth-child(2) > p:nth-child(1)")
    private WebElement errorMessage;
    @FindBy(xpath = "//label[contains(text(),'Statue of Liberty')]")
    private WebElement statueSelect;

    @FindBy(xpath = "//label[contains(text(),'Central Park')]")
    private WebElement parkSelect;

    @FindBy(xpath = "//label[contains(text(),'Rockefeller Center')]")
    private WebElement rockefellerSelect;

    @FindBy(xpath = "//label[contains(text(),'The Met')]")
    private WebElement metSelect;

    @FindBy(xpath = "//label[contains(text(),'Broadway')]")
    private WebElement broadwaySelect;

    @FindBy(xpath = "//label[contains(text(),'The Empire State Building')]")
    private WebElement empireSelect;

    @FindBy(xpath = "//label[contains(text(),'9/11 Memoria')]")
    private WebElement memoriaSelect;

    @FindBy(xpath = "//label[contains(text(),'The High Line')]")
    private WebElement highlineSelect;

    @FindBy(xpath = "//label[contains(text(),'The Museum of Natural History')]")
    private WebElement museumSelect;

    @FindBy(xpath = "//label[contains(text(),'Times Square')]")
    private WebElement timesSelect;

    @FindBy(xpath = "//label[contains(text(),'The Brooklyn Bridge')]")
    private WebElement bridgeSelect;

    @FindBy(xpath = "//label[contains(text(),'Fifth Avenue')]")
    private WebElement avenueSelect;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/button[1]")
    private WebElement addButton;

    @FindBy(xpath = "//a[contains(text(),'Stops')]")
    private WebElement stopsButton;

    @FindBy(xpath = "//a[contains(text(),'Guides')]")
    private WebElement guidesButton;

    @FindBy(id = "tours")
    private WebElement myToursButton;

    @FindBy(id = "home")
    private WebElement homeButton;

    @FindBy(id = "logout")
    private WebElement logoutButton;

    public void typePrice(String price){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        priceInput.sendKeys(price);
    }
    public void typeTitle(String title){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        titleInput.sendKeys(title);
    }

    public void selectDayDropdown(int day) throws InterruptedException {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(dayDropdown));
        Select se = new Select(dayDropdown);

        se.selectByIndex(day);

    }


    public void selectAllOptions(int op1, int op2, int op3) {

        poiDropdown.click();
        poiInput.clear();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        if (Objects.equals((op1), 1) || Objects.equals(op2, 1) ||Objects.equals(op3, 1)) {
            poiInput.sendKeys("statue");
            wdw.until(ExpectedConditions.visibilityOf(statueSelect));
            statueSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 2) || Objects.equals(op2, 2) ||Objects.equals(op3, 2)) {
            poiInput.sendKeys("central");
            wdw.until(ExpectedConditions.visibilityOf(parkSelect));
            parkSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 3) || Objects.equals(op2, 3) ||Objects.equals(op3, 3)) {
            poiInput.sendKeys("Rock");
            wdw.until(ExpectedConditions.visibilityOf(rockefellerSelect));
            rockefellerSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 4) || Objects.equals(op2, 4) ||Objects.equals(op3, 4)) {
            poiInput.sendKeys("The me");
            wdw.until(ExpectedConditions.visibilityOf(metSelect));
            metSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 5) || Objects.equals(op2, 5) ||Objects.equals(op3, 5)) {
            poiInput.sendKeys("Broad");
            wdw.until(ExpectedConditions.visibilityOf(broadwaySelect));
            broadwaySelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 6) || Objects.equals(op2, 6) ||Objects.equals(op3, 6)) {
            poiInput.sendKeys("The emp");
            wdw.until(ExpectedConditions.visibilityOf(empireSelect));
            empireSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 7) || Objects.equals(op2, 7) ||Objects.equals(op3, 7)) {
            poiInput.sendKeys("9/11");
            wdw.until(ExpectedConditions.visibilityOf(memoriaSelect));
            memoriaSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 8) || Objects.equals(op2, 8) ||Objects.equals(op3, 8)) {
            poiInput.sendKeys("the high");
            wdw.until(ExpectedConditions.visibilityOf(highlineSelect));
            highlineSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 9) || Objects.equals(op2, 9) ||Objects.equals(op3, 9)) {
            poiInput.sendKeys("the museum");
            wdw.until(ExpectedConditions.visibilityOf(museumSelect));
            museumSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 10) || Objects.equals(op2, 10) ||Objects.equals(op3, 10)) {
            poiInput.sendKeys("Times");
            wdw.until(ExpectedConditions.visibilityOf(timesSelect));
            timesSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 11) || Objects.equals(op2, 11) ||Objects.equals(op3, 11)) {
            poiInput.sendKeys("The Brookl");
            wdw.until(ExpectedConditions.visibilityOf(bridgeSelect));
            bridgeSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 12) || Objects.equals(op2, 12) ||Objects.equals(op3, 12)) {
            poiInput.sendKeys("fifth");
            wdw.until(ExpectedConditions.visibilityOf(avenueSelect));
            avenueSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        randomClick.click();
    }

    public void clickAddTourButton() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(addButton));
        addButton.click();
    }

    public String getError() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.getText();
    }
    public void selectAllOptions(int op1, int op2, int op3, int op4, int op5, int op6) {

        poiDropdown.click();
        poiInput.clear();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(poiInput));

        if (Objects.equals((op1), 1) || Objects.equals(op2, 1) ||Objects.equals(op3, 1) ||Objects.equals(op4, 1) || Objects.equals(op5, 1)  || Objects.equals(op6, 1)) {
            poiInput.sendKeys("statue");
            wdw.until(ExpectedConditions.visibilityOf(statueSelect));
            statueSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 2) || Objects.equals(op2, 2) ||Objects.equals(op3, 2) ||Objects.equals(op4, 2) || Objects.equals(op5, 2)  || Objects.equals(op6, 2)) {
            poiInput.sendKeys("central");
            wdw.until(ExpectedConditions.visibilityOf(parkSelect));
            parkSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 3) || Objects.equals(op2, 3) ||Objects.equals(op3, 3) ||Objects.equals(op4, 3) || Objects.equals(op5, 3)  || Objects.equals(op6, 3)) {
            poiInput.sendKeys("Rock");
            wdw.until(ExpectedConditions.visibilityOf(rockefellerSelect));
            rockefellerSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 4) || Objects.equals(op2, 4) ||Objects.equals(op3, 4) ||Objects.equals(op4, 4) || Objects.equals(op5, 4)  || Objects.equals(op6, 4)) {
            poiInput.sendKeys("The me");
            wdw.until(ExpectedConditions.visibilityOf(metSelect));
            metSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 5) || Objects.equals(op2, 5) ||Objects.equals(op3, 5) ||Objects.equals(op4, 5) || Objects.equals(op5, 5)  || Objects.equals(op6, 5)) {
            poiInput.sendKeys("Broad");
            wdw.until(ExpectedConditions.visibilityOf(broadwaySelect));
            broadwaySelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 6) || Objects.equals(op2, 6) ||Objects.equals(op3, 6) ||Objects.equals(op4, 6) || Objects.equals(op5, 6)  || Objects.equals(op6, 6)) {
            poiInput.sendKeys("The emp");
            wdw.until(ExpectedConditions.visibilityOf(empireSelect));
            empireSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 7) || Objects.equals(op2, 7) ||Objects.equals(op3, 7) ||Objects.equals(op4, 7) || Objects.equals(op5, 7)  || Objects.equals(op6, 7)) {
            poiInput.sendKeys("9/11");
            wdw.until(ExpectedConditions.visibilityOf(memoriaSelect));
            memoriaSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 8) || Objects.equals(op2, 8) ||Objects.equals(op3, 8) ||Objects.equals(op4, 8) || Objects.equals(op5, 8)  || Objects.equals(op6, 8)) {
            poiInput.sendKeys("the high");
            wdw.until(ExpectedConditions.visibilityOf(highlineSelect));
            highlineSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 9) || Objects.equals(op2, 9) ||Objects.equals(op3, 9) ||Objects.equals(op4, 9) || Objects.equals(op5, 9)  || Objects.equals(op6, 9)) {
            poiInput.sendKeys("the museum");
            wdw.until(ExpectedConditions.visibilityOf(museumSelect));
            museumSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 10) || Objects.equals(op2, 10) ||Objects.equals(op3, 10) ||Objects.equals(op4, 10) || Objects.equals(op5, 10)  || Objects.equals(op6, 10)) {
            poiInput.sendKeys("Times");
            wdw.until(ExpectedConditions.visibilityOf(timesSelect));
            timesSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 11) || Objects.equals(op2, 11) ||Objects.equals(op3, 11) ||Objects.equals(op4, 11) || Objects.equals(op5, 11)  || Objects.equals(op6, 11)) {
            poiInput.sendKeys("The Brookl");
            wdw.until(ExpectedConditions.visibilityOf(bridgeSelect));
            bridgeSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 12) || Objects.equals(op2, 12) ||Objects.equals(op3, 12) ||Objects.equals(op4, 12) || Objects.equals(op5, 12)  || Objects.equals(op6, 12)) {
            poiInput.sendKeys("fifth");
            wdw.until(ExpectedConditions.visibilityOf(avenueSelect));
            avenueSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        randomClick.click();
    }
    public void selectAllOptions(int op1, int op2, int op3, int op4) {

        poiDropdown.click();
        poiInput.clear();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(poiInput));

        if (Objects.equals((op1), 1) || Objects.equals(op2, 1) ||Objects.equals(op3, 1) ||Objects.equals(op4, 1)) {
            poiInput.sendKeys("statue");
            wdw.until(ExpectedConditions.visibilityOf(statueSelect));
            statueSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 2) || Objects.equals(op2, 2) ||Objects.equals(op3, 2) ||Objects.equals(op4, 2)) {
            poiInput.sendKeys("central");
            wdw.until(ExpectedConditions.visibilityOf(parkSelect));
            parkSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 3) || Objects.equals(op2, 3) ||Objects.equals(op3, 3) ||Objects.equals(op4, 3)) {
            poiInput.sendKeys("Rock");
            wdw.until(ExpectedConditions.visibilityOf(rockefellerSelect));
            rockefellerSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 4) || Objects.equals(op2, 4) ||Objects.equals(op3, 4) ||Objects.equals(op4, 4)) {
            poiInput.sendKeys("The me");
            wdw.until(ExpectedConditions.visibilityOf(metSelect));
            metSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 5) || Objects.equals(op2, 5) ||Objects.equals(op3, 5) ||Objects.equals(op4, 5)) {
            poiInput.sendKeys("Broad");
            wdw.until(ExpectedConditions.visibilityOf(broadwaySelect));
            broadwaySelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 6) || Objects.equals(op2, 6) ||Objects.equals(op3, 6) ||Objects.equals(op4, 6)) {
            poiInput.sendKeys("The emp");
            wdw.until(ExpectedConditions.visibilityOf(empireSelect));
            empireSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 7) || Objects.equals(op2, 7) ||Objects.equals(op3, 7) ||Objects.equals(op4, 7)) {
            poiInput.sendKeys("9/11");
            wdw.until(ExpectedConditions.visibilityOf(memoriaSelect));
            memoriaSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 8) || Objects.equals(op2, 8) ||Objects.equals(op3, 8) ||Objects.equals(op4, 8) ) {
            poiInput.sendKeys("the high");
            wdw.until(ExpectedConditions.visibilityOf(highlineSelect));
            highlineSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 9) || Objects.equals(op2, 9) ||Objects.equals(op3, 9) ||Objects.equals(op4, 9) ) {
            poiInput.sendKeys("the museum");
            wdw.until(ExpectedConditions.visibilityOf(museumSelect));
            museumSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 10) || Objects.equals(op2, 10) ||Objects.equals(op3, 10) ||Objects.equals(op4, 10)) {
            poiInput.sendKeys("Times");
            wdw.until(ExpectedConditions.visibilityOf(timesSelect));
            timesSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 11) || Objects.equals(op2, 11) ||Objects.equals(op3, 11) ||Objects.equals(op4, 11)) {
            poiInput.sendKeys("The Brookl");
            wdw.until(ExpectedConditions.visibilityOf(bridgeSelect));
            bridgeSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 12) || Objects.equals(op2, 12) ||Objects.equals(op3, 12) ||Objects.equals(op4, 12)) {
            poiInput.sendKeys("fifth");
            wdw.until(ExpectedConditions.visibilityOf(avenueSelect));
            avenueSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        randomClick.click();
    }
    public void selectAllOptions(int op1, int op2, int op3, int op4, int op5) {

        poiDropdown.click();
        poiInput.clear();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(poiInput));

        if (Objects.equals((op1), 1) || Objects.equals(op2, 1) ||Objects.equals(op3, 1) ||Objects.equals(op4, 1) || Objects.equals(op5, 1)) {
            poiInput.sendKeys("statue");
            wdw.until(ExpectedConditions.visibilityOf(statueSelect));
            statueSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 2) || Objects.equals(op2, 2) ||Objects.equals(op3, 2) ||Objects.equals(op4, 2) || Objects.equals(op5, 2)) {
            poiInput.sendKeys("central");
            wdw.until(ExpectedConditions.visibilityOf(parkSelect));
            parkSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 3) || Objects.equals(op2, 3) ||Objects.equals(op3, 3) ||Objects.equals(op4, 3) || Objects.equals(op5, 3)) {
            poiInput.sendKeys("Rock");
            wdw.until(ExpectedConditions.visibilityOf(rockefellerSelect));
            rockefellerSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 4) || Objects.equals(op2, 4) ||Objects.equals(op3, 4) ||Objects.equals(op4, 4) || Objects.equals(op5, 4)) {
            poiInput.sendKeys("The me");
            wdw.until(ExpectedConditions.visibilityOf(metSelect));
            metSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 5) || Objects.equals(op2, 5) ||Objects.equals(op3, 5) ||Objects.equals(op4, 5) || Objects.equals(op5, 5)) {
            poiInput.sendKeys("Broad");
            wdw.until(ExpectedConditions.visibilityOf(broadwaySelect));
            broadwaySelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        if (Objects.equals((op1), 6) || Objects.equals(op2, 6) ||Objects.equals(op3, 6) ||Objects.equals(op4, 6) || Objects.equals(op5, 6)) {
            poiInput.sendKeys("The emp");
            wdw.until(ExpectedConditions.visibilityOf(empireSelect));
            empireSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 7) || Objects.equals(op2, 7) ||Objects.equals(op3, 7) ||Objects.equals(op4, 7) || Objects.equals(op5, 7)) {
            poiInput.sendKeys("9/11");
            wdw.until(ExpectedConditions.visibilityOf(memoriaSelect));
            memoriaSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 8) || Objects.equals(op2, 8) ||Objects.equals(op3, 8) ||Objects.equals(op4, 8) || Objects.equals(op5, 8)) {
            poiInput.sendKeys("the high");
            wdw.until(ExpectedConditions.visibilityOf(highlineSelect));
            highlineSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 9) || Objects.equals(op2, 9) ||Objects.equals(op3, 9) ||Objects.equals(op4, 9) || Objects.equals(op5, 9)) {
            poiInput.sendKeys("the museum");
            wdw.until(ExpectedConditions.visibilityOf(museumSelect));
            museumSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 10) || Objects.equals(op2, 10) ||Objects.equals(op3, 10) ||Objects.equals(op4, 10) || Objects.equals(op5, 10)) {
            poiInput.sendKeys("Times");
            wdw.until(ExpectedConditions.visibilityOf(timesSelect));
            timesSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 11) || Objects.equals(op2, 11) ||Objects.equals(op3, 11) ||Objects.equals(op4, 11) || Objects.equals(op5, 11)) {
            poiInput.sendKeys("The Brookl");
            wdw.until(ExpectedConditions.visibilityOf(bridgeSelect));
            bridgeSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }

        if (Objects.equals((op1), 12) || Objects.equals(op2, 12) ||Objects.equals(op3, 12) ||Objects.equals(op4, 12) || Objects.equals(op5, 12)) {
            poiInput.sendKeys("fifth");
            wdw.until(ExpectedConditions.visibilityOf(avenueSelect));
            avenueSelect.click();
            poiInput.sendKeys(Keys.BACK_SPACE);
            poiDropdown.click();
        }
        randomClick.click();
    }

    public void clickStopsButton() {
        stopsButton.click();

    }
    public void clickGuidesButton(){
        guidesButton.click();
    }
    public void clickMyToursButton(){
        myToursButton.click();
    }
    public void clickHomeButton(){
        homeButton.click();
    }
    public void clickLogoutButton(){
        logoutButton.click();
    }
}
