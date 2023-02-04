@US169
Feature: US169 authorized user updates status of cargo
  # Bir kullanıcı olarak "/api/cargos/status" sayfasına
  # "patch" tipinde bağlanarak ilana ait "status" değerini güncelleyebilmeliyim.

  @MH-395
  Scenario Outline: User <user email> updates <status> of cargo
    Given user logs in with "<user email>" and "<user sifre>" with POST for user API
    And user updates "<status>" for "<id>" with PATCH for cargo API
    Then status code should be <status code> and modified info should be <nModified> for cargo API

    Examples:
      | user email      | user sifre | status | id                       | status code | nModified |
      | nbc@gmail.com   | jkl123     | false  | 6215825844c42508ff524d49 | 202         | 1         |
      | beyaz@gmail.com | 1234       | true   | 6215825844c42508ff524d49 | 202         | 0         |
      | qaz@gmail.com   | 1234       | true   | 6215a59544c42508ff524eb7 | 202         | 1         |
      | qaz@gmail.com   | 1234       | false  | 621583a344c42508ff524d52 | 202         | 0         |
