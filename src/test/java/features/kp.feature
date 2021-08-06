Feature: Validating KP apis
  Scenario Outline: GET channel API functional tests
    Given Read channel api with path param "<channelId>"
    When user calls "getChannelAPI" with "GET" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"
    Examples:
      | channelId |
      |in.ekstep  |

    Scenario Outline: GET framework API functional tests
      Given Read framework api with path param "<frameworkId>"
      When user calls "getFrameworkAPI" with "GET" http request
      Then the API call got success with status code 200
      And "responseCode" in response body is "OK"
      Examples:
        | frameworkId |
        | NCF     |

    Scenario: Generate DialCode API Functional Tests
      Given Generate dialcode using payload
      When user calls "generateDialCodeAPI" with "POST" http request
      Then the API call got success with status code 200
      And "responseCode" in response body is "OK"

   
    Scenario: Add registry record API Functional Tests
      Given Request registry record API with payload
      When user calls "addRegistryRecordAPI" with "POST" http request
      Then the API call got success with status code 200
      And "responseCode" in response body is "OK"

    Scenario: Create License API functional tests
      Given Request create license api with payload
      When user calls "createLicenseAPI" with "POST" http request
      Then the API call got success with status code 200
      And "responseCode" in response body is "OK"
