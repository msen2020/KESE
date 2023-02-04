Feature: As a user, I should be able to enter "Descriptions" in step 6 on the "Bed & Breakfast" ad creation page.

  Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
    Given user is on login page "http://test.kese.nl/new_bed_breakfast"
    When user signed in on sign in page
  | coder52@nonmail.com | 1234 |
    And user navigates to page 6 in Bed & Breakfast


  Scenario: user should see the Aciklamalar header on the BedAndBreakfast Page in 6th step
    Then verify user sees the "Açıklamalar" header on the 6th BedAndBreakfast Page



  Scenario: user should see the explanation paragraph on the BedAndBreakfast Page
    Then verify "Kullandıracağınız odayı, evinizin bahsetmek istediğiniz özelliklerini ve kahvaltı ile alakalı detayları aşağıya yazınız." text is displayed on the 6th BedAndBreakfast Page

  Scenario: user should see that s/he is on page 6
    Then verify user is on the "6 / 10" BedAndBreakfast page


  Scenario: User should see the each header before inputbox such as "*Odaniz", "*Eviniz", "*Kahvaltiniz"
    Then verify user can see the each header such as
      | *Odanız      |
      | *Eviniz      |
      | *Kahvaltınız |


  Scenario Outline: user should enter explanation to the each inputBox separately on the BedAndBreakfast Page
    When user enters "<text>" to the "<inputBox>" inputBox on the 6th BedAndBreakfast Page
    Then verify system displayed "<text>" in "<inputBox>" on the 6th BedAndBreakfast Page
    And verify Ilerle button is NOT active on 6th BedAndBreakfast Page
    Examples:
      | text                                    | inputBox  |
      | My home is so special                   | Room      |
      | Our neighborhood are a little bit noisy | Home      |
      | Our Breakfast is so delicious           | Breakfast |


    Scenario: Ilerle button should be active after entering explanations on the BedAndBreakfast Page
      When user enters "My home is ideal place to live" to the "Room" inputBox on the 6th BedAndBreakfast Page
      And user enters "Our neighborhoods are sweet also" to the "Home" inputBox on the 6th BedAndBreakfast Page
      And user enters "You can have breakfast on the balcony" to the "Breakfast" inputBox on the 6th BedAndBreakfast Page
      Then verify Ilerle button is active on 6th BedAndBreakfast Page






