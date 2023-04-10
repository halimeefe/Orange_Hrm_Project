Feature: Save New Employee Functionality

  Background:
    Given Navigate to Website
    When Enter username and password and click login button
    Then User should login succesfully
    Given Navigate to User Management Page
    And click on add button

  Scenario: Invalid admin name function
    And Enter an invalid employee name
    Then Verify no records found message
    Then Verify invalid message in red color