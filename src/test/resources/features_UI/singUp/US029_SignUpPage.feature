#US_029
# Bir kullanıcı olarak "/signup" sayfasına girdiğimde,
# kullanım koşulları ve gizlilik politikası kabul edilebilir olmalıdır.
# http://test.kese.nl/signup
#Checkbox kullanılabilir ve görünür olmalıdır.
#Default olarak checkbox seçili olmamalıdır.

@ui
Feature: US_29 Bir kullanıcı olarak "/signup" sayfasına girdiğimde, kullanım koşulları ve gizlilik politikası kabul edilebilir olmalıdır.

  @smoketest
  Scenario: US_29_TC_001 terms of use and privacy policy check box on signup page must be visible, enable, and not selected as default
    Given user goes to "http://test.kese.nl/signup" page
    And user asserts "check box on signup page" is visible and enabled
    Then user asserts "check box on signup page" is "not selected"
