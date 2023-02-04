#US_148
# Bir kullanıcı olarak "/api/reference/check/{email}" sayfasına "get" tipinde bağlanarak parametre olarak gönderdiğim email adresinin referans sayısını görebilmeliyim.
# https://kese.nl/api/reference/check/{email}
#Referans sayısı "sum" bölümü altında görünür olmalıdır.
#Swagger dökümanını inceleyiniz.

@MH-428
Feature: US_148_TE

  @TEST_MH-426
  Scenario Outline: US_148_TC_01_User should see the reference count of the sent "<emailWithReference>" email
    Given user connects to "/reference/check/{email}" endpoint with "<emailWithReference>"
    Then verify status code is 200 in reference of email endPoint
    And verify in the response has a value for sum key
    Examples:
      | emailWithReference   |
      | kullanici1@gmail.com |
      | kullanici3@gmail.com |


  @TEST_MH-427
  Scenario Outline: US_148_TC_02_User should NOT see any reference if the "<emailWithoutReference>" has no references_Negative
    Given user connects to "/reference/check/{email}" endpoint with "<emailWithoutReference>"
    Then verify status code is 200 in reference of email endPoint
    And verify in the response has NO value for sum key
    Examples:
      | emailWithoutReference |
      | kullanici2@gmail.com  |
      | hello@gmail.com       |
      | invalidmail@gmail.com |
