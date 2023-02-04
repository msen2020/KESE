Feature: US032 Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 1. stepten 2. stepe geçiş yapabilmeliyim.


  Background:
    Given user goes to "http://test.kese.nl" Page
    When "kullanici1@gmail.com" signed in on sign in page
    And user goes to "http://test.kese.nl/new_home" page

  Scenario:User sees ilerle button
    And ilerle button must be visible

  Scenario: User clicks ilerle button
    And user can click ilerle button

  Scenario: If without any house type is chosen and "ilerle" button is clicked, user sees "Lütfen ev tipini seçiniz" warnings
    Given user sees "*Lütfen ev tipini seçiniz." warnings when he  clicks ilerle button



  Scenario Outline: "ilerle" button must be clickable when a house type is chosen
    Given ilerle button must be clickable when the user clicks "<Ev Turu>"
    Examples:
      | Ev Turu           |
      | Mustakil Ev       |
      | Apartaman Dairesi |
      | Studyo Daire      |