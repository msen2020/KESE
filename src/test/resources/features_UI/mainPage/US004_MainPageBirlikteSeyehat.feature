# US_004
# Bir kullanıcı olarak ana sayfaya girdiğimde,
# "Birlikte Seyehat" ilanlarında arama yapabilmeliyim.
# https://kese.nl/
# "Birlikte Seyehat" tıklanabilir ve görünür olmalıdır.
# Birlikte seyehat seçili iken "Seyehat etmek istediğiniz yeri seçiniz" yazısı görünür olmalıdır.
#Not: Tıklanabilir mi vb onun da kontrol edilmesi.
#
Feature: As a user, when I go to the home page , I should be able to search for "Birlikte Seyehat" postings.

  Background:
    Given the user should be on the homepage

  Scenario: "Birlikte Seyehat" title verification
    Then the user verifies that Birlikte Seyahat Button is displayed and enabled
    When the user clicks the "Birlikte Seyehat" button
    Then the user verifies that Birlikte Seyehat is selected
    Then the user verifies that the text -Seyehat etmek istediginiz yeri seciniz- is displayed.
    And the user enters "Sevilla" into the ilan Ara inbox
    When the user clicks the Ilan Ara Button
    Then the user verifies that the Ilan results are displayed on the result page

