Feature: Matrix
  Background:
    Given I have A Matrix

  Scenario: Determinant
    When I compute determinant of
      | col1 | col2 | col3 |
      | 1    | 2  | 3      |
      | 4    | 5  | 6      |
      | 7    | 8  | 12     |
    Then The result of determinant is -9


  Scenario: Transpose
    When I compute transpose of
      | col1 | col2  |
      | 1    | 2  |
      | 3    | 4  |
      | 5    | 6 |
    Then The result of transpose is
      | col1 | col2 | col3 |
      | 1    | 3  | 5      |
      | 2    | 4  | 6      |


