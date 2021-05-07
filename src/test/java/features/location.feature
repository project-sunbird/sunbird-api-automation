Feature: validating location apis

  Scenario Outline: checking update Location api working properly
    Given update location details  payload with "<id>" "<name>"
    When user calls "updateLocationAPI" with "PATCH" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"
    Examples:
      | id |name|
      |91d9baae-14f1-477a-955c-f91bd9037f0b|APSTATE1|