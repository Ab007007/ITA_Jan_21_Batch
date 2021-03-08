@development
Feature: Customer Creation

  Background: 
    Given user is loggedin to the application
    When user click on task tab

  @actitime @regression
  Scenario: Create Non-Existing Customer
    Then user vlaidates the task page
    And user click on Add new and Add New Customer button
    Then Customer creation page will be displayed
    And user enter customer name cust desc and click on new customer
    Then user validate the toast success message
    And logout of the applcation

  @negativescenario @actitime
  Scenario: Create Existing Customer
    Then user vlaidates the task page
    And user click on Add new and Add New Customer button
    Then Customer creation page will be displayed
    And user enter existing customer name cust desc and click on new customer
    Then user gets a error message displayed
    Then user click on cancel button
    And logout of the applcation
