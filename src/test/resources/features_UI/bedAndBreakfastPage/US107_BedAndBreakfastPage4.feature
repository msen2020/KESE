@us107
Feature:US107 - BAB Page - Step 4 next function from Step 4 to Step 5

  Background: Successful connection to site and coming to step 4 in "Bed & Breakfast"
    Given the user goes to "http://test.kese.nl/" page
    And user logs in with "nbc@gmail.com" and "jkl123"
    And user navigates to page 4 in Bed & Breakfast

  @MH-183
  Scenario: "ilerle" button is displayed
    Then "ilerle" button should be displayed

  Scenario: "ilerle" button should not be clickable in default position
    Then "ilerle" button should not be clickable

  Scenario:In case of lack of information, click the Next button, "Lütfen cinsiyet, yaş aralığı ve kişi sayısı seçiniz." warning should be visible.
    When click the "ilerle" button
    Then "*Lütfen cinsiyet, yaş aralığı ve kişi sayısı seçiniz." warning should be visible.

  Scenario:After adding the mandatory information, the Next button should be clickable.
    When user clicks "10-15" age
    And user clicks "Kadin" gender
    And user clicks + button
    Then "ilerle" button should be clickable
    Then Verify "5 / 10" page is displayed






