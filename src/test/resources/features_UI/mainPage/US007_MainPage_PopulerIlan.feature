#US_007	Bir kullanıcı olarak ana sayfaya girdiğimde, "Popüler İlanlar" bölümünü görebilmeliyim.
# https://kese.nl
#"Popüler İlanlar" yazısı görünür olmalıdır.
#"Ev Değişimi", "Oda Kirala" ve "Bed & Breakfast" bölümleri yer almalıdır.
#"Ev Değişimi", "Oda Kirala" ve "Bed & Breakfast" bölümleri seçilebilir olmalıdır.
#    by nur

@META3-125
Feature: As a user I should be able to see "Populer Ilanlar" part on the homepage

  Background:
    Given the user should be on the homepage

  @TEST_META3-121
  Scenario: the user should see Populer Ilanlar text on the homepage
    Then the user verifies that the text Populer Ilanlar is displayed on the homepage

  @TEST_META3-123 @nur
  Scenario: the user should see options such as "Ev Degisimi" , "Oda Kirala" , "Bed & Breakfast"
    Then system should display options on the homepage
      | Ev Değişimi     |
      | Oda Kirala      |
      | Bed & Breakfast |

  @TEST_META3-124
  Scenario Outline: User should select options such as "Ev Degisimi" , "Oda Kirala" , "Bed & Breakfast"
    When click "<options>" on the homepage
    And  system redirects from homepage to "<relevant>" pages
    Examples:
      | options         | relevant      |
      | Ev Değişimi     | /home         |
      | Oda Kirala      | /room         |
      | Bed & Breakfast | /bedbreakfast |

