Feature: Matrix
  
  Scenario: Cofactor
  Given I have A Matrix
    When I compute cofactor of
      | col1 | col2  |
      | 1    | 2  |
      | 3    | 4  |
    Then The result of cofactor is
      | col1 | col2 |
      | 4    | -3  |
      | -2   | 1  |