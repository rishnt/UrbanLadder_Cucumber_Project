Feature: Verifying BookShelves

  Scenario: Verifying BookShelves page
    Given the user is on the UrbanLadder home page
    When the user search in the search bar(searchText: "BookShelves")
    And the user click the Enter button
    Then the user should see a text(text: "Search Results For 'BookShelves'")

 
