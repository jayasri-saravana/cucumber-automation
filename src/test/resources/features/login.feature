Feature: Login to HotelApp

  @regression
  Scenario: Login with valid credentials
    Given user is on the home page
    When user logins to the portal with username "jayasriadactin" and password "password"
    Then hotel search page should be displayed

  @negative-scenario
  Scenario: Login with invalid credentials
    Given user is on the home page
    When user logins to the portal with username "test123" and password "invalidpassword"
    Then invalid user error message should be displayed

