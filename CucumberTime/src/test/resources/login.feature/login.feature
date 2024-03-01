Feature: Login page Automation of saucedemo App
Scenario Outline: Check login is succesful with valid credentials
Given User is on login page
When User enters "<username>" and "<password>"
And Clicks on Login Button
Then User is navigated to Home Page
And Close the Browser

Examples:
| username | password | 
| standard_user | secret_sauce |

