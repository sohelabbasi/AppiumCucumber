Feature: Test feature for swag app on android device

@smoke1
Scenario: Invalid login scenario
Given I open the Androiddriver
When I enter "invalidusername" in username text field
And I enter "invalidpassword" in password text field
And I click on login option
Then I verify the error for invalid credentials
Then I close the application