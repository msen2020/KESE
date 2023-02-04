#US_016	Bir kullanıcı olarak "/forgot_password" sayfasına girdiğimde, email inputu kullanılabilir olmalıdır.
# https://kese.nl/forgot_password
#Email inputu aktif ve kullanılabilir olmalıdır.
#Default olarak input içerisinde "E-mail adresinizi giriniz" yazısı yer almalıdır.

Feature: As a user, when I go to the "/forgot_password" page, email input should be used.

  Scenario:
    Given the user is on forget password page "http://kese.nl/forgot_password"
    Then the user verifies that the email input box is enabled
    Then the user verifies that the text "E-mail adresinizi giriniz" is displayed as default in the input box