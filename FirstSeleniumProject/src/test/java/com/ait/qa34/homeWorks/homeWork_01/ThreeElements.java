package com.ait.qa34.homeWorks.homeWork_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ThreeElements {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTagName() {

        WebElement formElement = driver.findElement(By.tagName("form"));
        System.out.println("One unique element: " + formElement.getTagName());

        System.out.println("================= all h2 tag names =================");
        List<WebElement> h2Elements = driver.findElements(By.tagName("h2"));
        for (int i = 0; i < h2Elements.size(); i++) {
            WebElement element = h2Elements.get(i);
            System.out.println(element.getText());
        }

        System.out.println("================= all h3 tag names =================");
        List<WebElement> h3Elements = driver.findElements(By.tagName("h3"));
        for (WebElement element : h3Elements) {
            System.out.println(element.getText());
        }


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
