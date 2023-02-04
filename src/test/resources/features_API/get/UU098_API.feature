Feature: US_098 Bir kullanıcı olarak "/api/rooms/{id}/benzerilanlar" sayfasına "get" tipinde id'sini gönderdiğim odaya ait benzer ilanlarını görebilmeliyim.
#  En fazla 5 tane ilan listelenmelidir.
#  Benzer ilan listesinde, id'si gönderilen oda listelenmeMElidir.
#  Benzer ilanlar gönderilen adres bilgisine sahip olmalıdır. (en az bir ortak adres)

  Scenario: user should be verifies when get request on benzer ilanlar page
    Given user send get request on benzer ilanlar page with this id "61f879178ca7ec436c5b5a46" and this address "London, Birleşik Krallık"
    Then user verifies that there are at most 5 benzer ilan listed
    Then user verifies that this "61f879178ca7ec436c5b5a46" is not listed on the response
    Then user verifies that the address was sent "London, Birleşik Krallık" should be common with benzer ilanlar
