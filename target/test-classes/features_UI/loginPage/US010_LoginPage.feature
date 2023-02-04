#US_010	Bir kullanıcı olarak "/login" sayfasına girdiğimde, login için gerekli inputlar kullanılabilir olmalıdır.
# https://kese.nl/login
#"Email" inputu aktif ve kullanılabilir olmalıdır.
#"Şifre" inputu aktif ve kullanılabilir olmalıdır.
#"Email" inputunun içerisinde default olarak "Email giriniz" yazısı yer almalıdır.
#"Şifre" inputunun içerisinde default olarak "Şifrenizi giriniz" yazısı yer almalıdır.

@smoketest @ui
Feature:US_010 User can access to login page and input of the login should be available

  Background:
    Given user is on "https://kese.nl/login" login page


  Scenario Outline: TC_001_US_010 "Email" input must be active and available
    And User can click to email input
    Then User can write <email> in the email input
    Examples:
      | email                  |
      | "kullanici1@gmail.com" |
      | "aliSuleyman1235"      |
      | "12345@gmail"          |

  Scenario Outline: TC_002_US_010 "Sifre" input must be active and available
    And User can click to sifre input
    Then User can write <sifre> in the sifre input
    Examples:
      | sifre       |
      | "123456"    |
      | "AjgrWou"   |
      | "158ytrn!8" |

  Scenario: TC_003_US_010 By default, the text "Email giriniz" should be included in the "Email " input
      And User can click to email input
      Then Assure the "Email giriniz" default email text

  Scenario: TC_004_US_010 By default, the text "Şifrenizi giriniz" should be included in the "Sifre" input
      And User can click to sifre input
      Then Assure the "Şifrenizi giriniz" default sifre text