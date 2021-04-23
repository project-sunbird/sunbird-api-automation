package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.Resources;
import resources.Utils;
import resources.payload;
import resources.reUseableMethods;
import resources.generateToken;

import static io.restassured.RestAssured.given;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class users {
	RequestSpecification res;
	Response resspec;

	private static String USERID;
	//private static String userName;
	
	
	//*********USER CREATE API Implementation here*********

    @Given("^Request userCreateAPI with email in payload$")
    public void request_usercreateapi_with_something_in_payload() throws Throwable {

    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res= given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    	.body(payload.userCreateAPI()).log().all();
    }

    @When("Request with email POST calls")
    public void request_with_email_POST_calls() {
    	resspec=res.when().post(Resources.userCreateAPI());
    }

    @Then("^\"([^\"]*)\" got created in response body$")
    public void something_got_created_in_response_body(String strArg1) throws Throwable {
    	//String USERID;
    	String s123 = resspec.then().log().all().assertThat().statusCode(200).extract().response().asString();
    	System.out.println(s123);
    	JsonPath js1 =reUseableMethods.RawToJson(s123);
    	USERID = js1.getString("result.userId").toString();
    	System.out.println("Response body Contains userId: " + USERID);
    }
    
    @And("^SUCCESS is present in response result$")
    public void success_is_present_in_response_result() throws Throwable {
    	String s123 = resspec.then().log().all().assertThat().statusCode(200).extract().response().asString();
    	JsonPath js1 =reUseableMethods.RawToJson(s123);
    	String response = js1.getString("result.response");
    	if (response.contentEquals("SUCCESS"))
    	{
    		System.out.println("Create API response returning: " + response);
    		
    	}
    }

    @And("^Response header contains 200 as status$")
    public void response_header_contains_200_as_status() throws Throwable {
    	
    	resspec.then().log().all().assertThat().statusCode(200).extract().response().asString();
    	System.out.println("Create API response header contains status code 200");
    }

    @And("^responseCode contains OK$")
    public void responsecode_contains_ok() throws Throwable {
    	String s123 = resspec.then().log().all().assertThat().statusCode(200).extract().response().asString();
    	JsonPath js1 =reUseableMethods.RawToJson(s123);
    	String responseCode = js1.getString("responseCode");
    	if (responseCode.matches("OK"))
    	{
    		System.out.println("Create user api returns responseCode: " + responseCode);
    	}
        
    }
    
    
    // Create API - with existing users email id//
    @Given("Request API with existing user user's {string}")
    public void request_api_with_existing_user_users_email_id(String str) throws Throwable {
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res= given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    			.body(payload.userCreateAPI_withExistingEmail(str));
        
    }

    @When("^Request with post calls$")
    public void request_with_post_calls() throws Throwable {
    	resspec= res.when().post(Resources.userCreateAPI());
        
    }

    @Then("^Status shows as Failed$")
    public void status_shows_as_failed() throws Throwable {
    	String result = resspec.then().extract().response().asString();
    	JsonPath js = new JsonPath(result);
    	String status =js.getString("params.status");
    	if (status.contains("FAILED")) 
    	{
    		System.out.println("errms shows as: "+ status + " when requested with existing users email id");
    	}
    	
        
    }
    
    @And("^Return 400 as StatusCode$")
    public void return_400_as_statuscode() throws Throwable {
    	int str= resspec.then().extract().response().statusCode();
    	if (str==400)
    	{
    		System.out.println("Status code shows as "+ str + " when requested with existing users email id");
    	}
    	
    }

    @And("^err shows as EMAIL_IN_USE$")
    public void err_shows_as_emailinuse() throws Throwable {
    	String str= resspec.then().extract().response().asString();
    	JsonPath js = new JsonPath(str);
    	String err = js.getString("params.err");
    	//System.out.println(err);
    	if (err.contains("EMAIL_IN_USE"))
    	{
    		System.out.println("err message shows as when requested with existing users email id: " + err);
    	}
        
    }

 
    // Create API - with invalid email id format//

    @Given("^Request API with invalid \"([^\"]*)\"$")
    public void request_api_with_invalid_something(String email) throws Throwable {
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
        res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
        		.body(payload.userCreateAPI_withInvalidEmailFormat(email));
    }
    
    @When("^Request with post calls with invalid email id$")
    public void request_with_post_calls_with_invalid_email_id() throws Throwable {
    	resspec= res.when().post(Resources.userCreateAPI());
    }
    
    @Then("^Return 400 as StatusCode with invalid email id$")
    public void return_400_as_statuscode_with_invalid_email_id() throws Throwable {
    	int str= resspec.then().extract().response().statusCode();
        if (str==400)
        {
        	System.out.println("Returns " + str+ " in header as StatusCode with invalid email format");
        }
    }

    @And("^err message shows as EMAIL_FORMAT_ERROR$")
    public void err_message_shows_as_emailformaterror() throws Throwable {
    	String result= resspec.then().extract().response().asString();
    	JsonPath js = new JsonPath(result);
    	String str = js.getString("params.err");
    	if(str.contains("EMAIL_FORMAT_ERROR"))
    	{
    		System.out.println("err message printed as " + str + " when requested with invalid email format");
    	}
        
    }
    
 // Create API - with invalid password format//
    @Given("^Request API with invalid password \"([^\"]*)\"$")
    public void request_api_with_invalid_password_something(String password) throws Throwable {
        
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    			.body(payload.userCreateAPI_withInvalidPasswordFormat(password));
    }

    @When("Request with post calls  with invalid password")
    public void request_with_post_calls_with_invalid_password() {
    	
    	resspec= res.post(Resources.userCreateAPI());
        
    }

    @Then("Return 400 as StatusCode  with invalid password")
    public void return_as_StatusCode_with_invalid_password() { 
        
    	//String result =resspec.then().extract().response().asString();
        int statusCode=resspec.statusCode();
        System.out.println("Returing " +statusCode + " when requested with invalid password format");
        
    }

    @And("^err message shows as INVALID_PASSWORD$")
    public void err_message_shows_as_invalidpassword() throws Throwable {
    	//String results =resspec.then().extract().response().asString();
    	//JsonPath js = new JsonPath(results);
    	String str1=resspec.getBody().asString();
    	if (str1.contains("INVALID_PASSWORD"))
    	{
    	
    	System.out.println("Returning INVALID_PASSWORD");
    	}
    }	

    //************************USER UPDATE API *******************************
    //a1e64b41-16cd-47f7-989d-a605e740d040 (emailId- loadtestadmin@yopmail.com)
    
   
    @Given("^Update user's \"([^\"]*)\" for \"([^\"]*)\" with payload with valid user \"([^\"]*)\"$")
    public void update_users_something_for_something_with_payload_with_valid_user_something(String name, String userid, String token) throws Throwable {
    		
    	
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	System.out.println(generateToken.GTOKEN(token));
    	
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    			.header("x-authenticated-user-token",generateToken.GTOKEN(token))
    			.body(payload.userUpdateAPI(name, userid)).log().all();
    			
    }

    @When("^Request udate user with PATCH request call$")
    public void request_udate_user_with_patch_request_call() throws Throwable {
    	
    	resspec=res.when().patch(Resources.userUpdateAPI());
       
    }

    @Then("User's Name updated successfull and retruns 200")
    public void users_name_updated_successfull_and_retruns_200() throws Throwable {
    	String result = resspec.then().extract().response().asString();
    	//System.out.println(result);
    	JsonPath js = new JsonPath(result);
    	String status = js.getString("result.status");
    	
    	if (status=="Ok") {
    	System.out.println("User update api resturing status as" + status);
    	}
        
    }

    @And("^Update user's API Response shows as SUCCESS$")
    public void update_users_api_response_shows_as_success() throws Throwable {
    	String result = resspec.then().extract().response().asString();
    	//System.out.println(result);
    	JsonPath js = new JsonPath(result);
    	String resCode = js.getString("result.responseCode");
    	
    	if (resCode=="SUCCESS") {
        	System.out.println("User update api resturing status as" + resCode);
        	}
    }
    
    // User Update API with blank userId field
    @Given("^Update User's \"([^\"]*)\" for blank \"([^\"]*)\" with valid \"([^\"]*)\"$")
    public void update_users_something_for_blank_something_with_valid_something(String name, String userid, String token) throws Throwable {
    	
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Authorization",Utils.getGlobalValue("KEY")).header("Content-Type","application/json")
    			.header("x-authenticated-user-token",generateToken.GTOKEN(token))
    			.body(payload.userUpdateAPI(name, userid));
        
    }

    @When("^Request update user api with PATCH request when userId is blank$")
    public void request_update_user_api_with_patch_request_when_userid_is_blank() throws Throwable {
        resspec=res.when().patch(Resources.userUpdateAPI());
    	
    }

    @Then("^Validate that the resonse return 400 status code$")
    public void validate_that_the_resonse_return_400_status_code() throws Throwable {
    	resspec.then().extract().response().asString();
    	int statusCode=resspec.getStatusCode();
    	
    	if (statusCode==400)
    	{
    		System.out.println("Returing " + statusCode +" when  requested with emprty userId");
    	}
        
    }

    @And("^Validate response body returns correct error message for blank userId$")
    public void validate_response_body_returns_correct_error_message_for_blank_userid() throws Throwable {
    	String result=resspec.then().extract().response().asString();
    	JsonPath js= new JsonPath(result);
    	String errResponse= js.getString("params.errmsg");
    	
    	
    	if (errResponse.contains("Mandatory parameter userId or externalId, externalIdType and externalIdProvider is missing."))
    	{
    		System.out.println("With empty userId in payload getting error message: " + errResponse );
    	}
    }
    
    // User Update API without userId in request body
    @Given("^Update User's \"([^\"]*)\" without userid in request body with valid \"([^\"]*)\"$")
    public void update_users_something_without_userid_in_request_body_with_valid_something(String name, String token) throws Throwable {
        
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Authorization",Utils.getGlobalValue("KEY")).header("Content-Type","application/json")
    			.header("x-authenticated-user-token",generateToken.GTOKEN(token)).body(payload.userUpdateAPI_withoutUserId(name));
    }

    @When("^Request with PATCH request without userId$")
    public void request_with_patch_request_without_userid() throws Throwable {
    	resspec=res.when().patch(Resources.userUpdateAPI());
        
    }

    @Then("^Return 400 statuscode when requested withour userId$")
    public void return_400_statuscode_when_requested_withour_userid() throws Throwable {
       resspec.then();
       int statuscode=resspec.getStatusCode();
       if(statuscode==400)
       {
    	   System.out.println("Returning response code: " + statuscode);
       }
    }

    @And("^Correct error message retruns when requested without userId$")
    public void correct_error_message_retruns_when_requested_without_userid() throws Throwable {
    	String result=resspec.then().extract().response().asString();
    	JsonPath js= new JsonPath(result);
    	String errResponse= js.getString("params.errmsg");
    	
    	
    	if (errResponse.contains("Mandatory parameter userId or externalId, externalIdType and externalIdProvider is missing."))
    	{
    		System.out.println("With empty userId in payload getting error message: " + errResponse );
    	}
    }        
    
    //*********USER READ API Implementation here*********
    //a1e64b41-16cd-47f7-989d-a605e740d040 (emailId- loadtestadmin@yopmail.com)
    
    @Given("^Request userReadAPI with payload with valid \"([^\"]*)\"$")
    public void request_userreadapi_with_payload_with_valid_something(String token) throws Throwable {
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization", Utils.getGlobalValue("KEY"))
        		.header(("x-authenticated-user-token"), generateToken.GTOKEN(token));
    }

    @When("Request with {string} in GET call")
    public void request_with_in_GET_call(String userId) {
    	resspec= res.when().get(Resources.userReadAPI(userId));
    	System.out.println("UserId Printed From Read API call:" +userId );
    	   
    }

    @Then("^userid available in response$")
    public void userid_available_in_response() throws Throwable {
    	String str4= resspec.then().log().all().extract().response().asString();
    	JsonPath js= new JsonPath(str4);
    	//System.out.println(str4);
    	String id = js.getString("result.response.userId");
    	String username = js.getString("result.response.userName");
    	System.out.println("UserId: " +id + " UserName is: " + username +"\n");
    	
    	if (id.matches("a1e64b41-16cd-47f7-989d-a605e740d040"))
    	{
    	System.out.println("User Read API working fine");
    	}
    }
    @And("^ResponseCode returns 200 code$")
    public void responsecode_returns_200_code() throws Throwable {
    	resspec.then().log().all().extract().response().asString();
    	int statusCode= resspec.statusCode();
    	if (statusCode==200)
    	{
    		System.out.println("User Read apis returns " + statusCode  +"\n");
    	}
    	
    }

    @And("^OrgId is present in responseBody$")
    public void orgid_is_present_in_responsebody() throws Throwable {
    	String results = resspec.then().extract().response().asString();
    	JsonPath js = new JsonPath(results);
    	String orgId= js.getString("result.response.rootOrgId");
    	System.out.println("User is from " + orgId + " Organization \n");
        
    }

    @And("^user Role field is present in responseBody$")
    public void user_role_field_is_present_in_responsebody() throws Throwable {
    	String results = resspec.then().extract().response().asString();
    	JsonPath js = new JsonPath(results);
    	String role= js.getString("result.response.organisations.roles");
    	System.out.print("User is assigned with " + role + " roles \n");
    }
    
    @And("^userName is present in responseBody$")
    public void username_is_present_in_responsebody() throws Throwable {
    	String results = resspec.then().extract().response().asString();
    	JsonPath js = new JsonPath(results);
    	String UserName= js.getString("result.response.userName");
    	System.out.print("Username is: " + UserName +"\n");
    }
  
  // UserReadAPI requested with an invalid userId
    
    @Given("^RequestBody with valid user \"([^\"]*)\"$")
    public void requestbody_with_valid_user_something(String token) throws Throwable {
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Authorization",Utils.getGlobalValue("KEY")).header("Content-Type","application/json")
    			.header("x-authenticated-user-token", generateToken.GTOKEN(token));
        
    }

    @When("^Request with invalid \"([^\"]*)\"$")
    public void request_with_invalid_something(String userid) throws Throwable {
    	resspec=res.when().get(Resources.userReadAPI(userid));
        
    }

    @Then("^Returns 400 code when requested with invalid userid$")
    public void returns_400_code_when_requested_with_invalid_userid() throws Throwable {
    	resspec.then();
    	int statusCode=resspec.getStatusCode();
    	if (statusCode==404)
    	{
    		System.out.println("Returning statuscode " + statusCode + " when requested with invalid userId");
    		
    	}
        
    }

    @And("^userNotFound error message displayed$")
    public void usernotfound_error_message_displayed() throws Throwable {
    	String str=resspec.then().extract().response().asString();
    	JsonPath js = new JsonPath(str);
    	String userNotFound= js.getString("params.errmsg");
    	if (userNotFound.contains("user not found."))
    	{
    		System.out.println("Returing error message: " + userNotFound);
    	}
        
    }
    
 //*********USER SEARCH API Implementation here*********
    
    //user search with userName
    @Given("^Search user with \"([^\"]*)\" and valid \"([^\"]*)\"$")
    public void search_user_with_something_and_valid_something(String username, String token) throws Throwable {
    	
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    			.header("x-authenticated-user-token", generateToken.GTOKEN(token))
    			.body(payload.userSearch_with_userName(username));
        
    }

    @When("^Request with POST request call$")
    public void request_with_post_request_call() throws Throwable {
    	resspec=res.when().post(Resources.userSearchAPI());
        
    }

    @Then("^Search result returns 200 statuscode$")
    public void search_result_returns_200_statuscode() throws Throwable {
    	int statusCode=resspec.getStatusCode();
    	if (statusCode==200)
    	{
    		System.out.println("Returing status code: " + statusCode );
    	}
        
    }

    @And("^identifier is present in when requested with userName$")
    public void identifier_is_present_in_when_requested_with_username() throws Throwable {
    	String result= resspec.then().extract().response().asString();
    	JsonPath js = new JsonPath(result);
    	String indentifier = js.getString("result.response.content.id");
    	System.out.println("Returns userId: " + indentifier );
        
    }
    
  //user search with userId
    @Given("^Search user with \"([^\"]*)\" userId and valid \"([^\"]*)\"$")
    public void search_user_with_something_userid_and_valid_something(String userid, String token) throws Throwable {
    	
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    			.header("x-authenticated-user-token", generateToken.GTOKEN(token))
    			.body(payload.userSearch_with_userId(userid));
        
    }

    @When("^Request with POST call with userId$")
    public void request_with_post_call_with_userid() throws Throwable {
    	resspec=res.when().post(Resources.userSearchAPI());
        
    }

    @Then("^Search result returns 200 statuscode when requested with userId$")
    public void search_result_returns_200_statuscode_when_requested_with_userid() throws Throwable {
    	
    	int statusCode=resspec.statusCode();
    	if (statusCode==200)
    	{
    		System.out.println("Returning status code: " + statusCode );
    	}
    	else
    		System.out.println("Returning status code: " + statusCode );
        
    }

    @And("^identifier is present in responseBody$")
    public void identifier_is_present_in_responsebody() throws Throwable {
    	String result= resspec.then().extract().response().asString();
    	JsonPath js= new JsonPath(result);
    	String indentifier = js.getString("result.response.content.id");
    	System.out.println("Returns userId: " + indentifier );
    	
        
    }
    
  //user search with emailId
    @Given("^Search user with \"([^\"]*)\" emailId and valid \"([^\"]*)\"$")
    public void search_user_with_something_emailid_and_valid_something(String emailid, String token) throws Throwable {
        
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    			.header("x-authenticated-user-token", generateToken.GTOKEN(token))
    			.body(payload.userSearch_with_email(emailid));
    }

    @When("^Request with POST request call with emailId$")
    public void request_with_post_request_call_with_emailid() throws Throwable {
    	
    	resspec=res.when().post(Resources.userSearchAPI());
        
    }

    @Then("^Returns 200 statuscode when requested with emailId$")
    public void returns_200_statuscode_when_requested_with_emailid() throws Throwable {
    	
    	int statusCode=resspec.statusCode();
    	if (statusCode==200)
    	{
    		System.out.println("Returning status code: " + statusCode );
    	}
    	else
    		System.out.println("Returning status code: " + statusCode );
        
    }
    //User Search with FirstName
    @Given("^Search user with \"([^\"]*)\" firstName and valid \"([^\"]*)\"$")
    public void search_user_with_something_firstname_and_valid_something(String firstname, String token) throws Throwable {
        
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    			.header("x-authenticated-user-token", generateToken.GTOKEN(token))
    			.body(payload.userSearch_with_firstName(firstname));
    	
    }

    @When("^Request with POST request call with firstName$")
    public void request_with_post_request_call_with_firstname() throws Throwable {
    	resspec=res.when().post(Resources.userSearchAPI());
        
    }

    @Then("^Returns 200 statuscode when requested with firstName$")
    public void returns_200_statuscode_when_requested_with_firstname() throws Throwable {
    	
    	int statusCode=resspec.statusCode();
    	if (statusCode==200)
    	{
    		System.out.println("Returning status code: " + statusCode );
    	}
    	else
    		System.out.println("Returning status code: " + statusCode );
        
    }

    @And("^Showing total no of users count with the given firstName$")
    public void showing_total_no_of_users_count_with_the_given_firstname() throws Throwable {
    	
    	String result= resspec.then().extract().response().asString();
    	JsonPath js= new JsonPath(result);
    	String count=js.getString("result.response.count");
    	System.out.println(count + " Users are available with the given name");
        
    }
    //Search user with CreateBy field
    @Given("^Search user with \"([^\"]*)\" createdBy and valid \"([^\"]*)\"$")
    public void search_user_with_something_createdby_and_valid_something(String createdBy, String token) throws Throwable {
        
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    			.header("x-authenticated-user-token", generateToken.GTOKEN(token))
    			.body(payload.userSearch_with_createdBy(createdBy));
    	
    }

    @When("^Request with POST request call with createdBy$")
    public void request_with_post_request_call_with_createdby() throws Throwable {
        
    	resspec=res.when().post(Resources.userSearchAPI());
    	
    }

    @Then("^Search result returns 200 statuscode when searched with with createdBy$")
    public void search_result_returns_200_statuscode_when_searched_with_with_createdby() throws Throwable {
    	
    	int statusCode=resspec.statusCode();
    	if (statusCode==200)
    	{
    		System.out.println("Returning status code: " + statusCode );
    	}
    	else
    		System.out.println("Returning status code: " + statusCode );
        
    }

    @And("^Returns the no of users created by the user$")
    public void returns_the_no_of_users_created_by_the_user() throws Throwable {
    	
    	String result= resspec.then().extract().response().asString();
    	JsonPath js= new JsonPath(result);
    	String count=js.getString("result.response.count");
    	System.out.println(count + " Users are there created by the user");
    
    }
    
  //*********USER EXISTS API Implementation here*********
    
    //User exists API with valid emmailId
    @Given("^Request user exists api with valid emailId$")
    public void request_user_exists_api_with_valid_emailid() throws Throwable {
        
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"));
    }

    @When("^Request with GET api call with valid \"([^\"]*)\"  emailId$")
    public void request_with_get_api_call_with_valid_something_emailid(String emailid) throws Throwable {
    	resspec=res.when().get(Resources.userExistsAPI(emailid));
        
    }

    @Then("^User Exists apis returns 200 statuscode$")
    public void user_exists_apis_returns_200_statuscode() throws Throwable {
       
    	int statusCode=resspec.statusCode();
    	if (statusCode==200)
    	{
    		System.out.println("Returning status code: " + statusCode );
    	}
    	else
    		System.out.println("Returning status code: " + statusCode );
    }

    @And("^Returns exists value as true$")
    public void returns_exists_value_as_true() throws Throwable {
    	
    	String result= resspec.then().extract().response().asString();
    	JsonPath js= new JsonPath(result);
    	String exists=js.getString("result.exists");
    	
    	if (exists.matches("true"))
    	{
    		System.out.println("User exists and returing: " + exists );
    	}
    	else
    		System.out.println("Returning: " + exists );
        
    } 	
    
  //User exists api with non-existing emailId
    
    @Given("^Request user exists api with invalid emailId$")
    public void request_user_exists_api_with_invalid_emailid() throws Throwable {
        
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"));
    	
    }

    @When("^Request with GET api call with invalid \"([^\"]*)\"  emailId$")
    public void request_with_get_api_call_with_invalid_something_emailid(String emailId) throws Throwable {
        
    	resspec=res.when().get(Resources.userExistsAPI(emailId));
    	
    }

    @Then("^User Exists apis returns 200 statuscode when requested with invalid emailId$")
    public void user_exists_apis_returns_200_statuscode_when_requested_with_invalid_emailid() throws Throwable {
        
    	int statusCode=resspec.statusCode();
    	if (statusCode==200)
    	{
    		System.out.println("Returning status code: " + statusCode );
    	}
    	else
    		System.out.println("Returning status code: " + statusCode );
    	
    }

    @And("^Returns exists value as false$")
    public void returns_exists_value_as_false() throws Throwable {
    	
    	String result= resspec.then().extract().response().asString();
    	JsonPath js= new JsonPath(result);
    	String exists=js.getString("result.exists");
    	if (exists.matches("false"))
    	{
    		System.out.println("User does not exists and returing: " + exists );
    	}
    	else
    		System.out.println("Returning: " + exists );
        
    }
    
    //*********USER FEED READ API Implementation here*********
    
    @Given("^Request user feedRead api$")
    public void request_user_feedread_api() throws Throwable {
    	//user- loadtestadmin@yopmail.com
    	//String AUTH_KEY="eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJOdHpmQVhtOVpvUVQwZUZoXzRZNmpJX2wycjNFS1k2ckJRcklMYzNPMjZnIn0.eyJqdGkiOiJmNjUxOWYzMC1kYTBjLTQ2OGEtOTkzNi1mYmRkMDMwZDU5NTIiLCJleHAiOjE2MTU5OTUzMzQsIm5iZiI6MCwiaWF0IjoxNjEzNDAzMzM0LCJpc3MiOiJodHRwczovL2xvYWR0ZXN0Lm50cC5uZXQuaW4vYXV0aC9yZWFsbXMvc3VuYmlyZCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJmOjUwZjk2N2Q0LWI5ZGItNDUyOC05NTBjLWI5ZjAzMzJlNjNiYTphMWU2NGI0MS0xNmNkLTQ3ZjctOTg5ZC1hNjA1ZTc0MGQwNDAiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJnb29nbGUtYXV0aCIsImF1dGhfdGltZSI6MCwic2Vzc2lvbl9zdGF0ZSI6IjNiYjc3ZTI4LTA3YjktNDI5My04MWQzLWQyZGZhMzA3ZTc2MyIsImFjciI6IjEiLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOlsib2ZmbGluZV9hY2Nlc3MiLCJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoiIiwibmFtZSI6Ik1heWEgUHJhYmhhIiwicHJlZmVycmVkX3VzZXJuYW1lIjoiY3JlYXRvcjM5OTkiLCJnaXZlbl9uYW1lIjoiTWF5YSIsImZhbWlseV9uYW1lIjoiUHJhYmhhIiwiZW1haWwiOiJsbyoqKioqKioqKioqQHlvcG1haWwuY29tIn0.OR-l0-cwzYDePg7VBJPINdxbWHsqT9S8dU6U1vSpo_6EjupzxvMyumwK6rPvpICG1I9e_xznO51hXZpevnk1ShSM35d0XZRC6g-IdhSCrlS-ZNRVcGY3HRao4zDwU8rRJWcZyPXizZuB1TjgzjcOu-6oWaGzMfxKmJKLroWC9Uslwmkyq2kYTtfkxsj_82R91oWCZ0MTpco_hX02O9-_OGIhHQC3ahPqCwz1c4GGh8G-lhEeyyBEcHM2qmPbPA2VQZHVcV_IYUVk36IKuslnBNyeaZEkxufxruJv66pOJbnA9zkTtT1RFiiJspf35JGGgOBKxleye1LND0ZbTJMMRQ";
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY")).
    			header("x-authenticated-user-token",Utils.getGlobalValue("AUTH_KEY"));
        
    }

    @When("^Request feedRead api with \"([^\"]*)\" in pathparam$")
    public void request_feedread_api_with_something_in_pathparam(String userid) throws Throwable {
    	resspec= res.when().get(Resources.userFeedAPI(userid));
    	System.out.println(userid);
        
    }

    @Then("^User feedRead apis returns 200 statuscode$")
    public void user_feedread_apis_returns_200_statuscode() throws Throwable {
    	String str= resspec.then().statusCode(200).extract().response().asString();
    	JsonPath js = new JsonPath(str);
    	String responseCode = js.getString("responseCode");
    	System.out.println(responseCode);
    	
    	if (responseCode.contentEquals("OK"))
    	{
    		System.out.println("User feed api working fine");
    	}
        
    }
    
    //***************** USER CONSCENT API IMPLEMENTATION*********************************
    //Conscent Read with valid data
    @Given("^Requestbody with valid userId with \"([^\"]*)\" and with valid \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
    public void requestbody_with_valid_userid_with_something_and_with_valid_something_something_something(String token, String userid, String consumerid, String objectid) throws Throwable {
    	
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    			.header("x-authenticated-user-token", generateToken.GTOKEN(token))
    			.body(payload.userConscentRead(userid, consumerid, objectid));
        
    }

    @When("^Request with POST call valid userid, consumerId and objectId$")
    public void request_with_post_call_valid_userid_consumerid_and_objectid() throws Throwable {
        
    	resspec=res.when().post(Resources.userConscentReadAPI());
    	
    }

    @Then("^Should return status code as 200 with valid userId$")
    public void should_return_status_code_as_200_with_valid_userid() throws Throwable {
        
    	int statusCode=resspec.statusCode();
    	if (statusCode==200)
    	{
    		System.out.println("Returning status code: " + statusCode );
    	}
    	else
    		System.out.println("Returning status code: " + statusCode );
    	
    }

    @And("^consumerId is present when requested with valid userId$")
    public void consumerid_is_present_when_requested_with_valid_userid() throws Throwable {
        
    	String str= resspec.then().extract().response().asString();
    	
    	JsonPath js = new JsonPath(str);
    	String consumerId = js.getString("result.consents.consumerId");
    	System.out.println("Consumerid: " + consumerId );
}

    @And("^consumerType is present when requested with valid userId$")
    public void consumertype_is_present_when_requested_with_valid_userid() throws Throwable {
        
    	String str= resspec.then().statusCode(200).extract().response().asString();
    	JsonPath js = new JsonPath(str);
    	String consumerType = js.getString("result.consents.consumerType");
    	System.out.println("consumerType:" + consumerType);
    	
    }

    @And("^conscentId is present when requested with valid userId$")
    public void conscentid_is_present_when_requested_with_valid_userid() throws Throwable {
        
    	String str= resspec.then().statusCode(200).extract().response().asString();
    	JsonPath js = new JsonPath(str);
    	String id = js.getString("result.consents.id");
    	System.out.println("conscentId: " + id );
    	
    }
    
  //Conscent Read with invalid userId
    @Given("^Requestbody with invalid userId with \"([^\"]*)\" and with valid \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
    public void requestbody_with_invalid_userid_with_something_and_with_valid_something_something_something(String token, String userid, String consumerid, String objectid) throws Throwable {
        
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    			.header("x-authenticated-user-token", generateToken.GTOKEN(token))
    			.body(payload.userConscentRead(userid, consumerid, objectid));
    	
    }

    @When("^Request with POST call invalid userId$")
    public void request_with_post_call_invalid_userid() throws Throwable {
    	resspec=res.when().post(Resources.userConscentReadAPI());
    }

    @Then("^Should return status code as 404 with invalid userId$")
    public void should_return_status_code_as_404_with_invalid_userid() throws Throwable {
    	
    	int statusCode=resspec.statusCode();
    	if (statusCode==404)
    	{
    		System.out.println("Returning status code: " + statusCode + " when requested with invalid userId");
    	}
    	else
    		System.out.println("Returning status code: " + statusCode );
    	
        
    }

    @And("^Returning correct errormessage when requested with invalid userId$")
    public void returning_correct_errormessage_when_requested_with_invalid_userid() throws Throwable {
    	
    	String str= resspec.then().extract().response().asString();
    	JsonPath js = new JsonPath(str);
    	String errmsg = js.getString("params.errmsg");
    	System.out.println("Returing error message: " + errmsg );
        
    }
    
  //Conscent Read with invalid consumerId
    @Given("^Requestbody with invalid consumerId with \"([^\"]*)\" and with valid \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
    public void requestbody_with_invalid_consumerid_with_something_and_with_valid_something_something_something(String token, String userid, String consumerid, String objectid) throws Throwable {
        
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    			.header("x-authenticated-user-token", generateToken.GTOKEN(token))
    			.body(payload.userConscentRead(userid, consumerid, objectid));
    	
    }

    @When("Request with POST call invalid consumerId")
    public void request_with_POST_call_invalid_consumerId() {
    	resspec=res.when().post(Resources.userConscentReadAPI());
    }

    @Then("^Should return status code as 404 with invalid consumerId$")
    public void should_return_status_code_as_404_with_invalid_consumerid() throws Throwable {
        
    	int statusCode=resspec.statusCode();
    	if (statusCode==404)
    	{
    		System.out.println("Returning status code: " + statusCode + " when requested with invalid consumerId");
    	}
    	else
    		System.out.println("Returning status code: " + statusCode );
    	
    	
    }

    @And("^Returning correct errormessage when requested with invalid consumerId$")
    public void returning_correct_errormessage_when_requested_with_invalid_consumerid() throws Throwable {
        
    	String str= resspec.then().extract().response().asString();
    	JsonPath js = new JsonPath(str);
    	String errmsg = js.getString("params.errmsg");
    	System.out.println("Returing error message: " + errmsg );
    	
    }
    
  //Conscent Read with invalid consumerId
    @Given("^Requestbody with invalid objectId with \"([^\"]*)\" and with valid \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
    public void requestbody_with_invalid_objectid_with_something_and_with_valid_something_something_something(String str1, String userid, String consumerid, String objectid) throws Throwable {
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    			.header("x-authenticated-user-token", userToken.userUpdateToken(str1))
    			.body(payload.userConscentRead(userid, consumerid, objectid));
    }

    @When("^Request with POST call with invalid objectId$")
    public void request_with_post_call_with_invalid_objectid() throws Throwable {
    	resspec=res.when().post(Resources.userConscentReadAPI());
    }

    @Then("^Should return status code as 404 with invalid objectId$")
    public void should_return_status_code_as_404_with_invalid_objectid() throws Throwable {
        
    	int statusCode=resspec.statusCode();
    	if (statusCode==404)
    	{
    		System.out.println("Returning status code: " + statusCode + " when requested with invalid objectId");
    	}
    	else
    		System.out.println("Returning status code: " + statusCode );
    	
    }

    @And("^Returning correct errormessage when requested with invalid objectId$")
    public void returning_correct_errormessage_when_requested_with_invalid_objectid() throws Throwable {
        
    	String str= resspec.then().extract().response().asString();
    	JsonPath js = new JsonPath(str);
    	String errmsg = js.getString("params.errmsg");
    	System.out.println("Returing error message: " + errmsg );
    	
    }
    

}
