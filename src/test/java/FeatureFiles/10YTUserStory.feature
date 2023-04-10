
Feature: Admin Fuctionality

  Background:
    Given Navigate to Website
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: As an Admin user I should be able to see all the required elements displayed

    When Navigate to User Management Page
    And click on add button
    Then  verify that all the required elements are displayed