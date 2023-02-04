#US_096	Bir kullanıcı olarak "/api/rooms/{id}" sayfasına "delete" tipinde bağlandığımda ilanı sistemden kaldırabilmeliyim.
# https://kese.nl/api/rooms
#Sistemden kaldırılan oda değişimi ilanına tekrar ulaşılamamalıdır.
#Kullanıcı giriş yapmış olmalıdır. (token)
#
#"Gönderilecek datalar :  swagger dökümanınde belirtilmiştir"

Feature: US096 Bir kullanıcı olarak "/api/rooms/{id}" sayfasına "delete" tipinde bağlandığımda ilanı sistemden kaldırabilmeliyim.

  Background:
    Given user logged in with API
    When user enters required data
    Then verify status code is 202

  Scenario: The room removed from the system, should not be accessed again.
    Given user connects to "/rooms" for rooms API
#    When user deletes rooms for rooms API
    Then verify if the room is deleted
    And verify if the value of deleted count is 1