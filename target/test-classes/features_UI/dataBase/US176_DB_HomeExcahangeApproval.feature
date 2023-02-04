Feature: Veritabanındaki approval değeri 1 ya da 0 olan ev değişimi ilanları arayüzde görüntülenmemelidir.

  Scenario: US_176_TC01 Home Exchange ads with an approval value of 1 or 0 should not be displayed on the interface.
    Given user connects to the database
    And user gets the Home Exchange ads list with an approval value of one or zero
