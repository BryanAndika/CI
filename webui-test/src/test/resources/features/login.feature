@Login
Feature: Login

  @Valid-login
  Scenario: User login with valid email and password
    Given User is on login page
    When user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    Then user will redirected to home page

    @Invalid-Login
    Scenario: User login with valid email and invalid password
      Given User is on login page
      When user input username with "standard_user"
      And user input password with "wrong_password"
      And user click login button
      Then user will see error message "Epic sadface: Username and password do not match any user in this service"

      @Invalid-Login
      Scenario: User login with empty username and valid password
        Given User is on login page
        When user input username with ""
        And user input password with "secret_sauce"
        And user click login button
        Then user will see error message "Epic sadface: Username is required"
