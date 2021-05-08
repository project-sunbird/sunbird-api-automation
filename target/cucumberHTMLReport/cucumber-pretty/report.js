$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/contentCreationUpdation.feature");
formatter.feature({
  "name": "Validating content API\u0027s",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify if content is successfully created using createApi",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@createContent"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "create content Payload with \"\u003cname\u003e\"  \"\u003ccontentType\u003e\" \"\u003cmimeType\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"createContentAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify do_id created maps to \"\u003cname\u003e\" using \"getContentAPI\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "contentType",
        "mimeType"
      ]
    },
    {
      "cells": [
        "test1",
        "Resource",
        "application/vnd.ekstep.html-archive"
      ]
    },
    {
      "cells": [
        "test2",
        "Collection",
        "application/vnd.ekstep.html-archive"
      ]
    },
    {
      "cells": [
        "test3",
        "TextBook",
        "application/vnd.ekstep.content-collection"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify if content is successfully created using createApi",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@createContent"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "create content Payload with \"test1\"  \"Resource\" \"application/vnd.ekstep.html-archive\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.createContentPayloadWith(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"createContentAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify do_id created maps to \"test1\" using \"getContentAPI\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.verifyDo_idCreatedMapsToUsing(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if content is successfully created using createApi",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@createContent"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "create content Payload with \"test2\"  \"Collection\" \"application/vnd.ekstep.html-archive\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.createContentPayloadWith(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"createContentAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify do_id created maps to \"test2\" using \"getContentAPI\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.verifyDo_idCreatedMapsToUsing(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if content is successfully created using createApi",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@createContent"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "create content Payload with \"test3\"  \"TextBook\" \"application/vnd.ekstep.content-collection\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.createContentPayloadWith(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"createContentAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify do_id created maps to \"test3\" using \"getContentAPI\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.verifyDo_idCreatedMapsToUsing(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if update Content functionality is working",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@updateContent"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "update content Payload",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.updateContentPayload()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"updateContentAPI\" with \"PATCH\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify do_id updated maps to \"Yes\" using \"getContentAPI\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.verifyDo_idUpdatedMapsToUsing(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify search api functionality is working",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "search content payload",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.searchContentPayload()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"searchContentAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/course.feature");
formatter.feature({
  "name": "validating course apis",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "checking course enroll api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "create courseEnroll payload with \"\u003ccourseId\u003e\"  \"\u003cbatchId\u003e\" \"\u003cuserId\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"courseEnrollAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "courseId",
        "batchId",
        "userId"
      ]
    },
    {
      "cells": [
        "do_2130680468299530241752",
        "01327385116807168016",
        "9bb884fc-8a56-4727-9522-25a7d5b8ea06"
      ]
    }
  ]
});
formatter.scenario({
  "name": "checking course enroll api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "create courseEnroll payload with \"do_2130680468299530241752\"  \"01327385116807168016\" \"9bb884fc-8a56-4727-9522-25a7d5b8ea06\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.createcourseEnrollWith(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"courseEnrollAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "checking course umenroll api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "create courseUnEnroll payload with \"\u003ccourseId\u003e\"  \"\u003cbatchId\u003e\" \"\u003cuserId\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"courseUnEnrollAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "courseId",
        "batchId",
        "userId"
      ]
    },
    {
      "cells": [
        "do_2130680468299530241752",
        "01327385116807168016",
        "9bb884fc-8a56-4727-9522-25a7d5b8ea06"
      ]
    }
  ]
});
formatter.scenario({
  "name": "checking course umenroll api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "create courseUnEnroll payload with \"do_2130680468299530241752\"  \"01327385116807168016\" \"9bb884fc-8a56-4727-9522-25a7d5b8ea06\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.createcourseUnEnrollWith(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"courseUnEnrollAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/group.feature");
formatter.feature({
  "name": "validating group apis",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "checking group creation api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "create group payload with \"\u003cgroupName\u003e\"  \"\u003cdescription\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"createGroupAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "groupName",
        "description"
      ]
    },
    {
      "cells": [
        "automationTest",
        "this is a testing group"
      ]
    }
  ]
});
formatter.scenario({
  "name": "checking group creation api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "create group payload with \"automationTest\"  \"this is a testing group\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.createGroupPayloadWith(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"createGroupAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[200]\u003e but was:\u003c[OK]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinations.StepDefination.in_response_body_is(StepDefination.java:96)\r\n\tat ✽.\"responseCode\" in response body is \"OK\"(file:src/test/java/features/group.feature:7)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "name": "checking group list by userId",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Read groupDetails with \"\u003cuserId\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"readGroupList\" with \"GET\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId"
      ]
    },
    {
      "cells": [
        "9bb884fc-8a56-4727-9522-25a7d5b8ea06"
      ]
    }
  ]
});
formatter.scenario({
  "name": "checking group list by userId",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Read groupDetails with \"9bb884fc-8a56-4727-9522-25a7d5b8ea06\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.readGroupDetailsWith(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"readGroupList\" with \"GET\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c404\u003e but was:\u003c200\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:645)\r\n\tat org.junit.Assert.assertEquals(Assert.java:631)\r\n\tat stepDefinations.StepDefination.the_API_call_got_success_with_status_code(StepDefination.java:87)\r\n\tat ✽.the API call got success with status code 200(file:src/test/java/features/group.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/java/features/location.feature");
formatter.feature({
  "name": "validating location apis",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "checking update Location api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "update location details  payload with \"\u003cid\u003e\" \"\u003cname\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"updateLocationAPI\" with \"PATCH\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "id",
        "name"
      ]
    },
    {
      "cells": [
        "91d9baae-14f1-477a-955c-f91bd9037f0b",
        "APSTATE1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "checking update Location api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "update location details  payload with \"91d9baae-14f1-477a-955c-f91bd9037f0b\" \"APSTATE1\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.updateLocationDetailsPayloadWith(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"updateLocationAPI\" with \"PATCH\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c403\u003e but was:\u003c200\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:645)\r\n\tat org.junit.Assert.assertEquals(Assert.java:631)\r\n\tat stepDefinations.StepDefination.the_API_call_got_success_with_status_code(StepDefination.java:87)\r\n\tat ✽.the API call got success with status code 200(file:src/test/java/features/location.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/java/features/org.feature");
formatter.feature({
  "name": "validating org apis",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "checking readOrg api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "read org details  payload with \"\u003corgId\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"readOrgAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "orgId"
      ]
    },
    {
      "cells": [
        "01269878797503692810"
      ]
    }
  ]
});
formatter.scenario({
  "name": "checking readOrg api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "read org details  payload with \"01269878797503692810\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.readOrgDetailsPayloadWith(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"readOrgAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/question.feature");
formatter.feature({
  "name": "validating question apis",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "checking question creation api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "create question payload with \"\u003cmimeType\u003e\"  \"\u003cprimaryCategory\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"createQuestionAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "mimeType",
        "primaryCategory"
      ]
    },
    {
      "cells": [
        "application/vnd.sunbird.question",
        "Multiple Choice Question"
      ]
    }
  ]
});
formatter.scenario({
  "name": "checking question creation api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "create question payload with \"application/vnd.sunbird.question\"  \"Multiple Choice Question\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.createQuestionPayloadWith(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"createQuestionAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "checking questionSet api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "create questionset payload with \"\u003cmimeType\u003e\"  \"\u003cprimaryCategory\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"createQuestionSetAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "mimeType",
        "primaryCategory"
      ]
    },
    {
      "cells": [
        "application/vnd.sunbird.question",
        "Multiple Choice Question"
      ]
    }
  ]
});
formatter.scenario({
  "name": "checking questionSet api working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "create questionset payload with \"application/vnd.sunbird.question\"  \"Multiple Choice Question\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.createQuestionsetPayloadWith(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"createQuestionSetAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c404\u003e but was:\u003c200\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:645)\r\n\tat org.junit.Assert.assertEquals(Assert.java:631)\r\n\tat stepDefinations.StepDefination.the_API_call_got_success_with_status_code(StepDefination.java:87)\r\n\tat ✽.the API call got success with status code 200(file:src/test/java/features/question.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/java/features/textBook.feature");
formatter.feature({
  "name": "validating textBook apis",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "checking toc upload working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "read toc filepath to Upload with \"\u003cbookId\u003e\" as pathparam",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"tocUploadAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "bookId"
      ]
    },
    {
      "cells": [
        "do_21307515106813542413706"
      ]
    }
  ]
});
formatter.scenario({
  "name": "checking toc upload working properly",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "read toc filepath to Upload with \"do_21307515106813542413706\" as pathparam",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.readTocFilepathToUploadWithAsPathparam(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"tocUploadAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c400\u003e but was:\u003c200\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:645)\r\n\tat org.junit.Assert.assertEquals(Assert.java:631)\r\n\tat stepDefinations.StepDefination.the_API_call_got_success_with_status_code(StepDefination.java:87)\r\n\tat ✽.the API call got success with status code 200(file:src/test/java/features/textBook.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "\"responseCode\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/java/features/user.feature");
formatter.feature({
  "name": "User APIs",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User getting created successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Request userCreateAPI with email in payload",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.request_userCreateAPI_with_email_in_payload()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.request_userCreateAPI_with_email_in_payload(userStepDefinition.java:18)\r\n\tat ✽.Request userCreateAPI with email in payload(file:src/test/java/features/user.feature:5)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with email POST calls",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_email_POST_calls()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "\"UserId\" got created in response body",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.got_created_in_response_body(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "SUCCESS is present in response result",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.success_is_present_in_response_result()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Response header contains 200 as status",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.response_header_contains_as_status(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "responseCode contains OK",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.responsecode_contains_OK()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Getting proper error message user Create api requested with incorrect inputdata",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Request API with existing user user\u0027s \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with post calls",
  "keyword": "When "
});
formatter.step({
  "name": "Status shows as Failed",
  "keyword": "Then "
});
formatter.step({
  "name": "Return 400 as StatusCode",
  "keyword": "And "
});
formatter.step({
  "name": "err shows as EMAIL_IN_USE",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "test+1615363082542@yopmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Getting proper error message user Create api requested with incorrect inputdata",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Request API with existing user user\u0027s \"test+1615363082542@yopmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.request_API_with_existing_user_user_s(String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.request_API_with_existing_user_user_s(userStepDefinition.java:54)\r\n\tat ✽.Request API with existing user user\u0027s \"test+1615363082542@yopmail.com\"(file:src/test/java/features/user.feature:14)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with post calls",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_post_calls()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Status shows as Failed",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.status_shows_as_Failed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Return 400 as StatusCode",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.return_as_StatusCode(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "err shows as EMAIL_IN_USE",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.err_shows_as_EMAIL_IN_USE()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Getting proper error message when user Create api requested with invalid email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Request API with invalid \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with post calls with invalid email id",
  "keyword": "When "
});
formatter.step({
  "name": "Return 400 as StatusCode with invalid email id",
  "keyword": "Then "
});
formatter.step({
  "name": "err message shows as EMAIL_FORMAT_ERROR",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "testaccount5"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Getting proper error message when user Create api requested with invalid email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Request API with invalid \"testaccount5\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.request_API_with_invalid(String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.request_API_with_invalid(userStepDefinition.java:84)\r\n\tat ✽.Request API with invalid \"testaccount5\"(file:src/test/java/features/user.feature:25)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with post calls with invalid email id",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_post_calls_with_invalid_email_id()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Return 400 as StatusCode with invalid email id",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.return_as_StatusCode_with_invalid_email_id(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "err message shows as EMAIL_FORMAT_ERROR",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.err_message_shows_as_EMAIL_FORMAT_ERROR()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Getting proper error message when user Create api requested with invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Request API with invalid password \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with post calls  with invalid password",
  "keyword": "When "
});
formatter.step({
  "name": "Return 400 as StatusCode  with invalid password",
  "keyword": "Then "
});
formatter.step({
  "name": "err message shows as INVALID_PASSWORD",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "password"
      ]
    },
    {
      "cells": [
        "Password"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Getting proper error message when user Create api requested with invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Request API with invalid password \"Password\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.request_API_with_invalid_password(String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.request_API_with_invalid_password(userStepDefinition.java:108)\r\n\tat ✽.Request API with invalid password \"Password\"(file:src/test/java/features/user.feature:35)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with post calls  with invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_post_calls_with_invalid_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Return 400 as StatusCode  with invalid password",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.return_as_StatusCode_with_invalid_password(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "err message shows as INVALID_PASSWORD",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.err_message_shows_as_INVALID_PASSWORD()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Update Users name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Update user\u0027s \"\u003cname\u003e\" for \"\u003cuserId\u003e\" with payload with valid user \"token\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request udate user with PATCH request call",
  "keyword": "When "
});
formatter.step({
  "name": "User\u0027s Name updated successfull and retruns 200",
  "keyword": "Then "
});
formatter.step({
  "name": "Update user\u0027s API Response shows as SUCCESS",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "userId"
      ]
    },
    {
      "cells": [
        "Medha Paul",
        "a1e64b41-16cd-47f7-989d-a605e740d040"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Update Users name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Update user\u0027s \"Medha Paul\" for \"a1e64b41-16cd-47f7-989d-a605e740d040\" with payload with valid user \"token\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.update_user_s_for_with_payload_with_valid_user(String,String,String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.update_user_s_for_with_payload_with_valid_user(userStepDefinition.java:132)\r\n\tat ✽.Update user\u0027s \"Medha Paul\" for \"a1e64b41-16cd-47f7-989d-a605e740d040\" with payload with valid user \"token\"(file:src/test/java/features/user.feature:45)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request udate user with PATCH request call",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_udate_user_with_PATCH_request_call()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User\u0027s Name updated successfull and retruns 200",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.user_s_Name_updated_successfull_and_retruns(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Update user\u0027s API Response shows as SUCCESS",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.update_user_s_API_Response_shows_as_SUCCESS()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Getting proper error message when request body contains empty userId field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Update User\u0027s \"\u003cname\u003e\" for blank \"\u003cuserId\u003e\" with valid \"token\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request update user api with PATCH request when userId is blank",
  "keyword": "When "
});
formatter.step({
  "name": "Validate that the resonse return 400 status code",
  "keyword": "Then "
});
formatter.step({
  "name": "Validate response body returns correct error message for blank userId",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "userId"
      ]
    },
    {
      "cells": [
        "Megha",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Getting proper error message when request body contains empty userId field",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Update User\u0027s \"Megha\" for blank \"\" with valid \"token\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.update_User_s_for_blank_with_valid(String,String,String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.update_User_s_for_blank_with_valid(userStepDefinition.java:156)\r\n\tat ✽.Update User\u0027s \"Megha\" for blank \"\" with valid \"token\"(file:src/test/java/features/user.feature:56)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request update user api with PATCH request when userId is blank",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_update_user_api_with_PATCH_request_when_userId_is_blank()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate that the resonse return 400 status code",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.validate_that_the_resonse_return_status_code(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate response body returns correct error message for blank userId",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.validate_response_body_returns_correct_error_message_for_blank_userId()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Getting proper error message when request body doesn\u0027t contain userId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Update User\u0027s \"\u003cname\u003e\" without userid in request body with valid \"token\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with PATCH request without userId",
  "keyword": "When "
});
formatter.step({
  "name": "Return 400 statuscode when requested withour userId",
  "keyword": "Then "
});
formatter.step({
  "name": "Correct error message retruns when requested without userId",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name"
      ]
    },
    {
      "cells": [
        "Megha"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Getting proper error message when request body doesn\u0027t contain userId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Update User\u0027s \"Megha\" without userid in request body with valid \"token\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.update_User_s_without_userid_in_request_body_with_valid(String,String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.update_User_s_without_userid_in_request_body_with_valid(userStepDefinition.java:180)\r\n\tat ✽.Update User\u0027s \"Megha\" without userid in request body with valid \"token\"(file:src/test/java/features/user.feature:66)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with PATCH request without userId",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_PATCH_request_without_userId()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Return 400 statuscode when requested withour userId",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.return_statuscode_when_requested_withour_userId(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Correct error message retruns when requested without userId",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.correct_error_message_retruns_when_requested_without_userId()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "User Read API working fine",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Request userReadAPI with payload with valid \"token\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with \"\u003cuserId\u003e\" in GET call",
  "keyword": "When "
});
formatter.step({
  "name": "userid available in response",
  "keyword": "Then "
});
formatter.step({
  "name": "ResponseCode returns 200 code",
  "keyword": "And "
});
formatter.step({
  "name": "OrgId is present in responseBody",
  "keyword": "And "
});
formatter.step({
  "name": "user Role field is present in responseBody",
  "keyword": "And "
});
formatter.step({
  "name": "userName is present in responseBody",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId"
      ]
    },
    {
      "cells": [
        "a1e64b41-16cd-47f7-989d-a605e740d040"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Read API working fine",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Request userReadAPI with payload with valid \"token\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.request_userReadAPI_with_payload_with_valid(String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.request_userReadAPI_with_payload_with_valid(userStepDefinition.java:204)\r\n\tat ✽.Request userReadAPI with payload with valid \"token\"(file:src/test/java/features/user.feature:76)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with \"a1e64b41-16cd-47f7-989d-a605e740d040\" in GET call",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_in_GET_call(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "userid available in response",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.userid_available_in_response()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "ResponseCode returns 200 code",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.responsecode_returns_code(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "OrgId is present in responseBody",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.orgid_is_present_in_responseBody()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user Role field is present in responseBody",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.user_Role_field_is_present_in_responseBody()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "userName is present in responseBody",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.username_is_present_in_responseBody()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "User Read API returing proper message when requested withinvalid userId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "RequestBody with valid user \"token\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with invalid \"\u003cuserId\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Returns 400 code when requested with invalid userid",
  "keyword": "Then "
});
formatter.step({
  "name": "userNotFound error message displayed",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId"
      ]
    },
    {
      "cells": [
        "5c89aaec-d78f-4a13-abfd-39d76fdd9f6c"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Read API returing proper message when requested withinvalid userId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "RequestBody with valid user \"token\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.requestbody_with_valid_user(String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.requestbody_with_valid_user(userStepDefinition.java:246)\r\n\tat ✽.RequestBody with valid user \"token\"(file:src/test/java/features/user.feature:89)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with invalid \"5c89aaec-d78f-4a13-abfd-39d76fdd9f6c\"",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_invalid(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Returns 400 code when requested with invalid userid",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.returns_code_when_requested_with_invalid_userid(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "userNotFound error message displayed",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.usernotfound_error_message_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Search users with userName",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Search user with \"\u003cuserName\u003e\" and valid \"token\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with POST request call",
  "keyword": "When "
});
formatter.step({
  "name": "Search result returns 200 statuscode",
  "keyword": "Then "
});
formatter.step({
  "name": "identifier is present in when requested with userName",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName"
      ]
    },
    {
      "cells": [
        "creatortest_475l"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search users with userName",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Search user with \"creatortest_475l\" and valid \"token\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.search_user_with_and_valid(String,String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.search_user_with_and_valid(userStepDefinition.java:270)\r\n\tat ✽.Search user with \"creatortest_475l\" and valid \"token\"(file:src/test/java/features/user.feature:99)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with POST request call",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_POST_request_call()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Search result returns 200 statuscode",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.search_result_returns_statuscode(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "identifier is present in when requested with userName",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.identifier_is_present_in_when_requested_with_userName()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Search users with userId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Search user with \"\u003cuserId\u003e\" userId and valid \"token\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with POST call with userId",
  "keyword": "When "
});
formatter.step({
  "name": "Search result returns 200 statuscode when requested with userId",
  "keyword": "Then "
});
formatter.step({
  "name": "identifier is present in responseBody",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId"
      ]
    },
    {
      "cells": [
        "5c89aaec-d78f-4a13-abfd-39d76fdd9f6c"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search users with userId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Search user with \"5c89aaec-d78f-4a13-abfd-39d76fdd9f6c\" userId and valid \"token\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.search_user_with_userId_and_valid(String,String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.search_user_with_userId_and_valid(userStepDefinition.java:294)\r\n\tat ✽.Search user with \"5c89aaec-d78f-4a13-abfd-39d76fdd9f6c\" userId and valid \"token\"(file:src/test/java/features/user.feature:109)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with POST call with userId",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_POST_call_with_userId()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Search result returns 200 statuscode when requested with userId",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.search_result_returns_statuscode_when_requested_with_userId(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "identifier is present in responseBody",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.identifier_is_present_in_responseBody()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Search users with emailId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Search user with \"\u003cemailId\u003e\" emailId and valid \"token\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with POST request call with emailId",
  "keyword": "When "
});
formatter.step({
  "name": "Returns 200 statuscode when requested with emailId",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailId"
      ]
    },
    {
      "cells": [
        "test+1615363082542@yopmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search users with emailId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Search user with \"test+1615363082542@yopmail.com\" emailId and valid \"token\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.search_user_with_emailId_and_valid(String,String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.search_user_with_emailId_and_valid(userStepDefinition.java:318)\r\n\tat ✽.Search user with \"test+1615363082542@yopmail.com\" emailId and valid \"token\"(file:src/test/java/features/user.feature:119)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with POST request call with emailId",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_POST_request_call_with_emailId()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Returns 200 statuscode when requested with emailId",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.returns_statuscode_when_requested_with_emailId(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Search users with firstName",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Search user with \"\u003cfirstName\u003e\" firstName and valid \"token\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with POST request call with firstName",
  "keyword": "When "
});
formatter.step({
  "name": "Returns 200 statuscode when requested with firstName",
  "keyword": "Then "
});
formatter.step({
  "name": "Showing total no of users count with the given firstName",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName"
      ]
    },
    {
      "cells": [
        "Creator"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search users with firstName",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Search user with \"Creator\" firstName and valid \"token\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.search_user_with_firstName_and_valid(String,String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.search_user_with_firstName_and_valid(userStepDefinition.java:336)\r\n\tat ✽.Search user with \"Creator\" firstName and valid \"token\"(file:src/test/java/features/user.feature:128)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with POST request call with firstName",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_POST_request_call_with_firstName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Returns 200 statuscode when requested with firstName",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.returns_statuscode_when_requested_with_firstName(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Showing total no of users count with the given firstName",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.showing_total_no_of_users_count_with_the_given_firstName()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Search users with createdBy",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Search user with \"\u003ccreatedBy\u003e\" createdBy and valid \"token\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with POST request call with createdBy",
  "keyword": "When "
});
formatter.step({
  "name": "Search result returns 200 statuscode when searched with with createdBy",
  "keyword": "Then "
});
formatter.step({
  "name": "Returns the no of users created by the user",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "createdBy"
      ]
    },
    {
      "cells": [
        "6dfb3d72-274f-45c0-b6fd-0807bded7041"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search users with createdBy",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Search user with \"6dfb3d72-274f-45c0-b6fd-0807bded7041\" createdBy and valid \"token\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.search_user_with_createdBy_and_valid(String,String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.search_user_with_createdBy_and_valid(userStepDefinition.java:360)\r\n\tat ✽.Search user with \"6dfb3d72-274f-45c0-b6fd-0807bded7041\" createdBy and valid \"token\"(file:src/test/java/features/user.feature:138)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with POST request call with createdBy",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_POST_request_call_with_createdBy()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Search result returns 200 statuscode when searched with with createdBy",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.search_result_returns_statuscode_when_searched_with_with_createdBy(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Returns the no of users created by the user",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.returns_the_no_of_users_created_by_the_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Verify the user exists api with valid emailId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Request user exists api with valid emailId",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with GET api call with valid \"\u003cemailId\u003e\"  emailId",
  "keyword": "When "
});
formatter.step({
  "name": "User Exists apis returns 200 statuscode",
  "keyword": "Then "
});
formatter.step({
  "name": "Returns exists value as true",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailId"
      ]
    },
    {
      "cells": [
        "test+1615363082542@yopmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the user exists api with valid emailId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Request user exists api with valid emailId",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.request_user_exists_api_with_valid_emailId()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.request_user_exists_api_with_valid_emailId(userStepDefinition.java:384)\r\n\tat ✽.Request user exists api with valid emailId(file:src/test/java/features/user.feature:148)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with GET api call with valid \"test+1615363082542@yopmail.com\"  emailId",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_GET_api_call_with_valid_emailId(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Exists apis returns 200 statuscode",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.user_Exists_apis_returns_statuscode(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Returns exists value as true",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.returns_exists_value_as_true()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Verify the user exists api with invalid emailId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Request user exists api with invalid emailId",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with GET api call with invalid \"\u003cemailId\u003e\"  emailId",
  "keyword": "When "
});
formatter.step({
  "name": "User Exists apis returns 200 statuscode when requested with invalid emailId",
  "keyword": "Then "
});
formatter.step({
  "name": "Returns exists value as false",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailId"
      ]
    },
    {
      "cells": [
        "testaccount30999999@yopmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the user exists api with invalid emailId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Request user exists api with invalid emailId",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.request_user_exists_api_with_invalid_emailId()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.request_user_exists_api_with_invalid_emailId(userStepDefinition.java:408)\r\n\tat ✽.Request user exists api with invalid emailId(file:src/test/java/features/user.feature:158)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with GET api call with invalid \"testaccount30999999@yopmail.com\"  emailId",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_GET_api_call_with_invalid_emailId(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Exists apis returns 200 statuscode when requested with invalid emailId",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.user_Exists_apis_returns_statuscode_when_requested_with_invalid_emailId(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Returns exists value as false",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.returns_exists_value_as_false()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Verify the conscent read api with valid userId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Requestbody with valid userId with \"token\" and with valid \"\u003cuserId\u003e\" , \"\u003cconsumerId\u003e\" , \"\u003cobjectId\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with POST call valid userid, consumerId and objectId",
  "keyword": "When "
});
formatter.step({
  "name": "Should return status code as 200 with valid userId",
  "keyword": "Then "
});
formatter.step({
  "name": "consumerId is present when requested with valid userId",
  "keyword": "And "
});
formatter.step({
  "name": "consumerType is present when requested with valid userId",
  "keyword": "And "
});
formatter.step({
  "name": "conscentId is present when requested with valid userId",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId",
        "consumerId",
        "objectId"
      ]
    },
    {
      "cells": [
        "a1e64b41-16cd-47f7-989d-a605e740d040",
        "01269878797503692810",
        "do_31240717640512307211963"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the conscent read api with valid userId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Requestbody with valid userId with \"token\" and with valid \"a1e64b41-16cd-47f7-989d-a605e740d040\" , \"01269878797503692810\" , \"do_31240717640512307211963\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.requestbody_with_valid_userId_with_and_with_valid(String,String,String,String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.requestbody_with_valid_userId_with_and_with_valid(userStepDefinition.java:432)\r\n\tat ✽.Requestbody with valid userId with \"token\" and with valid \"a1e64b41-16cd-47f7-989d-a605e740d040\" , \"01269878797503692810\" , \"do_31240717640512307211963\"(file:src/test/java/features/user.feature:168)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with POST call valid userid, consumerId and objectId",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_POST_call_valid_userid_consumerId_and_objectId()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Should return status code as 200 with valid userId",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.should_return_status_code_as_with_valid_userId(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "consumerId is present when requested with valid userId",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.consumerid_is_present_when_requested_with_valid_userId()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "consumerType is present when requested with valid userId",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.consumertype_is_present_when_requested_with_valid_userId()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "conscentId is present when requested with valid userId",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.conscentid_is_present_when_requested_with_valid_userId()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Verify the conscent read api with invalid userId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Requestbody with invalid userId with \"token\" and with valid \"\u003cuserId\u003e\" , \"\u003cconsumerId\u003e\" , \"\u003cobjectId\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with POST call invalid userId",
  "keyword": "When "
});
formatter.step({
  "name": "Should return status code as 404 with invalid userId",
  "keyword": "Then "
});
formatter.step({
  "name": "Returning correct errormessage when requested with invalid userId",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId",
        "consumerId",
        "objectId"
      ]
    },
    {
      "cells": [
        "75c89aaec-d78f-4a13-abfd-39d76fdd9f6",
        "01269878797503692810",
        "do_31240717640512307211963"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the conscent read api with invalid userId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Requestbody with invalid userId with \"token\" and with valid \"75c89aaec-d78f-4a13-abfd-39d76fdd9f6\" , \"01269878797503692810\" , \"do_31240717640512307211963\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.requestbody_with_invalid_userId_with_and_with_valid(String,String,String,String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.requestbody_with_invalid_userId_with_and_with_valid(userStepDefinition.java:468)\r\n\tat ✽.Requestbody with invalid userId with \"token\" and with valid \"75c89aaec-d78f-4a13-abfd-39d76fdd9f6\" , \"01269878797503692810\" , \"do_31240717640512307211963\"(file:src/test/java/features/user.feature:180)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with POST call invalid userId",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_POST_call_invalid_userId()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Should return status code as 404 with invalid userId",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.should_return_status_code_as_with_invalid_userId(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Returning correct errormessage when requested with invalid userId",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.returning_correct_errormessage_when_requested_with_invalid_userId()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Verify the conscent read api with invalid consumerId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Requestbody with invalid consumerId with \"token\" and with valid \"\u003cuserId\u003e\" , \"\u003cconsumerId\u003e\" , \"\u003cobjectId\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with POST call invalid consumerId",
  "keyword": "When "
});
formatter.step({
  "name": "Should return status code as 404 with invalid consumerId",
  "keyword": "Then "
});
formatter.step({
  "name": "Returning correct errormessage when requested with invalid consumerId",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId",
        "consumerId",
        "objectId"
      ]
    },
    {
      "cells": [
        "5c89aaec-d78f-4a13-abfd-39d76fdd9f6c",
        "012698787975036928102",
        "do_31240717640512307211963"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the conscent read api with invalid consumerId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Requestbody with invalid consumerId with \"token\" and with valid \"5c89aaec-d78f-4a13-abfd-39d76fdd9f6c\" , \"012698787975036928102\" , \"do_31240717640512307211963\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.requestbody_with_invalid_consumerId_with_and_with_valid(String,String,String,String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.requestbody_with_invalid_consumerId_with_and_with_valid(userStepDefinition.java:492)\r\n\tat ✽.Requestbody with invalid consumerId with \"token\" and with valid \"5c89aaec-d78f-4a13-abfd-39d76fdd9f6c\" , \"012698787975036928102\" , \"do_31240717640512307211963\"(file:src/test/java/features/user.feature:190)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with POST call invalid consumerId",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_POST_call_invalid_consumerId()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Should return status code as 404 with invalid consumerId",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.should_return_status_code_as_with_invalid_consumerId(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Returning correct errormessage when requested with invalid consumerId",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.returning_correct_errormessage_when_requested_with_invalid_consumerId()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Verify the conscent read api with invalid objectId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Requestbody with invalid objectId with \"token\" and with valid \"\u003cuserId\u003e\" , \"\u003cconsumerId\u003e\" , \"\u003cobjectId\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Request with POST call with invalid objectId",
  "keyword": "When "
});
formatter.step({
  "name": "Should return status code as 404 with invalid objectId",
  "keyword": "Then "
});
formatter.step({
  "name": "Returning correct errormessage when requested with invalid objectId",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId",
        "consumerId",
        "objectId"
      ]
    },
    {
      "cells": [
        "5c89aaec-d78f-4a13-abfd-39d76fdd9f6c",
        "01269878797503692810",
        "do_31240717640512307211963000"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify the conscent read api with invalid objectId",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@User"
    }
  ]
});
formatter.step({
  "name": "Requestbody with invalid objectId with \"token\" and with valid \"5c89aaec-d78f-4a13-abfd-39d76fdd9f6c\" , \"01269878797503692810\" , \"do_31240717640512307211963000\"",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.requestbody_with_invalid_objectId_with_and_with_valid(String,String,String,String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.requestbody_with_invalid_objectId_with_and_with_valid(userStepDefinition.java:516)\r\n\tat ✽.Requestbody with invalid objectId with \"token\" and with valid \"5c89aaec-d78f-4a13-abfd-39d76fdd9f6c\" , \"01269878797503692810\" , \"do_31240717640512307211963000\"(file:src/test/java/features/user.feature:200)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request with POST call with invalid objectId",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_with_POST_call_with_invalid_objectId()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Should return status code as 404 with invalid objectId",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.should_return_status_code_as_with_invalid_objectId(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Returning correct errormessage when requested with invalid objectId",
  "keyword": "And "
});
formatter.match({
  "location": "userStepDefinition.returning_correct_errormessage_when_requested_with_invalid_objectId()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Verify theat user feedRead api returning 200",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Request user feedRead api",
  "keyword": "Given "
});
formatter.step({
  "name": "Request feedRead api with \"\u003cuserId\u003e\" in pathparam",
  "keyword": "When "
});
formatter.step({
  "name": "User feedRead apis returns 200 statuscode",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId"
      ]
    },
    {
      "cells": [
        "5c89aaec-d78f-4a13-abfd-39d76fdd9f6c"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify theat user feedRead api returning 200",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Request user feedRead api",
  "keyword": "Given "
});
formatter.match({
  "location": "userStepDefinition.request_user_feedRead_api()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinations.userStepDefinition.request_user_feedRead_api(userStepDefinition.java:540)\r\n\tat ✽.Request user feedRead api(file:src/test/java/features/user.feature:209)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Request feedRead api with \"5c89aaec-d78f-4a13-abfd-39d76fdd9f6c\" in pathparam",
  "keyword": "When "
});
formatter.match({
  "location": "userStepDefinition.request_feedRead_api_with_in_pathparam(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User feedRead apis returns 200 statuscode",
  "keyword": "Then "
});
formatter.match({
  "location": "userStepDefinition.user_feedRead_apis_returns_statuscode(Integer)"
});
formatter.result({
  "status": "skipped"
});
});