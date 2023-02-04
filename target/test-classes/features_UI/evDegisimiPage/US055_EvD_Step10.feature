#US_055	Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, ilk adım hariç diğer adımlarda geriye dönebilmeliyim.
# https://kese.nl/new_home
#"Geri" butonu, ilk adım hariç tüm adımlarda aktif ve kullanılabilir olmalıdır.
#Bir önceki adıma geri geldiğimde, daha önceden eklediğim bilgiler görünür olmalıdır.

Feature: US_055	Bir kullanıcı olarak "Ev Değişimi" ilan oluşturma sayfasında, ilk adım hariç diğer adımlarda geriye dönebilmeliyim.

  Scenario Outline: TC_001_US_055 and TC_002_US_055
    Given user is on login page <loginPageUrl>
    When user enters valid username <userName>
    And user enters valid password <password>
    And user clicks on Login button
    And user goes to "https://kese.nl/new_home" page
    And user selects "<ev tipi>" as house type on the new home step one page
    And user clicks to the ilerle button on the new home page
    Then user verifies the geri button is enabled
    And user clicks to the geri button
    Then user verifies "<ev tipi>" is selected on the new home step one page
    And user clicks to the ilerle button on the new home page
    And user selects "London, Birleşik Krallık" an address from the list in new home step two page
    And user clicks to the checkbox on the new home step two page
    And user types "1" to the ev otobus input on the new home step two page
    And user types "1" to the ev tren input on the new home step two page
    And user types "1" to the ev tramway input on the new home step two page
    And user clicks to the ilerle button on the new home page
    Then user verifies the geri button is enabled
    And user clicks to the geri button
    Then user verifies "London, Birleşik Krallık" is visible
    Then user verifies the variable of ev otobus input equals "1" on the new home step two page
    Then user verifies the variable of ev tren input equals "1" on the new home step two page
    Then user verifies the variable of ev tramway input equals "1" on the new home step two page
    Then user verifies the checkbox is checked on the new home step two page
    And user clicks to the ilerle button on the new home page
    And user types usage area as "120" to the input on the new home step three page
    And user clicks on the increment buttons on the new home step three page
    Then user verifies that the numbers are 2 1 1 1 on the new home step three page
    Then user verifies the value of usage area input is "120" on the new home step three page
    And user clicks to the ilerle button on the new home page
    And user clicks on the increment buttons on the new home step four page
    And user clicks on the increment buttons on the new home step four page
    And user clicks to the ilerle button on the new home page
    Then user verifies the geri button is enabled
    And user clicks to the geri button
    Then user verifies that the numbers are 2 2 2 2 2 2 2 2 on the new home step four page
    And user clicks to the ilerle button on the new home page
    And user clicks to the all options on the new home step five page
    And user clicks to the ilerle button on the new home page
    Then user verifies the geri button is enabled
    And user clicks to the geri button
    Then user verifies the all options are selected on the new home step five page
    And user clicks to the ilerle button on the new home page
    And user types a description as "asdf" to the input on the new home step six page
    And user clicks to the ilerle button on the new home page
    Then user verifies the geri button is enabled
    And user clicks to the geri button
    Then user verifies the value of description input is same with "asdf" on the new home step six page
    And user clicks to the ilerle button on the new home page
    And user clicks to the all options on the new home step seven page
    And user clicks to the ilerle button on the new home page
    Then user verifies the geri button is enabled
    And user clicks to the geri button
    Then user verifies the all options are selected on the new home step seven page
    And user clicks to the ilerle button on the new home page
    And user clicks to the all hayir options on the new home step eight page
    And user clicks to the ilerle button on the new home page
    Then user verifies the geri button is enabled
    And user clicks to the geri button
    Then user verifies the all hayir options are selected on the new home step eight page
    And user clicks to the ilerle button on the new home page
    And user selects the date on the new home step nine page
    Then user verifies "Seçtiğiniz Tarihler" is visible
    And user clicks to the ilerle button on the new home page
    Then user verifies the geri button is enabled
    And user clicks to the geri button

    Examples:
      | loginPageUrl | userName | password | ev tipi |
      |"http://test.kese.nl/login"|"email@gmail.com"|"3344"|Mustakil Ev|
      |"http://test.kese.nl/login"|"email@gmail.com"|"3344"|Apartman Dairesi|
      |"http://test.kese.nl/login"|"email@gmail.com"|"3344"|Studyo Daire|

