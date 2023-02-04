Feature: US056 Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 1. stepte "Ev Tipi" bilgisini girebilmeliyim.


  Background:

    Given user goes to "https://kese.nl" Page
    When "kullanici1@gmail.com" signed in on sign in page
    And user goes to "https://kese.nl/new_room" page


  Scenario: The "Ev Tipi" title  must be visible
    Given user should see the Ev Tipi

  Scenario:
    Given  user should see the writing "Odanız hangi ev türünde yer alıyor, belirtiniz."

  Scenario:
    Given the user should see "Odanızla ilgili tercihinizi belirtiniz. Eğer sizin için uygunsa iki seçeneği de işaretleyebilirsiniz." writing


  Scenario Outline: "Mustakil Ev", "Apartman Dairesi" ve "Studyo Daire" sections should be visible and clickable
    Given user asserts "<Ev Turu>" is visible and clicable
    Examples:
      | Ev Turu           |
      | Mustakil Ev       |
      | Apartaman Dairesi |
      | Studyo Daire      |


  Scenario: "Odami kiraya vermek istiyorum" ve "Karşılıklı oda değişimi yapmak istiyorum" checkboxları kullanılabilir olmalıdır.
    Then "Odami kiraya vermek istiyorum" ve "Karşılıklı oda değişimi yapmak istiyorum" checkboxes should be clickable


  Scenario: The "1 / 10" part above the page must be visible
    Given  user asserts "1 / 10" is visiblev