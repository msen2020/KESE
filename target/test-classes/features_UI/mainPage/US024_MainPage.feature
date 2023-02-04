# TEST CASE US_024
# -Bir kullanıcı olarak anasayfada, giriş yaptıktan sonra
# sağ üstte "İlan Ver" butonu yardımıyla ilan oluşturma sayfalarına gidebilmeliyim.
# Acceptance Criteria
# http://test.kese.nl/
# Ev Değişimi linki görünür olmalıdır, tıklandığında "/new_home" sayfasına gidilmelidir.
# Oda linki görünür olmalıdır, tıklandığında "/new_room" sayfasına gidilmelidir.
# Bed & Breakfast linki görünür olmalıdır, tıklandığında "/new_bed_breakfast" sayfasına gidilmelidir.
# Birlikte Seyehat linki görünür olmalıdır, tıklandığında "/new_car" sayfasına gidilmelidir.
# Kargo linki görünür olmalıdır, tıklandığında "/new_cargo" sayfasına gidilmelidir.

@signup1
Feature:US_024-Bir kullanıcı olarak anasayfada, giriş yaptıktan sonra sağ üstte "İlan Ver" butonu yardımıyla ilan oluşturma sayfalarına gidebilmeliyim.

  Background:
    Given the user goes to "http://test.kese.nl/" page
    Given user is on login page "http://test.kese.nl/login"
    When user enters valid username "email@gmail.com"
    And user enters valid password "3344"
    And user clicks on Login button
    When the user clicks The "İlan Ver" link it redirects to page


  Scenario Outline:TC_001_US_024 Kullanici İlan Ver" butonu yardımıyla ilan oluşturma sayfalarına gider
    Then the user asserts that The "<link>" link is visible
    When the user clicks The "<link>" link it redirects to page
    Then the user verifies that he can go to the "<page>" page

    Examples:
      | link             | page               |
      | Ev Değişimi      | /new_home          |
      | Oda              | /new_room          |
      | Bed & Breakfast  | /new_bed_breakfast |
      | Birlikte Seyehat | /new_car           |
      | Kargo            | /new_cargo         |

