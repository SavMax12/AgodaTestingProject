Feature: ViewHotelPhotos

  Background:
    Given click on the calendar icon located on the left under the search bar
    When select the departure date twenty-fifth of August and the arrival date tenth of September
    And enter the name of the locality in the search
    And select the first option from the drop-down list
    And click on the calendar icon located on the left under the search bar
    And click on the Search button
    And click on the first Select room button
    And click on see all photos next to the hotel photos

  Scenario:
    Then check that the photo is a image

  Scenario:
    When switch between the photo four times forward and then four times back
    And close the window with photos
    Then check that the hotel information page is displayed


