Feature: Calculator addition behaviour
  Testing if the calculator can successfully add numbers.
  
  As a user, I want to add two or more numbers so I can use the sum in further calculatons or data based decision making.

  Scenario Outline: Varying values Integer addition
    Given the number <num1>
    And the second number <num2>
    When the numbers are added
    Then the result should be <expected>
    
    Examples: Integer values
    | num1 | num2 | expected |
    | 2.2    | 2.2    | 4.4  |
    | 50   | 50   | 100      |
