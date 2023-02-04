# US_022	Bir kullanıcı olarak "/forgot_password" sayfasına girdiğimde, email adresime şifre sıfırlama linki gönderebilmeliyim.
# https://kese.nl/forgot_password
#Sistemde kullanılan email adresini girdikten sonra butona tıklayınca "Girmiş olduğunuz email adresine sıfırlama linki gönderildi." yazısı görünür olmalıdır.
#Sistemde yer almayan bir email adresi girildikten sonra butona tıklanırsa "Böyle bir kullanıcı bulunamadı." yazısı görünür olmalıdır.

Feature: US_022	Bir kullanıcı olarak "/forgot_password" sayfasına girdiğimde, email adresime şifre sıfırlama linki gönderebilmeliyim.

  Background:
    Given the user is on the Forget Password Page

  Scenario:
    Then the user verifies that the email input box is enabled
    Then the user verifies that the text "E-mail adresinizi giriniz" is displayed as default in the input box
    #Sistemde kullanılan email adresini girdikten sonra butona tıklayınca
      # "Girmiş olduğunuz email adresine sıfırlama linki gönderildi." yazısı görünür olmalıdır.
#Sistemde yer almayan bir email adresi girildikten sonra butona tıklanırsa
  # "Böyle bir kullanıcı bulunamadı." yazısı görünür olmalıdır.

  lmefa
  jdvye@gmail.com