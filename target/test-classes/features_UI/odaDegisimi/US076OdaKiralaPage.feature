# US_076-Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 10. stepte "Resim ve Fotoğraflar" bölümlerinde butonları ve açıklamaları görebilmeliyim.
# Acceptance Criteria
#http://test.kese.nl/new_room
#"Resim ve Fotoğraflar" başlığı görünür olmalıdır.
#"Odanızın ve evinizin ilgili alanlarının fotoğraflarını yükleyiniz. En az 2 en fazla 10 adet fotoğraf ekleyebilirsiniz." açıklaması görünür olmalıdır.
#"Resimleri Seçin" butonu aktif ve kullanılabilir olmalıdır.
#"Tüm Resimleri Kaldır" butonu aktif ve kullanılabilir olmalıdır.
#"En az 5 en fazla 10 resim yükleyebilirsiniz." açıklaması görünür olmalıdır.
#10. stepte, sayfanın üst kısmına "10 / 10" yazısı görünür olmalıdır.

Feature: US_076 Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 10. stepte "Resim ve Fotoğraflar" bölümlerinde butonları ve açıklamaları görebilmeliyim.

  Background: Successful connection to site and coming to step 10 in "Ev Değişimi"
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 10 in Room Exchange Page

  Scenario: US_076 TC_001 Buttons and the descriptions of the OdaStep10Page should be visible
    Then user verifies that there is a "10 / 10" Page Step Number visible on the new room_step ten page
    Then user verifies that the title "Resim ve Fotograflar" is visible on the new_room step ten page
    Then user verifies that "the description of Resim ve Fotograflar" is visible on the new room_step ten page
    Then user verifies that Resimleri Secin button is active and functional on the new room_step ten page
    Then user verifies that Tum Resimleri Kaldir button is active and functional on the new room_step ten page
    Then user verifies that the description of the maximum loading pictures are visible on the new room_step ten page