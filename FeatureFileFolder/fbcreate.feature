Feature: Facebook test Application

  Scenario: Create user on page
    Given user is on register page
    When enter valid firstname and lastname and mob No and password
    And enter Date of birth
    Then Select on gender button
    Then clcik on singup
