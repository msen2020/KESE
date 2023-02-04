#US_019	Bir kullanıcı olarak "/signup" sayfasına girdiğimde, sisteme kayıt olabilmeliyim.
#https://kese.nl/signup
#Girilen veriler ile sisteme kayıt olabilmeliyim.
#Kayıt oluşturulduktan sonra
# "Kaydınız oluşturuldu, giriş yapma sayfasına yönlendiriliyorsunuz.." yazısı görünür olmalıdır.
#Kayıt oluşturulduktan sonra kullanıcı "/login" sayfasına yönlendirilmelidir.

@smoketest
Feature: US_019 As a user, When I enter the "/signup" page , I should be able to register to the system

  Scenario: I should be able to register to the system.
    Given user is on signup page "https://kese.nl/signup"
    And user types "rejep" to the username input on the signup page
    And user types "rejep@gmail.com" to the email input on the signup page
    And user types "1234" to the password input on the signup page
    And user types "1234" to the repassword input on the signup page
    And user clicks to the checkbox on signup page
    And user clicks to the kayit ol button on the signup page
    And user verifies "Kaydınız oluşturuldu, giriş yapma sayfasına yönlendiriliyorsunuz." is visible
    Then user gets the url of the page
    And page url should be "https://kese.nl/signup"
