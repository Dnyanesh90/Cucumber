Feature: Guru99 test Application

  Scenario: Register page Functionality
    Given user is on register home page
    When user enter valid first name and last name and phone and email and address and city and state and pin code and country
    And user enter valid username and password and confirm password
    Then click on submit button
