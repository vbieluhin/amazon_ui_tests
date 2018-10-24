package com.amazon;

import com.amazon.utils.WebDriverFactory;
import org.junit.After;
import org.junit.Before;

public abstract class BaseTest {

    @Before
    public void setUp() {
        WebDriverFactory.setChromeDriver();
    }

    @After
    public void tearDown() {
        if (WebDriverFactory.getChromeDriver() != null) {
            WebDriverFactory.getChromeDriver().quit();
        }
    }
}
