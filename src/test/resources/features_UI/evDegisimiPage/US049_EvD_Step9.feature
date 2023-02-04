#  İnput içerisinde default olarak "Tarih seçmek için tıklayınız" yazısı yer almalıdır.
#  Seçtiğim tarih aralığı input içerisinde yer almalıdır.
#  Tarih seçme inputu aktif ve kullanılabilir olmalıdır.

Feature: Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 9. stepte "Değişim Tarihi"
  bilgisini girmek için ilgili inputu kullanabilmeliyim.


  Background:

    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 9 in HomeExchange

  Scenario: İnput içerisinde default olarak "Tarih seçmek için tıklayınız" yazısı yer almalıdır.
    Then user verifies that the text "Tarih seçmek için tıklayınız" is exist

  Scenario: Sectigim tarih aralıgi input içerisinde yer almalıdır.
    When user picks a date
    Then user verifies that the selected dates are exist in the input

  Scenario: Tarih seçme inputu aktif ve kullanılabilir olmalıdır.
    Then user verifies that the selected date input is enabled




