Feature: validating org apis

  Scenario Outline: checking readOrg api working properly
    Given read org details  payload with "<orgId>"
    When user calls "readOrgAPI" with "POST" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"
    Examples:
      | orgId |
      |0131630445447741440|