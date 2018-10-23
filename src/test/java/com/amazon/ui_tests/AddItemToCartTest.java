package com.amazon.ui_tests;

import com.amazon.BaseTest;
import com.amazon.pages.CartPage;
import com.amazon.pages.MainPage;
import org.junit.Assert;
import org.junit.Test;

public class AddItemToCartTest extends BaseTest {

    @Test
    public void addItemToCartTest() {
        String searchItem = "Docker Deep Dive";

        MainPage mainPage = new MainPage(driver);
        CartPage cartPage = new CartPage(driver);

        mainPage.openBaseURL()
                .serchForItem(searchItem)
                .clickOnItemWithText(searchItem)
                .addItemToCart()
                .proceedToCart();
        Assert.assertEquals("Wrong number of items in cart!",
                cartPage.getNumberOfItemsInCart(), 1);
    }
}
