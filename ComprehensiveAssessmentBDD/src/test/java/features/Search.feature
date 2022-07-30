Feature: Search funcationality

  Scenario: verify search operation
    Given user is on home page
    When user clicks on Search box
    And user enter text in search box
    And user pressed enter key
    Then user verify text in results page
