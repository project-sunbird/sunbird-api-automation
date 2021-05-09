Feature: Validating user API's


  Scenario : Verify if user is successfully created using createApi
    Given create user Payload with phoneNumber
    When user calls "createUserAPI" with "POST" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"
    And verify userId created maps to using "getUserAPI"



  Scenario : Verify if update user functionality is working
    Given update user Payload with phoneNumber
    When user calls "updateUserAPI" with "PATCH" http request
    Then the API call got success with status code 200
    And "responseCode" in response body is "OK"


