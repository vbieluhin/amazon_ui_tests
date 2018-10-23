package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(xpath = ".//input[@id='ap_email']")
    private WebElement emailField;

    @FindBy(xpath = ".//input[@id='ap_password']")
    private WebElement passwordField;

    @FindBy(xpath = ".//input[@id='signInSubmit']")
    private WebElement signInButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public MainPage signInWithCredentials(String login, String password) {
        waitForElementDisplayed(emailField);
        emailField.sendKeys(login);
        passwordField.sendKeys(password);
        click(signInButton);
        return new MainPage(driver);
    }
}
