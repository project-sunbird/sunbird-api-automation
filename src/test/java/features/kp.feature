Feature: Knowledge platform APIs functional test cases 

@KP
Scenario Outline: GET channel API functional tests
Given Request get channel api 
When Valid  "<channel>" channelId with GET calls
Then Validate the get channel api response 

Examples:
|channel|
|in.ekstep|

@KP
Scenario Outline: GET framework API functional tests
Given Request get framework api 
When Request with "<framework>" valid frameworkId
Then Validate the get framework api response 

Examples:
|framework|
|NCF|

@KP
Scenario: Generate DialCode API Functional Tests
Given Request generate dialcode API with payload
When Request generate API with GET request path
Then Validate the generateDialCode API response

@KP
Scenario: Add registry record API Functional Tests
Given Request registry record API with payload
When Request registry API with POST request path
Then Validate the registry API response

@KP
Scenario: Create License API functional tests
Given Request create license api with requestBody
When Request create license api with POST call
Then Validate the create license api api response
