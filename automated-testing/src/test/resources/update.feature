Feature: Update

  Scenario Outline: Successfully Update the First Tour
    Given I am at the update page
    When I select <day> for day in update
    And I type in a valid price of "<price>" in update
    And I select <radio>
    And I click on update tours button
    And I accept the alert
    Then I should be redirected to mytours.html
    Examples:
    #in radio 1 means inactive 2 means active
    |day|price|radio|
    |3  |22   |1    |
    |0  |10   |2    |
    |4  |87   |1    |
    |6  |45.02|2    |

    Scenario Outline: Unsuccessfully update the first tour
      Given I am at the update page
      When I type in a valid price of "<price>" in update
      And I select <radio>
      And I click on update tours button
      Then I should get the error "<error>" in update
       Examples:
        |price|radio|error|
        |-22   |1    |The price must be a positive value|
        |10    |0    |A status must be chosen before updating the changes|
        |abc   |1    |The price must be a numeric value with maximum 2 decimal places|
        ||0    |A status must be chosen before updating the changes            |

  Scenario: I Click on stops button
    Given I am at the update page
    When I click on the stops button in update
    Then I should be redirected to index.html#pois

  Scenario: I click on guides
    Given I am at the update page
    When I click on the guides button in update
    Then I should be redirected to index.html#guides

  Scenario: I click on my tours
    Given I am at the update page
    When I click on the my tours button in update
    Then I should be redirected to mytours.html

  Scenario: I click all tours
    Given I am at the update page
    When I click on the all tours button in update
    Then I should be redirected to tours.html

  Scenario: I click on logout
    Given I am at the update page
    When I click on the logout button in update
    And I accept the alert
    Then I should be redirected to index.html