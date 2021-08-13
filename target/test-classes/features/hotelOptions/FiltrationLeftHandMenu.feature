Feature: FiltrationLeftHandMenu

  Background:
    Given click on the calendar icon located on the left under the search bar
    When select the departure date twenty-fifth of August and the arrival date tenth of September
    And enter the name of the locality in the search
    And select the first option from the drop-down list
    And click on the calendar icon located on the left under the search bar
    And click on the Search button

  Scenario:
    When filter distance to center
    And filter location rating
    And open more filters and select filter
    Then check that the filter In the center is displayed