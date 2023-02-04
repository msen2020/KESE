# US_077 Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 10. stepte "Resim ve Fotoğraflar" ekleyebilmeliyim.
# http://test.kese.nl/new_room
#Sayfada default olarak 4 tane resim ekleme butonu görünür olmalıdır.
#Default olarak sadece ilk buton tıklanabilir olmalı, diğerleri "disabled" olmalıdır.
#İlk resim eklenince, ikinci resim ekle butonu aktif hale gelmelidir, bu son resime kadar böyle devam etmelidir.

Feature: US_077 Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 10. stepte "Resim ve Fotoğraflar" ekleyebilmeliyim.

  Background: Successful connection to site and coming to step 10 in "Ev Değişimi"
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 10 in Room Exchange Page

  Scenario: US_077 TC_001 Buttons and the descriptions should be visible
    Then user verifies that the four image add buttons are visible as default on the new room_step ten page
    Then user verifies that only the first image add buttons is clickable as default on the new room_step ten page
    Then user verifies that the rest of the image add buttons are disabled on the new room_step ten page
    When user clicks and adds the first image button
    Then user verifies that after adding the first image, the second Add image Button has become active and this should continue until the last picture on the new room_step ten page