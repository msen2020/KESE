Feature: US163
  #Nuray

  Scenario: As an admin, I should be able to update the "approval" value of the ad by connecting to the "/api/cars/approval" page in "patch" type.
   # Given user logs in with email and sifre using POST for API
    And user can update approval value with "/cars/approval" using Patch
    Then verify updated approval value