Feature: validating error msg
Scenario: validate CoverFox Health Insurance plan for single person
Given I am on home page
When I Click on get Started button
And I click on next button
And I provide age as "34" and Click on next button
And click on continue button
Then error msg should be displayed