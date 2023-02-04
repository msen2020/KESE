#US_002
#Bir kullanıcı olarak ana sayfaya girdiğimde,
# "Ev Değişimi" ilanlarında arama yapabilmeliyim.
#http://kese.nl
#"Ev Değişimi" tıklanabilir ve görünür olmalıdır.
#Ev değişimi seçili iken "Ev değişimi yapmak istediğiniz yer" yazısı görünür olmalıdır.
#Not: Tıklanabilir mi vb onun da kontrol edilmesi.@mainPage

Feature: Bir kullanıcı olarak ana sayfaya girdiğimde,
  "Ev Değişimi" ilanlarında arama yapabilmeliyim.

  Background: login page
    Given User is on the login page

#   @wip
  Scenario: "Home Exhange" button should be visible and clickable
    Then the user verifies that the "Ev Degisimi" button is displayed and enabled
    When the user clicks Ev Degisimi Button
    Then the user verifies that Ev Degisimi is selected
    Then the user verifies that the text "Ev değişimi yapmak istediğiniz yer" is displayed
    And the user enters "Sevilla" into the ilan Ara inbox
    When the user clicks the Ilan Ara Button
    Then the user verifies that the Ilan results are displayed on the result page