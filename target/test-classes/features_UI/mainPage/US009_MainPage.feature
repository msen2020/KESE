#US_009	Bir kullanıcı olarak ana sayfaya girdiğimde,
# giriş yapmadığımda "Giriş Yap" butonu görünür olmalıdır.
# https://kese.nl
#Giriş Yap butonu görünür ve tıklanabilir olmalıdır.
#Giriş Yap butonuna tıklayınca "/login" sayfasına gidilmelidir.
# When the user is not logged in, "Giris Yap" button should be visible and clickable
# When the user clicks "Giris Yap" button, user should be directed to login page

@US009
Feature: Kese HomePage Giris Yap Button is displayed verification without SignIn

  Background:
    Given the user is on the homepage

  Scenario: User should see "Giris Yap" button when not logged in
    Then the user verifies that the Giris Yap Button is visible and clickable on home page
    When the user clicks Giris Yap button on home page
    Then the user should be redirected to "https://kese.nl/login" page