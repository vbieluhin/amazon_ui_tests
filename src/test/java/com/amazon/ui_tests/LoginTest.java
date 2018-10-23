package com.amazon.ui_tests;

import com.amazon.BaseTest;
import com.amazon.pages.MainPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest() {
        String userEmail = "uitestamazon@yopmail.com";
        String userPassword = "qwerty!";
        String userName = "Test";

        MainPage mainPage = new MainPage(driver);

        mainPage.openBaseURL()
                .openLoginPage()
                .signInWithCredentials(userEmail, userPassword);
        Assert.assertEquals("User is not signed in or userName is incorrect",
                mainPage.getUserName(), userName);
    }
}
