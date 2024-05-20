Feature: TJMaxx Search Item

  Scenario: User searches and adds an item to the cart
    Given the browser is open for searchitem
    And the User navigates to the Google search page for searchitem
    When the User clicks on the TJMaxx link from the search results for searchitem
    Then the User goes to the TJMaxx home page for searchitem
    When the User searches for an item
    And the User clicks on the search button
    And the User selects the item from the search results
    And the User adds the item to the cart
    Then the item should be added to the cart successfully
