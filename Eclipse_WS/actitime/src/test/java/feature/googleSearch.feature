@google
Feature: Print Search Results

	@regression 
  Scenario: User Prints first page searach results
    Given User is on Google Page
    When user enters "ibm"
    And application display auto suggestions
    Then user print all the auto suggestions
    And close the browser

  Scenario: User Prints first page searach results
    Given User is on Google Page
    When user enters "ITA Automation"
    And application display auto suggestions
    Then user print all the auto suggestions
    And close the browser

  Scenario: User Prints first page searach results
    Given User is on Google Page
    When user enters "Wipro"
    And application display auto suggestions
    Then user print all the auto suggestions
    And close the browser

  Scenario: User Prints first page searach results
    Given User is on Google Page
    When user enters "Oracle"
    And application display auto suggestions
    Then user print all the auto suggestions
    And close the browser
#Scenario: User Prints first two page searach results
#Scenario: User Prints ten page searach results
