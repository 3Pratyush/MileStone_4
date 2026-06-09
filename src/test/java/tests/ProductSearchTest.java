package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductsPage;

public class ProductSearchTest extends BaseTest {

    @Test
    public void searchProductTest() {

        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        ProductsPage products = new ProductsPage(driver);

        Assert.assertTrue(
            products.isProductDisplayed("Sauce Labs Backpack")
        );
    }
}
