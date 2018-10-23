package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {

    @FindBy(xpath = "//*[@id='add-to-cart-button']")
    private WebElement addToCartButton;

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public CartConfirmationPage addItemToCart() {
        click(addToCartButton);
        return new CartConfirmationPage(driver);
    }
}
