Feature: HotelReservation

  Background:
    Given click on the calendar icon located on the left under the search bar
    When select the departure date twenty-fifth of August and the arrival date tenth of September
    And enter the name of the locality in the search
    And select the first option from the drop-down list
    And click on the calendar icon located on the left under the search bar
    And click on the Search button
    And click on the first Select room button

  Scenario:
    When click on the Reserve button
    And fill in the fields Contact details: Full name="Maxim Savchenko", "Email", "Retype email", Phone number = 444444444, Country or region of residence="Беларусь", booking for someone else or not
    And specify room preferences
    And specify arrival date
    And click on the Next page button
    Then check that the card filling page or the hotel selection page is displayed
