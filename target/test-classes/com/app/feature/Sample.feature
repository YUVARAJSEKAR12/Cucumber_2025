@Smoke
Feature: Title of your feature

  Background: 
    Given Login to Application


  Scenario: Vaidate the Correct username and password
    When Enter the username "Aiite"
    And Enter the password "Auy7tu"
    And Click the login Button
    Then Validate the Homepage


  Scenario: Vaidate the InCorrect username and password
    When Enter the username "Aiite132434"
    And Enter the password "Auy7tu43453545"
    And Click the login Button

  # Then Validate the Homepage
 
  Scenario Outline: Vaidate the userand pass
    When Enter the user "<username>"
    And Enter the pass "<password>"
    And Click the login Button
    Then Validate the Homepage

    Examples: 
      | username | password     |
      | Aiite1   | Aiite123     |
      | Aiite2   | A9que98wyre9 |
      | Aiite3   | Aoiruweuyf   |
      | Aiite4   | Aljksdjshg   |
