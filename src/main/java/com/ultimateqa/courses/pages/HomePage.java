package com.ultimateqa.courses.pages;

import com.google.common.base.Verify;
import com.ultimateqa.courses.utility.Utility;
import org.omg.CORBA.DynAnyPackage.Invalid;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //* click on the ‘Sign In’ link
    By clickOnSignInLink = By.linkText("Sign In");

    public void setClickOnSignInLink() {
        clickOnElement(clickOnSignInLink);
    }

    // * Verify the text ‘Welcome Back!’
    By verifyTextMessage = By.xpath("//h1[contains(text(),'Welcome Back!')]");

    public String getVerifyTextMessage() {
        return getTextFromElement(verifyTextMessage);
    }


    //* Enter invalid username
    By clickOnEmailField = By.id("user[email]");

    public void emailField(String email) {
        sendTextToElement(clickOnEmailField, email);
    }

    //* Enter invalid password
    By clickOnPasswordField = By.id("user[password]");

    public void passwordField(String password) {
        sendTextToElement(clickOnPasswordField, password);
    }


}
