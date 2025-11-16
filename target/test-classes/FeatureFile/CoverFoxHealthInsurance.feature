Feature: CoverFox Health Insurance test
Scenario: validate CoverFox Health Insurance plan for single person
Given I am on home page
When I Click on get Started button
And I click on next button
And I provide age as "34" and Click on next button
And I provide pincode a "411046", mobNumber as "8888888888" and Click on continue button
Then matching Health Insurance Plans should be displayed as "48"

Scenario: Validate coverfox health insurance pincode and mobile number error msg
Given I am on home page
When I Click on get Started button
And I click on next button	
And I provide age as "29" and Click on next button
And click on continue button without providing pincode and mobile number
Then appropriate error messages should be displayed for pincode and mobile number