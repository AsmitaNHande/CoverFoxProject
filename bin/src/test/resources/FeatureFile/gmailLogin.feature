Feature: gmail login with valid password and username
Scenario: Gmail login functionality
Given I am on HomePage
And Enter username as "chaitali" password as "test123"
And click on login button
Then succesfully logged in also navigated to inbox

