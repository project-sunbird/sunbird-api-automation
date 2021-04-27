Feature: Content APIs

@Content
Scenario Outline: Verify if contents are getting created with contentCreateAPI
Given Content Create Payload "<name>" "<description>" "<createdBy>"
When User Calls "ContentCreateAPI" with POST Request
Then Content ID Getting Created
And "StatusCode" is 200
And Indentifier is present in the responseBody

Examples:
	|name|description|createdBy|
	|English Story Book| It's created for Assam Board| 716b4696-0d12-470d-96d8-17f040d1356f|
	
@Content123
Scenario: Verify Content Update API functionality
Given Resuest contentUpdateAPi with "versionkey" in payload
When contentUpdateAPi with POST call with "contentId" in requestPath
Then Validate contentUpdateAPi response
And versionKey is present in the responseBody
And publish the content "<contentId>"


@Content
Scenario Outline: Publish ContentAPI working fine
Given Request content publish api with payload
When Request with "<contentId>" in POST request
Then Validate response returns 200 status code
Examples:
|contentId|
|do_31321401593029427218|

@Content
Scenario Outline: Content Search api functionality
Given Request contentSearchApi with "<contentId>"
When Request with with GET request
Then Validate contentSearchApi response 
Examples:
|contentId|
|do_3130001168567992321105|

@Content
Scenario Outline: Content Read API functionality
Given Content API payload
When Request with GET call with "<contentID>"
Then Validate conntentReadApi response
Examples:
|contentID|
|do_3130001172720762881189|

@Content
Scenario Outline: Content Hierarchy API functionality
Given Request Content Hierarchy API
When GET call with "<contentID>"
Then Validate conntentHierarchyApi response
Examples:
|contentID|
|do_31320335404877414413|

@Content
Scenario: Composite Search API functionality
Given Composite Search with payload 
When Request with POST call
Then Validate Composite Search api response


