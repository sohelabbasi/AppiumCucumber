Feature: Test feature for swag app on android device

@smoke
Scenario: Valid login test and shopping cart scenario
Given I open the Androiddriver
When I enter "problemusernamekey" in username text field
And I enter "problempassword" in password text field
And I click on login option
Then I should be able to see an error message
Then I close the application