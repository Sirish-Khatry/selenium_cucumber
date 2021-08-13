Feature: DVD store accepts new dvds
  As a user, when I add a new DVD to my store, then the DVD should be saved to the stores item list.

Scenario: Add dvd to dvd store
  Given the following new DVDs
    | Title | Year | Actor |
    | Maze Runner  | 2010   | Paul Walker  |
    | Captain America | 2013   | Sirish Khatry  |
    | F9 | 2018   | Dom Torredo |
  And the expected outputs
    | Maze Runner - 2010 - Paul Walker |
    | Captain America - 2013 - Sirish Khatry |
    | F9 - 2018 - Dom Torredo |
  When the new DVDs are added to the store
  Then the get dvd list request should return the expected outputs