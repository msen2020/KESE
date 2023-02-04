Feature: US_157	Bir kullanıcı olarak "/api/cars" sayfasına "post" tipinde bağlandığımda gönderilen bilgiler ile yeni bir birlikte seyehat ilanı oluşturabilmeylim.
# Bilal
#  Zorunlu bilgiler gönderilerek yeni bir ilan oluşturulabilmelidir.
#  Kullanıcı giriş yapmış olmalıdır. (token)
  Scenario: user should be create new car birlikte seyahat advertise
    Given user connects to "/cars" and adds a new cars adds
    Then user verifies the cars advertise added and status code is 202


