package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//*[@id='nav-link-accountList']/span[2]")
    private WebElement loginPageButon;

    @FindBy(xpath = "//*[@id='nav-link-accountList']/span[1]")
    private WebElement userBar;

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
        String message = userBar.getText();
        return message.substring(message.indexOf(" ") + 1);
    }
}
