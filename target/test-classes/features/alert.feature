@selenium
Feature: Alert input

 Scenario: Input alert
 Given I navigate to alert site "http://way2automation.com/way2auto_jquery/alert.php#load_box"
 And I click on input alert button
 When I click on button and input "Sirish"
 Then the result will be "Hello Sirish! How are you today?"