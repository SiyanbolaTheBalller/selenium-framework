@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<firstname>" "<lastname>" "<email>" "<password>" "<confirmPassword>"
    And I click on create an account
    Then My account page is displayed

    Examples:
      | firstname | lastname | email               | password   | confirmPassword |
      | Adam      | Scott    | adamscoop@gmail.com | Testing12! | Testing12!      |

  @DuplicateAccountCreationNotAllowed
  Scenario Outline: Create an account using the same email address
    Given I am on create an account page
    When I enter "<firstname>" "<lastname>" "<email>" "<password>" "<confirmPassword>"
    And I click on create an account
    Then Error message should be displayed that account already exists

    Examples:
      | firstname | lastname | email               | password   | confirmPassword |
      | Adam      | Scott    | adamscoop@gmail.com | Testing12! | Testing12!      |

  @AccountLogin
  Scenario Outline: Account Login with registered username and password
    Given I am on account login page
    When I enter "<email>" "<password>"
    And I click on sign in
    Then Customer account page is displayed

    Examples:
      | email               | password   |
      | adamscoop@gmail.com | Testing12! |

  @UnregisteredCustomerCannotLogin
  Scenario Outline: Account Login with unregistered username and password
    Given I am on account login page
    When I enter "<email>" "<password>"
    And I click on sign in
    Then Error message is displayed


    Examples:
      | email              | password  |
      | adamscoy@gmail.com | Testing2! |