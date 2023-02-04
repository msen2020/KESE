@US103
Feature: US103 - BAB Page - Step 2 next function from Step 2 to Step 3
  # Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında,
  # 2. stepten 3. stepe geçiş yapabilmeliyim.

  Background: Go to BAB Page Step 2
    Given the user goes to "http://test.kese.nl/" page
    And user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks ilan ver menu on signed in home page
    When user clicks "Bed & Breakfast" in ilan ver menu
    And user clicks "Apartman Dairesi" option on on step one on oda kirala page
    And user clicks to the ilerle button on bab page
    Then step number "2 / 10" should be displayed on bab page

  Scenario: Step 2 Ilerle Button Not Clickability By Default
    * ilerle button should be visible on bab page
    But ilerle button should not be clickable on bab page
    When user clicks to the ilerle button on bab page
    Then warning message "*Lütfen ulaşım olanağı bilgisi ekleyin." should be displayed on step "2 / 10" on bab page

  Scenario: Step 2 Missing Info 1 Ulasim Olanaklari Ilerle Button Not Clickability
    When user enters "Litvanya" to address input on step two on bab page
    Then sectiginiz adres "Litvanya" should be displayed on step two on bab page
    But ilerle button should not be clickable on bab page
    When user clicks to the ilerle button on bab page
    Then warning message "*Lütfen ulaşım olanağı bilgisi ekleyin." should be displayed on step "2 / 10" on bab page

  Scenario: Step 2 Missing Info 2 Home Location Ilerle Button Not Clickability
    When user enters ulasim olanaklari from home on step two on bab page
      | Ev ile otobüs durağı arası :  | 0.7 |
      | Ev ile tren istasyonu arası : | 2.1 |
      | Ev ile tramway durağı arası : | 0.5 |
    And user clicks sahsi arac ulasim checkbox on step two on bab page
    Then ilerle button should not be clickable on bab page
    When user clicks to the ilerle button on bab page
    Then warning message "*Lütfen ulaşım olanağı bilgisi ekleyin." should be displayed on step "2 / 10" on bab page

  Scenario: Step 2 Complete Info 1 Ilerle Button Clickability
     When user enters "San Fernando, Şili" to address input on step two on bab page
     Then sectiginiz adres "San Fernando, Şili" should be displayed on step two on bab page
     When user enters ulasim olanaklari from home on step two on bab page
      | Ev ile otobüs durağı arası :  | 1.4 |
     Then ilerle button should be clickable on bab page
    And user clicks to the ilerle button on bab page
    Then step number "3 / 10" should be displayed on bab page

  Scenario: Step 2 Complete Info 2 Ilerle Button Clickability
     When user enters "Venedig, Venedik, İtalya" to address input on step two on bab page
     Then sectiginiz adres "Venedig, Venedik, İtalya" should be displayed on step two on bab page
     When user clicks sahsi arac ulasim checkbox on step two on bab page
     Then ilerle button should be clickable on bab page
     And user clicks to the ilerle button on bab page
     Then step number "3 / 10" should be displayed on bab page


