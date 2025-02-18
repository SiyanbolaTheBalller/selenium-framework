package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPO {

    //Element Locators
    @FindBy(id = "email")
    public static WebElement EmailField;

    @FindBy(id = "pass")
    public static WebElement PasswordField;

    @FindBy(css = "#send2 > span")
    public static WebElement SignInButton;


    //Initialize Web Element using Selenium
    public AccountLoginPO(WebDriver driver){

        PageFactory.initElements(driver, this);
    }


    //Create Methods for Web Element Actions
    public void enterEmail(String email){
        EmailField.sendKeys(email);
    }

    public void enterPassword(String password){
        PasswordField.sendKeys(password);
    }

    public void clickSignInButton(){
        SignInButton.click();
    }





}
