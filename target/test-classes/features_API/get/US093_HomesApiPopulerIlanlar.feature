@US093
Feature: Populer Ev Ilanlari Listing for Home API
  # Bir kullanici olarak "api/homes/homepage/ilans" sayfasina
  # "get" tipinda baglandigimda populer ilanlari gorebilmeliyim
  # En fazla 8 tane ilan listelenmelidir
  # İlanlar "okunmasayisi" bilgisine göre sıralı olmalıdır

  @MH-138
  Scenario: Home api max 8 populer ilan listing by read count order
    When user connects to "/homes/homepage/ilans" with GET for home API
    Then system should display max 8 populer ev ilani for home API
    And populer ev ilanlari should be displayed by read count order for home API




