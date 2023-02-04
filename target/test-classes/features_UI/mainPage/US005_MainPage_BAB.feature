#US_005	Bir kullanıcı olarak ana sayfaya girdiğimde,
# "Bed & Breakfast" ilanlarında arama yapabilmeliyim.
# https://kese.nl/
#"Bed & Breakfast" tıklanabilir ve görünür olmalıdır.
#Bed & breakfast seçili iken "Gitmek istediğiniz Yer" yazısı görünür olmalıdır.
#Not: Tıklanabilir mi vb onun da kontrol edilmesi.
#
Feature:US_005 Bir kullanıcı olarak ana sayfaya girdiğimde, "Bed & Breakfast" ilanlarında arama yapabilmeliyim.

  Background:The user is on the Home Page
    Given the user should be on the homepage

  Scenario:TC001 US005-"Bed & Breakfast" button should be visible
    Then the user verifies that the Bed & Breakfast button is displayed and clickable
    When the user clicks the Bed & Breakfast button
    Then the user verifies that Bed & Breakfast is selected
    Then the user verifies that the text "Gitmek istediğiniz Yer" is visible.
    And the user enters "Sevilla, İspanya" into the ilan Ara inbox
    When the user clicks the Ilan Ara Button
    Then the user verifies that the Ilan results are displayed on the result page
