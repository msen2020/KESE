#US_021	Bir kullanıcı olarak "/signup" sayfasına girdiğimde, kullanıcı kaydı oluşturmak için aynı şifreyi 2 kez girmeliyim.
# https://kese.nl/signup
#Şifre ve Şifre Tekrarı aynı olmalıdır.
#Şifreler birbiri ile uyuşmuyorsa "Şifreler birbiri ile uyuşmuyor." uyarısı görünür olmalıdır.

Feature: US_021	Bir kullanıcı olarak "/signup" sayfasına girdiğimde, kullanıcı kaydı oluşturmak için aynı şifreyi 2 kez girmeliyim.

  Background: the user goes to KESE signup Page
    Given the user goes to the "signup" page

  Scenario Outline: TC_001 the same input of the password
    And the user types a "<username>"
    When the user types a valid "<email>" into the email Box
    When the user types "<sifre>"
    And the user retypes the same "<retype sifre>"
    Then the user verifies that the inputs of Sifre are the same
    When the user accepts the terms of use and privacy policy.
    And the user clicks the "Kayıt Oluştur" button
    Then the user verifies that the text "Kaydınız oluşturuldu, giriş yapma sayfasına yönlendiriliyorsunuz.." is displayed
    Examples:
      | username | email           | sifre  | retype sifre |
      | pmail    | pmail@gmail.com | pm1234 | pm1234       |


  Scenario Outline: TC_002 nonmatching input of the password
    And the user types a "<username>"
    When the user types a valid "<email>" into the email Box
    When the user types "<sifre>"
    And the user retypes "<retypeSifre>" with a mistake
    When the user accepts the terms of use and privacy policy.
    And the user clicks the "Kayıt Oluştur" button
    Then the user verifies that the warning message "Şifreler birbiri ile uyuşmuyor." is displayed
    Examples:
      | username | email           | sifre  | retypeSifre |
      | mem      | mmail@gmail.com | mm1234 | mm123       |
