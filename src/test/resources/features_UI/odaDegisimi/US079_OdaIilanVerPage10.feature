Feature:US079


  Background:
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | hamza@gmail.com | 1234 |
    And user should click to Ilan Ver go to page 10 in Oda


Scenario: User should be able to remove all the images added when I click on the "Tüm Resimleri Kaldır" button.
  Given user should be able to click on "Tüm Resimleri Kaldır" button after adding the images.
  Then validate to remove all added images.


  Scenario: The first image insertion input must be active and the others must be disabled.
  Given user should be able to clicks on insertion input and  the others must be disabled.
  And validate user added the image on insertion input after the other one must be able to insertion.




  #http://test.kese.nl/new_room
  #User should be able to remove all the images added when I click on the "Tüm Resimleri Kaldır" button.
  #The first image insertion input must be active and the others must be disabled.

  #US079_TC03_1_user should be able to click on image insertion input and the others must be disabled.
  #US079_TC02_1_user should be able to click on ""Tüm Resimleri Kaldır" button after adding the images.
  #US079_TC01_3_user navigates to page 10 in Oda
  #US079_TC02_1_user should be able to click on "Tüm Resimleri Kaldır" button after adding the images.
  #US079_TC02_2_validate to remove all added images.
  #US079_TC03_1_user should be able to clicks on insertion input and  the others must be disabled.
  #US079_TC03_2_user added the image on insertion input after the other one must be able to insertion.