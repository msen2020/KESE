#US_012	Bir kullanıcı olarak "/login" sayfasına girdiğimde, şifremi unuttum bölümüne ulaşabilmeliyim
#https://kese.nl/login
#"Şifremi Unuttum" linki aktif ve görünür olmalıdır.
#"Şifremi Unuttum" linkinin altı çizili olmalıdır.
#Linke tıklanınca "http://test.kese.nl/forgot_password" sayfasına gidilmelidir.

Feature: Kese Sifremi Unuttum Redirection

  @MarkBoz
  Scenario: on Login page Şifremi Unuttum link must be visible

    Given the user is on the login page as this url "https://kese.nl/login"
    Then the user verifies that the link "Şifremi Unuttum" is displayed
    Then the user verifies that the link Sifremi Unuttum should be active
    Then the user verifies that the link Sifremi Unuttum is "underline"
    When the user clicks on the Sifremi Unuttum link
    Then user should be redirected to "https://kese.nl/forgot_password" page
