# US_135
  # https://kese.nl/new_car
  # Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 6. stepte "Araç Fotolarını" ekleyebilmeliyim.

  #"Araç Fotoları" başlığı görünür olmalıdır.
  #"Yolculukta kullanacağınız aracın fotoğraflarını yükleyiniz. En fazla 10 fotoğraf yükleyebilirsiniz." açıklaması görünür olmalıdır.
  #"Resimleri Seçin" butonu aktif ve kullanılabilir olmalıdır.
  #"Tüm Resimleri Kaldır" butonu aktif ve kullanılabilir olmalıdır.
  #"En az 5 en fazla 10 resim yükleyebilirsiniz." açıklaması görünür olmalıdır.
  #6. stepte, sayfanın üst kısmına "6 / 6" yazısı görünür olmalıdır.
#    by nur

@MH-380
Feature: US135

  Background: Going to Page 6 on Birlikte Seyahat
    Given user is on login page
    When user logs in with "kullanici1@gmail.com" and "1234"
    And user clicks ilan ver menu on signed in home page
    And user clicks "Birlikte Seyehat" in ilan ver menu
    And user navigates to page 6 in Birlikte Seyahat

  @TEST_MH-372
  Scenario: User should be on the 6/6 step
    Then step number "6 / 6" should be displayed on the birlikteSeyahat Page

  @TEST_MH-373
  Scenario: User should see "Arac Fotoları" text as a header on the 6th step
    Then verify "Araç Fotoları" displays as a header on the 6th step of the birlikteSeyahatPage

  @TEST_MH-374
  Scenario: User should see the info on 6th step
    Then verify "Yolculukta kullanacağınız aracın fotoğraflarını yükleyiniz. En fazla 10 fotoğraf yükleyebilirsiniz." text is displayed as info at 6th step of the birlikteSeyahatPage

  @TEST_MH-375
  Scenario: Without adding any pics clicking the "Resimleri Kaydet" button_ Negative
    When user clicks "Resimleri Kaydet" button on the 6th step of the birlikteSeyahatPage
    Then verify "*Lütfen en az 5 tane resim seçiniz." text is displayed on the 6th step

  @TEST_MH-376
  Scenario: When user clicks to "Geri" button user shoul be on the 5/6 page
    When user clicks "Geri" button on the 6th step of the birlikteSeyahatPage
    Then user should be on the "5 / 6" step of the birlikteSeyahatPage

  @TEST_MH-377
  Scenario: User should add 5 pics (mim required) to the 6th step
    When user adds 5 pictures on the birlikteSeyahatPage at 6th step
    Then verify in the system has 5 pics to the birlikteSeyahatPage
    And user clicks "Resimleri Kaydet" button on the 6th step of the birlikteSeyahatPage
    Then system should display İlani Yayinla button on the 6th step of the birlikteSeyahatPage

  @TEST_MH-378 @hi
  Scenario Outline: Adding less than 5 pics and clicking the "Resimleri Kaydet" button_ Negative
    When user adds <numOfPic> pictures on the birlikteSeyahatPage at 6th step
    And user clicks "Resimleri Kaydet" button on the 6th step of the birlikteSeyahatPage
    Then verify "*Lütfen en az 5 tane resim seçiniz." text is displayed on the 6th step
    Examples:
      | numOfPic |
      | 1        |
      | 2        |
      | 3        |
      | 4        |

  @TEST_MH-379 @hi
  Scenario Outline: Removing all pics with "Tum Resimleri Kaldır" button
    Given user adds <numOfPic> pictures on the birlikteSeyahatPage at 6th step
    When user clicks "Tüm Resimleri Kaldır" button on the 6th step of the birlikteSeyahatPage
    Then verify in the system has 0 pics to the birlikteSeyahatPage
    Examples:
      | numOfPic |
      | 1        |
      | 2        |
      | 3        |
      | 4        |
      | 5        |

