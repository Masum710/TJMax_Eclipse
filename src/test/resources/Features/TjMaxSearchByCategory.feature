Feature: TJMaxx Search By Category

  Scenario: User searches and adds a beauty item to the cart
    Given the browser is open for categorysearch
    And the User navigates to the Google search page for categorysearch
    When the User clicks on the TJMaxx link from the search results for categorysearch
    Then the User goes to the TJMaxx home page for categorysearch
    When the User navigates to the women's category
    And the User navigates to the women's perfume section
    And the User selects the perfume item
    And the User adds the item to the cart for categorysearch
    Then the item should be in the cart
