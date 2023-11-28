Feature: OrangeHRM Login
  Scenario:  Logo Presence on OrangeHRM
    Given I launched chrome browser
    When I open OrangeHRM Home Page
    Then I verify that the logo present on page
    And I close browser