@ui
Feature: US_122 Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 10. stepte en az 5 en fazla 10 tane resim ekleyebilmeliyim.

  Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
    Given user is on login page "http://test.kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 10 in Bed & Breakfast

  Scenario: TC001_US122 It should be able to add at least 5 images in step 10 on the "Bed & Breakfast"  ad creation page.
    Then user shouldn't save the pictures without adding minimum 5 pictures

  Scenario: TC002_US122 It should be able to add at most 10 images in step 10 on the "Bed & Breakfast" ad creation page.
    When user adds 10 pictures on the home change page
    Then user asserts that it can't be upload more images

  Scenario: TC003_US122 After adding 5 images "Resimleri Kaydet" button must be clickable.
    When user adds 5 pictures on the home change page
    And user asserts that the Resimleri Kaydet button is clickable