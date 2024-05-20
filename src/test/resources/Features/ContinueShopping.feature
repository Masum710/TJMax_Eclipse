Feature: Continue Shopping

  Scenario: Add multiple items to the shopping bag and continue shopping
  	Given the browser is open for continue shopping
    And the User navigates to the Google search page for TJMaxx for continue shopping
    When the User clicks on the TJMaxx link for continue shopping
    Then the user is on the TJ Maxx homepage for continue shopping
    And the user selects the "Luggage" category
    And the user clicks on "Carry-On Luggage"
    And the user selects the first carry-on luggage item
    And the user adds the item to the order for continue shopping
    And the user selects another carry-on luggage item
    And the user adds the second item to the order
    Then both items should be added to the shopping bag

