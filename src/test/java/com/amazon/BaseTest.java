package com.amazon;

import com.amazon.utils.WebDriverFactory;
import org.junit.After;

public abstract class BaseTest {

    @After
    public void tearDown() {
        if (WebDriverFactory.getChromeDriver() != null) {
            WebDriverFactory.getChromeDriver().quit();
        }
    }
}
