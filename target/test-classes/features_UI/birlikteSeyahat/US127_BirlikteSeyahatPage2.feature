Feature: US_127	Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 2. stepte başlangıç, bitiş ve geçiş noktalarını seçebilmeliyim.
#  "Yolculuk Rotası" başlığı görünür olmalıdır.
#  "Yapacağınız/ Yapmak istediğiniz yolculuğun rotasını seçiniz. Başlangıç ve bitiş noktalarını belirtiniz.
#  Ayrıca yolculuğunuz süresince uğrayacağınız geçiş noktalarını sırası ile belirtiniz." açıklaması görünür olmalıdır.
#  Başlangıç noktası bilgisi seçilebilir olmalıdır.
#  Bitiş noktası bilgisi seçilebilir olmalıdır.
#  Geçiş noktaları bilgileri seçilebilir olmalıdır.
#  Seçilen geçiş noktaları liste şeklinde görünür olmalıdır.
#  Geçiş noktaları kaldırılabilmelidir.

  Background: Going to Page 2 on Birlikte Seyahat
    Given user is on login page
    When user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks ilan ver menu on signed in home page
    * user clicks "Birlikte Seyehat" in ilan ver menu
    * user navigates to page 2 in Birlikte Seyahat

  Scenario: user on the step 2 at Birlikte seyahat page and confirm that acceptance criteria is satisfied
    Given user on the page two "2 / 6"
    Then user confirm that page title text is visible
    And user confirm that explain section is visible
    And user confirm that starting point is selectable
    And user confirm that ending point is selectable
    And user confirm thar passing point is selectable
    And user confirm that selected passing point should be visible as a list
    And user confirm that passing points are deletable



