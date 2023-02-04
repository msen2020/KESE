@US102
Feature: US102-Page2 location and transportation features
  # Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında,
  # 2. stepte "Konum ve Ulaşım" bilgilerini girebilmeliyim.

  Background: Login and navigate to ilan ver menu
    Given the user goes to "http://test.kese.nl/" page
    And user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks ilan ver menu on signed in home page
    When user clicks "Bed & Breakfast" in ilan ver menu
    And user clicks "Apartman Dairesi" option on on step one on oda kirala page
    And user clicks to the ilerle button on bab page
    Then step number "2 / 10" should be displayed on bab page

    Scenario: Verify Step 2 Konum ve Ulasim UI elements
      Then page title text "Konum ve Ulaşım" should be displayed on step two on bab page
      And page info text "Evinizin konumunu belirtiniz. Açık adres vermenize gerek yoktur." should be displayed on step two on bab page
      And below input boxes should be enabled
        | Ev ile otobüs durağı arası :  |
        | Ev ile tren istasyonu arası : |
        | Ev ile tramway durağı arası : |
      And sahsi arac ulasim box should be clickable on step two on bab page
      And step number "2 / 10" should be displayed on bab page




