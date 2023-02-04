# US_138 Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 1. stepten 2. stepe geçiş yapabilmeliyim.
#"İlerle" butonu görünür olmalıdır.
#"İlerle" butonu default olarak tıklanabilir olmalı ancak tıklandığında bir sonraki stepe geçmemelidir.
#"İlerle" butonunun default olarak opacity (saydamlık) değeri 0.65 olmalıdır.
#Herhangi bir kargo tipi seçili olmadığında, İlerle butonuna tıklanırsa "Lütfen kargo tipi seçiniz" uyarısı görünür olmalıdır.
#Herhangi bir kargo tipi seçildiğinde, İlerle butonu tıklanabilir olmalı.

Feature: US138-Page1 location and transportation features

  Scenario: : Login and navigate to ilan ver menu
    Given the user goes to "https://kese.nl/new_cargo" page
    And user logs in with "mamice@gmail.com" and "1234"
    And user clicks ilan ver menu on signed in home page
    When user clicks "Kargo" in ilan ver menu
    Then user verifies opacity value
    Then verify if "İlerle" button is visible
    Then verify if "İlerle" button shouldn't be clickable as a default
    And user clicks to the ilerle button on bab page
    Then warning message "*Lütfen kargo tipi seçiniz." should be displayed on step "1 / 4" on bab page
    And user clicks "Zarf" option on on step one on oda kirala page
    And user clicks to the ilerle button on bab page
    Then verify if the number of page "2 / 4" is visible