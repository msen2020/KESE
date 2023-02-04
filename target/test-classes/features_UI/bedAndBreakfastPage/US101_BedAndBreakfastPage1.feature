#US_101	Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 1. stepten 2. stepe geçiş yapabilmeliyim.
# https://kese.nl/new_bed_breakfast
#"İlerle" butonu görünür olmalıdır.
#"İlerle" butonu default olarak tıklanabilir olmalı ancak tıklandığında bir sonraki stepe geçmemelidir.
#"İlerle" butonunun default olarak opacity (saydamlık) değeri 0.65 olmalıdır.
#Herhangi bir ev tipi seçili olmadığında, İlerle butonuna tıklanırsa "Lütfen ev tipini seçiniz" uyarısı görünür olmalıdır.
#Herhangi bir ev tipi seçildiğinde, İlerle butonu tıklanabilir olmalı.

Feature: US101-Page1 location and transportation features

  Scenario: : Login and navigate to ilan ver menu
    Given the user goes to "https://kese.nl/" page
    And user logs in with "mamice@gmail.com" and "1234"
    And user clicks ilan ver menu on signed in home page
    When user clicks "Bed & Breakfast" in ilan ver menu
    Then user verifies opacity value
    Then verify if "İlerle" button is visible
    Then verify if "İlerle" button shouldn't be clickable as a default
    And user clicks to the ilerle button on bab page
    Then warning message "*Lütfen ev tipini seçiniz." should be displayed on step "1 / 10" on bab page
    And user clicks "Apartman Dairesi" option on on step one on oda kirala page
    And user clicks to the ilerle button on bab page
    Then verify if the number of page "2 / 10" is visible