#US_092
# Bir kullanıcı olarak "/api/homes/{id}/benzerilanlar" sayfasına "get" tipinde id'sini gönderdiğim evin benzer ilanlarını görebilmeliyim.
# http://test.kese.nl/api/homes/{id}/benzerilanlar
#En fazla 5 tane ilan listelenmelidir.
#Benzer ilan listesinde, id'si gönderilen ev listelenmeMElidir.
#Benzer ilanlar gönderilen adres bilgisine sahip olmalıdır. (en az bir ortak adres)
#
#"Gönderilecek datalar :  swagger dökümanınde belirtilmiştir"
#NURAY SARI

@US092
Feature: As a user, I should be able to see similar advertisements of the house whose id of type "get" I sent to the "/api/homes/{id}/benzerilanlar" page.

  Scenario Outline:
    Given connect to home benzerilanlar with endpoint "<id>"  query data "<query>" use get
    Then verify the response includes maximum of 5 advertisements
    Then verify the id list should not include sent id "<id>"
    Then verify address information must be same as at least one of "<city>" and "<country>"
    Examples:
      | id                       | query                                                                   | city           | country                   |
      | 61fe52dae970093ad0e4bef3 | ?address=Frankfurt, Almanya&address_list=Frankfurt, Almanya             | Frankfurt      | Almanya                   |
      | 61cf1b2389708a2d2aedcf0e | ?address=London, Birleşik Krallık&address_list=London, Birleşik Krallık | London         | Birleşik Krallık          |
      | 620107561a9c4175c99e97e8 | ?address_list=Rue de l'Arnon, Sainte-Croix, Switzerland                 | Rue de l'Arnon | Sainte-Croix, Switzerland |
