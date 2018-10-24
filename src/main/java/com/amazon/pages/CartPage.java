package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(xpath = "//*[@class='sc-product-image']")
    private List<WebElement> cartItemImages;

    @FindBy(xpath = "//input[@value='Delete']")
    private WebElement deleteItemFromCartButton;

    @FindBy(xpath = "//input[@value='Delete']")
    private List<WebElement> deleteItemFromCartButtonList;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int getNumberOfItemsInCart() {
        //TODO: remove sleep
        sleep(800);
        return cartItemImages.size();
    }

    public CartPage deleteFirstItemFromCart() {
        click(deleteItemFromCartButton);
        return this;
    }

    public CartPage deleteAllItemsFromCart() {
        for(WebElement element: deleteItemFromCartButtonList) {
            click(element);
        }
        return this;
    }
}
