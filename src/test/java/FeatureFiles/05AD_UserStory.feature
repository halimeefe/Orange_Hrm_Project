Feature: Password Match Functionality
  Background:
    Given Navigate to Website
    When Enter username and password and click login button
    Then  User should login succesfully

  Scenario: Verifiying password field and password confirm field if they are equal
    Given Navigate to User Management Page
    And click on add button
    And Enter a required value in to the “password” field and different value in to the “confirm password” field
    Then Verify that notification messages “Passwords do not match” in red color displayed