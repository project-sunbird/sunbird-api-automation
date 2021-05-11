Feature: validating user apis are working
  Scenario: checking user creation api creating user with unique phonenumber
    Given create user with valid phoneNumber
    When user calls "createUserAPI" with "POST" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"
    And validate userId is not null

  Scenario: Getting user details with getUser api
    Given Read user with valid userId
    When user calls "readUserAPI" with "GET" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"

  Scenario: Upadte user details with update user api
    Given update user details with payload
    When user calls "updateUserAPI" with "PATCH" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"

  Scenario Outline: Search user api verification
     Given search user with "<emailId>"
     When  user calls "searchUserAPI" with "POST" http request
     Then the API call got success with status code 200
     And "responseCode" in response body is "OK"
    Examples:
      | emailId |
      |test+1615363082542@yopmail.com|

  Scenario Outline: user exist api validation
      Given user exxist api validation with "<idType>" and "<idValue>"
      When  user calls "userExistAPI" with "GET" http request
      Then the API call got success with status code 200
      And "responseCode" in response body is "OK"
    Examples:
      | idType | idValue |
      |email   |test+1615363082542@yopmail.com|
