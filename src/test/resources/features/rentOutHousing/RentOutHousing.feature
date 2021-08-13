Feature: RentOutHousing

  Scenario:
    Given page List your place is open
    When click list your place now button
    And click property type Homes
    And choose properties category Vacation home
    And click Next button
    And increase Number of properties or units to five and choose Different addresses
    And click Next button
    And click Confirm button
    Then check that the account creation page or main page is displayed