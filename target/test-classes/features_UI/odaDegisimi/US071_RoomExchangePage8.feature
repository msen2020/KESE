Feature: US_071_Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 8. stepten 9. stepe geçiş yapabilmeliyim.

  Background:
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | hamza@gmail.com | 1234 |
    And user should click to Ilan Ver go to page 8 in OdaDegisimi

  Scenario: TC_001_US_071 "İlerle" butonu görünür olmalıdır.
    Then user asserts ilerle button is visible


    Scenario: TC_002_US_046 "İlerle" butonu default olarak tıklanabilir olmamalıdır.
      Then user asserts ilerle button should not be clickable as a default

  Scenario: TC_003_US_046 Bilgi eksikliği durumunda, İlerle butonuna tıklanırsa "Lütfen özel şart seçiniz." uyarısı görünür olmalıdır.
    Then user asserts ilerle button should not be clickable if required informations are not filled

  Scenario: TC_004_US_071 Zorunlu bilgiler eklendikten sonra İlerle butonu tıklanabilir olmalı.
    Then user asserts ilerle button should be clickable if required informations are filled in page eights