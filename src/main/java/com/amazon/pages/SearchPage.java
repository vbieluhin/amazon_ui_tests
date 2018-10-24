package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//a/h2")
    private List<WebElement> searchItems;

    public ItemPage clickOnItemWithText(String text) {
        click(searchItems.stream().filter(webElement -> webElement.getText().contains(text)).findAny().orElse(null));
        return new ItemPage();
    }
}
