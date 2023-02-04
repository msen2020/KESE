Feature: US_047 Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 9. stepte "Değişim Tarihi" bilgisini girebilmeliyim.

  Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
    Given user is on login page "http://test.kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 9 in Bed & Breakfast

  Scenario: "ilerle" button should be visible and clickable
    Then verify if "İlerle" button is visible ,shouldn't be clickable as a default
    Then verify if "*Lütfen tarih seçiniz." warning message appears
    When user clicks any date and ilerle button on page nine
    Then verify if the "Resim ve Fotoğraflar"  is visible





 #Scenario: "ilerle" button should be visible and clickable
 #Then verify if "İlerle" button is visible
 #Then verify if "İlerle" button shouldn't be clickable as a default
 #When user clicks "İlerle" button without any selection at Ev Degisimi
 #Then verify if "*Lütfen tarih seçiniz." warning message appears
 #When user clicks any date on page nine
 #Then verify if ilerle button should be clickable
 #When user clicks to the ilerle button on the new home page
 #Then verify if the "10" is visible
