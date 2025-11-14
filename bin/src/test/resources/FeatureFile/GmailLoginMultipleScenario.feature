Feature: login feature
Scenario: TC1 login functionality
Given I am on HomePage
And Enter username as "chaitali" password as "test123"
And click on login button
Then succesfully logged in also navigated to inbox


Scenario: TC02 login Functionality With blank details
Given I am on HomePage
And click on login button
Then Error msg will be displayed

Scenario: TC03 login functionality with valid username and blank password
Given I am on HomePage
And Enter username as "velocity"
And click on login button
Then Error msg will be displayed
