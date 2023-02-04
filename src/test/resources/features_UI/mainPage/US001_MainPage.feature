# US_001
# Bir kullanıcı olarak ana sayfaya girdiğimde, "Seyehatin Tadını Çıkartın!" yazısını görebilmeliyim.
# http://kese.nl
#"Seyehatin Tadını Çıkartın!" yazısı görünür olmalıdır.

@homepageSlogan
Feature: Kese HomePage Slogan verification

  Scenario: User should see the slogan of the application on the Home Page
    Given the user should be on the homepage
    Then the user verifies that the message "Seyahatin Tadını Çıkartın!" is visible