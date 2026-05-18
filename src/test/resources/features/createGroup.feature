Feature: Create Group

  Scenario Outline: as admin user i want to login to ndosi website
    Given i am on the login page
    And I enter email <email>
    And I enter password <password>
    When I click login button
    Then i should be logged in successfully
    And I click on the logged in user
    And I click on the admin panel
    And I click on the groups tab
    And I click on the create new group button
    And I enter group name <groupName>
    And I enter group description <groupDescription>
    And I enter year <year>
    And I enter max capacity <maxCapacity>
    And I enter start date <startDate>
    And I enter end date <endDate>
    And I click on the create group button
    And I should see the success message "Group created successfully"
    And I click on Back to Website button
    And Dashboard page should be displayed
    And I click on the logged in user again
    And I click on logout button
    And logout confirmation popup should be displayed
    And I click on Ok button to confirm logout
    And Home page should be displayed
    And I click on the login button again
    And Login page should be displayed
    And I click on Sign Up here link
    And Create Your Account page should be displayed
    And I click on Select Your group dropdown
    Then I should see that the group was created successfully
    Examples:
      | email             | password  | groupName | groupDescription | year | maxCapacity | startDate  | endDate    |
      | admin@gmail.com   | @12345678 | some name | some description | 2026 |  65456      |  05182026  |  05182027  |
