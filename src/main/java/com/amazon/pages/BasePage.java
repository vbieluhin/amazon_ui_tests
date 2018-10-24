package com.amazon.pages;

import com.amazon.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class BasePage {
    private static final long EXPLICIT_WAIT = 5;
    private WebDriver driver;
    private WebDriverWait wait;

    BasePage() {
        this.driver = WebDriverFactory.getChromeDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, EXPLICIT_WAIT);
    }

    public MainPage openBaseURL() {
        driver.get("https://amazon.com");
        return new MainPage();
    }

    void click(WebElement element) {
        waitForElementDisplayed(element);
        element.click();
    }

    void sendKeys(WebElement element, String text) {
        waitForElementDisplayed(element);
        element.clear();
        element.sendKeys(text);
    }

    /**
     * Waiters
     */

    private void waitForElementDisplayed(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void sleep(int milliseconds) {
        System.out.println("Sleeping " + milliseconds + " milliseconds");
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {}
    }
}
