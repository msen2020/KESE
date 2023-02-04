#US_085
# Bir kullanıcı olarak "/api/user/account/logout" sayfasına "get" tipinde bağlandığımda sistemden çıkış yapabilmeliyim.
# https://kese.nl/api/user/account/logout
#Çıkış yapma işlemi başarılı ise "200" durum kodunda
# "{sonuc : true}" cevabını alabilmeliyim.
#
@wip
Feature: US085

  Scenario: User should logout
    When user connects to "/user/account/logout"
    Then the user verifies that the status code is 200
    And the user verifies that the response body has sonuc is "true"