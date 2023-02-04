# US129
# Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 3. stepte başlangıç, koltuk bilgisi seçebilmeli, seyehat ile ilgili açıklamaları girebilmeliyim.
# https://kese.nl/new_car
#"Araç/Seyehat Bilgileri" başlığı görünür olmalıdır.
#"Seyehattaki koltuk tecihinizi veya müsait olan koltuk durumunuzu belirtiniz?" açıklaması görünür olmalıdır.
#Ön Koltuk, Arka Koltuk, Faketmez seçenekleri seçilebilir olmalıdır.
#Ön Koltuk, Arka Koltuk, Faketmez seçeneklerinden aynı anda sadece 1 tanesi seçilebilir olmalıdır.
#Açıklamalar inputu kullanılabilir olmalıdır.
#
#3. stepte, sayfanın üst kısmına "3 / 6" yazısı görünür olmalıdır.

Feature: 3rd step should be able to select the starting seat information

  Background: Going to Page 3 on Birlikte Seyahat
    Given user is on login page
    When user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks ilan ver menu on signed in home page
    * user clicks "Birlikte Seyehat" in ilan ver menu
    * user navigates to page 3 in Birlikte Seyahat

  Scenario:US129_TC_001 As a user, I should be able to select the 3rd step starting, seat information, and enter explanations about the trip.

    Then user verifty that there is a "Araç/Seyehat Bilgileri" Page title visible on the Birlikte Seyahat three page
    Then user verifty that there is a "Seyehattaki koltuk tecihinizi veya müsait olan koltuk durumunuzu belirtiniz?" Page  visible on the Birlikte Seyahat three page
    Then user verifty that there is a "3 / 6" Page Step Number visible on the Birlikte Seyahat three page

  Scenario Outline:US129_TC_002 "Seyehattaki koltuk tecihinizi veya müsait olan koltuk durumunuzu belirtiniz" selection should be selectable, more than one selection should not be allowed.
    And user clicks on "<SeatOption>"  on the Birlikte Seyahat ten page
    Then assert that other gender options are not selected
    Examples:
      | SeatOption  |
      | Ön Koltuk   |
      | Arka Koltuk |
      | Farketmez   |

  Scenario Outline:US129_TC_003 user should enter explanation to the each inputBox separately on the Birlikte seyahat Page
    When user enters "<text>" to the "<inputBox>" inputBox on the 3th BirlikteSeyahat Page
    Then verify system displayed "<text>" in "<inputBox>" on the 3th BirlikteSeyahat Page

    Examples:
      | text                   | inputBox |
      | My car is toyota prius | Aciklama |

