package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateAccountPagePO {

    //Element Locators
    @FindBy(id = "firstname")
    public static WebElement FirstNameField;

    @FindBy(id = "lastname")
    public static WebElement LastNameField;

    @FindBy(id = "email_address")
    public static WebElement EmailAddressField;

    @FindBy(id = "password")
    public static WebElement PasswordField;

    @FindBy(id = "password-confirmation")
    public static WebElement ConfirmPasswordField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAccountButton;


    //Initialize Web Element using Selenium
    public CreateAccountPagePO(WebDriver driver){

        PageFactory.initElements(driver, this);
    }


    //Create Methods for Web Element Actions
    public void enterFirstName(String firstname){
        FirstNameField.sendKeys(firstname);
    }

    public void enterLastName(String lastname){
        LastNameField.sendKeys(lastname);
    }

    public void enterEmail(String email){
        EmailAddressField.sendKeys(email);
    }

    public void enterPassword(String password){
        PasswordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword){
        ConfirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickCreateAccountButton(){
        CreateAccountButton.click();
    }

}



