Feature: As a user, I can delete the "/api/cars/{id}" page as "delete".

  Background:
    Given user connects to "/cars" and adds
    Then user I should be able to see the information "200"

  Scenario: The car removed from the system, should not be accessed again.
    Given user connects to "/cars" for car API
    Then verify if the car is deleted
  #  And verify if the value of delete count is 1
