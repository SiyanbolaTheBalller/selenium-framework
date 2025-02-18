package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    //Element Locators
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;

    //Initialize Web Element using Selenium
    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Create Methods for Web Element Actions
    public void clickCreateAccountLink(){
        CreateAccountLink.click();
    }

    public void clickSignInLink(){
        SignInLink.click();
    }














}
