Feature: Sorting BookShelves

  Scenario: Sorting BookShelves Price
    Given the user is on the UrbanLadder home page
    When the user search(searchText: "BookShelves")
    And the user select the price under 15000
    Then retrieve the list of BookShelves
