Feature: User
  As an a admin
  I want to log in
  So that I can get token

  @TC01-LoginPositive
  Scenario: POST - As admin I can login
    Given I set the api POST endpoint
    When I send HTTP POST request
    Then I receive valid HTTP response code 200
    And I received the token

