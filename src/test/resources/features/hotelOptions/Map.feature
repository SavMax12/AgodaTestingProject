Feature: Map

  Background:
    Given click on the calendar icon located on the left under the search bar
    When select the departure date twenty-fifth of August and the arrival date tenth of September
    And enter the name of the locality in the search
    And select the first option from the drop-down list
    And click on the calendar icon located on the left under the search bar
    And click on the Search button
    And click on the first Select room button

  Scenario:
    When click on the map located near the photos
    And open the entertainment list to the right of the map
    And click on + four times and - six times
    Then check that the hotel information page is displayed
