Feature: test ability to search for multi-city flights on the Orbitz.com home page

  Scenario: Verification that 2 adults and 2 children can search for a round-trip consisting of 3 flights
    Given orbitz.com is loaded and the home page is visible
    When flights button is pressed
    And multi-city flights button is pressed
    And DFW is inputted into Flying from tab 1
    And DFW airport is selected
    And LAX is inputted into Flying to tab 1
    And LAX airport is selected
    And flight 1 departure date is inputted
    And 2 adults flying are selected
    And 2 children flying are selected
    And age of child 1 is selected
    And age of child 2 is selected
    And LAX is inputted into Flying from tab 2
    And LAX airport is selected
    And CHI is inputted into Flying to tab 2
    And CHI airport is selected
    And flight 2 departure date is inputted
    And add another flight button is pressed
    And CHI is inputted into Flying from tab 3
    And CHI airport is selected
    And DFW is inputted into Flying to tab 3
    And DFW airport is selected
    And flight 3 departure date is inputted
    And search button is pressed