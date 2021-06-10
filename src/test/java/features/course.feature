Feature: validating course apis

 Scenario Outline: checking course enroll api working properly
    Given create courseEnroll payload with "<courseId>"  "<batchId>" "<userId>"
    When user calls "courseEnrollAPI" with "POST" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"

   Examples:
     | courseId | batchId | userId |
     | do_21329831820991692811252 |01329832358048563257|9bb884fc-8a56-4727-9522-25a7d5b8ea06|


  Scenario Outline: checking course umenroll api working properly
    Given create courseUnEnroll payload with "<courseId>"  "<batchId>" "<userId>"
    When user calls "courseUnEnrollAPI" with "POST" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"

    Examples:
      | courseId | batchId | userId |
      | do_21329831820991692811252 |01329832358048563257|9bb884fc-8a56-4727-9522-25a7d5b8ea06|
