#US_008
#Bir kullanıcı olarak ana sayfaya girdiğimde, "Popüler İlanlar" bölümündeki ilanların resimlerini ve bilgilerini görebilmeliyim.
# https://kese.nl
#"Ev Değişimi", "Oda Kirala" ve "Bed & Breakfast" bölümlerindeki tüm ilanların resimleri görünür olmalıdır.
#Tüm ilanların ev tipi görünür olmalıdır.
#Tüm ilanların sahibin ismi görünür olmalıdır.
#Tüm ilanların başlıkları görünür olmalıdır.

Feature: US_008 I log in the home page as a user, I should be able to see the pictures and information of the posts
  in the "Popular Posts"  section.

  Background:
    Given the user navigates to "https://kese.nl/" page

  Scenario:Pictures of all listings in the "Ev Degisimi" section must be visible.
    And Able to see Ev Degisimi section
    Then Check if all the posts pictures are visible under the Ev Degisimi section

  Scenario:House type of all ads under the "Ev Degisimi" section must be visible
    And Able to see Ev Degisimi section
    Then Check if all the house types are visible under the Ev Degisimi section

  Scenario: The owners' names of all posts under the Ev Degisimi section must be visible
    And Able to see Ev Degisimi section
    Then Check if all the posts owners' names are visible under the Ev Degisimi section

  Scenario: The titles of all posts under the "Ev Degisimi" section must be visible
    And Able to see Ev Degisimi section
    Then Check if all the posts title are visible under the Ev Degisimi section

  Scenario: Pictures of all posts in the "Oda Kirala" section must be visible and clickable
    Given Able to see Oda Kirala section.
    And Click Oda Kiralama button
    Then Check if all the posts pictures are visible under the Oda Kiralama section

  Scenario: House type of all posts under the "Oda Kiralama" section must be visible and clickable
    Given Able to see Oda Kirala section.
    And Click Oda Kiralama button
    Then Check if all the posts' house types are visible under the Oda Kiralama section

  Scenario: The owners' names of all ads under the "Oda Kiralama" section must be visible and clickable
    Given Able to see Oda Kirala section.
    And Click Oda Kiralama button
    Then Check if all the posts owners names are visible under the Oda Kiralama section

  Scenario: The titles of all posts under the "Oda Kiralama" section must be visible and clickable.
    Given Able to see Oda Kirala section.
    And Click Oda Kiralama button
    Then Check if all the posts' titles are visible under the Oda Kiralama section

  Scenario: Pictures of all listings in the "Bed & Breakfast" section must be visible and clickable
    Given Able to see Bed & Breakfast section
    And  Click Bed & Breakfast button
    Then   Check if all the posts' pictures are visible under the Bed & Breakfast section

  Scenario: House type of all posts under the "Bed & Breakfast" section must be visible and clickable.
    Given Able to see Bed & Breakfast section
    And Click Bed & Breakfast button
    Then Check if all the posts' house types are visible under the Bed & Breakfast section

  Scenario: The owners' names of all posts under the "Bed & Breakfast" section must be visible and clickable.
    Given Able to see Bed & Breakfast section
    And Click Bed & Breakfast button
    Then Check if all the posts owners names are visible under the Bed & Breakfast section

  Scenario: The titles of all posts under the "Bed & Breakfast" section must be visible and clickable
    Given Able to see Bed & Breakfast section
    And  Click Bed & Breakfast button
    Then Check if all the ads' titles are visible under the Bed & Breakfast section

