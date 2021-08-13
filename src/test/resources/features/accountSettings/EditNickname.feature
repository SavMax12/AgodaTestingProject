Feature: EditNickname

  Background:
    Given page Sign in is open
    When fill in the fields Email and Password
    And click Sign in button
    And open My account list by clicking on the profile icon
    And click Profile button on My account list

  Scenario:
    When click on the edit name button
    And fill in the fields First name="Maxim", Last name="Savchenko"
    And click on save nickname button
    Then check that the name editing field is displayed