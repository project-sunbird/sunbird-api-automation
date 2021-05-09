Feature: validating question apis

  Scenario Outline: checking question creation api working properly
    Given create question payload with "<mimeType>"  "<primaryCategory>"
    When user calls "createQuestionAPI" with "POST" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"

    Examples:
      | mimeType | primaryCategory |
      | application/vnd.sunbird.question | Multiple Choice Question |


  Scenario Outline: checking questionSet api working properly
    Given create questionset payload with "<mimeType>"  "<primaryCategory>"
    When user calls "createQuestionSetAPI" with "POST" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"

    Examples:
      | mimeType | primaryCategory |
      | application/vnd.sunbird.questionset | Practice Question Set |
