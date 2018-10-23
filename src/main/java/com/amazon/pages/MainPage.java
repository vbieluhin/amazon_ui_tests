package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = "//*[@id='nav-link-accountList']/span[2]")
    private WebElement loginPageButon;

    @FindBy(xpath = "//*[@id='nav-link-accountList']/span[1]")
    private WebElement userBar;

    @FindBy(xpath = "//*[@class='feed-carousel-card']")
    private List<WebElement> carouselItems;

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    private WebElement searchBar;

    @FindBy(xpath = "//*[@id='nav-search']//div[2]//input")
    private WebElement searchButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openBaseURL() {
        driver.get("https://amazon.com");
        return this;
    }

    public SignInPage openLoginPage() {
        click(loginPageButon);
        return new SignInPage(driver);
    }

    public String getUserName() {
        return userBar.getText().split(" ")[1];
    }

    public SearchPage serchForItem(String item) {
        sendKeys(searchBar, item);
        click(searchButton);
        return new SearchPage(driver);
    }
}
