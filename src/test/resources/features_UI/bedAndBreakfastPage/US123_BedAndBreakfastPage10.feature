Feature: US123 Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 10. stepte tüm resimleri kaldır butonu yardımıyla, eklenen resimleri kaldırabilmeliyim.

Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
  Given user is on login page "http://test.kese.nl/new_bed_breakfast"
  When user signed in on sign in page
    | coder52@nonmail.com | 1234 |
  And user navigates to page 10 in Bed & Breakfast


Scenario: User should be able to remove all the images added when user click on the "Tüm Resimleri Kaldır" button.
Given on BAB user should be able to click on "Tüm Resimleri Kaldır" button after adding the images.
Then on BAB validate to remove all added images.


Scenario: The first image insertion input must be active and the others must be disabled.
Given on BAB user should be able to clicks on insertion input and  the others must be disabled.
And on BAB validate user added the image on insertion input after the other one must be able to insertion.