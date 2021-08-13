Feature: SignIn

  Background:
    Given page Sign in is open

  Scenario:
    When fill in the fields Email and Password
    And click Sign in button
    Then check that the my Account field is displayed