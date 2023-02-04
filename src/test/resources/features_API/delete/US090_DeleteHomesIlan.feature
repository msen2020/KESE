@MH-181
Feature:US090 Bir kullanici olarak "/api/homes/{id}" sayfasina "delete" tipinde baglandigimda ilani sistemden kaldirabilmeliyim

  @TEST_MH-48 @TESTSET_MH-53
  Scenario Outline:US_090_TC_01 Delete ilan positive scenario
    Given user creates new user
    Then user verifies that status code is 201 for create user
    And user logs in "/user/account/login" with new user info via post request
    Then user verifies that status code is 200 for login
    Then user connects to "/homes" to create new home with new user info via post request
    Then user verifies that status code is 202 for create new home
    When user connects to "/homes/search/ilanlistesi/{bulundugu_sayfa}" for search homes with "<bulundugu_sayfaReq>" "<address>" "<address_listReq>" "<order>"
    Then user verifies that status code 200 for delete home
    Then user verifies that delete home with request "/homes/{id}"
    Then user verifies that status code 200 for delete home
    Then user verifies that deletedCount 1
    Examples:
      | bulundugu_sayfaReq | address                                   | address_listReq                           | order |
      | 1                  | Rue de l'Arnon, Sainte-Croix, Switzerland | Rue de l'Arnon, Sainte-Croix, Switzerland | date  |

  @TEST_MH-182 @TESTSET_MH-53
  Scenario Outline:US_090_TC_02 Delete ilan negative scenario
    Given user creates new user
    Then user verifies that status code is 201 for create user
    And user logs in "/user/account/login" with new user info via post request
    Then user verifies that status code is 200 for login
    Then user connects to "/homes" to create new home with new user info via post request
    Then user verifies that status code is 202 for create new home
    When user connects to "/homes/search/ilanlistesi/{bulundugu_sayfa}" for search homes with "<bulundugu_sayfaReq>" "<address>" "<address_listReq>" "<order>"
    Then user verifies 401 status code with invalid "<ilanId>" "<token>" to request "/homes/{id}"

    Examples:
      | bulundugu_sayfaReq | address                                   | address_listReq                           | order | ilanId                   | token |
      | 1                  | Rue de l'Arnon, Sainte-Croix, Switzerland | Rue de l'Arnon, Sainte-Croix, Switzerland | date  | 61fb04b86606cd38918acf84 | var   |



