package com.ait.qa34.homeWorks.homeWork_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BasePage {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void clickOnLoginButton() {
        click(By.cssSelector("[class='button-1 login-button']"));
    }

    public void fillLoginForm(User user) {
        type(By.name("Email"), user.getEmail());
        type(By.name("Password"), user.getPassword());
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }

    public void fillRegisterForm(User user) {
        type(By.id("FirstName"), user.getFirstName());
        type(By.id("LastName"), user.getLastName());
        type(By.id("Email"), user.getEmail());
        type(By.id("Password"), user.getPassword());
        type(By.id("ConfirmPassword"), user.getPassword());
    }

//    public void fillRegisterForm() {
//        type(By.id("FirstName"), "Vincent");
//        type(By.id("LastName"), "Vega");
//        type(By.id("Email"), "pulp_fiction2024@gmail.com");
//        type(By.id("Password"), "Chelsea$1905");
//        type(By.id("ConfirmPassword"), "Chelsea$1905");
//    }

    public void clickOnRegistrationButton() {
        click(By.id("register-button"));
    }

    public boolean isElementPresent() {
        return isElementPresent(By.xpath("//a[.='pulp_fiction2024@gmail.com']"));
    }
}

