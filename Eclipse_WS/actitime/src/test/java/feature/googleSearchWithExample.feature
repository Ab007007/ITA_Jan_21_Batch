@google
Feature: Print Search Results

  Scenario Outline: User Prints first page searach results
    Given User is on Google Page
    When user enters <company>
    And application display auto suggestions
    Then user print all the auto suggestions
    And close the browser

    Examples: 
      | company        |
      | ibm            |
      | ita automation |
      | wipro          |
      | Oracle         |