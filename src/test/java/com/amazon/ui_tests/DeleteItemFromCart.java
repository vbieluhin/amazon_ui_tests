package com.amazon.ui_tests;

import com.amazon.BaseTest;
import com.amazon.pages.CartPage;
import com.amazon.pages.MainPage;
import org.junit.Assert;
import org.junit.Test;

public class DeleteItemFromCart extends BaseTest {

    @Test
    public void deleteItemFromTest() {
        String searchItem = "Docker Deep Dive";

        MainPage mainPage = new MainPage();
        CartPage cartPage = new CartPage();

        mainPage.openBaseURL()
                .searchForItem(searchItem)
                .clickOnItemWithText(searchItem)
                .addItemToCart()
                .proceedToCart()
                .deleteFirstItemFromCart();
        Assert.assertEquals("Wrong number of items in cart!",
                0, cartPage.getNumberOfItemsInCart());
    }
}
