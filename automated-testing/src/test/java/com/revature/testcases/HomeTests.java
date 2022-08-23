//package com.revature.testcases;
//
//import com.revature.pages.HomePage;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
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
//
//public class HomeTests {
//    public WebDriver driver;
//
//    Logger logger = LoggerFactory.getLogger(HomeTests.class);
//
////
////    @BeforeMethod
////    public void beforeMethod() {
////        WebDriverManager.chromedriver().setup();
////
////        ChromeOptions options = new ChromeOptions();
////        options.addArguments("−−incognito");
////        driver = new ChromeDriver(options);
////    }
////
////    @AfterMethod
////    public void afterMethod() {
////        driver.quit();
////
////    }
//
//    @Test
//    public void clickTours(){
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html");
//        HomePage homePage = new HomePage(driver);
//        homePage.clickToursButton();
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("#home"));
//
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html#home";
//        Assert.assertEquals(actual, expected);
//    }
//    @Test
//    public void clickCurrentTours(){
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html");
//        HomePage homePage = new HomePage(driver);
//        homePage.clickCurrentButton();
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("tours.html"));
//
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/tours.html";
//        Assert.assertEquals(actual, expected);
//    }
//    @Test
//    public void clickStops(){
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html");
//        HomePage homePage = new HomePage(driver);
//        homePage.clickStopsButton();
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
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html");
//        HomePage homePage = new HomePage(driver);
//        homePage.clickGuidesButton();
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("#guides"));
//
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html#guides";
//        Assert.assertEquals(actual, expected);
//    }
//
//    @Test
//    public void clickRegister(){
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html");
//        HomePage homePage = new HomePage(driver);
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.id("register")));
//        homePage.clickRegisterButton();
//
//
//        wdw.until(ExpectedConditions.urlContains("com.revature.steps.registration.html"));
//
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/registration.html";
//        Assert.assertEquals(actual, expected);
//    }
//    @Test
//    public void clickLogin(){
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html");
//        HomePage homePage = new HomePage(driver);
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));
//        homePage.clickLoginButton();
//
//
//        wdw.until(ExpectedConditions.urlContains("login.html"));
//
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html";
//        Assert.assertEquals(actual, expected);
//    }
//}
