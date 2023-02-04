# US_116
# Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 9. stepte "Değişim Tarihi" bilgisini girebilmeliyim.	http://test.kese.nl/new_bed_breakfast
# "Değişim Tarihi" başlığı görünür olmalıdır.
# "Evinizin değişim için müsait olduğu tarih aralıklarını seçiniz. Birden çok tarih aralığı seçebilirsiniz." açıklaması görünür olmalıdır.
# "Tarih seçmek için tıklayınız" inputu aktif ve kullanılabilir olmalıdır.
# Tarih seçme inputuna tıklayınca, tarih seçme penceresi açılmalıdır.
#
# 9. stepte, sayfanın üst kısmına "9 / 10" yazısı görünür olmalıdır.

Feature:US_116 Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 9. stepte "Değişim Tarihi" bilgisini girebilmeliyim.	http://test.kese.nl/new_bed_breakfast

  Background: Successful connection to site and coming to step 9 in "Bed & Breakfast"
    Given user is on login page "https://kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 9 in Bed & Breakfast

  Scenario:
    Given "Tarih seçmek için tıklayınız" input should be clickable
    Then user verifies the text "Evinizin değişim için müsait olduğu tarih aralıklarını seçiniz. Birden çok tarih aralığı seçebilirsiniz." is visible
    Then user verifies the text "Değişim Tarihi" is visible
    When user clicks "Tarih seçmek için tıklayınız" input
    Then user verifies that the date selection window is visible
    Then user verifies text "9 / 10" the is visible