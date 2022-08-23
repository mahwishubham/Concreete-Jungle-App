Feature: tours

  Scenario: At tours page not logged in
    Given I am at the tours page
    And I click on the guides button in tours
    Then I should be redirected to index.html#guides

  Scenario: At tours page not logged in
    Given I am at the tours page
    And I click on the stops button in tours
    Then I should be redirected to index.html#pois

  Scenario: At tours page not logged in
    Given I am at the tours page
    And I click on the login button in tours
    Then I should be redirected to login.html

  Scenario: At tours page not logged in
    Given I am at the tours page
    And I click on the register button in tours
    Then I should be redirected to register.html

  Scenario: At tours page not logged in
    Given I am at the tours page
    And I click on the home button in tours
    Then I should be redirected to index.html

  Scenario: Click on stops while logged on
    Given I am at the tours page
    When I am logged in as a user
    And I click on the stops button in tours
    Then I should be redirected to index.html#pois

  Scenario: Click on guides while logged on
    Given I am at the tours page
    When I am logged in as a user
    And I click on the guides button in tours
    Then I should be redirected to index.html#guides

  Scenario: Click on home while logged on
    Given I am at the tours page
    When I am logged in as a user
    And I click on the home button in tours
    Then I should be redirected to index.html

  Scenario: Click on logout while logged on
    Given I am at the tours page
    When I am logged in as a user
    And I click on the logout button in tours
    And I accept the alert in tours
    Then I should be redirected to index.html

  Scenario: Click on stops while logged on
    Given I am at the tours page
    When I am logged in as a guide
    And I click on the stops button in tours
    Then I should be redirected to index.html#pois


  Scenario: Click on guides while logged on
    Given I am at the tours page
    When I am logged in as a guide
    And I click on the guides button in tours
    Then I should be redirected to index.html#guides


  Scenario: Click on my tours while logged on
    Given I am at the tours page
    When I am logged in as a guide
    And I click on the my tour button in tours
    Then I should be redirected to mytours.html

  Scenario: Click on add tours while logged on
    Given I am at the tours page
    When I am logged in as a guide
    And I click on the add tour button in tours
    Then I should be redirected to addTour.html

  Scenario: Click on home while logged on
    Given I am at the tours page
    When I am logged in as a guide
    And I click on the home button in tours
    Then I should be redirected to index.html

  Scenario: Click on logout while logged on
    Given I am at the tours page
    When I am logged in as a guide
    And I click on the logout button in tours
    And I accept the alert in tours
    Then I should be redirected to index.html