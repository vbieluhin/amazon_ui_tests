package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(xpath = "//*[@class='sc-product-image']")
    private List<WebElement> cartItemImages;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int getNumberOfItemsInCart() {
        return cartItemImages.size();
    }
}
