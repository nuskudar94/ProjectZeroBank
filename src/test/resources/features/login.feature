Feature: User should be able to login
  @login
  Scenario: User logs in
    Given the user is on homepage
    When the user navigates to Login Page
    And the user enter "username" and "password"
    Then the user should be able to login


  Scenario Outline: non-authorized users cannot login
    Given navigate


    Examples:


