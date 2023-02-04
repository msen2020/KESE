@US111
Feature: US111 - BAB Page - Step 6 next function from Step 6 to Step 7

  Background: Successful connection to site and coming to step 6 in "Bed & Breakfast"
    Given the user goes to "http://test.kese.nl/" page
    And user logs in with "nbc@gmail.com" and "jkl123"
    And user navigates to page 6 in Bed & Breakfast

  Scenario Outline: Step 6 Missing Info <Odanız> <Eviniz> <Kahvaltınız> Ilerle Button Not Clickability
    * ilerle button should be visible on bab page
    When user enters "<Odanız>" "<Eviniz>" "<Kahvaltınız>" on step six on bab page
    Then ilerle button should not be clickable on bab page
    When user clicks to the ilerle button on bab page
    Then warning message "*Lütfen eviniz, odanız ve kahvaltınızı tanımlayınız." should be displayed on step "6 / 10" on bab page

    Examples:
      | Odanız    | Eviniz   | Kahvaltınız    |
      |           |          |                |
      | Oda sicak | Ev guzel |                |
      |           | Ev guzel | Kahvalti genis |
      | Oda sicak |          | Kahvalti genis |

  Scenario Outline: Step 6 Complete Info <Odanız> <Eviniz> <Kahvaltınız> Ilerle Button Not Clickability
    * ilerle button should be visible on bab page
    When user enters "<Odanız>" "<Eviniz>" "<Kahvaltınız>" on step six on bab page
    Then ilerle button should be clickable on bab page
    When user clicks to the ilerle button on bab page
    Then step number "7 / 10" should be displayed on bab page

    Examples:
      | Odanız    | Eviniz   | Kahvaltınız    |
      | Oda sicak | Ev guzel | Kahvalti genis |
