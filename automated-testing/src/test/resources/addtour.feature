Feature: Add Tour

    Scenario Outline: add valid tour
      Given I am at the add tours page
      When I select <day> for day
      And I select <option1> <option2> <option3> for three valid options
      And I type in a valid price of "<price>"
      And I type in a valid title of "<title>"
      And I click on the add tour button in add tours
      And I accept the alert
      Then I should be redirected to mytours.html
      Examples:
      |day|option1|option2|option3|price  |title|
      |1  |  1     |  2     |    3 | 12.25|mytour|
      |2  |  2     |  3     |    1 | 15|mytour|
      |3  |  3     |  4     |    2 | 38.7|mytour|
      |4  |  4     |  5     |    6 | 32.20|mytour|
      |5  |  5     |  6     |    4 | 99|mytour|
      |6  |  6     |  7     |    5 | 99.99|mytour|
      |6  |  9     |  10     |    8 | 58.25|mytour|
      |5  |  10     |  11     |    12 | 23.22|mytour|


  Scenario Outline: try to add invalid tour   #to re use functiality even though these say valid most options listed are not valid
    Given I am at the add tours page
    When I select <day> for day
    And I select <option1> <option2> <option3> for three valid options
    And I type in a valid price of "<price>"
    And I type in a valid title of "<title>"
    And I click on the add tour button in add tours
    Then I should receive an alert with the error "<error>"
    Examples:
      |day|option1|option2|option3|price  |title|error|
      |2  |  2     |  3     |    1 | abc|mytour|The price must be a numeric value with maximum 2 decimal places|
      |3  |  3     |  4     |    2 | -1|mytour|The price must be a positive value                              |
      |5  |  5     |  6     |    4 | 99| |You have to add a title                                              |

  Scenario Outline: add valid tour
    Given I am at the add tours page
    When I select <day> for day
    And I select <option1> <option2> <option3> <option4> for four valid options
    And I type in a valid price of "<price>"
    And I type in a valid title of "<title>"
    And I click on the add tour button in add tours
    And I accept the alert
    Then I should be redirected to mytours.html
    Examples:
      |day|option1 |option2 |option3|option4|price  |title|
      |1  |  1     |  2     |3      |4      | 12.25 |mytour|
      |2  |  2     |  3     |    1  |8      | 15    |mytour|
      |3  |  3     |  4     |    2  |12     | 38.7  |mytour|
      |4  |  4     |  5     |    6  |10     | 32.20 |mytour|
      |5  |  5     |  6     |    4  |3      | 99 |mytour|

  Scenario Outline: add valid with 5 poitour
    Given I am at the add tours page
    When I select <day> for day
    And I select <option1> <option2> <option3> <option4> <option5> for five valid options
    And I type in a valid price of "<price>"
    And I type in a valid title of "<title>"
    And I click on the add tour button in add tours
    And I accept the alert
    Then I should be redirected to mytours.html
    Examples:
      |day|option1|option2|option3|option4| option5|price  |title|
      |1  |  1     |  2     |    3 |4     |5| 12.25|mytour|
      |2  |  2     |  3     |    1 |8     |10| 15|mytour|
      |3  |  3     |  4     |    2 |9     |11| 38.7|mytour|
      |4  |  4     |  5     |    6 |12    |8 | 32.20|mytour|
      |5  |  5     |  6     |    4 | 7    |10|99|mytour|

  Scenario: try to add 6 poi
    Given I am at the add tours page
    When I select 3 for day
    And I select 1 2 3 4 5 6 for six valid options
    And I type in a valid price of "50"
    And I type in a valid title of "Title"
    And I click on the add tour button in add tours
    Then I should receive an alert with the error "Cannot pick more than 5 points of interest"

    Scenario: Click stops button
Given I am at the add tours page
      When I click on the stops button in add tours
      Then I should be redirected to index.html#pois

     Scenario: Click guides button
Given I am at the add tours page
       When I click on the guides button in add tours
       Then I should be redirected to index.html#guides

     Scenario: click my tours button
       Given I am at the add tours page
       When I click on the my tours button in add tours
       Then I should be redirected to mytours.html

     Scenario: click home button
       Given I am at the add tours page
       When I click on the home button in add tours
       Then I should be redirected to index.html

     Scenario: click logout button
       Given I am at the add tours page
       When I click on the logout button in add tours
       And I accept the alert
       Then I should be redirected to index.html