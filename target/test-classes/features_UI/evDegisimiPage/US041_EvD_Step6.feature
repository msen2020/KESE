@META3-464
Feature: As a user, I should be able to enter the "Remarks" information in step 6 on the "Home Exchange" ad creation page.

  Background:
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 6 in Home Exchange

  @TEST_META3-460
  Scenario: user should see the AÇIKLAMALAR header on the HomeExchange Page in 6th step
      Then user should see the "AÇIKLAMALAR" header on the 6th Page

  @TEST_META3-461
  Scenario: user should see the explanation on the HomeExchange Page
    Then verify "Evinizle ilgili açıklamaları bu kısma yazabilirsiniz. Evinizle ve komsularinizla ilgili belirtmek istediğiniz özel bir durum, özellik, ayrıcalık, avantaj veya dezavantaj varsa bu kısımda açıklayabilirsiniz." text is displayed on the page

  @TEST_META3-462
  Scenario: user should see that s/he is on page 6
    Then verify user is on the "6 / 10" page


  @TEST_META3-463
  Scenario Outline: user should send keys to explanation input box
    When user enters "<textHome>" explanation to the inputbox on the 6th page
    Then verify input box accept "<textHome>" explanation correctly on the 6th page
    Examples:
    |textHome|
    |Home Sweet Home|
    |123456789/*-+|
    |фдылвфждывжфыдлвжф--üğşüçşöiıöçşiğü---^^^%&|