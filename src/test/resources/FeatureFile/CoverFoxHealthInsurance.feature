Feature: CoverFox Health Insurance test
Scenario: validate CoverFox Health Insurance plan for single person
Given I am on home page
When I Click on get Started button
And I click on next button
And I provide age as "34" and Click on next button
And I provide pincode a "411046", mobNumber as "8888888888" and Click on continue button
Then matching Health Insurance Plans should be displayed as "48"

