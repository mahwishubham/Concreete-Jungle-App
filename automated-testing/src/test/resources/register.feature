Feature: Register

  Scenario Outline: Invalid Registration
    Given I am at the registration page
    When I type in "<email>" for email
    And I type in "<password>" for password
    And I type in "<firstname>" for first name
    And I type in "<lastname>" for last name
    And I type in "<phonenumber>" for phone number
    And I click on the register button in register
    Then I should get the error "<error>"
    Examples:
    |email          |password    |firstname |lastname|phonenumber |error|
    |               |            |          |        |            |Names cannot be blank     |
    |validemail.com|PassWord123!|John      |Doe     |123-456-4567 |accepted email address format is: username@company.domain|
    |              |PassWord123!|John      |Doe     |123-456-4567 |email cannot be blank                                    |
    |valid1@email.com|pass        |John      |Doe     |123-456-4567 |Accepted password length is between 8 and 20 characters inclusive|
    |valid1@email.com|PassWord123!|      |Doe     |123-456-4567 |Names cannot be blank|
    |valid1@email.com|PassWord123!|John      |     |123-456-4567 |Names cannot be blank|
    |valid1@email.com|PassWord123!|John      |D     |123-456-4567 |Names must have at least 2 letters|
    |valid1@email.com|PassWord123!|J      |Doe     |123-456-4567 |Names must have at least 2 letters|
    |valid1@email.com|PassWord123!|John      |Doe     | |mobile phone cannot be blank|
    |valid1@email.com|PassWord123!|John      |Doe     |1234564567 |mobile phone format <555-555-5555>|

    Scenario: Valid Registration
      Given I am at the registration page
      When I type in "valid3000@email.com" for email
      And I type in "PassWord123!" for password
      And I type in "John" for first name
      And I type in "Doe" for last name
      And I type in "000-000-0000" for phone number
      And I click on the register button in register
      Then I should be redirected to tours.html

    Scenario: I click home on register
      Given I am at the registration page
      When I click on the home button in register
      Then I should be redirected to index.html

    Scenario: I click login on register
      Given I am at the registration page
      When I click on the login button in register
      Then I should be redirected to login.html