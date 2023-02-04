# US_105
# Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.
# http://test.kese.nl/new_bed_breakfast
#"İlerle" butonu görünür olmalıdır.
#"İlerle" butonu default olarak tıklanabilir olmamalıdır.
#Bilgi eksikliği durumunda, İlerle butonuna tıklanırsa "Lütfen kullanım alanlarını giriniz." uyarısı görünür olmalıdır.
#Zorunlu bilgiler eklendikten sonra İlerle butonu tıklanabilir olmalı.
#
#Not: Eklenmesi gereken zorunlu bilgiler, "Yüzey Alanı".

Feature: Bir kullanıcı olarak "BadAndBreakfast" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.

  Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
    Given user is on login page "http://test.kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 3 in Bed & Breakfast


  Scenario:The "ilerle" button should be visible

    Given until  users fills in the blanks on page 3 "ilerle" button should not be functional
    When  users not enters required  information, she sees "Lütfen evin yüzey alanını giriniz"
    Then After users has entered the required information, the "ilerle" button should be clickable.