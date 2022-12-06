package com.ultimateqa.courses.testsuite;

import com.google.common.base.Verify;
import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.omg.CORBA.DynAnyPackage.Invalid;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyTheErrorMessage() {

        //* click on the ‘Sign In’ link
        homePage.setClickOnSignInLink();
       //Enter invalid username
        loginPage.enterEmail("123abc@gmail.com");
        // Enter invalid password
        loginPage.enterPassword("abc123");
        //Click on Login button
        loginPage.clickOnSignIn();
        // * Verify the error message ‘Invalid email or password.
        String expectedMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.getVerifyTextMessage1(), expectedMessage, "Message is not displayed");

    }

}
