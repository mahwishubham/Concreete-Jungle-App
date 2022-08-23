Feature: Home

  Scenario: I click on tours while not logged in
    Given I am at the home page
    When I click on the tours button
    Then I should be redirected to index.html#home

  Scenario: I click on current tours while not logged in
    Given I am at the home page
    When I click on the current tours button
    Then I should be redirected to tours.html

  Scenario: I click on stops while not logged in
    Given I am at the home page
    When I click on the stops button
    Then I should be redirected to index.html#pois

  Scenario: I click on guides while not logged in
    Given I am at the home page
    When I click on the guides button
    Then I should be redirected to index.html#guides

  Scenario: I click on register while not logged in
    Given I am at the home page
    When I click on the register button
    Then I should be redirected to registration.html

  Scenario: I click on login while not logged in
    Given I am at the home page
    When I click on the login button
    Then I should be redirected to login.html

Scenario: I click on tours while logged in as user
  Given I am at the home page
  When I am logged in as a user on home page
  And I click on the tours button
  Then I should be redirected to index.html#home

  Scenario: I click on current tours while logged in as user
    Given I am at the home page
    When I am logged in as a user on home page
    And I click on the current tours button
    Then I should be redirected to tours.html

  Scenario: I click on stops while logged in as user
    Given I am at the home page
    When I am logged in as a user on home page
    And I click on the stops button
    Then I should be redirected to index.html#pois

  Scenario: I click on guides while logged in as user
    Given I am at the home page
    When I am logged in as a user on home page
    And I click on the guides button
    Then I should be redirected to index.html#guides

  Scenario: I click on all tours while logged in as user
    Given I am at the home page
    When I am logged in as a user on home page
    And I click on the all tours button on home page
    Then I should be redirected to tours.html

  Scenario: I click on logout while logged in as user
    Given I am at the home page
    When I am logged in as a user on home page
    And I click on the logout button on home page
    And I accept the alert on home page
    Then I should be redirected to index.html


  Scenario: I click on tours while logged in as guide
    Given I am at the home page
    When I am logged in as a guide on home page
    And I click on the tours button
    Then I should be redirected to index.html#home

  Scenario: I click on stops while logged in as guide
    Given I am at the home page
    When I am logged in as a guide on home page
    And I click on the stops button
    Then I should be redirected to index.html#pois

  Scenario: I click on current tours while logged in as guide
    Given I am at the home page
    When I am logged in as a guide on home page
    And I click on the current tours button
    Then I should be redirected to tours.html

  Scenario: I click on guides while logged in as guide
    Given I am at the home page
    When I am logged in as a guide on home page
    And I click on the guides button
    Then I should be redirected to index.html#guides

  Scenario: I click on add tour while logged in as guide
    Given I am at the home page
    When I am logged in as a guide on home page
    And I click on the add tour button on home page
    Then I should be redirected to addTour.html

  Scenario: I click on my tours while logged in as guide
    Given I am at the home page
    When I am logged in as a guide on home page
    And I click on the my tours button
    Then I should be redirected to mytours.html

  Scenario: I click on all tours while logged in as guide
    Given I am at the home page
    When I am logged in as a guide on home page
    And I click on the all tours button on home page
    Then I should be redirected to tours.html

  Scenario: I click on logout while logged in as guide
    Given I am at the home page
    When I am logged in as a guide on home page
    And I click on the logout button on home page
    And I accept the alert
    Then I should be redirected to index.html