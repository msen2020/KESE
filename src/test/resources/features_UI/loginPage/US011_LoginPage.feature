#US_011	Bir kullanıcı olarak "/login" sayfasına girdiğimde, giriş yap, kayıt ol butonları aktif olmalıdır.
#https://kese.nl/login
#"Giriş Yap" butonu aktif ve görünür olmalıdır.
#"Kayıt Ol" butonu aktif ve görünür olmalıdır.
#"Kayıt Ol" butonuna tıklayınca, "https://kese.nl/signup" sayfasına gidilebilmelidir.

@US11 @smoketest
Feature: Kese Login Page Giris Yap Kayit Ol Buttons Validation


  Scenario: Login Page Giris Yap Kayit Ol buttons should be active
    Given user goes to "https://kese.nl/login" page
    Then the user verifies that the "Giriş Yap" Button is active on login page
    And the user verifies that the "Kayıt Oluştur" Button is active on login page
    When user clicks "Kayıt Oluştur" button on login page
    Then user goes to "https://kese.nl/signup" page

     


    

