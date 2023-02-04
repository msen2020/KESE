#US_094	Bir kullanıcı olarak "/api/rooms" sayfasına "post" tipinde bağlandığımda gönderilen bilgiler ile yeni bir oda değişimi ilanı oluşturabilmeylim.
# http://test.kese.nl/api/rooms
#Zorunlu bilgiler gönderilerek yeni bir oda ilanı oluşturulabilmelidir.
#Kullanıcı giriş yapmış olmalıdır. (token)
#"Gönderilecek datalar :  swagger dökümanınde belirtilmiştir"
  # by nur

Feature: Creating new room

  Background:
    Given user logged in with API

  Scenario: Creating new room Positive Testing
    When user enters required data
    Then verify status code is 202

  Scenario: Negative testing without secret_token
    When user enters all requirement data without sending secret token
    Then verify status code is 401
    And verify if the room is deleted from the database




