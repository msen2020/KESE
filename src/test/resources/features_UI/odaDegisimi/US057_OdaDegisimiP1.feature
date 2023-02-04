Feature: US057 Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 1. stepten 2. stepe geçiş yapabilmeliyim.

  Background:

    Given user goes to "https://kese.nl" Page
    When "kullanici1@gmail.com" signed in on sign in page
    And user goes to "https://kese.nl/new_room" page

  Scenario:User sees ilerle button
    And ilerle button must be visible

  Scenario: User clicks ilerle button
    And user can click ilerle button

  Scenario:
    And user can click ilerle button
    Then User sees "Lütfen ev tipini seçiniz" warnings

  Scenario Outline: "ilerle" button must be clickable when a house type is chosen
    Given ilerle button must be clickable when the user clicks "<Ev Turu>"
    Examples:
      | Ev Turu           |
      | Mustakil Ev       |
      | Apartaman Dairesi |
      | Studyo Daire      |