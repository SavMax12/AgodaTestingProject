Feature: EmailSubscriptions

  Background:
    Given page Sign in is open
    When fill in the fields Email and Password
    And click Sign in button
    And open My account list by clicking on the profile icon
    And click Profile button on My account list

  Scenario:
    When set up newsletter
    Then check that two time a week is visible

  Scenario:
    When click on the radio next to the text I would like to receive booking assist reminders
    And click on the radio next to the text I would like to receive emails about Agoda promotions
    And click on the radio next to the text I would like to know about information and offers related to my upcoming trip
    Then check that the text Saved has appeared