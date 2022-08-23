Feature: MyTours

  Scenario: Click add tour button on my tours page
    Given I am at the my tours page
    And I click on the add tour button
    Then I should be redirected to addTour.html
  Scenario: Click all tours
    Given I am at the my tours page
    And I click on the all tours button in mytours
    Then I should be redirected to tours.html

  Scenario: Click Home button
    Given I am at the my tours page
    And I click on the home button in mytours
    Then I should be redirected to index.html

  Scenario: Click stops button
    Given I am at the my tours page
    And I click on the stops button in mytours
    Then I should be redirected to index.html#pois

  Scenario: Click guides button
    Given I am at the my tours page
    And I click on the guides button in my tours
    Then I should be redirected to index.html#guides

  Scenario: Click first update #turn this into an outline if possible
    Given I am at the my tours page
    And I click on the first update button
    Then I should be redirected to update.html

  Scenario: Click first delete
    Given I am at the my tours page
    And I click on the first delete button


  Scenario: Click logout button
    Given I am at the my tours page
    Then I click on the logout button in my tours
    And I accept the alert
    Then I should be redirected to index.html