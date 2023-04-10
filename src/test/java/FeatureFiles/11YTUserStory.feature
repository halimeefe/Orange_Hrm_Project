Feature: Admin Functionality

  Background:
    Given Navigate to Website
    When Enter username and password and click login button
    Then User should login succesfully

    Scenario:I can see the "Add User" header is displayed.

      When   Navigate to User Management Page
      And click on add button
      Then  verify that “Add User” heading is displayed