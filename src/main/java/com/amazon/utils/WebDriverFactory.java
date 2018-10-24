package com.amazon.utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    private static final long IMPLICIT_WAIT = 2;
    private static WebDriver driver = getChromeDriver();

    private static WebDriver initChromeDriver() {
        WebDriver driver;
        ChromeDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("start-maximized");
        driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }

    public static void setChromeDriver() {
        driver = initChromeDriver();
    }

    public static WebDriver getChromeDriver() {
        return driver;
    }
}
