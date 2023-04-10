Feature: Message Functionality
  Background:
    Given Navigate to Website
    When Enter username and password and click login button
    Then User should login succesfully
  Scenario: Add button should appear
    Given Navigate to User Management Page
    Then verify that “Add” button is displayed.



#  As an Admin user I should be able to see Add button displayed,
#  when I navigate to the User Management page
#  Step 1 – I login as an Admin
#  Step 2 – I navigate to Admin / User Management page.
#  Step 3 – I verify that “Add” button is displayed.