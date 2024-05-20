#Feature: TJMaxx Delete Item from Cart
#
  #Scenario: User deletes an item from the cart
    #Given the browser is open for deleting an item from the cart
    #And the User navigates to the Google search page for TJMaxx
    #When the User clicks on the TJMaxx link from the search results
    #Then the User goes to the TJMaxx home page
    #When the User clicks on the cart icon
    #And the User clicks on the My Bag link
    #Then the User goes to the cart page
    #When the User tries to remove an item from the cart
    #Then the User should see a confirmation or a message if the cart is empty

  Feature: TJMaxx Delete Item from Cart

  Scenario: Add and remove an item from the shopping bag
  	Given the browser is open for deleting an item from the cart
    And the User navigates to the Google search page for TJMaxx
    When the User clicks on the TJMaxx link from the search results
    Then the user is on the TJ Maxx homepage
    When the user searches for "white lamp"
    And the user clicks on the search button
    And the user scrolls down by 400 pixels
    And the user selects the "Scalloped Table Lamp"
    And the user adds the item to the order
    Then the user should see the "VIEW BAG" link
    When the user clicks on the "VIEW BAG" link
    #Then the user should see the "Remove" link
    When the user clicks on the "Remove" link to remove item
    Then the item should be removed from the shopping bag

    