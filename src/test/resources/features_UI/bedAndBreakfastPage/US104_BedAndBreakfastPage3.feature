Feature:Bir kullanıcı olarak "BadAndBreakfast" ilan oluşturma sayfasında, 3. stepte "Kullanım Alanı" bilgilerini girebilmeliyim.

  Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
    Given user is on login page "http://test.kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 3 in Bed & Breakfast


  Scenario:The "Kullanim Alani" input must be available.

    And  users sees the title "kullanım alanı"
    And  users sees description of "Odanızın kullanım alanını belirtiniz"
    And  users clicks "yüzey alanı" button and enters the "120" of the housee
    And  users can increase or decrease the numbers by clicking the bedroom bathroom toilet living room button
    And users should able to click increment button fifteen times for Kullanilabilecek Alanlara
    And users verifies that the numbers are max 15 15 15 15 on the new home pages step three
    And users can see the text ucboluon on the top of the pages