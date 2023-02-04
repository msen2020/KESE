#US_087
# Bir kullanıcı olarak "/api/user/bilgi" sayfasına "get" tipinde bağlandığımda
# kullanıcı bilgilerini görebilmeliyim.	http://test.kese.nl/api/user/bilgi
#Kullanıcıya ait bilgiler görünmelidir.
#"Gönderilecek datalar :  (query olarak)
#id: bilgisi alınacak kullanıcı id bilgisi"

Feature: US_087	As a user, I should be able to see user information when I connect to the "/api/user/information" page in the "get" type.

  Scenario: user should be able to see user information
    Given user connect to "/api/user"
    Then  user verifies that status code is 200
    Then user verifies that response body has sonuc is "true"

