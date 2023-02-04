Feature: US_072 Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 9. stepte "Değişim Tarihi" bilgisini girebilmeliyim.

  Background:
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | hamza@gmail.com | 1234 |
    And user should click to Ilan Ver go to page 9 in OdaDegisimi

  Scenario:
    When "Tarih seçmek için tıklayınız" input should be clickable
    And if user clicks "Tarih seçmek için tıklayınız" input, the date selection window should open
    Then verify if the header "Değişim Tarihi" is visible
    And verify if the description "Odanızın değişim veya kiralama için müsait olduğu tarih aralıklarını seçiniz. Birden çok tarih aralığı seçebilirsiniz." is visible
    And verify if the number of page "9 / 10" is visible