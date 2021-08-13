Feature: FiltrationTopHandMenu

  Background:
    Given click on the calendar icon located on the left under the search bar
    When select the departure date twenty-fifth of August and the arrival date tenth of September
    And enter the name of the locality in the search
    And select the first option from the drop-down list
    And click on the calendar icon located on the left under the search bar
    And click on the Search button

  Scenario:
    When click on the Your budget button
    And set the price by dragging the sliders
    Then check that the price value is not exactly null

  Scenario:
    When click on the Stars button
    And set the number of stars
    Then check that the Three stars filter is displayed

  Scenario:
    When click on the More button
    And click on clear all filters button
    And click on the Done button
    Then check that the page ListOfHotels is displayed