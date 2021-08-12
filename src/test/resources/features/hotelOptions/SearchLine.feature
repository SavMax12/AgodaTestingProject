Feature: SearchLine

  Scenario:
    Given enter the incomplete name of the locality in the search field: "Istan"
    When select the first option from the drop-down list
    Then check that the entered value in the string does not match the entered value