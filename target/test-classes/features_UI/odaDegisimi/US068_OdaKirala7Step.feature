@META3-477
Feature: Bir kullanici olarak "Oda Kirala & Degisimi" ilan olusturma sayfasinda,
  7. stepte "Aktiviteler" bilgisini girebilmeliyim

  Background: Successful connection to site and coming to step 7 in "Oda Kirala"
    Given user is on login page "https://kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user should click to Ilan Ver go to page 7 in Oda
  @TEST_META3-475
  Scenario: Title, warning message and number of the page should be visible
    Then user verifies that "Aktiviteler" is visible at Oda Kirala
    Then user verifies that "Evinizin çevresinde yapılabilecek aktiviteleri belirtiniz." message is visible at Oda Kirala
    Then user verifies that number of the "7 / 10" page is visible at Oda Kirala

  @TEST_META3-476
  Scenario: All selections should be clickable
    Then user verifies that all selections should be clickable at Oda Kirala
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