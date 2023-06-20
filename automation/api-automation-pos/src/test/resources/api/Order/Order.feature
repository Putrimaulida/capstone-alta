Feature: Order
  As an a admin
  I want to get order information
  So that I can see all order list

  @GetAllCashier
  Scenario: GET ALL - As admin I can get all data details order
    Given admin has api endpoint get all order
    When admin send HTTP request get all order
    Then admin receive response code 200
    And admin validate response body get order information