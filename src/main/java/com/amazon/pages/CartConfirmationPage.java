package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartConfirmationPage extends BasePage {

    @FindBy(xpath = "//*[@id='hlb-view-cart-announce']")
    private WebElement proceedToCartButton;

    public CartConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public CartPage proceedToCart() {
        click(proceedToCartButton);
        return new CartPage(driver);
    }
}
