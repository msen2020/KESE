Feature: US120-Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 10. stepte "Resim ve Fotoğraflar" bölümlerinde butonları ve açıklamaları görebilmeliyim.


  Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
    Given user is on login page "http://test.kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 10 in Bed & Breakfast


  Scenario: US_0120 TC_001 Buttons and the descriptions should be visible
    Then user verifty that there is a "10 / 10" Page Step Number visible on the bed and breakfast ten page
    Then user verifty that the title "Resim ve Fotograflar" should be visible on the bed and breakfast ten page
    Then user verifty that the description of Resim ve Fotograflar should be visible on the bed and breakfastp ten page
    Then user verifty that Resimleri Secin button is active and functional on the bed and breakfast ten page
    Then user verifty that Tum Resimleri Kaldir button is active and functional on the bed and breakfast  ten page
    Then user verifty that the description of the maximum loading pictures should be visible on then bed and breakfast ten page