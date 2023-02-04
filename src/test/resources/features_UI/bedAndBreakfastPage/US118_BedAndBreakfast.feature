# US_118
# Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 9. stepte "Değişim Tarihi" bilgisini girmek için ilgili inputu kullanabilmeliyim.
# http://test.kese.nl/new_bed_breakfast
#İnput içerisinde default olarak "Tarih seçmek için tıklayınız" yazısı yer almalıdır.
#Seçtiğim tarih aralığı input içerisinde yer almalıdır.
# Example value="03/05/2022 - 03/05/2022"
#Tarih seçme inputu aktif ve kullanılabilir olmalıdır.

Feature: US_118 Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 9. stepte "Değişim Tarihi"
  bilgisini girmek için ilgili inputu kullanabilmeliyim.

  Background: US118_TC001
    Given user is on login page "http://test.kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 9 in HomeExchange

  Scenario:US118_TC002
  Input icerisinde default olarak "Tarih seçmek için tıklayınız" yazisi yer almalidir.
    Then user verifies that the text "Tarih seçmek için tıklayınız" should be exist in the input

  Scenario: US118_TC003
  Sectigim tarih araligi input icerisinde yer almalidir.
    When user picks the dates
    Then user verifies that the selected date range should be included in the input

  Scenario:US118_TC004
  Tarih secme inputu aktif ve kullanalabilir olmalidir.
    Then user verifies that the date selection input should be active and enabled


