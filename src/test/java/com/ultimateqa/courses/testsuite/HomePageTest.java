package com.ultimateqa.courses.testsuite;

import com.google.common.base.Verify;
import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
       //* click on the ‘Sign In’ link
        HomePage homePage = new HomePage();
        homePage.setClickOnSignInLink();

        // * Verify the text ‘Welcome Back!’
        String expectedErrorMessage = "Welcome Back!";
        Assert.assertEquals(homePage.getVerifyTextMessage(), expectedErrorMessage, "Error message not displayed");

    }





}
