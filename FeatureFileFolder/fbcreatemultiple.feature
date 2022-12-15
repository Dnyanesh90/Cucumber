Feature: Test Facebook Application

  Scenario Outline: User is create on page
    Given user is on register page
    When user enter valid "<firstname>" and "<lastname>" and "<emailId>" and "<password>"
    Then user is on Homepage

    Examples: 
      | Rukmini     | Bhargude    | rukmini@gmail.com  | 8854566046 |
      | Savita      | Tumberphale | savita@gmail.com   | 8868466046 |
      | Sangita     | Pokale      | sangita@gmail.com  | 8854566146 |
      | Dnyaneshwar | kadam       | dnyanesh@gmail.com | 8741566046 |
      | jana        | kadam       | janhvi@gmail.com   | 8746566046 |
      | parmeshwar  | kadam       | parmesh@gmail.com  | 9421566046 |
