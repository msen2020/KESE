# Bir kullanıcı olarak "Birlikte Seyehat" ilan oluşturma sayfasında, 4. stepte başlangıç, yaş aralığı, cinsiyet ve kişi sayısı bilgilerini girebilmeliyim.
# https://kese.nl/new_car
#"Cinsiyet, yaş aralığı, kişi sayısı" başlığı görünür olmalıdır.
#"Birlikte seyehat yapmak istediğiniz kişi/kişilerin yaş, cinsiyet tercihlerinizi seçiniz." açıklaması görünür olmalıdır.
#"Yaş Aralığı" birden fazla seçilebilmelidir.
#"Yaş Aralığı" farketmez olarak seçildiğinde, diğer yaş aralığı seçimleri kaldırılmalıdır.
#"Cinsiyet" seçimi yapılabilmelidir, birden fazla seçime izin verilmemelidir.
#"Maksimum kişi sayısı" en az 0 en fazla 15 olacak şekilde seçilebilmelidir.
#
#4. stepte, sayfanın üst kısmına "4 / 6" yazısı görünür olmalıdır.
#Nuray

Feature:US131

  Background: Going to Page 4 on Birlikte Seyahat
    Given user is on login page
    When user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks ilan ver menu on signed in home page
    * user clicks "Birlikte Seyehat" in ilan ver menu
    * user navigates to page 4 in Birlikte Seyahat

  Scenario:"Cinsiyet, yaş aralığı, kişi sayısı" title should be visible
    Given "Cinsiyet, yaş aralığı, kişi sayısı" text is displayed
    And "Cinsiyet" text is displayed
    And "Yaş Aralığı" text is displayed
    And "4" text is displayed
    Then "Birlikte seyehat yapmak istediğiniz kişi/kişilerin yaş, cinsiyet tercihlerinizi seçiniz." text is displayed

  Scenario:"Yaş Aralığı"should be able to select one more than if user select farketmez other choeses should not able to select
    Given Yaş Aralığı should be selectable up to 7
    When Yaş Aralığı selected as 8 farketmez other choices can not be selected
    Then Verify selected only farketmez


  Scenario Outline:User should be able to select "Cinsiyet" ,do not let one more than choices.
    Given Cinsiyet should be selectable only "<cinsiyet>" and "<num>"gender
    Then verify user select only one "<cinsiyet>" choice
    Examples:
      | cinsiyet  | num |
      | Kadin     | 1   |
      | Erkek     | 1   |
      | Farketmez | 2   |


  Scenario: "Maksimum kişi sayısı" should be able to select at least 0 at most 15
    Given user should be able to select from 1 to 15 number
