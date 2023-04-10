

Feature: Admin Fuctionality

  Background:
    Given Navigate to Website
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Notification message with password less than 8 characters

    Given Navigate to User Management Page
    And click on add button
    When Enter password less than 8 characters
    Then Verify notification messages displayed
