Feature: Bir kullanıcı olarak "/api/cargos" sayfasına "post" tipinde bağlandığımda gönderilen bilgiler ile yeni bir kargo taşıma ilanı oluşturabilmeylim.

  Scenario: US_164_TC_01 Creating a new cargo transport ad by Post method.
    Given GET secret_token, id and user name for authorized user
    Then POST a new cargo transport ad