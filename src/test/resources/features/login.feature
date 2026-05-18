Feature: Login

  Scenario Outline: as a user I want to login to Ndosi web site
    Given i am on the login page
    And i enter email <email>
    And i enter password <password>
    When i clicklogin button
    Then i should be logged in successfully
    Examples:
      | email    | ignatius@gmai.com |
      | password | R001118w!!        |

