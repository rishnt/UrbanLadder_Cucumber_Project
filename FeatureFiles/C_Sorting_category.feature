Feature: Sorting Category

  Scenario: Sorting the Category
    Given the user is on the UrbanLadder home page
    When the user search(searchText: "BookShelves")
    And the user select the price under 15000
    Then the user selects from the category items(item: "Kids BookShelves")
    And the user selects exclude out of stock option
    And Sort the price from Low to High
    And retrieve the first three items
