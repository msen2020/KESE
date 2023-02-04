# US_050
#  Eklediğim tarih bilgisi "Seçtiğiniz Tarihler" bölümüne eklenmelidir.
#  Tarih bilgisini eklediğim inputun yanında "çarpı" butonu yer almalıdır.
#  Çarpı butonuna tıklayarak, eklediğim tarih bilgisi inputunu kaldırabilmeliyim.
#  Kaldırdığım tarih bilgisi, "Seçtiğiniz Tarihler" bölümünden kaldırılmalıdır.

Feature: Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 9. stepte "Değişim Tarihi"
  bilgisi ekleyip çıkarabilmeliyim.


  Background: user is logs in

    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 9 in HomeExchange

  Scenario: Bugunun tarih bilgisi "Seçtiğiniz Tarihler" bölümüne eklenmelidir.
    When user picks today's dates
    Then user verifies that Today's date are added under Sectiginiz Tarihler Title

#  Scenario: Onceki ay tarih bilgisi "Seçtiğiniz Tarihler" bölümüne eklenmelidir.
#    When user picks a date
#    Then user verifies selected dates "16 Ocak 2022 Pazar - 16 Ocak 2022 Pazar" are added under Sectiginiz Tarihler

  Scenario: Tarih bilgisini eklediğim inputun yanında "çarpı" butonu yer almalıdır.
    When user picks a date
    When user select a date user should see  X cancel the date button on the right side

  Scenario:Carpı butonuna tıklayarak, eklediğim tarih bilgisi inputunu kaldırabilmeliyim.
    When user picks a date
    When user click on the x button date frame should be clear and "Tarih seçmek için tıklayınız" should be exist.

  Scenario:  Kaldırdığım tarih bilgisi, "Seçtiğiniz Tarihler" bölümünden kaldırılmalıdır.
    When user picks a date
    When user click on the x button date frame should be clear and "Tarih seçmek için tıklayınız" should be exist.
    When user delete date on the frame selected date Sectiginiz Tarihler shouldn't be displayed