# US_136
# Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 6. stepte resimleri kaydedebilmeliyim.
#
#https://kese.nl/new_car
#"İlerle" butonu görünür olmalıdır.
#"İlerle" butonu default olarak tıklanabilir olmamalıdır.
#Bilgi eksikliği durumunda, İlerle butonuna tıklanırsa "Lütfen en az 5 tane resim seçiniz." uyarısı görünür olmalıdır.
#En az 5 tane resim eklendikten sonra İlerle butonu tıklanabilir olmalı.
  # QA msen

Feature: Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 6. stepte resimleri kaydedebilmeliyim.

  Background: Going to Page 6 on Birlikte Seyahat
    Given user is on login page
    When user logs in with "kullanici1@gmail.com" and "1234"
    And user clicks ilan ver menu on signed in home page
    And user clicks "Birlikte Seyehat" in ilan ver menu
    And user navigates to page 6 in Birlikte Seyahat

