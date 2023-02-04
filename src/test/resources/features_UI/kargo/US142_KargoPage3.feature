# US_142 Bir kullanıcı olarak "Kargo Gönder" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.
# https://kese.nl/new_cargo
#"İlerle" butonu görünür olmalıdır.
#"İlerle" butonu default olarak tıklanabilir olmalı ancak tıklandığında bir sonraki stepe geçmemelidir.
#"İlerle" butonunun default olarak opacity (saydamlık) değeri 0.65 olmalıdır.
#Açıklama bilgisi eklenmediğinde, İlerle butonuna tıklanırsa "Lütfen açıklama giriniz." uyarısı görünür olmalıdır.
#Açıklama bilgisi eklendiğinde, İlerle butonu tıklanabilir olmalı.

@142 @ui
Feature: US_142 Bir kullanıcı olarak "Kargo Gönder" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.
#selen
  Background: Successful connection to site and coming to step 3 in "Kargo"
    Given user is on login page "https://kese.nl/new_cargo"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 3 in Kargo

    Scenario:
      Then ilerle button should be visible on kargo page
      But ilerle button should not be clickable on kargo page
      And ilerle button opacity should be 0.65 on kargo page
      When user clicks to the ilerle button on kargo page
      Then warning message "*Lütfen açıklama giriniz." should be displayed on kargo page
      When user enters "Kargo 4 kg" to aciklamalar on kargo page
      And ilerle button should be clickable on kargo page