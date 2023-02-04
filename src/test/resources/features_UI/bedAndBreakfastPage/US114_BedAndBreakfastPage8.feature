Feature: Bir kullanıcı olarak "Bed & Breakfast" ilan oluşturma sayfasında, 8. stepte "Özel Şartlar" bilgisini girebilmeliyim.

  Background: Successful connection to site and coming to step 10 in "Bed & Breakfast"
    Given user is on login page "http://test.kese.nl/new_bed_breakfast"
    When user signed in on sign in page
      | coder52@nonmail.com | 1234 |
    And user navigates to page 8 in Bed And Breakfast Page

  Scenario: TC_001_US_114 "Özel Şartlar" title should be visible
    Then user able to see ozel Sartlar title is visible

  Scenario: TC_002_US_114 "Evinize ait özel şartları belirtiniz." should be visible.
    Then user see Evinize ait ozel sartlari belirtiniz title is visible

  Scenario: TC_003_US_114 "Çocuklarınızı getirebilirsiniz, Evcil hayvan getirebilirsiniz,
  Evde sigara içmeye izin verilir,Araba değişimi olabilir, Bakılması gereken evcil hayvan var,
  Bakılması gereken bitki var" options should be visible.
    Then user see all option titles are visible in page eight

  Scenario: TC_004_US_114 "Çocuklarınızı getirebilirsiniz, Evcil hayvan getirebilirsiniz,
  Evde sigara içmeye izin verilir,Araba değişimi olabilir, Bakılması gereken evcil hayvan var,
  Bakılması gereken bitki var" choises should be visible and clickable.
    Then user see all choises are visible and clickable in page eight

  Scenario: TC_005_US_114 At the stept 8, at the top of page "8 / 10" should be visible.
    Then user see current page eight is visible