Feature: SignUp

  Background:
    Given page Create account is open

  Scenario:
    When fill in the fields: First name="Maxim", Last name = "Savchenko", "Email", "Password", "Confirm Password", remove the filter Email me exclusive Agoda promotions. I can opt out later as stated in the Privacy Policy.
    And click Sign up button
    Then check that the inscription has appeared Please perform a CAPTCHA check under the captcha in sign up page
