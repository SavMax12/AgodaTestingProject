Feature: NumberOfPersons

  Scenario:
    Given click on the icon with the people
    When select a group of Group travelers
    And add the number of rooms by clicking one time on + opposite Room
    And add the number of adults two times on + opposite Adult
    And add the number of child by clicking one time on + opposite Child and select the age of the child in the drop-down lis
    And click on I need prefer a family room
    Then check that the main page is displayed