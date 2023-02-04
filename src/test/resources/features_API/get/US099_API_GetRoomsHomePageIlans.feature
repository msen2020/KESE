Feature: Bir kullanıcı olarak "/api/rooms/homepage/ilans" sayfasına "get"
  tipinde bağlandığımda popüler oda değişimi ilanlarını görebilmeliyim..

#  US_099
#  "http://test.kese.nl/api/rooms/homepage/ilans
#  "
#  En fazla 8 tane ilan listelenmelidir.
#  İlanlar "okunmasayisi" bilgisine göre sıralı olmalıdır.
#  Status code 200 olmalidir.
#  "Gönderilecek datalar :  swagger dökümanınde belirtilmiştir
#  "

  Scenario: TC001_US_099
    Given user connects to "/homepage/ilans" with get request
    And User should be able to see max eight postings
    And Posts should be in order by okunmasayisi
    And status code should be 200


