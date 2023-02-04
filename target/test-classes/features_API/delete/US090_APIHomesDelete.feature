# US090_APIHomesDelete
# Bir kullanıcı olarak "/api/homes/{id}" sayfasına "delete" tipinde bağlandığımda ilanı sistemden kaldırabilmeliyim.
# http://kese.nl/api/homes
#Sistemden kaldırılan ev ilanına tekrar ulaşılamamalıdır.
#Kullanıcı giriş yapmış olmalıdır. (token)
#"Gönderilecek datalar :  swagger dökümanınde belirtilmiştir"
# http://kese.nl/api/api-docs/#/homes/deleteHomeById

Feature: US090_APIHomesDelete TC001_Bir kullanıcı olarak "/api/homes/{id}" sayfasına "delete" tipinde bağlandığımda ilanı sistemden kaldırabilmeliyim.

Given User logs in by using a token
Then User verifies the house advertisement that has been removed from the system cannot be accessed again.

  Scenario Outline: TC001_
    Given user creates new user
    Then user verifies that status code is 201 for create user
    And user logs in "/user/account/login" with new user info via post request
    Then user verifies that status code is 200 for login
    Then user connects to "/homes" to create new home with new user info via post request
    Then user verifies that status code is 202 for create new home
    When user connects to "/homes/search/ilanlistesi/{bulundugu_sayfa}" for search homes with "<bulundugu_sayfaReq>" "<address>" "<address_listReq>" "<order>"
    Then user verifies that status code 200 for delete home
    Then user verifies that delete home with request "/homes/{id}"
    Then user verifies that status code 200 for delete home
    Then user verifies that deletedCount 1
    Examples:
      | bulundugu_sayfaReq | address                                   | address_listReq                           | order |
      | 1                  | Rue de l'Arnon, Sainte-Croix, Switzerland | Rue de l'Arnon, Sainte-Croix, Switzerland | date  |