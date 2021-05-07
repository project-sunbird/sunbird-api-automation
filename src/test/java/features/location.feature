Feature: validating location apis

  Scenario Outline: checking update Location api working properly
    Given update location details  payload with "<id>" "<name>"
    When user calls "updateLocationAPI" with "PATCH" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"
    Examples:
      | id |name|
      |e4e60956-277c-439e-bbf7-5c99730341f3|APSTATE1|