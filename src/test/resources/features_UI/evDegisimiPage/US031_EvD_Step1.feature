Feature:
  Background:
    Given user goes to "http://test.kese.nl" Page
    When "kullanici1@gmail.com" signed in on sign in page
    And user goes to "http://test.kese.nl/new_home" page




  Scenario:
    Given user should see the Ev Tipi



  Scenario:
    Given user should see the Ev Tipi


  Scenario Outline: user asserts "ilerle" is visible and clicable
    Given ilerle button must be clickable when the user clicks "<Ev Turu>"
    Examples:
      | Ev Turu           |
      | Mustakil Ev       |
      | Apartaman Dairesi |
      | Studyo Daire      |

  Scenario:
    Given user asserts "1/10" is visiblev

  Scenario:
    Given the user should see "Değişim yapmak istediğiniz evinizin türünü belirtiniz"