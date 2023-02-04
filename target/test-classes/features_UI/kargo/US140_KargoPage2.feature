# US_140
# Bir kullanıcı olarak "Kargo Gönder" ilan oluşturma sayfasında, 2. stepten 3. stepe geçiş yapabilmeliyim.
# https://kese.nl/new_cargo
#"İlerle" butonu görünür olmalıdır.
#"İlerle" butonu default olarak tıklanabilir olmalı ancak tıklandığında bir sonraki stepe geçmemelidir.
#"İlerle" butonunun default olarak opacity (saydamlık) değeri 0.65 olmalıdır.
#Başlangıç noktası ya da bitiş noktası seçili olmadığında, İlerle butonuna tıklanırsa "Lütfen başlangıç ve bitis noktalarını giriniz." uyarısı görünür olmalıdır.
#Başlangıç noktası ve bitiş noktası seçildiğinde, İlerle butonu tıklanabilir olmalı.

Feature: Bir kullanıcı olarak "Kargo Gönder" ilan oluşturma sayfasında, 2. stepten 3. stepe geçiş yapabilmeliyim.

  Background: Successful connection to site and coming to step 2 in "Kargo"
    Given user is on login page "https://kese.nl/new_cargo"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 2 in Kargo

  Scenario:
    Then user verifies that "İlerle button" is visible
    Then user verifies that "İlerle button" should be clickable as default
    Then user verifies that when "İlerle button" is clicked it shouldn't pass the next step
    Then user verifies that the opacity value of ilerle button is 0.65
    Then user verifies that when the Starting Point or End Point are not selected, and the "İlerle button" is clicked, then "Lütfen başlangıç ve bitis noktalarını giriniz." warning should be visible.
    Then user verifies that when the Starting Point or End Point are selected then the "İlerle Button" should be clickable
