package com.ait.qa31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {

    static WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");

        //maximize browser to window size
        driver.manage().window().maximize();
        //wait for all elements on the page to load before starting test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void findElementByTagName(){
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());
        WebElement element1 = driver.findElement(By.tagName("a"));

        System.out.println(element1.getText());
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

    }
    @Test
    public void findElementBySampleLocator(){
        driver.findElement(By.id("city"));
        WebElement element = driver.findElement(By.className("navigation-link"));
        System.out.println(element.getText());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
