Feature: As a user, I should be able to switch from step 6 to step 7 on the "Room Exchange" and creation page.

  Background:
    Given user is on login page "http://test.kese.nl/new_room"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user should click to Ilan Ver go to page 6 in Oda

  Scenario: user should see the "Ilerle" button on the 6th roomExchange page
    Then system displays Ilerle button on the 6th roomExchange page

  Scenario: As a default "Ilerle" Button should NOT be clickable
    Then verify Ilerle button is NOT enable on 6th roomExchange page

#  @wip
  Scenario: after providing min requirement of the page the "Ilerle" button should be clickable on the page
    When user enters "N" explanation to the inputbox on the 6th roomExchange page
    Then verify Ilerle button is active on 6th roomExchange page


  Scenario: before providing min requirement of the page clicking "Ilerle" button
    When user enters "" explanation to the inputbox on the 6th roomExchange page
    And user clicks Ilerle button on the 6th roomExchange page
    Then verify user sees "*Lütfen eviniz ve odanızı tanımlayınız." text near to Ilerle button on the 6th roomExchange page


  Scenario: user should navigate 6th page to 7th page
    When user enters "N" explanation to the inputbox on the 6th roomExchange page
    And user clicks Ilerle button on the 6th roomExchange page
    Then verify user is on the "7 / 10" page

#    by nur
