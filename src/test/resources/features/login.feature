Feature: Login feature

@invalidLogin @Login
  Scenario: verify login with invalid credentials
    Given user launches shopwitheg application
    When user clicks on login button
    And user enters invalid username and password
    And user clicks on sign in button
   
@validLogin @Login
  Scenario: verify login with valid credentials
    Given user launches shopwitheg application
    When user clicks on login button
    And user enters valid username and password
    And user clicks on sign in button
    