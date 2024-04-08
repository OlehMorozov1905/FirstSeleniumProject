package com.ait.qa34.homeWorks.homeWork_06;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCart extends BasePage{

    @BeforeMethod
    public void ensurePrecondition() {

        clickOnLoginLink();
        fillLoginForm(new User()
                .setEmail("pulp_fiction2024@gmail.com")
                .setPassword("Chelsea$1905"));
        clickOnLoginButton();
    }

    @Test
    public void AddItemToCartPositiveTest() {
        click(By.xpath("(//input[@type='button'])[4]"));

    }
}
