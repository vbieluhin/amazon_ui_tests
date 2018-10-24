package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = "//*[@id='nav-link-accountList']//following-sibling::span[@class='nav-icon nav-arrow']")
    private WebElement loginPageButon;

    @FindBy(xpath = "//*[@id='nav-link-accountList']//following-sibling::span[@class='nav-line-1']")
    private WebElement userBar;

    @FindBy(xpath = "//*[@class='feed-carousel-card']")
    private List<WebElement> carouselItems;

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    private WebElement searchBar;

    @FindBy(xpath = "//input[@class='nav-input' and @type='submit']")
    private WebElement searchButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage openLoginPage() {
        click(loginPageButon);
        return new SignInPage(driver);
    }

    public String getUserName() {
        return userBar.getText().split(" ")[1];
    }

    public SearchPage serchForItem(String itemName) {
        sendKeys(searchBar, itemName);
        click(searchButton);
        return new SearchPage(driver);
    }
}
