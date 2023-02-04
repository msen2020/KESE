@smoketest
Feature: As a user I should be see and access "/usage" and "/privacy"
  Background:
    Given user is on login page "https://kese.nl/signup"

  Scenario: "/usage" should be visible
    Then "/usage" should be visible

  Scenario: "/privacy" should be visible
    Then "/privacy" should be visible

  Scenario: "/usage" page should be accessible
    And Click usage
    Then page url should be "https://kese.nl/usage"

  Scenario: "/privacy" page should be accessible
    And Click privacy
    Then page url should be "https://kese.nl/privacy"
    
