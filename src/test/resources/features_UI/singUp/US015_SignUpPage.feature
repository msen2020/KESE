# TEST CASE US_015-
# Bir kullanıcı olarak "/signup" sayfasına girdiğimde,"Giriş Yap" butonu görünür olmalıdır.
#Acceptance Criteria
#httpS://kese.nl/signup
#"Giriş Yap" butonu  görünür ve aktif olmalıdır.
#Giris Yap Butonuna tıklandğında "https://kese.nl/login" sayfasına gidilebilmelidir.

@smoke
Feature:US_015-Bir kullanıcı olarak "/signup" sayfasına girdiğimde,"Giriş Yap" butonu görünür olmalıdır.

  Background:
    Given the user goes to "https://kese.nl/signup" page

  @smoke
  Scenario:TC_001_US_015 The Giris Yap Button should be visible and enabled
    And the user asserts that the Giris Yap Button is visible and enabled
    When the user clicks Giris Yap button
    Then the user asserts that he is able to go to "https://kese.nl/login" page


