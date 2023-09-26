Feature: addtocart feature
@addtocart
  Scenario: verify product successfully added to cart
    Given user launches shopwitheg application
    When user clicks on login button
    And user enters valid username and password
    And user clicks on sign in button
    Then user clicks on mens
    And user select a product
    Then user select size
    Then user select color
    And user clicks add to cart
    Then verify product is added successfully
