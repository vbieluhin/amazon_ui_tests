package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {

    @FindBy(xpath = "//*[@id='add-to-cart-button']")
    private WebElement addToCartButton;

    public CartConfirmationPage addItemToCart() {
        click(addToCartButton);
        return new CartConfirmationPage();
    }
}
