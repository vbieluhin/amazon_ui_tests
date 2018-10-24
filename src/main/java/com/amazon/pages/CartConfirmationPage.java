package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartConfirmationPage extends BasePage {

    @FindBy(xpath = "//*[@id='hlb-view-cart-announce']")
    private WebElement proceedToCartButton;

    public CartPage proceedToCart() {
        click(proceedToCartButton);
        return new CartPage();
    }
}
