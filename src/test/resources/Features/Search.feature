@Search
Feature: Search functionality

  Scenario: Search for item and add then delete from cart
    Given User is on homepage
    Then User enters "stainless steel table" to search bar
    Then User checks to make sure results show "Table"
    And User adds last item in search to cart
    Then User empty's cart
