#US_036	Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.
# https://kese.nl/new_home
#"İlerle" butonu görünür olmalıdır.
#"İlerle" butonu default olarak tıklanabilir olmamalıdır.
#Bilgi eksikliği durumunda, İlerle butonuna tıklanırsa "Lütfen evin yüzey alanını giriniz" uyarısı görünür olmalıdır.
#Zorunlu bilgiler eklendikten sonra İlerle butonu tıklanabilir olmalı.
#
#Not: Eklenmesi gereken zorunlu bilgiler, "Yüzey Alanı".
# msen

Feature: US_036	Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.

  Background:
    Given user is on login page "https://kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 3 in Home Exchange

Scenario:
  Then the user verifies that the ilerle button is displayed
and clickableonu is visible.
#"İlerle" butonu default olarak tıklanabilir olmamalıdır.
#Bilgi eksikliği durumunda, İlerle butonuna tıklanırsa "Lütfen evin yüzey alanını giriniz" uyarısı görünür olmalıdır.
#Zorunlu bilgiler eklendikten sonra İlerle butonu tıklanabilir olmalı.
#
#Not: Eklenmesi gereken zorunlu bilgiler, "Yüzey Alanı".