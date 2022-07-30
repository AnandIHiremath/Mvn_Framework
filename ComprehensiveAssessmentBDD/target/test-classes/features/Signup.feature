Feature: Register page feature

  Scenario: Signup with credentials
    Given user is on home page
    And user clicks on register button
    And user clicks on signup button
    When user enters first name "Anand"
    And user enters email "anandhiremath@gmail.com"
    And user enters password "123@ananD"
    And user clicks on create account button
