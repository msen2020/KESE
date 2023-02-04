Feature: US_062 New Room 4/10

  Background: login

    Given user is on login page "http://test.kese.nl/login"
    When user signed in on sign in page
      | kullanici1@gmail.com | 1234 |
    And waiting for you
    And user goes to "http://test.kese.nl/new_room" page
    And waiting for you
    And user chooses options for coming to step four in url

  Scenario: US062_TC01-"Cinsiyet, Yaş Aralığı ve Kişi Sayısı" heading should be visible
    Then user asserts "Cinsiyet, Yaş Aralığı ve Kişi Sayısı" is visible

  Scenario: US062_TC02-"Hangi yaş aralığındaki ve cinsiyetteki kişiyi evinizde ağırlamak istersiniz." explanation should be visible
    Then user asserts "Hangi yaş aralığındaki ve cinsiyetteki kişiyi evinizde ağırlamak istersiniz." is visible

  Scenario: US062_TC03-"Yaş Aralığı" should be able to be selected more than one
    And user clicks on all age gaps
    Then user asserts all age gaps are selected


  Scenario: US062_TC04- When "Yaş Aralığı" is selected as "Farketmez", other age range selections should be deselected.
    And user clicks on all age gaps
    And click on Farketmez in age area
    Then assert that all age gaps are not selected


  Scenario Outline: US062_TC05- "Cinsiyet" selection should be selectable, more than one selection should not be allowed.
    And user clicks on "<GenderOption>"
    Then assert thatother gender options are not selected
    Examples:
      | GenderOption |
      | Kadin          |
      | Erkek          |
      | Farketmez      |

  Scenario: US062_TC06.1- "Maksimum kişi sayısı" should be selected maximum 15.
    And user click increment button for 16 times
    Then assert input is 15
  Scenario: US062_TC06.2- "Maksimum kişi sayısı" should be selected as minimum 0.
    And user click decrement button for 2 times
    Then assert input is 0

  Scenario:US062_TC07- In step 4, the text "4 of 10" should be visible at the top of the page.
    Then assert that four slash ten should be visible




