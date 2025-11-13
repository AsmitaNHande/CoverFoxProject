Feature: gmail login with valid password and username
Scenario: Gmail login functionality
Given I am on HomePage
And Enter username as "<usernm>" password as "<Passwrd>"
And click on login button
Then succesfully logged in also navigated to inbox
Examples:
|usernm|passwrd|
|chaitali|123456|
|velocity|568545|
|||

