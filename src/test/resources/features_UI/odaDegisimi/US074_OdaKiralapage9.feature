Feature: Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 9.
  stepte "Değişim Tarihi" bilgisini girmek için ilgili inputu kullanabilmeliyim.


#  İnput içerisinde default olarak "Tarih seçmek için tıklayınız" yazısı yer almalıdır.
#  Seçtiğim tarih aralığı input içerisinde yer almalıdır.
#  Tarih seçme inputu aktif ve kullanılabilir olmalıdır.

  Background:

    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 9 in HomeExchange

  Scenario: İnput içerisinde default olarak "Tarih seçmek için tıklayınız" yazısı yer almalıdır.
    Then user verify "Tarih seçmek için tıklayınız" shold be exist

  Scenario: Seçtiğim tarih aralığı input içerisinde yer almalıdır.
    When user pick a date
    Then user verify picked date should be exist in the input

  Scenario: Tarih seçme inputu aktif ve kullanılabilir olmalıdır.
    Then user verify pick date input should be enabled



