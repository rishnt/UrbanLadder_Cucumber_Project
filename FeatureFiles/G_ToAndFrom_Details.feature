Feature: Customise GiftCard

  Scenario: Customising the GiftCard with valid data
    Given the user is on the UrbanLadder home page
    When the user clicks on the Gift Cards
    Then the user clicks on the Birthday/Anniversary Occassion
    And the user Enter the valid Amount, valid month, valid date and cilcks next
    And the user sets Receipents name as and Receipents email as and Receipents mobile as ( name: "Shivam", email: "shivam@gmail.com", mobile: "7490840344")
    And the user sets name in From as email as phone as address as pincode as( name: "Shivansh", email:"shivansh@gmail.com", phone:"6394723744",address:"Bharti Nagar",pincode:"560002")
    And the user clicks the confirm button
    
    Scenario: Customising the GiftCard with Invalid data
    Given the user is on the UrbanLadder home page
    When the user clicks on the Gift Cards
    Then the user clicks on the Birthday/Anniversary Occassion
    And the user Enter the valid Amount, valid month, valid date and cilcks next
    And the user sets Receipents name as and Receipents email as and Receipents mobile as ( name: "Shivam", email: "shivamgmail.com", mobile: "7490840344")
    And the user sets name in From as email as phone as address as pincode as( name: "Shivansh", email:"shivansh@gmail.com", phone:"6394723744",address:"Bharti Nagar",pincode:"560002")
    And the user clicks the confirm button
    And the user capture the error message
    
    Scenario: Customising the GiftCard with Invalid data
    Given the user is on the UrbanLadder home page
    When the user clicks on the Gift Cards
    Then the user clicks on the Birthday/Anniversary Occassion
    And the user Enter the valid Amount, valid month, valid date and cilcks next
    And the user sets Receipents name as and Receipents email as and Receipents mobile as ( name: "Shivam", email: "shivam@gmail.com", mobile: "7490840344")
    And the user sets name in From as email as phone as address as pincode as( name: "Shivansh", email:"shivansh@gmail.com", phone:"6394723744",address:"Bharti Nagar",pincode:"560000")
    And the user clicks the confirm button
    And the user capture the error message