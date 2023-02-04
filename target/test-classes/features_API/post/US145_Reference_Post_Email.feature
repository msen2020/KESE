@US145
  # Nursel
Feature: US 145 Reference to an account
  # Bir kullanıcı olarak "/api/reference" sayfasına
  #"post" tipinde bağlanarak istediğim email adresine referans olabilmeliyim
  @MH-414
  Scenario Outline: Authorized reference author <user email> creates a reference
    Given user logs in with "<user email>", "<user sifre>" as "<user role>" with POST for user API
    Then status code should be 200 and sonuc should be "true" for user API
    And "<user email>" user is authorized to add an email for reference API
    When user adds a new email with POST for reference API
    Then reference author should be "<user email>" and reference member's count should be <reference count>
    And reference member's role should be "<members role>" for reference API

    Examples:
      | user email          | user sifre | user role      | reference count | members role |
      | fakeadmin@gmail.com | 1234       | admin          | 2               | yetkili      |
      | abct@gmail.com      | 1234       | yetkili        | 2               | kullanici    |
      | moris@gmail.com     | 1234       | referansli uye | 1               | kullanici    |

  @MH-419
  Scenario Outline: Unauthorized user can not create a reference for a given email
    Given user logs in with "<unauth user email>", "<unauth user sifre>" as "<unauth user role>" with POST for user API
    And "<unauth user email>" user with <sum count> is unauthorized to add an email for reference API
    When user adds a new email with POST for reference API
    Then status code "500" should be displayed for reference API

    Examples:
      | unauth user email | unauth user sifre | unauth user role | sum count |
      | mavi@gmail.com    | 1234              | kullanici        | 1         |
      | beyaz@gmail.com   | 1234              | kullanici        | 0         |

  @MH-420
  Scenario Outline: Authorized user can not create a self-reference
    Given user logs in with "<author email>", "<author sifre>" as "<author role>" with POST for user API
    When user adds "<member email>" with POST for reference API for herself
    Then message "<rejection message>" should be displayed

    Examples:
      | author email        | author sifre | author role | member email        | rejection message          |
      | fakeadmin@gmail.com | 1234         | admin       | fakeadmin@gmail.com | kendine referans olamazsın |
      | abct@gmail.com      | 1234         | yetkili     | abct@gmail.com      | kendine referans olamazsın |
      #| fakeadmin@gmail.com | 1234         | admin       | qaz@gmail.com       | sadece 1 kere referans olabilirsiniz |
      #| abct@gmail.com      | 1234         | yetkili     | moris@gmail.com     | sadece 1 kere referans olabilirsiniz |
