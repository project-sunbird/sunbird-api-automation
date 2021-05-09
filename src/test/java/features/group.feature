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
    When user calls "readGroupList" with "POST" http request
    Then the API call got success with status code 200
    And responseCode in response body is 200

    Examples:
    | userId |
    |0ced9624-e65b-4fd0-a0d3-2f6e86dd3ef7|