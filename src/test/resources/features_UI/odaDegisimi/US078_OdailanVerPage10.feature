Feature:US078

  Background:
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | hamza@gmail.com | 1234 |
    And user should click to Ilan Ver go to page 10 in Oda

Scenario: User should be able to attach 5 images
    Given user should be able to attach 5 images with Resimleri Secin button
    And user should be able to attach 5 images with Resim Ekle
    Then verify the 5 added images

  Scenario:User should be able to attach at most 10 images
    Given user should be able to attach 10 images with Resimleri Secin button
    And user should be able to attach 10 images with Resim Ekle
    Then verify the 10 added images

    Scenario: User should not be able to attach more than 10 images
      Given user should not be able to attach 11 images with Resimleri Secin button
      And  user should not be able to attach 11 images with Resim Ekle
      Then verify should not be able yo add 11 images

  Scenario: After adding 5 images, the "Resimleri Kaydet" button should be clickable.
    Given After adding 5 or more images, the "Resimleri Kaydet" button should be clickable
    And user adding 4 images, the "Resimleri Kaydet" button should not be clickable
    Then verify the "Resimleri Kaydet" button










#US078_TC01_1_user is on login page "http://test.kese.nl/new_home"
#US078_TC01_2_user signed in on sign in page
#US078_TC01_3_user navigates to page 10 in Oda
#US078_TC02_1_user should be able to attach at least 5 images with "Resim Ekle"
#US078_TC02_2_user should be able to attach at least 5 images with "Resimleri Secin" button
#US078_TC03_1_user should be adding from 5 to 10 images, the "Resimleri Kaydet" button should be clickable
#US078_TC03_2_user should not be adding more than 10 images
#US078_TC03_3_user should be able to inserton ""Tüm Resimleri Kaldır" button after adding the images.
#US078_TC04_1_After adding 5 images, the "Resimleri Kaydet" button should be clickable
#US078_TC04_2_user adding less than 5 images, the "Resimleri Kaydet" button should not be clickable