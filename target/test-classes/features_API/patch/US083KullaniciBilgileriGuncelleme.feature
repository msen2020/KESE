#US_083
#Bir kullanıcı olarak "/api/user/account" sayfasına "patch" tipinde bağlandığımda gönderdiğim bilgiler ile kullanıcı bilgileri güncellenebilmelidir.
#https://kese.nl/api/user/account
#Gönderilen bilgiler ile kullanıcı bilgileri güncellenebilmelidir.
#Kullanıcı bilgilerinin güncellenebilmesi için giriş yapılmış olmalıdır.
#Kullanıcı bilgileri güncellenince "{sonuc : true}" cevabı "200" durum kodunda alınmalıdır.
#Kullanıcı bilgileri güncellenemezse 401 durum kodu mesajı alınmalıdır.
#
#"Gönderilebilecek datalar : (body olarak)
#email : email adresi
#kullanici_adi : kullanıcı adı"

Feature:API - Kullanıcı Bilgileri Guncelleme

  Scenario: Kullanici bilgilerini gunceller
    Given assert that user connects to "/user/account"
    Then user updates their info and verifies status code

  Scenario: NEGATIVE invalid kullanici token
    Given assert that user connects with invalid credential and verifies status code

  Scenario: NEGATIVE invalid email adresi ile patch
    Given assert that can not patch with invalid email address