@ui
Feature: US_054 Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 10. stepte tüm resimleri kaldır butonu yardımıyla, eklenen resimleri kaldırabilmeliyim.

  Background: Successful connection to site and coming to step 10 in "Ev Değişimi"
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 10 in Home Exchange

  Scenario: TC_001 US_054 Tüm Resimleri Kaldır butonuna tıklayınca eklenen tüm resimleri kaldırabilmeliyim.
    When user adds 7 pictures on the home change page
    And user clicks Tüm Resimleri Kaldır button on the home change page
    Then user asserts that all pictures are removed

  Scenario: TC_002 US_054 İlk resim ekleme inputu aktif, diğerleri disabled olmalıdır.
    Then user asserts that first add picture frame is enabled and others are disabled