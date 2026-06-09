package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.CheckoutPage;
import pages.ConfirmationPage;
import pages.LoginPage;
import pages.ProductsPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void completeCheckoutFlow() {

        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        ProductsPage products = new ProductsPage(driver);

        products.addBackpackToCart();

        CartPage cart = products.goToCart();

        CheckoutPage checkout = cart.clickCheckout();

        ConfirmationPage confirmation =
                checkout.enterDetails(
                        "Pratyush",
                        "Sahoo",
                        "751001");

        Assert.assertEquals(
                confirmation.getConfirmationMessage(),
                "Thank you for your order!");
    }
}
