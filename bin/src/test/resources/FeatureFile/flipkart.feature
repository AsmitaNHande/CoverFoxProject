Feature: flipkart 
Background: 
Given clear cache

Scenario: TC01 flipkart for backgroundFeature
Given I am on HomePage
When click on add to cart
Then item added sucessfully

Scenario: TC02 login Functionality With blank details
Given I am on HomePage
And click on login button
Then Error msg will be displayed

Scenario: TC03 login functionality with valid username and blank password
Given I am on HomePage
And Enter username as "velocity"
And click on login button
Then Error msg will be displayed

