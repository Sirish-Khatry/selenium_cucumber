@selenium
Feature: Navigate to demo page and register then login 

As a user, I want to navigate to demo page so that i can register and login using the credentials 

Scenario:
Given I navigate to "https://www.thedemosite.co.uk" 
When I provide username "Sirish" and password "Sirish" to register
And I login with username "Sirish" and password "Sirish"
Then the alert should be "**Successful Login**"