package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    //* Click on Login button
    By clickOnLoginButton= By.xpath("//input[@class='button button-primary g-recaptcha']");
    public void signInButton(){
        clickOnElement(clickOnLoginButton);
    }
    By emailField=By.id("user[email]");
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }
    By passwordField=By.id("user[password]");
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    //click on signIn button
    By clickOnSignInField=By.xpath("//input[@data-callback='onSubmit']");
    public void clickOnSignIn(){
        clickOnElement(clickOnSignInField);
    }
    //* Verify the error message ‘Invalid email or password.’
    By getTextMessage1=By.xpath("//li[contains(text(),'Invalid email or password.')]");
    public String getVerifyTextMessage1(){
        return getTextFromElement(getTextMessage1);
    }


}
