Feature:US147
#Nuray
  Scenario: As a user, I should be able to see the reference count of the logged in user by connecting to the "/api/reference/single" page with "get" type.
    Given user connects to "/reference/single" with endpoint
    Then user verifies the response status code is 200
    Then user verifies the referance value of sum "[100]" count