Feature: Login Feature

@actitime @regression
  Scenario: Login with valid username and password
    Given user is on login page
    When user enter valid username
    And user enter valid password
    And click on login button
    Then user should see dashboard page
    And user validate the title
    When user click on logout button
    Then user come back to login page

  Scenario: Login with in valid username and valid password
    Given user is on login page
    When user enter invalid username
    And user enter valid password
    And click on login button
    Then user see an error message
    And user print the error message

  Scenario: Login with valid username and invalid password
    Given user is on login page
    When user enter valid username
    And user enter invalid password
    And click on login button
    Then user see an error message
    And user print the error message

  Scenario: Login with invalid username and invalid password
    Given user is on login page
    When user enter invalid username
    And user enter invalid password
    And click on login button
    Then user see an error message
    And user print the error message
