Feature: User
  As an a admin
  I want to get cashier information
  So that I can see all cashier list

  @GetAllCashier
  Scenario: GET ALL - As admin I can get all data details cashier
    Given admin has api endpoint get all cashier
    When admin send HTTP request get all cashier
    Then admin receive response code 200
    And admin validate response body get cashier information

  @GetSearchCashier
  Scenario: GET - As admin I can get search data details cashier
    Given admin has api endpoint get cashier
    When admin send HTTP request get cashier
    Then admin receive response code 200
    And admin validate response body get search cashier information

  @PostCreateCashier
  Scenario: POST - As admin I can add new cashier data
    Given admin has api endpoint create new cashier
    When admin send HTTP request create new cashier
    Then admin receive response code 200
    And admin validate response body post create new cashier

  @UpdateCashierByID
  Scenario: PUT - As admin I can update cashier data by id
    Given admin has api endpoint update cashier
    When admin send HTTP request update cashier
    Then admin receive response code 200
    And admin validate response body update cashier

  @DelCashierByID
  Scenario: DELETE - As admin I can delete cashier data by id
    Given admin has api endpoint delete cashier
    When admin send HTTP request delete cashier
    Then admin receive response code 200
    And admin validate response body delete cashier

  @InvalidGetAllCashier
  Scenario: GET ALL - As admin I can get all data details cashier
    Given admin has api endpoint get all cashier
    When admin send HTTP request get all cashier
    Then admin receive response code 200
    And admin validate response body get cashier information