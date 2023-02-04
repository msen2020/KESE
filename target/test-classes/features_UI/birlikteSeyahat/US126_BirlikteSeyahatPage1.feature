# US126
# Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 1. stepten 2. stepe geçiş yapabilmeliyim.
# https://kese.nl/new_car
#"İlerle" butonu görünür olmalıdır.
#"İlerle" butonu default olarak tıklanabilir olmalı ancak tıklandığında bir sonraki stepe geçmemelidir.
#"İlerle" butonunun default olarak opacity (saydamlık) değeri 0.65 olmalıdır.
#Herhangi bir araç tipi seçili olmadığında, İlerle butonuna tıklanırsa "Lütfen araç tipini seçiniz." uyarısı görünür olmalıdır.
#Herhangi bir araç tipi seçildiğinde, İlerle butonu tıklanabilir olmalı.

@Berrin
Feature: US126_As a user, I should be able to switch from step 1 to step 2 on the "Travel Together" ad creation page.



  Background: Going to Page 1 on Birlikte Seyahat
    Given user is on login page
    When user logs in with "kullanici1@gmail.com" and "1234"
    And user clicks ilan ver menu on signed in home page
    And user clicks "Birlikte Seyehat" in ilan ver menu
    And user navigates to page 1 in Birlikte Seyahat

  Scenario:Without clicking any button user should NOT move to the next page

   When The user can click the proceed button without making any selections
    Then The user "1 / 6" on the step
    And Verifies that "*Lütfen araç tipini seçiniz." appears if the user clicks the Proceed button without making any selections

    Scenario:User verifies number of transparency "0.65"
    Given User verifies that the Ilerle button appears
    Then User verifies that the next button has a value of "cursor: not-allowed; opacity: 0.65;" as transparency

    Scenario:
    When User selects any vehicle type
    And User clicks on the Ilerle button
    Then proceeds to the "2" step