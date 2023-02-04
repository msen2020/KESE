Feature: US_046_Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 8. stepten 9. stepe geçiş yapabilmeliyim.

  Background:
  #Successful connection to site and coming to step 10 in "Ev Değişimi"
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 8 in HomeExchange

    Scenario: TC_001_US_046 "İlerle" butonu görünür olmalıdır.
      Then user asserts ilerle button is visible

    Scenario: TC_002_US_046 "İlerle" butonu default olarak tıklanabilir olmamalıdır.
      Then user asserts ilerle button should not be clickable as a default

  Scenario: TC_003_US_046 Bilgi eksikliği durumunda, İlerle butonuna tıklanırsa "Lütfen özel şart seçiniz." uyarısı görünür olmalıdır.
    Then user asserts ilerle button should not be clickable if required informations are not filled

  Scenario: TC_004_US_046 Zorunlu bilgiler eklendikten sonra İlerle butonu tıklanabilir olmalı.
    Then user asserts ilerle button should be clickable if required informations are filled

