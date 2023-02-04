Feature: US_047 Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 9. stepte "Değişim Tarihi" bilgisini girebilmeliyim.

  Background:
    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 9 in HomeExchange

    Scenario:
      When "Tarih seçmek için tıklayınız" input should be clickable
      And if user clicks "Tarih seçmek için tıklayınız" input, the date selection window should open
      Then verify if the header "Değişim Tarihi" is visible
      And verify if the description "Evinizin değişim için müsait olduğu tarih aralıklarını seçiniz. Birden çok tarih aralığı seçebilirsiniz." is visible
      And verify if the number of page "9 / 10" is visible

