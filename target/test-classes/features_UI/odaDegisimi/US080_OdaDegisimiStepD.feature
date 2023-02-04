#US_080	Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, ilk adım hariç diğer adımlarda geriye dönebilmeliyim.
# https://kese.nl/new_room
#"Geri" butonu, ilk adım hariç tüm adımlarda aktif ve kullanılabilir olmalıdır.
#Bir önceki adıma geri geldiğimde, daha önceden eklediğim bilgiler görünür olmalıdır.

@US080

Feature: "Oda Kirala & Değişimi" - Geri button enability and saved data verification
  # Bir kullanıcı olarak "Oda Kirala & Değişim" ilan oluşturma sayfasında, ilk adım hariç diğer adımlarda geriye dönebilmeliyim.

  Background: Login and navigate to ilan ver menu
    Given the user goes to "https://kese.nl/" page
    And user logs in with "nbc@gmail.com" and "jkl123"
    And user clicks ilan ver menu on signed in home page

  Scenario Outline: <Ev Tipi> - TC_001_US_080 and TC_002_US_080 - Geri buttons enability and saved data verification
   #Geri buttons should be active and user should see all the saved data when clicked geri button
    When user clicks "Oda" in ilan ver menu
    Then step 1 should be displayed on oda kirala page
    And user clicks "<Ev Tipi>" option on on step one on oda kirala page
    And user clicks "Odamı kiraya vermek istiyorum." checkbox on step one on oda kirala page
    And user clicks "Karşılıklı oda değişimi yapmak istiyorum." checkbox on step one on oda kirala page
    When user clicks to the ilerle button on oda kirala page
    Then step 2 should be displayed on oda kirala page
    And the geri button should be enabled
    When user clicks to the geri button on oda kirala page
    Then "<Ev Tipi>" option should be selected on step one on oda kirala page
    And "Odamı kiraya vermek istiyorum." checkbox should be clicked on step one on oda kirala page
    And "Karşılıklı oda değişimi yapmak istiyorum." checkbox should be clicked on step one on oda kirala page
    When user clicks to the ilerle button on oda kirala page
    Then step 2 should be displayed on oda kirala page
    And user enters "San Fernando, Şili" to address input on step two on oda kirala page
    And user enters ulasim olanaklari from home on step two on oda kirala page
      | Ev ile otobüs durağı arası :  | 2 |
      | Ev ile tren istasyonu arası : | 3 |
      | Ev ile tramway durağı arası : | 4 |
    And user clicks sahsi arac ulasim box on oda kirala page
    When user clicks to the ilerle button on oda kirala page
    Then step 3 should be displayed on oda kirala page
    And the geri button should be enabled
    When user clicks to the geri button on oda kirala page
    Then "San Fernando, Şili" should be displayed as sectiginiz adres on step two on oda kirala page
    Then below ulasim olanaklari should be displayed on step two on oda kirala page
      | Ev ile otobüs durağı arası :  | 2 |
      | Ev ile tren istasyonu arası : | 3 |
      | Ev ile tramway durağı arası : | 4 |
    And sahsi arac ulasim box should be clicked on step two on oda kirala page
    When user clicks to the ilerle button on oda kirala page
    Then user enters "80" to ev kullanim alani on oda kirala page
    And user defines below ortak kullanim alanlari on step three on oda kirala page
      | Yatak Odası  | 6 |
      | Banyo        | 3 |
      | Tuvalet      | 4 |
      | Oturma Odası | 3 |
    When user clicks to the ilerle button on oda kirala page
    Then step 4 should be displayed on oda kirala page
    And the geri button should be enabled
    When user clicks to the geri button on oda kirala page
    Then "80" should be displayed on ev kullanim alani step three on oda kirala page
    And below ortak kullanim alanlari should be displayed on step three on oda kirala page
      | Yatak Odası  | 6 |
      | Banyo        | 3 |
      | Tuvalet      | 4 |
      | Oturma Odası | 3 |
    Then user clicks to the ilerle button on oda kirala page
    And user clicks below yas araligi options on step four on oda kirala page
      | 10-15 |
      | 26-35 |
      | 46-65 |
      | 65+   |
    And user clicks cinsiyet "Kadin" option on step four on oda kirala page
    And user increments max kisi sayisi to 3 on step four on oda kirala page
    When user clicks to the ilerle button on oda kirala page
    Then step 5 should be displayed on oda kirala page
    And the geri button should be enabled
    When user clicks to the geri button on oda kirala page
    Then below yas araligi options should be selected on step four on oda kirala page
      | 10-15 |
      | 26-35 |
      | 46-65 |
      | 65+   |
    And cinsiyet "Kadin" should be selected on step four on oda kirala page
    And max kisi sayisi should be 3 on step four on oda kirala page
    When user clicks to the ilerle button on oda kirala page
    Then user selects below ev imkanlari options on step five on oda kirala page
      | TV                 |
      | Eve ait özel garaj |
      | Wi-Fi              |
      | Bulaşık Makinesi   |
      | Bahçe              |
      | Mangal/Barbekü     |
      | Balkon             |
      | Oyun Konsolu       |
    When user clicks to the ilerle button on oda kirala page
    Then step 6 should be displayed on oda kirala page
    And the geri button should be enabled
    When user clicks to the geri button on oda kirala page
    Then below ev imkanlari options should be selected on step five on oda kirala page
      | TV                 |
      | Eve ait özel garaj |
      | Wi-Fi              |
      | Bulaşık Makinesi   |
      | Bahçe              |
      | Mangal/Barbekü     |
      | Balkon             |
    When user clicks to the ilerle button on oda kirala page
    Then user enters "Kileri kullanabilirsiniz" to aciklamalar on step six on oda kirala page
    And user clicks to the ilerle button on oda kirala page
    Then step 7 should be displayed on oda kirala page
    And the geri button should be enabled
    When user clicks to the geri button on oda kirala page
    Then "Kileri kullanabilirsiniz" message should be displayed on step six on oda kirala page
    And user clicks to the ilerle button on oda kirala page
    And user selects below aktiviteler on step seven on oda kirala page
      | Bisiklet Yolu |
      | Sinema        |
      | Kayak Yapma   |
      | Doğa Yürüyüşü |
    When user clicks to the ilerle button on oda kirala page
    Then step 8 should be displayed on oda kirala page
    And the geri button should be enabled
    When user clicks to the geri button on oda kirala page
    Then below aktiviteler should be selected on step seven on oda kirala page
      | Bisiklet Yolu |
      | Sinema        |
      | Kayak Yapma   |
      | Doğa Yürüyüşü |
    When user clicks to the ilerle button on oda kirala page
    And user selects below ozel sartlar on step eight on oda kirala page
      | Evcil hayvan getirebilirsiniz.   | Evet  |
      | Evde sigara içmeye izin verilir. | Hayır |
      | Bakılması gereken bitki var.     | Evet  |
    When user clicks to the ilerle button on oda kirala page
    Then step 9 should be displayed on oda kirala page
    And the geri button should be enabled
    When user clicks to the geri button on oda kirala page
    Then below ozel sartlar should be selected on step eight on oda kirala page
      | Evcil hayvan getirebilirsiniz.   | Evet  |
      | Evde sigara içmeye izin verilir. | Hayır |
      | Bakılması gereken bitki var.     | Evet  |
    And user clicks to the ilerle button on oda kirala page
    And user enters degisim tarihleri on step nine on oda kirala page
    When user clicks to the ilerle button on oda kirala page
    Then step 10 should be displayed on oda kirala page
    And the geri button should be enabled
    When user clicks to the geri button on oda kirala page
    Then selected date should be displayed below sectiginiz tarihler on step nine on oda kirala page
    And user clicks to the ilerle button on oda kirala page
    Then user uploads 5 pictures on step ten on oda kirala page
    And user clicks resimleri kaydet button on step ten on oda kirala page
    And the geri button should be enabled
    When user clicks to the geri button on oda kirala page
    Then step 9 should be displayed on oda kirala page
    When user clicks to the ilerle button on oda kirala page
    Then 5 pictures should be uploaded on step ten on oda kirala page

    Examples:
      | Ev Tipi          |
      | Müstakil Ev      |
      | Apartman Dairesi |
      | Stüdyo Daire     |