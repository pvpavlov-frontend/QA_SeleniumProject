package com.ait.homework_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomeWorkElementTests {
    static WebDriver webDriver;

    @BeforeTest
    public void setUp(){
        webDriver = new ChromeDriver();
        webDriver.get("https://demowebshop.tricentis.com/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void findElementByCssSelector(){
        webDriver.findElement(By.cssSelector("body"));
        webDriver.findElement(By.cssSelector("#small-searchterms"));
        webDriver.findElement(By.cssSelector(".top-menu"));
        webDriver.findElement(By.cssSelector("[href=\"/computers\"]"));
    }
    @Test
    public void findElementByXPath(){
        webDriver.findElement(By.xpath("//body"));
        webDriver.findElement(By.xpath("//*[@id='small-searchterms']"));
        webDriver.findElement(By.xpath("//*[@class='firstLevel']"));
        webDriver.findElement(By.xpath("//*[@href=\"/computers\"]"));
        webDriver.findElement(By.xpath("//*[text()='Newsletter']"));
        webDriver.findElement(By.xpath("//*[.='Find your car now!']"));
        webDriver.findElement(By.xpath("//*[contains(.,'poll')]"));
    }
    @AfterMethod
    public void tearDown() {
        webDriver.quit();
    }
}
