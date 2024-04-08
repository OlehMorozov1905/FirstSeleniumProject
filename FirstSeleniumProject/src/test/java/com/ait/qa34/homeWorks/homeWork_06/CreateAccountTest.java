package com.ait.qa34.homeWorks.homeWork_06;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateAccountTest extends BasePage {

    @Test(enabled = false)
    public void createNewAccountPositiveTest() {

        clickOnRegisterLink();

        fillRegisterForm(new User()
                .setFirstName("Vincent")
                .setLastName("Vega")
                .setEmail("pulp_fiction2024@gmail.com")
                .setPassword("Chelsea$1905")
                .setPassword("Chelsea$1905"));

        clickOnRegistrationButton();

        Assert.assertTrue(isElementPresent());
    }
}
