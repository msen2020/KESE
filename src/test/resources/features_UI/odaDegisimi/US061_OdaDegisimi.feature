#US_061	Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.
# http://test.kese.nl/new_room
#"İlerle" butonu görünür olmalıdır.
#"İlerle" butonu default olarak tıklanabilir olmamalıdır.
#Bilgi eksikliği durumunda, İlerle butonuna tıklanırsa "Lütfen evin yüzey alanını giriniz" uyarısı görünür olmalıdır.
#Zorunlu bilgiler eklendikten sonra İlerle butonu tıklanabilir olmalı.
#Not: Eklenmesi gereken zorunlu bilgiler, "Yüzey Alanı".

Feature: Bir kullanıcı olarak "Oda Değişimi" ilan oluşturma sayfasında, 3. stepten 4. stepe geçiş yapabilmeliyim.


  Background:
    Given user is on login page "https://kese.nl/new_home"
    When user signed in on sign in page
      | hamza@gmail.com | 1234 |
    And user should click to Ilan Ver go to page 3 in Oda

  Scenario: US061 TC01_The "ilerle" button should be visible and not clickable
    Then the user verifies that the "İlerle" butonu is visible.
    When the user clicks the "Ilerle" button
    Then  the user verifies that the "Ilerle" button is not clickable
    Then the user verifies that the warning text "Lütfen evin yüzey alanını giriniz" is visible

  Scenario: US061 TC02_The "ilerle" button should be visible and clickable
    Given the user inputs the required information on page 3 of Room Exchange
    When the user clicks the "Ilerle" button
    Then the user verifies that the "Ilerle" button is clickable

    Given until the user fills in the blanks on page 3 "ilerle" button should not be functional
    When the user not enters required  information, she sees "Lütfen evin yüzey alanını giriniz"
    Then After the user has entered the required information, the "ilerle" button should be clickable.