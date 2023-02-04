#US_026	Bir kullanıcı olarak anasayfada, giriş yaptıktan sonra sistemden çıkış yapabilmeliyim.
# https://kese.nl/
#Profilim bölümü içerisinde "Çıkış Yap" linki aktif olmalıdır.
#Linke tıklandıktan sonra sistemden çıkış yapılmalıdır.

@US26 @smoketest
Feature: Logout Functionality Validation

  Background:
    Given the user goes to "https://kese.nl/" page
    And user logs in with "nbc@gmail.com" and "jkl123"

  Scenario:
    When user clicks Profilim link on signed in page
    When user clicks "Çıkış Yap" button on Profilim link
    Then Giris Yap button should be visible and clickable on home page




