Feature: UserCreate Functionality
  Background:
    Given Navigate to Website
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Creating new user ESS successfully
    Given Navigate to User Management Page
    And click on add button
    And Fill in the all fields
    And Click on Save button
    Then Verify that you have added to the list