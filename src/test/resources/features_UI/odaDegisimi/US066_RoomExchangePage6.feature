Feature: As a user, I should be able to enter the "Remarks" information in step 6 of "Rent Room & Exchange" advertisement preparation.

  Background:
    Given user is on login page "http://test.kese.nl/new_room"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    Then user should click to Ilan Ver go to page 6 in Oda

  Scenario: user should see the Aciklamalar header on the RoomExchange Page in 6th step
    Then user should see the "Açıklamalar" header on the 6th roomExchange Page

  Scenario: user should see the explanation on the RoomExchange Page
    Then verify "Evinizle ve/veya Odanızla ilgili açıklamaları bu kısma yazabilirsiniz. Evinizle ve/veya odanızla ilgili belirtmek istediğiniz özel bir durum, özellik, ayrıcalık, avantaj veya dezavantaj varsa bu kısımda açıklayabilirsiniz." text is displayed on the 6th roomExchange page

  Scenario: user should see that s/he is on page 6
    Then verify user is on the "6 / 10" roomExchange page

  Scenario Outline: user should send keys to explanation input box
    When user enters "<textRoom>" explanation to the inputbox on the 6th roomExchange page
    Then verify input box accept "<textRoom>" explanation correctly on the 6th roomExchange page
    Examples:
      |textRoom|
      |Room My Sweet Room|
      |123456789/*-+|
      |фдылвфждывжфыдлвжф--üğşüçşöiıöçşiğü---^^^%&|

#    by nur
