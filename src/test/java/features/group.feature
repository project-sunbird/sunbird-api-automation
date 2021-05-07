Feature: validating group apis

  Scenario Outline: checking group creation api working properly
    Given create group payload with "<groupName>"  "<description>"
    When user calls "createGroupAPI" with "POST" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"

    Examples:
      | groupName | description |
      | automationTest |this is a testing group |


  Scenario Outline: checking group list by userId
    Given Read groupDetails with "<userId>"
    When user calls "readGroupList" with "GET" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"

    Examples:
    | userId |
    |9bb884fc-8a56-4727-9522-25a7d5b8ea06|