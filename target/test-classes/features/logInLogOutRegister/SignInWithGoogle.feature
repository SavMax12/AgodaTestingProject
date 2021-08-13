Feature: SignInWithGoogle

  Background:
    Given page Sign in is open

  Scenario:
    When click on Google button
    Then check that the Google label is missing on the page