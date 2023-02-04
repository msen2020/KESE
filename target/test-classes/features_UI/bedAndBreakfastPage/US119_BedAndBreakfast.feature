Feature: Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, 9. stepte "Değişim Tarihi"
  bilgisi ekleyip çıkarabilmeliyim.

#  Eklediğim tarih bilgisi "Seçtiğiniz Tarihler" bölümüne eklenmelidir.
#  Tarih bilgisini eklediğim inputun yanında "çarpı" butonu yer almalıdır.
#  Çarpı butonuna tıklayarak, eklediğim tarih bilgisi inputunu kaldırabilmeliyim.
#  Kaldırdığım tarih bilgisi, "Seçtiğiniz Tarihler" bölümünden kaldırılmalıdır.


  Background:

    Given user is on login page "http://test.kese.nl/new_home"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 9 in HomeExchange

  Scenario: Eklediğim tarih bilgisi "Seçtiğiniz Tarihler" bölümüne eklenmelidir.
    When user pick a date
    Then user verifies selected dates "16 Şubat 2022 Çarşamba - 16 Şubat 2022 Çarşamba" are added under Sectiginiz Tarihler

  Scenario: Tarih bilgisini eklediğim inputun yanında "çarpı" butonu yer almalıdır.
    When user pick a date
    When user select a date user should see  x button on the right side

  Scenario:Carpı butonuna tıklayarak, eklediğim tarih bilgisi inputunu kaldırabilmeliyim.
    When user pick a date
    When user click on the x button date frame should be clear and "Tarih seçmek için tıklayınız" should be exist.

  Scenario:  Kaldırdığım tarih bilgisi, "Seçtiğiniz Tarihler" bölümünden kaldırılmalıdır.
    When user pick a date
    When user click on the x button date frame should be clear and "Tarih seçmek için tıklayınız" should be exist.
    When user delete date on the frame selected date Sectiginiz Tarihler shouldn't be displayed