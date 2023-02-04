@MH-241
Feature:US_112 Bir kullanici olarak "Bed & Breakfast" ilan olusturma sayfasinda,
  7. stepte "Aktiviteler" bilgisini girebilmeliyim

   Background: US_112 Successful connection to site and coming to step 7 in "Bed & Breakfast"
    Given user is on login page "http://test.kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 7 in Bed And Breakfast Page
  @TEST_MH-242 @TESTSET_MH-47
  Scenario: US_112_TC_01 Title, warning message and number of the page should be visible
    Then user verifies that "Aktiviteler" is visible at Bed & Breakfast
    Then user verifies that "Evinizin çevresinde yapılabilecek aktiviteleri belirtiniz." message is visible at Bed & Breakfast
    Then user verifies that number of the "7 / 10" page is visible at Bed & Breakfast
  @TEST_MH-243 @TESTSET_MH-47
  Scenario: US_112_TC_02 All selections should be clickable
    Then user verifies that all selections should be clickable at Bed & Breakfast
      | Lunapark        |
      | Plaj            |
      | Bisiklet Yolu   |
      | Müze            |
      | Balık Tutma     |
      | Kayak Yapma     |
      | Spor Salonu     |
      | Doğa Yürüyüşü   |
      | Ünlü Meydan     |
      | Çocuk Parkı     |
      | Helal Restorant |
      | AVM             |
      | Sinema          |
      | Camii & Dernek  |