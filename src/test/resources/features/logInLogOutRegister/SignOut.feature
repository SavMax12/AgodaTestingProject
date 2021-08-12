Feature: SignOut

  Background:
    Given page Sign in is open
    When fill in the fields Email and Password
    And click Sign in button

  Scenario:
    When open My account list by clicking on the profile icon
    And click Sign out button
    Then check that the Login button is displayed on the main page

