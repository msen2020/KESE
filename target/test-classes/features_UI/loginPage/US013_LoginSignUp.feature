#US_013
#Bir kullanıcı olarak "/signup" sayfasına girdiğimde, kayıt için gerekli inputlar kullanılabilir olmalıdır.
#https://kese.nl/signup
#"Kullanıcı Adı" inputu aktif ve kullanılabilir olmalıdır.
#"Email" inputu aktif ve kullanılabilir olmalıdır.
#"Şifre" inputu aktif ve kullanılabilir olmalıdır.
#"Şifre tekrarı" inputu aktif ve kullanılabilir olmalıdır.
#"Email" inputunun içerisinde default olarak "email@gmail.com" yazısı yer almalıdır.@adem-SignUp

Feature: US_013 When I enter the "/signup" page as a user,
  the necessary inputs for the registration should be available.

  Background: US_013_TC_01 the user goes to https://kese.nl/login page
    Given Kullanici "https://kese.nl" sayfasina gider
    When the user clicks Giris Yap button
    And the user clicks Kayit Ol button
    And the system redirects the user to "https://kese.nl/signup" page

  Scenario:US_013_TC_02- "Kullanıcı Adı" inputu aktif ve kullanılabilir olmalıdır.
    Given Kullanici "User name" yerine "admin" yazar

  Scenario:US_013_TC_03- "Email" inputu aktif ve kullanılabilir olmalıdır.
    Given Kullanici email@gmail.com kismina admin@gmail.com girilir

  Scenario:US_013_TC_04-  "Şifre" inputu aktif ve kullanılabilir olmalıdır.
    Given Kullanici Sifre kismina Admin123.girilir

  Scenario:US_013_TC_05- "Şifre tekrarı" inputu aktif ve kullanılabilir olmalıdır.
    Given Kullanici bir onceki adimda girdigimiz sifre Admin123.buraya da girilir

  Scenario:US_013_TC_06- "Email" inputunun içerisinde default olarak "email@gmail.com" yazısı yer almalıdır.
    Given default email adresinde email@gmail.com yazili oldugunu kontrol edilir

