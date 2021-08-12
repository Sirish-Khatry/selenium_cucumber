@selenium
Feature: Navigate to bing and search

As a user, I want to navigate to Bing so that i can search for doge on the web

Scenario: 
When I request "https://www.bing.com"
And I search for "dodge"
Then the result should be "dodge - Bing"
