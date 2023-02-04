# US_086
# Bir kullanıcı olarak "/api/user/listofilans" sayfasına
# "get" tipinde bağlandığımda kullanıcıya ait ilan bilgilerini görebilmeliyim
#https://kese.nl/api/user/listofilans
#"Gönderilecek datalar :  (query olarak)
#scret_token: bilgisi alınacak kullanıcıya ait token bilgisi"
#Nursel

@US086
Feature: User API Get List of Ilans

  @MH-225
  Scenario: User api get list of all users ilans
    When user logs in with "nbc@gmail.com" and "jkl123" to "/user/account/login" with GET for user API
    Then user enters user's token to "/user/listofilans" to list all the ilans with GET for user API