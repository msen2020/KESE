# US_143-Bir kullanıcı olarak "Kargo Gönder" ilan oluşturma sayfasında, 4. stepte açıklama bilgisi ekleyebilmeliyim.
# https://kese.nl/new_cargo
# 1.stepte, sayfanın üst kısmında "4 / 4" yazısı görünür olmalıdır.
# "Kargo Tarihi ve Zamanı" başlığı görünür olmalıdır.
# "Kargo gonderme tarihini ve zamanini  belirtiniz." açıklaması görünür olmalıdır.
# "Tarih seçmek için tıklayınız" inputu aktif ve kullanılabilir olmalıdır.
# Saat seçme inputuna tıklayınca, saat seçme penceresi açılmalıdır,
# saat seçimi yapılabilmelidir.

  # QA ENGINEER MSEN

Feature: US_143-Bir kullanıcı olarak "Kargo Gönder" ilan oluşturma sayfasında, 4. stepte açıklama bilgisi ekleyebilmeliyim.

  Background: Successful connection to site and coming to step 3 in "Kargo"
    Given user is on login page "https://kese.nl/new_cargo"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 4 in Kargo

  Scenario: TC_01 user adds explanation in step 4
    Then user verifies that the number of the page "4/4" is visible at step four on Kargo Page
    Then user verifies that the title "Kargo Tarihi ve Zamanı" is visible at step four on Kargo Page
    Then user verifies that he can see explanation message "Kargoyu tasiyabilecegiz tarihi ve zamanını belirtiniz." should be displayed on kargo page
    Then user verifies that "Tarih seçmek için tıklayınız" input is enabled
    When user clicks date input at step four on kargo page
    Then user verifies that the Time window is opened at step four on kargo page
    And user selects Times at step four on kargo page
    And user clicks Bilgileri Kaydet Button
