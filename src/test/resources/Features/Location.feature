Feature: TJMaxx Store Locator

  Scenario: User searches for a TJMaxx store location
    Given the browser is open for store location
    And the User navigates to the Google search page for TJMaxx for store location
    When the User clicks on the TJMaxx link from the search results for store location
    Then the User goes to the TJMaxx home page for store location
    And the User clicks on the store locator
    And the User enters the zip code "60090"
    And the User enters the city "Wheeling"
    And the User selects the state "Illinois"
    And the User clicks on the find store button
    Then the User should see the store locations

  Scenario: User searches for a TJMaxx store with invalid state and city
   	Given the browser is open for store location
    And the User navigates to the Google search page for TJMaxx for store location
    When the User clicks on the TJMaxx link from the search results for store location
    Then the User goes to the TJMaxx home page for store location
    And the User clicks on the stores link
    And the User enters the city "Milford" again
    And the User selects the state "Arizona" again
    And the User clicks on the find a store button
    Then the User should see an error message or no store found
