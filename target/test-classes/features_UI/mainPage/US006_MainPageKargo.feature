#US_006	Bir kullanıcı olarak ana sayfaya girdiğimde, "Kargo" ilanlarında arama yapabilmeliyim.
# https://kese.nl/
#"Kargo" tıklanabilir ve görünür olmalıdır.
#Kargo seçili iken "Kargo göndermek istediğiniz noktayı seçiniz" yazısı görünür olmalıdır.
#Not: Tıklanabilir mi vb onun da kontrol edilmesi.

@US_006
Feature: Cargo is clickable and visible and message is visible

  Background:
    Given go to "https://kese.nl/" page

  @META3-128
  Scenario: Cargo button should be clickable and displayed
    Then Cargo button should be clickable and displayed
    
  @META3-144
  Scenario: "Kargo göndermek istediğiniz noktayı seçiniz" is displayed
    And Click Cargo button
    Then "Kargo göndermek istediğiniz noktayı seçiniz" is displayed