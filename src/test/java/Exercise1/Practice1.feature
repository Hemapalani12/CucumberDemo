Feature: login page check

Background: 
Given user is on login page

@smokeTest
Scenario: Basic scenario


When Enters valid credentials
Then User should able to login
Then Navigated to the Homepage

@regressionTest
Scenario: Basic scenario with creds


When Enters valid username "user" and password "password"
Then User should able to login
Then Navigated to the Homepage

Scenario Outline: Multiple user login


When Enters valid username "<username>" and password "<password>"
Then User should able to login
Then Navigated to the Homepage

Examples:

|username|password|
|admin|Admin1|
|user|User@1|


Scenario: registration validation


When Enters the details
|hema|
|palani|
|india|
Then User should able to register

@smokeTest
Scenario: students data validation


When enter the student details

|Name|Email|
|Hema|hema@gmail.com|
|Ramya|ramya@gmail.com|

Then successfully updated
