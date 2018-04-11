Feature:
  Scenario: I can calculate single number
    Given I initialize stringCalculator
    And I pass 5 value
    When I trigger calculate function
    Then I get 5 as a result

  Scenario: I can calculate null number
    Given I initialize stringCalculator
    And I pass value null
    When I trigger calculate function
    Then I get 0 as a result

  Scenario: I can calculate empty number
    Given I initialize stringCalculator
    And I pass  value
    When I trigger calculate function
    Then I get 0 as a result

  Scenario: I can calculate two number
    Given I initialize stringCalculator
    And I pass 5;4 value
    When I trigger calculate function
    Then I get 9 as a result

  Scenario: I can calculate multiple numbers
    Given I initialize stringCalculator
    And I pass 2;3;4 value
    When I trigger calculate function
    Then I get 9 as a result

  Scenario: I can calculate multiple numbers with whitespaces
    Given I initialize stringCalculator
    And I pass 2  ;3    ;  4   value
    When I trigger calculate function
    Then I get 9 as a result
