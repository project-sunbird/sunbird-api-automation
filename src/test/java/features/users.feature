Feature: User APIs

@User
Scenario: User getting created successfully
Given Request userCreateAPI with email in payload
When Request with email POST calls
Then "UserId" got created in response body
And SUCCESS is present in response result
And Response header contains 200 as status
And responseCode contains OK

@User
Scenario Outline: Getting proper error message user Create api requested with incorrect inputdata
Given Request API with existing user user's "<email>"
When Request with post calls
Then Status shows as Failed
And Return 400 as StatusCode
And err shows as EMAIL_IN_USE 
Examples:
|email|
|test+1615363082542@yopmail.com|

@User
Scenario Outline: Getting proper error message when user Create api requested with invalid email
Given Request API with invalid "<email>"
When Request with post calls with invalid email id
Then Return 400 as StatusCode with invalid email id
And err message shows as EMAIL_FORMAT_ERROR
Examples:
|email|
|testaccount5|

@User
Scenario Outline: Getting proper error message when user Create api requested with invalid password
Given Request API with invalid password "<password>"
When Request with post calls  with invalid password 
Then Return 400 as StatusCode  with invalid password 
And err message shows as INVALID_PASSWORD
Examples:
|password|
|Password|

@User
Scenario Outline: Update Users name
Given Update user's "<name>" for "<userId>" with payload with valid user "token"
When Request udate user with PATCH request call
Then User's Name updated successfull and retruns 200 
And Update user's API Response shows as SUCCESS
Examples:
|name|userId|
|Medha Paul|a1e64b41-16cd-47f7-989d-a605e740d040|


@User
Scenario Outline: Getting proper error message when request body contains empty userId field
Given Update User's "<name>" for blank "<userId>" with valid "token"
When Request update user api with PATCH request when userId is blank
Then Validate that the resonse return 400 status code
And Validate response body returns correct error message for blank userId
Examples:
|name|userId|
|Megha||

@User
Scenario Outline: Getting proper error message when request body doesn't contain userId
Given Update User's "<name>" without userid in request body with valid "token"
When Request with PATCH request without userId
Then Return 400 statuscode when requested withour userId
And Correct error message retruns when requested without userId
Examples:
|name|
|Megha|

@User
Scenario Outline: User Read API working fine
Given Request userReadAPI with payload with valid "token"
When Request with "<userId>" in GET call
Then userid available in response
And ResponseCode returns 200 code
And OrgId is present in responseBody
And user Role field is present in responseBody
And userName is present in responseBody 
Examples:
|userId|
|a1e64b41-16cd-47f7-989d-a605e740d040|

@User
Scenario Outline: User Read API returing proper message when requested withinvalid userId
Given RequestBody with valid user "token"
When Request with invalid "<userId>"
Then Returns 400 code when requested with invalid userid
And userNotFound error message displayed
Examples:
|userId|
|5c89aaec-d78f-4a13-abfd-39d76fdd9f6c|

@User
Scenario Outline: Search users with userName
Given Search user with "<userName>" and valid "token"
When Request with POST request call
Then Search result returns 200 statuscode
And identifier is present in when requested with userName
Examples:
|userName|
|creatortest_475l|

@User
Scenario Outline: Search users with userId
Given Search user with "<userId>" userId and valid "token"
When Request with POST call with userId
Then Search result returns 200 statuscode when requested with userId
And identifier is present in responseBody
Examples:
|userId|
|5c89aaec-d78f-4a13-abfd-39d76fdd9f6c|

@User
Scenario Outline: Search users with emailId
Given Search user with "<emailId>" emailId and valid "token"
When Request with POST request call with emailId
Then Returns 200 statuscode when requested with emailId
Examples:
|emailId|
|test+1615363082542@yopmail.com|

@User
Scenario Outline: Search users with firstName
Given Search user with "<firstName>" firstName and valid "token"
When Request with POST request call with firstName
Then Returns 200 statuscode when requested with firstName
And Showing total no of users count with the given firstName
Examples:
|firstName|
|Creator|

@User
Scenario Outline: Search users with createdBy
Given Search user with "<createdBy>" createdBy and valid "token"
When Request with POST request call with createdBy
Then Search result returns 200 statuscode when searched with with createdBy
And Returns the no of users created by the user
Examples:
|createdBy|
|6dfb3d72-274f-45c0-b6fd-0807bded7041|

@User
Scenario Outline: Verify the user exists api with valid emailId
Given Request user exists api with valid emailId
When Request with GET api call with valid "<emailId>"  emailId
Then User Exists apis returns 200 statuscode
And Returns exists value as true
Examples:
|emailId|
|test+1615363082542@yopmail.com|

@User
Scenario Outline: Verify the user exists api with invalid emailId
Given Request user exists api with invalid emailId
When Request with GET api call with invalid "<emailId>"  emailId
Then User Exists apis returns 200 statuscode when requested with invalid emailId
And Returns exists value as false
Examples:
|emailId|
|testaccount30999999@yopmail.com|

@User
Scenario Outline: Verify the conscent read api with valid userId 
Given Requestbody with valid userId with "token" and with valid "<userId>" , "<consumerId>" , "<objectId>"
When Request with POST call valid userid, consumerId and objectId
Then Should return status code as 200 with valid userId
And consumerId is present when requested with valid userId
And consumerType is present when requested with valid userId
And conscentId is present when requested with valid userId
Examples:
|userId|consumerId|objectId|
|a1e64b41-16cd-47f7-989d-a605e740d040|01269878797503692810|do_31240717640512307211963|

@User
Scenario Outline: Verify the conscent read api with invalid userId 
Given Requestbody with invalid userId with "token" and with valid "<userId>" , "<consumerId>" , "<objectId>"
When Request with POST call invalid userId
Then Should return status code as 404 with invalid userId
And Returning correct errormessage when requested with invalid userId
Examples:
|userId|consumerId|objectId|
|75c89aaec-d78f-4a13-abfd-39d76fdd9f6|01269878797503692810|do_31240717640512307211963|

@User
Scenario Outline: Verify the conscent read api with invalid consumerId 
Given Requestbody with invalid consumerId with "token" and with valid "<userId>" , "<consumerId>" , "<objectId>"
When Request with POST call invalid consumerId 
Then Should return status code as 404 with invalid consumerId
And Returning correct errormessage when requested with invalid consumerId
Examples:
|userId|consumerId|objectId|
|5c89aaec-d78f-4a13-abfd-39d76fdd9f6c|012698787975036928102|do_31240717640512307211963|

@User
Scenario Outline: Verify the conscent read api with invalid objectId 
Given Requestbody with invalid objectId with "token" and with valid "<userId>" , "<consumerId>" , "<objectId>"
When Request with POST call with invalid objectId
Then Should return status code as 404 with invalid objectId
And Returning correct errormessage when requested with invalid objectId
Examples:
|userId|consumerId|objectId|
|5c89aaec-d78f-4a13-abfd-39d76fdd9f6c|01269878797503692810|do_31240717640512307211963000|

Scenario Outline: Verify theat user feedRead api returning 200
Given Request user feedRead api
When Request feedRead api with "<userId>" in pathparam
Then User feedRead apis returns 200 statuscode
Examples:
|userId|
|5c89aaec-d78f-4a13-abfd-39d76fdd9f6c|
