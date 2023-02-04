#US_036	Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.
# https://kese.nl/new_home
#"İlerle" butonu görünür olmalıdır.
#"İlerle" butonu default olarak tıklanabilir olmamalıdır.
#Bilgi eksikliği durumunda, İlerle butonuna tıklanırsa "Lütfen evin yüzey alanını giriniz" uyarısı görünür olmalıdır.
#Zorunlu bilgiler eklendikten sonra İlerle butonu tıklanabilir olmalı.
#Not: Eklenmesi gereken zorunlu bilgiler, "Yüzey Alanı".
#

Feature: Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.

  Background:
  #Successful connection to site and coming to step 10 in "Ev Değişimi"
    Given user is on login page "https://kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 3 in Home Exchange

  Scenario:The "ilerle" button should be visible

    Given until the user fills in the blanks on page 3 "ilerle" button should not be functional
    When the user click "ilerle" button
    When the user not enters required  information, she sees "Lütfen evin yüzey alanını giriniz"
    Then After the user has entered the required information, the "ilerle" button should be clickable.