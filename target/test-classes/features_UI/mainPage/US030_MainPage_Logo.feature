#US_030	Bir kullanıcı olarak ana sayfaya girdiğimde, sol üst tarafta KESE logosunu görebilmeliyim.
# https://kese.nl/
#Sol üst tarafta logo görünür olmalıdır.
#Kullanıcı logoya tıklandığında anasayfaya yönlendirilmelidir.

@META3-76
Feature: US30_TestExecution

	Background:
		Given the user should be on the homepage

	@TEST_META3-74
	Scenario: US30_TC02_The system should navigate homepage after clicking KESE logo on advert page
		When user hits "London" on the homepage
		And  user hits the KESE logo on the advert page
		Then system should display homepage


	@TEST_META3-75
	Scenario: US30_TC03_The system should NOT navigate different page when clicking KESE logo on homepage
		When user hits the KESE logo on the homepage
		Then the system should NOT navigate another page


	@TEST_META3-72
	Scenario Outline: US30_TC01_System should display the advert page
		When user hits "<CardTitle>" on the homepage
		    Then verify the title is changed
		    Examples:
		      | CardTitle         |
		      | Terborg, Hollanda |
		      | London            |

#		by nur
