Feature: Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 8. stepten 9. stepe geçiş yapabilmeliyim.

  Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
    Given user is on login page "http://test.kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 8 in Bed And Breakfast Page

  Scenario: TC_001_US_115 "İlerle" butonu görünür olmalıdır.
    Then user asserts ilerle button is visible


  Scenario: TC_002_US_115 "İlerle" butonu default olarak tıklanabilir olmamalıdır.
    Then user asserts ilerle button should not be clickable as a default

  Scenario: TC_003_US_115 Bilgi eksikliği durumunda, İlerle butonuna tıklanırsa "Lütfen özel şart seçiniz." uyarısı görünür olmalıdır.
    Then user asserts ilerle button should not be clickable if required informations are not filled

  Scenario: TC_004_US_115 Zorunlu bilgiler eklendikten sonra İlerle butonu tıklanabilir olmalı.
    Then user asserts ilerle button should be clickable if required informations are filled in page eights