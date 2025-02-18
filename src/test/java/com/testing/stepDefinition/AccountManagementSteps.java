package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.AccountLoginPO;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;
    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();

    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String firstname, String lastname, String email, String password, String confirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(firstname);
        createAccountPagePO.enterLastName(lastname);
        createAccountPagePO.enterEmail(email);
        createAccountPagePO.enterPassword(password);
        createAccountPagePO.enterConfirmPassword(confirmPassword);
    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();
    }

    @Then("My account page is displayed")
    public void myAccountPageIsDisplayed() {
    }

    @Then("Error message should be displayed that account already exists")
    public void errorMessageShouldBeDisplayedThatAccountAlreadyExists() {

    }



    @Given("I am on account login page")
    public void iAmOnAccountLoginPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignInLink();
    }

    @When("I enter {string} {string}")
    public void iEnter(String email, String password) {
        AccountLoginPO accountLoginPO = new AccountLoginPO(driver);
        accountLoginPO.enterEmail(email);
        accountLoginPO.enterPassword(password);
    }

    @And("I click on sign in")
    public void iClickOnSignIn() {
        AccountLoginPO accountLoginPO = new AccountLoginPO(driver);
        accountLoginPO.clickSignInButton();
    }

    @Then("Customer account page is displayed")
    public void customerAccountPageIsDisplayed() {
    }


    @Then("Error message is displayed")
    public void errorMessageIsDisplayed() {
    }
}
