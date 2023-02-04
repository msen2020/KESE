Feature:Bir kullanıcı olarak "Oda Değişimi" ilan oluşturma sayfasında, 3. stepte "Kullanım Alanı" bilgilerini girebilmeliyim.

  Background:
    Given user is on login page "https://kese.nl/new_home"
    When user signed in on sign in page
      | hamza@gmail.com | 1234 |
    And user should click to Ilan Ver go to page 3 in Oda

  Scenario:The "Kullanim Alani" input must be available.

    And  The user sees the titlee "kullanım alanı"
    And  user sees description of "Odanızın kullanım alanını belirtiniz"
    And  user clicks "yüzey alanı" button and enters the "120" of the house
    And  The user can increase or decrease the numbers by clicking the bedroom bathroom toilet living room buttonss
    And The user should able to click increment button fifteen times for Kullanilabilecek Alanlar
    And user verifies that the numbers are max 15 15 15 15 on the new home page step three3
    And The user can see the text ucboluon on the top of the pages