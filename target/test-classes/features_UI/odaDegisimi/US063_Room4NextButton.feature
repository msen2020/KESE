Feature: US_063 New Room 4/10 Next Button

  Background: login

    Given user is on login page "http://test.kese.nl/login"
    When user signed in on sign in page
      | kullanici1@gmail.com | 1234 |
    And waiting for you

    And user goes to "http://test.kese.nl/new_room" page
    And waiting for you
    And user chooses options for coming to step four in url

  Scenario: US063_TC01-"İlerle" button should be visible.
    Then user asserts ilerle button is visible sevda

  Scenario: US063_TC02-"İlerle" button should not be clickable by default.
    Then user assert ilerle button is not clickable

  Scenario: US063_TC03-In case of lack of information, if the Next button is clicked, the warning "Lütfen cinsiyet ve yaş aralığı seçiniz" should be visible.
    And user clicks on ilerle button
    Then user asserts "*Lütfen cinsiyet ve yaş aralığı seçiniz." is visible

  Scenario: US063_TC04- After adding the mandatory information, the İleri button should be clickable.
    And user enter age as Farketmez
    And user enter gender as Farketmez
    Then user assert ilerle button is clickable
