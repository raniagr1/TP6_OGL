Feature: Matrix
  Background:
    Given I have A Matrix

  Scenario: Cofactor
    When I compute cofactor of
      | col1 | col2  |
      | 1    | 2  |
      | 3    | 4  |
    Then The result of cofactor is
      | col1 | col2 |
      | 4    | -3  |
      | -2   | 1  |
	  
	  
	  
  Scenario: Inverse
    When I compute inverse of
      | col1 | col2  |
      | 1    | 2  |
      | 3    | 4  |
    Then The result of inverse is
      | col1 | col2 |
      | -2    | 1  |
      | 1.5   | -0.5  |
