Feature: Validating content API's
@createContent @Regression
Scenario Outline: Verify if content is successfully created using createApi
	Given create content Payload with "<name>"  "<contentType>" "<mimeType>"
	When user calls "createContentAPI" with "POST" http request
	Then the API call got success with status code 200
	And "responseCode" in response body is "OK"
	And verify do_id created maps to "<name>" using "getContentAPI"
	
Examples:
	|name 	 | contentType |mimeType		   |
	|test1 |  Resource |application/vnd.ekstep.html-archive|
	|test2 | Collection  |application/vnd.ekstep.html-archive  |
	|test3 | TextBook  |application/vnd.ekstep.content-collection  |

@updateContent @Regression
Scenario: Verify if update Content functionality is working

	Given update content Payload
	When user calls "updateContentAPI" with "PATCH" http request
	Then the API call got success with status code 200
	And "responseCode" in response body is "OK"
	And verify do_id updated maps to "Yes" using "getContentAPI"

Scenario: verify search api functionality is working
	Given search content payload
	When user calls "searchContentAPI" with "POST" http request
	Then the API call got success with status code 200
	And "responseCode" in response body is "OK"


	 


	

	
	
	
	
	
	

	
	
	