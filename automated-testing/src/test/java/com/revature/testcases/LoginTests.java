//package com.revature.testcases;
//
//import com.revature.pages.LoginPage;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//@CucumberOptions(glue="com.revature.steps", features = {"src/test/resources/login.feature"})
//public class LoginTests extends AbstractTestNGCucumberTests {
//
//    public WebDriver driver;
//
//    Logger logger = LoggerFactory.getLogger(LoginTests.class);
//
//    @BeforeMethod
//    public void beforeMethod() {
//        WebDriverManager.chromedriver().setup();
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("−−incognito");
//        driver = new ChromeDriver(options);
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        driver.quit();
//
//    }
//
//    @Test
//    public void validLoginAsGuide() {
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.typeUsername("mc@a.ca");
//        loginPage.typePassword("password");
//
//        loginPage.clickLoginButton();
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("mytours.html"));
//
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/mytours.html";
//        Assert.assertEquals(actual, expected);
//    }
//
//    @Test
//    public void validLoginAsUser() {
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.typeUsername("jd03@a.ca");
//        loginPage.typePassword("password");
//
//        loginPage.clickLoginButton();
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("tours.html"));
//
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/tours.html";
//        Assert.assertEquals(actual, expected);
//    }
//
//    @Test
//    public void invalidUsernameInvalidPassword() {
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.typeUsername("fgdfljqwekr");
//        loginPage.typePassword("fasdfs");
//
//        loginPage.clickLoginButton();
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wdw.until(ExpectedConditions.alertIsPresent());
//
////        WebElement errorMessageParagraph = new Alert();
////        String actual = errorMessageParagraph.getText();
////        String expected = "Invalid username and/or password combination";
//
////        Assert.assertEquals(actual, expected);
//    }
//
//    @Test
//    public void validUsernameInvalidPassword() {
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.typeUsername("jd03@a.ca");
//        loginPage.typePassword("fasdfs");
//
//        loginPage.clickLoginButton();
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wdw.until(ExpectedConditions.alertIsPresent());
//
////        WebElement errorMessageParagraph = new Alert();
////        String actual = errorMessageParagraph.getText();
////        String expected = "Invalid username and/or password combination";
//
////        Assert.assertEquals(actual, expected);
//    }
//
//    @Test
//    public void invalidUsernameValidPassword() {
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.typeUsername("dfasdf");
//        loginPage.typePassword("Password!123");
//
//        loginPage.clickLoginButton();
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wdw.until(ExpectedConditions.alertIsPresent());
//
////        WebElement errorMessageParagraph = new Alert();
////        String actual = errorMessageParagraph.getText();
////        String expected = "Invalid username and/or password combination";
//
////        Assert.assertEquals(actual, expected);
//    }
//    @Test
//    public void emptyUsernameemptyPassword() {
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.typeUsername("");
//        loginPage.typePassword("");
//
//        loginPage.clickLoginButton();
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wdw.until(ExpectedConditions.alertIsPresent());
//
////        WebElement errorMessageParagraph = new Alert();
////        String actual = errorMessageParagraph.getText();
////        String expected = "Invalid username and/or password combination";
//
////        Assert.assertEquals(actual, expected);
//    }
//
//    @Test
//    public void clickTours(){
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.clickToursButton();
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("tours.html"));
//
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/tours.html";
//        Assert.assertEquals(actual, expected);
//    }
//
//    @Test
//    public void clickStops(){
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.clickStopsButton();
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("#pois"));
//
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html#pois";
//        Assert.assertEquals(actual, expected);
//    }
//    @Test
//    public void clickGuides(){
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.clickGuidesButton();
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("#guides"));
//
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html#guides";
//        Assert.assertEquals(actual, expected);
//    }
//    @Test
//    public void clickHome(){
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//        LoginPage loginPage = new LoginPage(driver);
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.id("home")));
//        loginPage.clickHomeButton();
//
//
//        wdw.until(ExpectedConditions.urlContains("index.html"));
//
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html";
//        Assert.assertEquals(actual, expected);
//    }
//      @Test
//    public void clickRegister(){
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//        LoginPage loginPage = new LoginPage(driver);
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.id("register")));
//        loginPage.clickRegisterButton();
//
//
//        wdw.until(ExpectedConditions.urlContains("com.revature.steps.registration.html"));
//
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/registration.html";
//        Assert.assertEquals(actual, expected);
//    }
//}