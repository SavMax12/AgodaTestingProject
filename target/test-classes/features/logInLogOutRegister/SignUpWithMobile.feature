Feature: SignUpWithMobile

  Background:
    Given page Create account is open

  Scenario:
    When go to the page Mobile
    And fill in the fields: Country="беларусь", Number = 34343434, "Password", add a filter Send me special offers and promotions
    And click Send OTP button
    Then check that the inscription has appeared Please perform a CAPTCHA check under the captcha in mobile sign up page
