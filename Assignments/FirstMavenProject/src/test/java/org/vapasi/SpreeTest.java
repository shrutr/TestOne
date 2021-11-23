package org.vapasi;

import Pages.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class SpreeTest extends BaseTest {


    @Test()
    public void SpreeApplication() throws IOException {

        //1. Login Page
        LoginPage loginPage = new LoginPage(driver);
        loginPage.spreeLogin("hello123456789@gmail.com", "password12345678");

        //2. Assertion on Home Page
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.spreeHome(), "Logged in successfully");
        homePage.spreeHomeClick();
        homePage.screenShot(driver, "/Users/shrutigupta/test1.png");

        //3. Category Page
        CategoryPage categoryPage = new CategoryPage(driver);
        categoryPage.selectCategory();

        //4. From product details, Add to Cart
        ProductDetailPage productsPage = new ProductDetailPage(driver);
        productsPage.selectItems();

        //5. Assertion on Cart Page
        CartPage cartPage = new CartPage(driver);
        cartPage.cartTotal();
        //  Assert.assertEquals(cartPage.cartTotal(), "$63.96");
        cartPage.cartSubmit();

        //6. Checkout Address Page
        CheckoutAddressPage checkoutAddressPage = new CheckoutAddressPage(driver);
        checkoutAddressPage.addBillingAddress("Test", "One", "23, B9", "home", "Delhi", "985728");
        checkoutAddressPage.saveAddr();

        //7. Assertion on Checkout Delivery Page
        CheckoutDeliveryPage checkoutDeliveryPage = new CheckoutDeliveryPage(driver);
        Assert.assertEquals(checkoutDeliveryPage.deliveryPageReview(), "Delivery");
        checkoutDeliveryPage.deliveryPage();

        //8. Checkout Payment Page
        CheckoutPaymentPage checkoutPaymentPage = new CheckoutPaymentPage(driver);
        Assert.assertEquals(checkoutPaymentPage.paymentPage(), "Payment Information");
        checkoutPaymentPage.selectPaymentMode();
        System.out.println("Payment Page");

        //9. Order Confirmation Page
        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
        Assert.assertEquals(orderConfirmationPage.orderConfirm(), "Your order has been processed successfully");
        orderConfirmationPage.orderConfirm();
        orderConfirmationPage.logout();
        System.out.println("Confirmation Page");

        //10. Logout
        LogoutPage logoutPage = new LogoutPage(driver);
        Assert.assertEquals(logoutPage.logout(), "Signed out successfully.");
        logoutPage.logout();

    }


}
