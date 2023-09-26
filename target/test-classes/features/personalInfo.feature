Feature: personalInfo feature
@personalInfo
  Scenario: verify personal info is updated
    Given user launches shopwitheg application
    When user clicks on login button
    And user enters valid username and password
    And user clicks on sign in button
    Given user launches shopwitheg personalinformation page
    And user changes firstname
    And user changes second name
    Then user changes email
    Then user clicks save changes
    Then verify success message
