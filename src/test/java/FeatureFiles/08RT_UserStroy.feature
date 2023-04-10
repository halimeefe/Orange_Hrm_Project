Feature: Message Functionality
  Background:
    Given Navigate to Website
    When Enter username and password and click login button
    Then User should login succesfully
  Scenario: Verifiying enter an unused Admin name
    Given Navigate to User Management Page
    And click on add button
    And enter a value in to the username which was already taken
    Then verify that notification messages “Already exists” in red color displayed.


#  Step 1 – I login as an Admin
#  Step 2 – I navigate to Admin / User Management page.
#  Step 3 – I click on Add button
#  Step 4 – I enter a value in to the username which was already taken
#  Step 5 – I verify that notification messages “Already exists” in red color displayed.