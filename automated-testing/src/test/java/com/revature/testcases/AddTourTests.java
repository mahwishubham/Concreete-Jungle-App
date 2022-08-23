//package com.revature.testcases;
//
//import com.revature.pages.AddTourPage;
//import com.revature.pages.LoginPage;
//import com.revature.pages.MyToursPage;
//import io.github.bonigarcia.wdm.WebDriverManager;
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
//public class AddTourTests {
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
//    public void clickStopsButton() {
//
//        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
//
//        AddTourPage addTourPage = new AddTourPage(driver);
//        MyToursPage myToursPage = new MyToursPage(driver);
//        myToursPage.clickAddTour();
//
//        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
//        wdw.until(ExpectedConditions.urlContains("addTour.html"));
//
//        myToursPage.clickStopButton();
//
//        String actual = driver.getCurrentUrl();
//        String expected = "http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/index.html#pois";
//        Assert.assertEquals(actual, expected);
//    }
//}
