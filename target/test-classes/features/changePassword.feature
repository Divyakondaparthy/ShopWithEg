Feature: change password feature

@changePassword
  Scenario: verify password isreset
    Given user launchs shopwitheg application
    When user clicks on login button
    And user enters invalid username and password
    And user clicks on sign in button
    Then user navigate to shopwitheg reset password
    And user enter old password
    Then user enter new password
    Then user reenter the confirm password
    And user clicks save changes
    Then verify the password changed successfully