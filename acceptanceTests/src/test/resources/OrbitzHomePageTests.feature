Feature: test ability to search for multi-city flights on the Orbitz.com home page

  Scenario: Verification that 2 adults and 2 children can search for a roundtrip consisting of 3 flights
    Given orbitz.com is loaded and the home page is visible
    When flights button is pressed
    And multi-city flights button is pressed
    And DFW is inputted into Flying from tab 1
    And DFW airport is selected