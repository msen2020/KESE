#US_020	Bir kullanıcı olarak "/signup" sayfasına girdiğimde,
# yeni bir kullanıcıyı sadece benzersiz email ve kullanıcı adı ile oluşturabilmeliyim.
# https://kese.nl/signup
#Daha önceden kullanılan email ile kullanıcı kaydı oluşturamamalıdır.
#Daha önceden kullanılan kullanıcı adı ile kullanıcı kaydı oluşturamamalıdır.
#Email kullanılıyorsa "Bu mail adresi zaten kullanılıyor." yazısı görünür olmalıdır.
#Kullanıcı adı kullanılıyorsa
# "Bu kullanıcı adı alınmıştır. Başka bir kullanıcı adı giriniz." yazısı görünür olmalıdır.

@ui
Feature: US_20 Bir kullanıcı olarak "/signup" sayfasına girdiğimde, yeni bir kullanıcıyı sadece benzersiz email ve kullanıcı adı ile oluşturabilmeliyim.

  Background: Successful connection to site and sign up
    Given user is on login page "https://kese.nl/signup"
    When user creates a random credentials and signup

  @smoketest
  Scenario Outline: TC_001_US_20 signup blocks because of repeated email or username
    And user tries to use the same "<credentialPart>" for signup again
    Then user verifies "<warning text>" and can't signup on signup page
    Examples:
      | credentialPart | warning text                                                          |
      | email          | Bu mail adresi zaten kullanılıyor.                            |
      | username       | Bu kullanıcı adı alınmıştır. Başka bir kullanıcı adı giriniz. |

