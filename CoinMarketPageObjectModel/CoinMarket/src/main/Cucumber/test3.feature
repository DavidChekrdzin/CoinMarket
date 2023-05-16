Feature: FETest3
  Scenario: Record data in Most visited and Verify first 10 Most Visited coins are also displayed in the new tab
    Given I launch the Chrome Browser in fetest3 and open coinmarket page
    Then I record data from first page and verify that it is in the same order as in most visited coins
    And Close The Browser in fetest3