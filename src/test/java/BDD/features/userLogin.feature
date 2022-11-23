Feature: User Login
  I want to check that the user can login into Orange Website

  Scenario: User Login with valid credentials
    Given the user in the login page
    When I entered the user data and click on login button
    Then The login page displayed successfully