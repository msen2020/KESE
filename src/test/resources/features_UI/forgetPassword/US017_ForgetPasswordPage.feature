#US_017	Bir kullanıcı olarak "/forgot_password" sayfasına girdiğimde, şifremi değiştir butonu kullanılabilir olmalıdır.
# https://kese.nl/forgot_password
#Şifremi Değiştir linki aktif ve görünür olmalıdır.
#Buton içerisinde "Şifremi Değiştir" yazısı yer almalıdır.

@smoketest
Feature: When I enter the "forgot_password" page the Change My Password button should be enabled

  Background: the user logs in
    Given the user goes to "https://kese.nl/" page
    And the user clicks on Login button

  Scenario:The "Şifremi Unuttum" link should be active and visible
    Then the user verifies that the link Sifremi Unuttum "Şifremi Unuttum" is displayed
    Then the user verifies that the link "Şifremi Unuttum" is enabled
    And the user clicks the "Şifremi Unuttum" link
    Then the user verifies that the Title "Sifre Yenileme" is displayed
    Then the user verifies that the text "Sifremi Degistir" is displayed in the button
    Then the user verifies that the "Sifremi Degistir" button is enabled
    And the user enters valid e-mail address
    And User clicks on "Sifremi Degistir" button
    Then the user verifies that the text "Girmiş olduğunuz email adresine sıfırlama linki gönderildi." is displayed on Forgot Password Page

