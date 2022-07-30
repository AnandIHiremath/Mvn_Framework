Feature: Downy on Site Top Header bar

  Scenario: verify Downy operation
    Given user is on home page
    When user clicks on downy
    And user mouse hover on about
    And user clicks on ingridents
    Then user verify text in ingridents page
