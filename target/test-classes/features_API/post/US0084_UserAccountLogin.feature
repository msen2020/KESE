
Feature:US84-As a user, when I connect to "/api/user/account/login" page with "post" type, I should be able to login with the information I sent.

  @wip
  Scenario Outline: user logs in positive
    Given user connects to "/user/account/login" for login with "<email>" and "<password>"
    Then user verifies that status code is "<statusCode>" for login with email and password
    Then user verifies that response body has infos
      | sonuc         |
      | rol           |
      | kullanici_adi |
      | durum         |
      | _id           |

    Examples:
      | email              | password | statusCode |
      | kullanici1@email.com    | 1234     | 200        |



  Scenario Outline: user logs in negative
    Given user connects to "/user/account/login" for login with "<email>" and "<password>"
    Then user verifies that status code is "<statusCode>" for login with email and password


    Examples:
      | email              | password | statusCode |
      | kullanici1yyy@email.com | 1234     | 401        |
      | kullanici1@email.com    | 123488   | 401        |
      | kullanici1yyy@email.com | 1234555  | 401        |