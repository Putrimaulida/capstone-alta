Feature: User
  As an a cashier
  I want to get cashier information
  So that I can manage cashier accounts to order

  @GetCategoryItem
  Scenario: GET - Cashier get categories & items with valid endpoint input
    Given cashier has api endpoint get categories & items
    When cashier send HTTP request get categories & items
    Then cashier receive response code 200
    And cashier validate response body get categories & items

  @GetSearchItemByName
  Scenario: GET - Cashier get search item by name with valid endpoint input
    Given cashier has api endpoint get search item by name
    When cashier send HTTP request get search item by name
    Then cashier receive response code 200
    And cashier validate response body get search item by name

  @GetSearchItemById
  Scenario: GET - Cashier get search item by id with valid endpoint input
    Given cashier has api endpoint get search item by id
    When cashier send HTTP request get search item by id
    Then cashier receive response code 200
    And cashier validate response body get search item by id

  @GetCategory
  Scenario: GET - Cashier get category with valid endpoint input
    Given cashier has api endpoint get category
    When cashier send HTTP request get category
    Then cashier receive response code 200
    And cashier validate response body category

  @PostCreateMemberships
  Scenario: POST - Cashier can add new memberships data
    Given cashier has api endpoint add new memberships
    When cashier send HTTP request add new memberships
    Then cashier receive response code 200
    And cashier validate response body post add new memberships

  @PostCreateTransaction
  Scenario: POST - Cashier can add new transaction
    Given cashier has api endpoint add new transaction
    When cashier send HTTP request add new transaction
    Then cashier receive response code 200
    And cashier validate response body post add new transaction