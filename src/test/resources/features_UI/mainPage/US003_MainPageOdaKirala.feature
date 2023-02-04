#US_003	Bir kullanıcı olarak ana sayfaya girdiğimde,
# "Oda Kirala" ilanlarında arama yapabilmeliyim.
# https://kese.nl/
#"Oda Kirala" tıklanabilir ve görünür olmalıdır.
#"Oda kirala seçili iken ""Oda değişimi yapmak istediğiniz yer"
# yazısı görünür olmalıdır."
# Oda Kirala" ilanlarında arama yababilmeliyim.

Feature:  As a user, when I go to the home page , I should be able to search for "Oda Kirala" postings.

  Background:
    Given the user should be on the homepage

  Scenario: The User can search adds on "Oda Kirala" adds
    Then the user verifies that the "Oda Kirala" button is displayed and clickable
    When the user clicks the Oda Kirala button
    Then the user verifies that the Oda Kirala Button is selected
    Then the user verifies that the text "Oda değişimi yapmak istediğiniz yer" is displayed.
    Then the user verifies that ilan ara input is enabled

