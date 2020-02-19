Feature: Has correct title
  Index (login) page has the appropriate title.

  Scenario: Index page has correct title
    Given I navigate to index.html
    Then The title should be 'Agile Voting'
    
  Scenario: Login with empty id fails
    Given I navigate to index.html
    When I type nothing into id input
    And I press the vote button
    Then I must see an error message
