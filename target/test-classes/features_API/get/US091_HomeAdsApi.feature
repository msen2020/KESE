#US_091
# Bir kullanıcı olarak "/api/homes/search/ilanlistesi/{bulundugu_sayfa}" sayfasına "get" tipinde bağlandığımda ilanlari dogru siralayabilmeliyim
# https://kese.nl/api/homes/search/ilanlistesi/{bulundugu_sayfa}
#En fazla 20 tane ilan listelenmelidir.
#Tarihe göre ya da görüntülenme sayısısına göre sıralı olabilmelidir.
#"Gönderilecek datalar :  swagger dökümanınde belirtilmiştir"

Feature: Bir kullanıcı olarak "/api/homes/search/ilanlistesi/{bulundugu_sayfa}" sayfasına "delete" tipinde bağlandığımda ilanı sistemden kaldırabilmeliyim.

  Scenario: US091_TC001 A maximum of 20 ad should be listed and they should be able to be sorted by date.
    When GET all of ads on 1. page as JSON in "date" order
    Then user asserts that there are a maximum of 20 ads
    And user asserts whether the advertisements are in "date" order

  Scenario: US091_TC002 Ads also should be able to be sorted according to the number of views, either.
    When GET all of ads on 1. page as JSON in "viewed" order
    And user asserts whether the advertisements are in "viewed" order

  Scenario: US091_TC003 The ad should be able to be deleted from the system by connecting in the Delete type.
    Given GET secret_token, id and user name for authorized user
    Then POST a new home advertisement and get id of it
    And DELETE the advertisement with users secret_token and id of home
    Then user asserts that home has been by authorized user deleted

  Scenario: US091_TC004 Unauthorized users could not be able to delete the ad
    Given GET secret_token, id and user name for authorized user
    Then POST a new home advertisement and get id of it
    And DELETE the advertisement with unauthorized user
    Then user asserts that home has been by unauthorized user not deleted
