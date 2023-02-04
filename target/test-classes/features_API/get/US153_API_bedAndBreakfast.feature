# US_153-Bir kullanıcı olarak "/api/bedbreakfasts/{id}/benzerilanlar" sayfasına
# "get" tipinde id'sini gönderdiğim ilanın benzer ilanlarını görebilmeliyim.
# https://kese.nl/api/bedbreakfasts/{id}/benzerilanlarEn fazla 5 tane ilan listelenmelidir.
# Benzer ilan listesinde, id'si gönderilen ilan listelenmeMElidir.
# Benzer ilanlar gönderilen adres bilgisine sahip olmalıdır. (en az bir ortak adres)
#"Gönderilecek datalar :  swagger dökümanınde belirtilmiştir"

  # QA Engineer MSEN

Feature: US_153_TC001-Bir kullanıcı olarak "/api/bedbreakfasts/{id}/benzerilanlar" sayfasına "get" tipinde id'sini gönderdiğim ilanın benzer ilanlarını görebilmeliyim.

  Scenario: US_153_TC001
    Given user creates new user
    And user logs in "/user/account/login" with existing user info via post request
    Then user verifies that status code is 200 for login.
    And user creates an add on bed and breakfast page
    Then user verifies that he can see the similar adds
    Then user verifies that there are max 5 similar adds


