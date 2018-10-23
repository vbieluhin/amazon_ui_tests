package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(xpath = "//*[@class='sc-product-image']")
    private List<WebElement> cartItemImages;

    @FindBy(xpath = "//*[@id='activeCartViewForm']//span[1]/span/input")
    private WebElement deleteItemFromCartButton;

    @FindBy(xpath = "//*[@id='activeCartViewForm']//span[1]/span/input")
    private List<WebElement> deleteItemFromCartButtonList;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int getNumberOfItemsInCart() {
        //TODO: remove sleep
        sleep(600);
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
