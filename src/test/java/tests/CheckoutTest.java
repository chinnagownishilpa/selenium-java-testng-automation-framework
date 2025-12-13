package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CheckoutPage;
import pages.LoginPage;
import utils.ConfigReader;

public class CheckoutTest extends BaseTest {

    @Test
    public void verifyCheckoutFlow() {
        LoginPage login = new LoginPage(driver);
        login.login(
                ConfigReader.get("username"),
                ConfigReader.get("password")
        );

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.checkoutFlow();

        Assert.assertTrue(driver.getPageSource().contains("Checkout"));
    }
}
