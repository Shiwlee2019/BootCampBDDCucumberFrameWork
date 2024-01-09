@TutorialsNinjaSearchProduct

Feature: search product functionality of TutorialsNinja

@ValidProduct
Scenario:
Given User opens the application
When User enters the search product 'HP'
And User clicks on the search button
Then User gets valid product info display in search page

@InvalidProduct
Scenario: 
Given User opens the application
When User enters the invalid product 'DELL'
And User clicks on the search button 
Then User gets a warning message

@NoProduct
Scenario:
Given User opens the application
And User clicks on the search button
Then User gets a warning message