Feature: User
  As an a admin
  I want to log in
  So that I can get token

  @TC01-LoginPositiveAdmin
  Scenario: POST - As a admin I can login
    Given admin set the api POST endpoint
    When admin send HTTP POST request
    Then admin receive valid HTTP response code 200
    And admin received the token

