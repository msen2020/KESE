# US_130 Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.
# https://kese.nl/new_car
# "İlerle" butonu görünür olmalıdır.
# "İlerle" butonu default olarak tıklanabilir olmalı ancak tıklandığında bir sonraki stepe geçmemelidir.
# "İlerle" butonunun default olarak opacity (saydamlık) değeri 0.65 olmalıdır.
# Koltuk bilgisi seçili olmadığında ya da açıklama bilgisi girilmediğinde, İlerle butonuna tıklanırsa "Lütfen zorunlu bilgileri giriniz." uyarısı görünür olmalıdır.
# Başlangıç noktası ve bitiş noktası seçildiğinde, İlerle butonu tıklanabilir olmalı.
#  QA MSEN

Feature: US_130 Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.

  Background: Going to Page 2 on Birlikte Seyahat
    Given user is on login page
    When user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks ilan ver menu on signed in home page
    * user clicks "Birlikte Seyehat" in ilan ver menu
    * user navigates to page 3 in Birlikte Seyahat

  Scenario: US_130_TC001
    Then user verifies that "İlerle" button is visible
    Then verifies that "İlerle" button shouldn't be clickable as a default
    Then user verifies that the opacity value of ilerle button is 0.65
    Then user verifies that when the seat information is not selected or the description information is not entered, and the Next button is clicked, "Please enter the required information." warning should be visible.
