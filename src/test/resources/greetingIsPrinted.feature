Feature: As a user I can run program and see greeting

  Scenario: Greeting is printed
    Given Program is started
    When Program is running
    Then the greeting text is printed to System.out
