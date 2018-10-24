package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class BasePage {
    private static final long EXPLICIT_WAIT = 5;
    WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public MainPage openBaseURL() {
        driver.get("https://amazon.com");
        return new MainPage(driver);
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
        WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void sleep(int milliseconds) {
        System.out.println("Sleeping " + milliseconds + " milliseconds");
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {}
    }
}
