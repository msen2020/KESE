#Bir kullanıcı olarak "/api/bedbreakfasts/status" sayfasına "patch" tipinde bağlanarak ilana ait "status" değerini güncelleyebilmeliyim.
#İlan sahibi giriş yapan kullanıcı olmalıdır. Aksi durumda güncellemeye izin verilmemelidir.

Feature: Bir kullanıcı olarak "/api/bedbreakfasts/status" sayfasına "patch" tipinde bağlanarak ilana ait "status" değerini güncelleyebilmeliyim.

  Scenario: US_155_TC001 valid token and id
    Given user patch status on "/bedbreakfasts/status" with valid token
    Then assert that status code 202 and nModified is 1

  Scenario: NEGATIVE US_155_TC002 invalid token valid id
    Given user patch status on "/bedbreakfasts/status" with invalid token
    Then assert that status code 202 and nModified is 0

  Scenario: NEGATIVE US_155_TC003 invalid token invalid id
    Given user patch status on "/bedbreakfasts/status" with invalid token invalid id
    Then assert that status code 202 and nModified is 0

  Scenario: NEGATIVE US_155_TC004 valid token invalid id
    Given user patch status on "/bedbreakfasts/status" with valid token invalid id
    Then assert that status code 202 and nModified is 0