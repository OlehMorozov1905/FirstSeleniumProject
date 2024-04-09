package com.ait.qa34.homeWorks.homeWork_07;

import com.demowebshop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CreateAccountTests extends BasePage {
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLoginLinkPresent()) {
            app.getUser().clickOnLogOutButton();
        }
    }

    @Test(enabled = false)
    public void createNewAccountPositiveTest() {

        app.getUser().clickOnRegisterLink();

        app.getUser().fillRegisterForm(new User()
                .setFirstName("Vincent")
                .setLastName("Vega")
                .setEmail("pulp_fiction2024@gmail.com")
                .setPassword("Chelsea$1905")
                .setPassword("Chelsea$1905"));

        app.getUser().clickOnRegistrationButton();

        Assert.assertTrue(app.getUser().isAccountEmailPresent());
    }

    @Test
    public void createNewAccountWithExistedEmailNegativeTest() {
        app.getUser().clickOnRegisterLink();

        app.getUser().fillRegisterForm(new User()
                .setFirstName("Vincent")
                .setLastName("Vega")
                .setEmail("pulp_fiction2024@gmail.com")
                .setPassword("Chelsea$1905")
                .setPassword("Chelsea$1905"));

        app.getUser().clickOnRegistrationButton();

        Assert.assertTrue(app.getUser().isErrorMessagePresent());

    }
}
