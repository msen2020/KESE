#US_033	Bir kullanıcı olarak "Konum ve Ulaşım" ilan oluşturma sayfasında,
# 2. stepte "Konum ve Ulaşım" bilgilerini girebilmeliyim.
# https://kese.nl/new_home
#"Konum ve Ulaşım" başlığı görünür olmalıdır.
#"Evinizin konumunu belirtiniz. Açık adres vermenize gerek yoktur" açıklaması görünür olmalıdır.
#"Ev ile otobüs durağı arası" inputu kullanılabilir olmalıdır.
#"Ev ile tren istasyonu arası" inputu kullanılabilir olmalıdır.
#"Ev ile tramway durağı arası" inputu kullanılabilir olmalıdır.
#"Sadece şahsi araç ile..." checkbox'ı kullanılabilir olmalıdır.
#2. stepte, sayfanın üst kısmına "2 / 10" yazısı görünür olmalıdır.

Feature: TC_001_US_033_Bir kullanıcı olarak "Konum ve Ulaşım" ilan oluşturma sayfasında, 2. stepte "Konum ve Ulaşım" bilgilerini girebilmeliyim.

  Background: user should be on the Konum ve Ulasim page
    Given user goes to "https://kese.nl" Page
    When "cemile@gmail.com" signed in on sign in page
    And user goes to "https://kese.nl/new_home" page
    And user chooses house type on the new home step one page
    And user clicks to the ilerle button on the new home page
    And user should able to see Konum ve Ulasim text

  Scenario: : user should able to go next page fiiling mandatory fields
    And user should able to see the text Evinizin konumunu belirtiniz. Acik adres vermenize gerek yoktur
    And user should be able to see the page number
    And user chooses "London, Birleşik Krallık" an address from the list in new home step two page
    And Ev ile otobus duragi arasi input field should be usable
    And Ev ile tren istasyonu arasi input field should be usable
    And Ev ile tramway duragi arasi input field should be usable
    And Sadece sahsi arac ile... checkbox button should be usable







