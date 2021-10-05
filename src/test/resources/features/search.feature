Feature: Search a hotel

  @regression
  Scenario Outline: Search hotel with valid search
    Given user is on the home page
    When user logins to the portal with username "jayasriadactin" and password "password"
    Then hotel search page should be displayed
    When user selects "<Location>" from location
    When user selects "<Hotel Name>" from Hotel
    When user selects "<roomType>" from roomType
    When user selects "<noOfRoom>" from noOfRoom
    When user selects "<checkInDate>" from checkInDate
    When user selects "<checkOutDate>" from checkOutDate
    When user selects "<adultsPerRoom>" from adultsPerRoom
    When user selects "<childrenPerRoom>" from childrenPerRoom
    When user clicks on Search button
    Then select hotel page should be displayed
    Examples:
      | Location  | Hotel Name  | roomType     | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Sydney    | Hotel Creek | Super Deluxe | 2        | 11/12/2021  | 12/12/2021   | 2             | 2               |
      | Melbourne |             | Super Deluxe | 2        | 10/12/2021  | 12/12/2021   | 2             | 2               |


  @regression
  Scenario: Search hotel only with Location
    Given user is on the home page
    When user logins to the portal with username "jayasriadactin" and password "password"
    Then hotel search page should be displayed
    When user selects "Sydney" from location
    When user clicks on Search button
    Then select hotel page should be displayed

  @negative-scenario
  Scenario Outline: Search hotel without selecting Location
    Given user is on the home page
    When user logins to the portal with username "jayasriadactin" and password "password"
    Then hotel search page should be displayed
    When user selects "<Hotel Name>" from Hotel
    When user selects "<roomType>" from roomType
    When user selects "<noOfRoom>" from noOfRoom
    When user selects "<checkInDate>" from checkInDate
    When user selects "<checkOutDate>" from checkOutDate
    When user selects "<adultsPerRoom>" from adultsPerRoom
    When user selects "<childrenPerRoom>" from childrenPerRoom
    When user clicks on Search button
    Then Error Message - Please Select Location should be displayed
    Examples:
      | Hotel Name  | roomType     | noOfRoom | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Hotel Creek | Super Deluxe | 2        | 11/12/2021  | 12/12/2021   | 2             | 2               |

  @negative-scenario
  Scenario: Search hotel without selecting any field
    Given user is on the home page
    When user logins to the portal with username "jayasriadactin" and password "password"
    Then hotel search page should be displayed
    When user clicks on Search button
    Then Error Message - Please Select Location should be displayed
    Then Error Message - Please Select Total Number of Rooms should be displayed
    Then Error Message - Please Select Check-In-date should be displayed
    Then Error Message - Please Select Check-Out-date should be displayed
    Then Error Message - Please Select Adults Per Room should be displayed
