Feature: Message Functionality
  Background:
    Given Navigate to Website
    When Enter username and password and click login button
    Then User should login succesfully
  Scenario: Notification message when pressing save button without entering mandatory fields
    Given Navigate to User Management Page
    And click on add button
    And Click on Save button before entering any mandatory field
    Then Verify that notification messages in red color displayed