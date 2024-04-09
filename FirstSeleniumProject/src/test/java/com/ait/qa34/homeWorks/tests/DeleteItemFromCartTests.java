package com.ait.qa34.homeWorks.tests;

import com.demowebshop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteItemFromCartTests extends BasePage {

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

        app.getUser().clickOnButtonAddItemToCartAndViewShoppingCart();
    }

    @Test
    public void deleteItemPositiveTest() {
        int sizeBefore = app.getUser().sizeOfItems();
        app.getUser().removeItem();

        app.getUser().pause(500);
        int sizeAfter = app.getUser().sizeOfItems();
        Assert.assertEquals(sizeAfter, sizeBefore - 1);
    }
}
