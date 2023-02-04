# Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 4. stepten 5. stepe geçiş yapabilmeliyim.
# https://kese.nl/new_car
#"İlerle" butonu görünür olmalıdır.
#"İlerle" butonu default olarak tıklanabilir olmalı ancak tıklandığında bir sonraki stepe geçmemelidir.
#"İlerle" butonunun default olarak opacity (saydamlık) değeri 0.65 olmalıdır.
#Yaş aralığı, cinsiyet ya da kişi sayısı girilmediğinde, İlerle butonuna tıklanırsa "Lütfen cinsiyet, yaş aralığı ve kişi sayısı seçiniz." uyarısı görünür olmalıdır.
#Yaş aralığı, cinsiyet ve kişi sayısı bilgileri eklendiğinde, İlerle butonu tıklanabilir olmalı.
@US132
# Nursel
Feature: From 4. step to 5. Step Passing Feature in Birlikte Seyahat

  Background: Going to Page 4 on Birlikte Seyahat
    Given user is on login page
    When user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks ilan ver menu on signed in home page
    * user clicks "Birlikte Seyehat" in ilan ver menu
    * user navigates to page 4 in Birlikte Seyahat


  @MH-311
  Scenario Outline: Step 4 Missing Info <Yas> <Cinsiyet> <Max Kisi> Ilerle Button Not Clickability on Birlikte Seyahat Page
    Then ilerle button should be visible on bs page
    But ilerle button should not be clickable on bs page
    And ilerle button opacity should be 0.65 on bs page
    When user enters "<Yas>" "<Cinsiyet>" "<Max Kisi>" on step four on bs page
    Then ilerle button should not be clickable on bs page
    When user clicks to the ilerle button on bs page
    Then warning message "*Lütfen cinsiyet, yaş aralığı ve kişi sayısı seçiniz." should be displayed on step "4 / 6" on bs page

    Examples:
      | Yas   | Cinsiyet  | Max Kisi |
      |       |           | 0        |
      | 65+   | Kadin     | 0        |
      |       | Farketmez | 2        |
      | 10-15 |           | 3        |

  @MH-312
  Scenario Outline: Step 4 Complete Info <Yas> <Cinsiyet> <Max Kisi> Ilerle Button Not Clickability on Birlikte Seyahat Page
    Then ilerle button should be visible on bs page
    When user enters "<Yas>" "<Cinsiyet>" "<Max Kisi>" on step four on bs page
    Then ilerle button should be clickable on bs page
    When user clicks to the ilerle button on bs page
    Then step number "5 / 6" should be displayed on bs page

    Examples:
      | Yas   | Cinsiyet | Max Kisi |
      | 16-20 | Kadin    | 4        |