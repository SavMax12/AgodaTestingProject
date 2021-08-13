Feature: CurrentOffers

  Scenario:
    Then the current offers page is visible
    Given the current offers page is open
    When click on the coupon
    And copy the coupon from the offer
    Then check that the Copied label has appeared