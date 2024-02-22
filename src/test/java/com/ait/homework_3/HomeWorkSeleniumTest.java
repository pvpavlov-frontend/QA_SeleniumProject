package com.ait.homework_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWorkSeleniumTest {

    WebDriver webDriver;

    @BeforeMethod
    public void setUp(){
        webDriver = new ChromeDriver();
        webDriver.navigate().to("https://demowebshop.tricentis.com/");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
    }
    @Test
    public void openDemoWebShop(){
        System.out.println("DemoWebShop opened!");
    }
    @AfterMethod
    public void tearDown(){
        webDriver.close();
    }
}
