Feature: Test feature for swag app on android device

@smoke123
Scenario: Valid login test and shopping cart scenario
Given I open the Androiddriver
When I enter "username" in username text field
And I enter "password" in password text field
And I click on login option
Then System navigates me to the homepage
And I select item from the list
Then item should appear in the cart
And I remove the selected item from the cart
Then I close the application

  @test
  Scenario: test
    Given I open the Androiddriver
    When I enter username and password
    And I click on login button
    Then I close the application