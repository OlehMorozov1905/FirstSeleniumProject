package com.ait.qa34.homeWorks.homeWork_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class ElementsByCssSelector {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementCssSelector() {

        driver.findElement(By.cssSelector("#flyout-cart"));
        driver.findElement(By.cssSelector(".top-menu"));
        driver.findElement(By.cssSelector("[href='http://www.nopcommerce.com/']"));
        driver.findElement(By.cssSelector("[type*='script']"));
        driver.findElement(By.cssSelector("[style^='display']"));
        driver.findElement(By.cssSelector("[href$='use']"));
        driver.findElement(By.cssSelector(".footer > .footer-menu-wrapper"));
        driver.findElement(By.cssSelector(".header > .header-links-wrapper .mini-shopping-cart"));
        driver.findElement(By.cssSelector(".header > .header-links-wrapper .mini-shopping-cart >.count"));
        driver.findElement(By.cssSelector(".header .header-links #topcartlink"));

    }

    @Test
    public void findElementXPath() {

        driver.findElement(By.xpath("//*[@id='flyout-cart']"));
        driver.findElement(By.xpath("//*[@class='top-menu']"));
        driver.findElement(By.xpath("//*[@href='http://www.nopcommerce.com/']"));
        driver.findElement(By.xpath("//*[contains(@type,'script')]"));
        driver.findElement(By.xpath("//*[starts-with(@style,'display')]"));
        driver.findElement(By.xpath("//*[contains(text(),'use')]"));
        driver.findElement(By.xpath("//div[@class='footer']//div[@class='footer-menu-wrapper']"));
        driver.findElement(By.xpath("//div[@class='header']//div[@class='header-links-wrapper']//div[@class='mini-shopping-cart']"));
        driver.findElement(By.xpath("//div[@class='header']//div[@class='header-links-wrapper']//div[@class='mini-shopping-cart']//div[@class='count']"));
        driver.findElement(By.xpath("//div[@class='header']//div[@class='header-links']//*[@id='topcartlink']"));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
