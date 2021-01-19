Feature: feature to test login functionality 
Scenario: Check login successful with valid credentials 

Given usr is on login page
When user enters username and password
And clicks on login button 
Then user is navigated to Home screen

Scenario Outline: Check login successful with valid credentials 

Given usr is on login page
When user enters <username> and <password>
And clicks on login button 
Then user is navigated to Home screen

Examples:
|username|password|
|yalagalapolaiah@tvarana.com|Tvarana2020@|
|abhishek.dutta@tvarana.com|Entally2004|
