Feature: To validate the Login Page Scenarios



  @smoke1
  Scenario: Vaidate the Correct username and password
    Given Login to Application
    When Enter the username "Aiite"
    And Enter the password "Auy7tu"
    And Click the login Button
    Then Validate the Homepage

  @smoke2
  Scenario: Vaidate the InCorrect username and password
    Given Login to Application
    When Enter the username "Aiite132434"
    And Enter the password "Auy7tu43453545"
    And Click the login Button

  # Then Validate the Homepage
  @Smoke3
  Scenario Outline: Vaidate the userand pass
    Given Login to Application
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
