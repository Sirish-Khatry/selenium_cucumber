@selenium
Feature: Navigate to demo page and register then login 

As a user, I want to navigate to demo page so that i can register and login using the credentials 

Scenario:
Given I navigate to "http://way2automation.com/way2auto_jquery/selectable.php#load_box" 
When I select item 2
Then the highlighted result should be "Text 2"