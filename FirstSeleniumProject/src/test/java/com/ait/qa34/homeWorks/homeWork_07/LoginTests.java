package com.ait.qa34.homeWorks.homeWork_07;

import com.demowebshop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BasePage {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnLogOutButton();
        }
    }

    @Test
    public void loginPositiveTest() {
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(new User()
                .setEmail("pulp_fiction2024@gmail.com")
                .setPassword("Chelsea$1905"));
        app.getUser().clickOnLoginButton();

        Assert.assertTrue(app.getUser().isAccountEmailPresent());
    }

    @Test
    public void loginNegativeTestWithWrongPassword() {
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(new User()
                .setEmail("pulp_fiction2024@gmail.com")
                .setPassword("WrongPassword"));
        app.getUser().clickOnLoginButton();

        Assert.assertTrue(app.getUser().isErrorMessagePresent());
    }
}
