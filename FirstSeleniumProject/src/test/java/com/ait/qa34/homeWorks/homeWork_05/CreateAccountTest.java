package com.ait.qa34.homeWorks.homeWork_05;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTest extends BasePage {

    @Test
    public void createNewAccountPositiveTest() {

        Random random = new Random();
        int i = random.nextInt(1000)+1000;

        click(By.cssSelector("[href='/register']"));

        type(By.id("FirstName"), "Vincent");

        type(By.id("LastName"), "Vega");

        type(By.id("Email"), "pulp_fiction" + i +"@gmail.com");

        type(By.id("Password"), "Chelsea$1905");

        type(By.id("ConfirmPassword"), "Chelsea$1905");

        click(By.id("register-button"));

        Assert.assertTrue(isElementPresent(By.xpath("//a[.='pulp_fiction" + i +"@gmail.com']")));
    }
}
