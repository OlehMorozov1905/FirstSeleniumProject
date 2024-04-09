package com.ait.qa34.homeWorks.tests;

import com.demowebshop.models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends BasePage {

    @BeforeMethod
    public void ensurePrecondition() {

        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnLogOutButton();
        }

        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(new User()
                .setEmail("pulp_fiction2024@gmail.com")
                .setPassword("Chelsea$1905"));
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void AddItemToCartPositiveTest() {
        app.getUser().clickOnButtonAddItemToCartAndViewShoppingCart();
        Assert.assertTrue(app.getUser().isItemAdded());

    }

    @AfterMethod
    public void postCondition() {
        app.getUser().removeItem();
    }
}
