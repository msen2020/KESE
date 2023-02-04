#US_025	Bir kullanıcı olarak anasayfada, giriş yaptıktan sonra sağ üstte "Profilim" butonu yardımıyla ilgili sayfalara gidebilmeliyim.
# http://test.kese.nl/
#Mesajlar linki görünür olmalıdır, tıklandığında "/profile/message" sayfasına gidilmelidir.
#İlanlarım linki görünür olmalıdır, tıklandığında "/profile/listofilans" sayfasına gidilmelidir.
#Referans Ol linki görünür olmalıdır, tıklandığında "/profile/reference" sayfasına gidilmelidir.

@US_025
Feature:Bir kullanıcı olarak anasayfada, giriş yaptıktan sonra sağ üstte "Profilim" butonu yardımıyla ilgili sayfalara gidebilmeliyim.


  Background:"Profilim"

    When go to "http://test.kese.nl/" page
    And Click GirişYap Button
    And Enter email and password
    When Click Giriş Yap Button
    And  Click Profilim Button
    Then Dropdown menu show

  @META3-173
  Scenario:
    And Click "mesajlar" button
    Then user should go to "/profile/message" page

  @META3-176
  Scenario:
    And Click "ilanlarım" button
    Then user should go to "/profile/listofilans" page

  @META3-177
  Scenario:
    And Click "Referans Ol" button
    Then user should go to "/profile/reference" page
