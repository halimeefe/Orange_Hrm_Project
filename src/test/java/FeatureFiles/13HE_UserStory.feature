



Feature: Admin Fuctionality

  Background:
    Given Navigate to Website
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario:Notification message with a password without  lowercase character


    Given Navigate to User Management Page
    And click on add button
    When Enter password without lowercase character
    Then Verify that notification messages must contain a lower case letter
