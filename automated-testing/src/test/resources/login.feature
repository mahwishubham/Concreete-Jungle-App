Feature: Login


  Scenario: log in user
    Given I am at the login page
  When I type in a valid username "jd03@a.ca"
  And I type in a valid password "password"
    And I click on the login button in login
  Then I should be redirected to tours.html


  Scenario Outline: Valid user login
    Given I am at the login page
    When I type in a valid username "<username>"
    And I type in a valid password "<password>"
    And I click on the login button in login
    Then I should be redirected to <page>
    Examples:
    |username |password|page        |
    |jd80@a.ca|password|tours.html  |
    |jd81@a.ca|password|tours.html  |
    |jd03@a.ca|password|tours.html  |
    |mc@a.ca  |password|mytours.html|
    |vv@a.ca  |password|mytours.html|
    |m@a.ca   |password|mytours.html|

Scenario: Click tours on login page
  Given I am at the login page
  When I click on the tours button in login
  Then I should be redirected to tours.html

  Scenario: Click stops on login page
    Given I am at the login page
    When I click on the stops button in login
    Then I should be redirected to index.html#pois

  Scenario: Click guides on login page
    Given I am at the login page
    When I click on the guides button in login
    Then I should be redirected to index.html#guides

  Scenario: Click home on login page
    Given I am at the login page
    When I click on the home button in login
    Then I should be redirected to index.html

  Scenario: Click tours on register page
    Given I am at the login page
    When I click on the register button in login
    Then I should be redirected to registration.html
