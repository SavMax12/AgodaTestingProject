Feature: AddCard

  Background:
    Given page Sign in is open
    When fill in the fields Email and Password
    And click Sign in button
    And open My account list by clicking on the profile icon
    And click Profile button on My account list

  Scenario:
    When click on add new payment method button
    And fill in the fields of the card: Credit card number=4320777777777777, Card holder name="Maxim Savchenko", Expiry date=1125, Issuing bank="MyBank", click on save card button
    And click on save card button
    Then to check that the inscription appears, Please enter a valid credit card number under the Credit or debit card number field


