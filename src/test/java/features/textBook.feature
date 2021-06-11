Feature: validating textBook apis

  Scenario Outline: checking toc upload working properly
    Given read toc filepath to Upload with "<bookId>" as pathparam
    When user calls "tocUploadAPI" with "POST" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"
    Examples:
      | bookId |
      |do_213298858288390144134|
