Feature: VirginGame bingo data

  As a user I want to get all bingo jackpot data from virginGames API

  Scenario: User wants to Verify VirginGames jackpot bingo data
    When I send a Get request
    Then I get valid response code 200
    And I verify currency GBP in bingo data
    And I verify name is Enterprise in bingo data
    Then I verify id 1256 is equal to 'CrystalMazeVirgin' in bingo data





