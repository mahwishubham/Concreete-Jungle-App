//package com.revature.testcases;
//
//import com.revature.pages.LoginPage;
//import com.revature.pages.MyToursPage;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//public class MyToursTests {
//
//    public WebDriver driver;
//
//    Logger logger = LoggerFactory.getLogger(MyToursTests.class);
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
//    public void clickStopButton() throws InterruptedException {
//
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        MyToursPage myToursPage = new MyToursPage(driver);
//
//        Thread.sleep(2000);
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("mytours.html"));
//
//        myToursPage.clickStopButton();
//
//        wdw.until(ExpectedConditions.urlContains("index.html"));
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html#pois";
//        Assert.assertEquals(actual, expected);
//    }
//
//    @Test
//    public void clickGuideButton() {
//
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        MyToursPage myToursPage = new MyToursPage(driver);
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("tours.html"));
//
//        myToursPage.clickGuideButton();
//
//        wdw.until(ExpectedConditions.urlContains("#guides"));
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html#guides";
//        Assert.assertEquals(actual, expected);
//    }
//    @Test
//    public void clickLogoutButton() {
//
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        MyToursPage myToursPage = new MyToursPage(driver);
//
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("tours.html"));
//
//        myToursPage.clickLogoutButton();
////      alert needs to be accepted
////        wdw.until(ExpectedConditions.urlContains("login.html"));
////        String actual = driver.getCurrentUrl();
////        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html";
////        Assert.assertEquals(actual, expected);
//    }
//
//    @Test
//    public void clickHomeButton() {
//
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        MyToursPage myToursPage = new MyToursPage(driver);
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("tours.html"));
//
//        myToursPage.clickHomeButton();
//
//        wdw.until(ExpectedConditions.urlContains("index.html"));
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html";
//        Assert.assertEquals(actual, expected);
//    }
//    @Test
//    public void clickAllToursButton() {
//
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        MyToursPage myToursPage = new MyToursPage(driver);
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("tours.html"));
//
//        myToursPage.clickAllTours();
//
//        wdw.until(ExpectedConditions.urlContains("tours.html"));
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/tours.html";
//        Assert.assertEquals(actual, expected);
//    }
//    @Test
//    public void clickAddToursButton() {
//
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        MyToursPage myToursPage = new MyToursPage(driver);
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("mytours.html"));
//
//        myToursPage.clickAddTour();
//
//        wdw.until(ExpectedConditions.urlContains("addTour.html"));
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/addTour.html";
//        Assert.assertEquals(actual, expected);
//    }
//    @Test
//    public void clickFirstUpdateButton() {
//
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        MyToursPage myToursPage = new MyToursPage(driver);
//
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("mytours.html"));
//// validate that there is a tour to be updated
//        myToursPage.clickUpdateFirstButton();
//
//        wdw.until(ExpectedConditions.urlContains("update.html"));
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/update.html";
//        Assert.assertEquals(actual, expected);
//    }
//    @Test
//    public void clickFirstDeleteButton() throws InterruptedException {
//
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        MyToursPage myToursPage = new MyToursPage(driver);
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//
//        wdw.until(ExpectedConditions.urlContains("mytours.html"));
//        //validation needed for a delete button
//        myToursPage.clickDeleteFirstButton();
//        Thread.sleep(2000);
//    }
//}