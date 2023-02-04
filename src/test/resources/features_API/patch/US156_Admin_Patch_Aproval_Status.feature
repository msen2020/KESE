Feature: US_156	Bir admin olarak "/api/bedbreakfasts/approval" sayfasına "patch" tipinde bağlanarak ilana ait "approval" değerini güncelleyebilmeliyim.
#Giriş yapan kullanıcı admin olmak zorundadır, aksi durumda güncellemeye izin verilmemelidir.
#Bilal
  Scenario: admin user should be change to bedbreakfasts ads status by patch request
    Given user connects to "/bedbreakfasts/approval" and change the exist ads status
    Then user verifies the bedbreakfasts advertise status changed and status code is 202

