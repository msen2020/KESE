
Feature: TC_001_US_058-Bir kullanıcı olarak "Oda Kirala & Değişim"
  ilan oluşturma sayfasında, 2. stepte "Konum ve Ulaşım" bilgilerinigirebilmeliyim.

  Background: user should be on the Konum ve Ulasim page
    Given user goes to "https://kese.nl" Page
    When "cemile@gmail.com" signed in on sign in page
    And user goes to "https://kese.nl/new_room" page
    And user chooses house type on the new home step one page
    And user clicks "Odamı kiraya vermek istiyorum." button
    And user clicks "Karşılıklı oda değişimi yapmak istiyorum." button
    And user clicks to the ilerle button on the new home page
    And user should able to see Konum ve Ulasim text

  Scenario: : user should able to go next page fiiling mandatory fields
    And user chooses "London, Birleşik Krallık" an address from the list in new home step two page
    And Ev ile otobus duragi arasi input field should be usable
    And Ev ile tren istasyonu arasi input field should be usable
    And Ev ile tramway duragi arasi input field should be usable
    And Sadece sahsi arac ile... checkbox button should be usable
    And verify if ilerle button should be clickable

  Scenario: : NEGATIVE user should not able to go next page with out input any mandatory fields
    And user verifies that ilerle button should not be clickable


  Scenario: NEGATIVE user should not able to go to next page only with input location
    And user chooses "London, Birleşik Krallık" an address from the list in new home step two page
    And user verifies that ilerle button should not be clickable

  Scenario: NEGATIVE user should not able to go to next page only with input Ev ile Otobus Duragi field
    And Ev ile otobus duragi arasi input field should be usable
    And user verifies that ilerle button should not be clickable

  Scenario: NEGATIVE user should not able to go to next page only with input Ev ile Tren Istasyonu field
    And Ev ile tren istasyonu arasi input field should be usable
    And user verifies that ilerle button should not be clickable

  Scenario: NEGATIVE user should not able to go to next page only with input Ev ile Tramvay field
    And Ev ile tramway duragi arasi input field should be usable
    And user verifies that ilerle button should not be clickable

  Scenario: NEGATIVE user should not able to go to next page only with check checkbox
    And Sadece sahsi arac ile... checkbox button should be usable
    And user verifies that ilerle button should not be clickable


