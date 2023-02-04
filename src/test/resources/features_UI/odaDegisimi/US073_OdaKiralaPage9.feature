Feature: US_073 Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 9. stepten 10. stepe geçiş yapabilmeliyim.

  Background:
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | hamza@gmail.com | 1234 |
    And user should click to Ilan Ver go to page 9 in OdaDegisimi

  Scenario: "ilerle" button should be visible
    Then verify if "İlerle" button is visible
    Then verify if "İlerle" button shouldn't be clickable as a default
    When user clicks "İlerle" button without any selection at Oda Kirala
    Then verify if "*Lütfen tarih seçiniz." warning message appears

  Scenario: "İlerle" button should be clickable after any selection
    When user clicks any date on page nine
    Then verify if ilerle button should be clickable
    When user clicks to the ilerle button on the new home page
    And verify if the number of page "10 / 10" is visible

