package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.Utils;
import resources.payload;
import resources.Resources;
import static io.restassured.RestAssured.given;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


public class content {
	RequestSpecification res;
	Response resspec;
	private static String content_id;
	private static String versionKey;
	//private static String result;

	

	//************* CONTENT CREATE API *****************************************
	
	@Given("^Content Create Payload \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void content_create_payload_something_something_something(String name, String description, String createdby) throws Throwable {
        //System.out.println("Create API");
		
        RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
        res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
        		.body(payload.AddContent(name, description, createdby));
  
    }

    @When("^User Calls \"([^\"]*)\" with POST Request$")
    public void user_calls_something_with_post_request(String strArg1) throws Throwable {
        
        resspec = res.when().post(Resources.ContentCreateAPI());
    }

    @Then("^Content ID Getting Created$")
    public void content_id_getting_created() throws Throwable {
        String result= resspec.then().log().all().assertThat().statusCode(200).extract().response().asString();
        JsonPath js = new JsonPath(result);
        String content_id = js.getString("result.content_id");
        String versionKey = js.getString("result.versionKey");
        System.out.println(content_id +","+versionKey);
    }

   @And("^\"([^\"]*)\" is 200$")
    public void something_is_200(String strArg1) throws Throwable {
	   String result= resspec.then().log().all().assertThat().statusCode(200).extract().response().asString();
	    JsonPath js = new JsonPath(result);
  	 	String str1 = js.getString("params.status");
    	if (str1=="unsuccessful") {
    		System.out.println("Content is not getting created");
    	}
    	else
    	{
    	
    	 if (str1=="successful") 
    	 {
    		 System.out.println("Content is getting created" + content_id +versionKey );
    	 }
    	}
   }

   @And("^Indentifier is present in the responseBody$")
   public void indentifier_is_present_in_the_responsebody() throws Throwable {
	   String result = resspec.then().extract().response().asString();
	   JsonPath js = new JsonPath(result);
	   String indentifier = js.getString("result.content_id");
	   if (indentifier.isEmpty()) {
		   System.out.println("Content creation failing");
	   }
	   else System.out.println("Content creation working fine");
   }
   
   
  //************* CONTENT UPDATE API *****************************************
    
    @Given("^Resuest contentUpdateAPi with \"([^\"]*)\" in payload$")
    public void resuest_contentupdateapi_with_something_in_payload(String versionKey) throws Throwable {
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY")).header("X-Authenticated-User-Token",Utils.getGlobalValue("AUTH_KEY"))
        		.body(payload.contentUpdateAPI(versionKey));
        
    }

    @When("^contentUpdateAPi with POST call with \"([^\"]*)\" in requestPath$")
    public void contentupdateapi_with_post_call_with_something_in_requestpath(String content_id) throws Throwable {
    	resspec=res.when().patch(Resources.ContentUpdateAPI(content_id));
        
    }

    @Then("^Validate contentUpdateAPi response$")
    public void validate_contentupdateapi_response() throws Throwable {
    	String str3= resspec.then().log().all().extract().response().asString();
    	JsonPath js= new JsonPath(str3);
    	String status= js.getString("params.status");
    	if (status=="success")
    	{
    		System.out.println("Update API is working fine");
    	}
    	else System.out.println("Update API is not working fine");
    }
    
    @And("^versionKey is present in the responseBody$")
    public void versionkey_is_present_in_the_responsebody() throws Throwable {
    	String result = resspec.then().extract().response().asString();
    	JsonPath js = new JsonPath(result);
    	String ver= js.getString("result.versionKey");
    	if (ver.isEmpty())
    	{
    		System.out.println("Content Update API is not working");
    	}
    	else System.out.println("Content Update API is working and version also present in the response body" + ver);
        
    }
    
  //************* CONTENT PUBLISH API ****************************************
    
    @Given("^Request content publish api with payload$")
    public void request_content_publish_api_with_payload() throws Throwable {
    	//System.out.println("Publish API");
    	
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res= given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
    			.header("x-authenticated-user-token",Utils.getGlobalValue("AUTH_KEY")).body(payload.ContentPublish());
    }

    @When("^Request with \"([^\"]*)\" in POST request$")
    public void request_with_something_in_post_request(String contentid) throws Throwable {
    	resspec=res.when().post(Resources.contentPublish(contentid));
        
    }

    @Then("^Validate response returns 200 status code$")
    public void validate_response_returns_200_status_code() throws Throwable {
    	String s1= resspec.then().statusCode(200).log().all().extract().asString();
    	JsonPath js1= new JsonPath(s1);
    	String s2 =js1.getString("params.status");
    	String s3 =js1.getString("result.content_id");
    	
        if (s3.equals("do_31321401593029427218") && s2.equals("successful") )
        {
        	System.out.println("Content Publish API is Working"); 
        }
        else System.out.println("Content Publish API is not Working"); 
    }
 
    
  //************* CONTENT SEARCH API ****************************************
    
    @Given("Request contentSearchApi with {string}")
    public void request_contentSearchApi_with(String contentid) throws Throwable {
        RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
        res=given().header("Content-Type",Utils.getGlobalValue("Content_Type")).header("Authorization",Utils.getGlobalValue("KEY"))
        		.body(payload.SearchContent(contentid));
    }

    @When("Request with with GET request")
    public void request_with_with_GET_request() {
    	resspec= res.when().post(Resources.contentSearch());
       
    }

    @Then("^Validate contentSearchApi response$")
    public void validate_contentsearchapi_response() throws Throwable {
    	String str1= resspec.then().log().all().extract().response().asString();
    	JsonPath js1= new JsonPath(str1);
    	String status= js1.getString("params.status");
    	String ownershipType =js1.getString("result.content.ownershipType");
    	String copyright =js1.getString("result.content.copyright");
    	String count =js1.getString("result.count");
    	System.out.println(status +  ownershipType +  copyright +  count);
    	
    	if (status.matches("successful"))
    	{
    		System.out.println("Content Search Api working fine.Returning status " + count + " content(s) with status " + status +" and copyright is "+ copyright);
    	}
    	if (status.matches("failed") )
    	{
    		System.out.println("Content search API is not working.Returning responseCode");
    	}

    }
    
  //************* CONTENT READ API ****************************************
    @Given("^Content API payload$")
    public void content_api_payload() throws Throwable {
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");

    	res=given().header("Content-Type",Utils.getGlobalValue("Content_Type")).header("Authorization",Utils.getGlobalValue("KEY"));
        
    }

    @When("^Request with GET call with \"([^\"]*)\"$")
    public void request_with_get_call_with_something(String contentid) throws Throwable {
        resspec=res.when().get(Resources.contentRead(contentid));
    }

    @Then("^Validate conntentReadApi response$")
    public void validate_conntentreadapi_response() throws Throwable {
    	String str=resspec.then().log().all().extract().response().asString();
    	JsonPath js = new JsonPath(str);
    	String responseCode = js.getString("responseCode");
    	//String status = js.getString("params.status");
    	if (responseCode.matches("OK"))
    	{
    		System.out.println("Content Read API is wokring fine");
    	}
    	if (responseCode.matches("RESOURCE_NOT_FOUND"))
    	{
    		System.out.println("Resource Not found");
    	}
    	if (responseCode.matches("failed")){
    		System.out.println("Content Read API is failing");
    	}
    }
    
  //************* CONTENT HIERARCHY API ****************************************
    
    @Given("^Request Content Hierarchy API$")
    public void request_content_hierarchy_api() throws Throwable {
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type",Utils.getGlobalValue("Content_Type")).header("Authorization",Utils.getGlobalValue("KEY"));
        
    }

    @When("^GET call with \"([^\"]*)\"$")
    public void get_call_with_something(String contentid) throws Throwable {
        resspec=res.when().get(Resources.contentHierarchy(contentid));
    }

    @Then("^Validate conntentHierarchyApi response$")
    public void validate_conntenthierarchyapi_response() throws Throwable {
    	String str =resspec.then().log().all().extract().response().asString();
    	JsonPath js = new JsonPath(str);
    	String responseCode = js.getString("responseCode");
    	String leafNodes=js.getString("result.content.leafNodes");
    	if (responseCode.matches("OK"))
    	{
    		System.out.println("Content Hierarchy API is wokring fine");
    		System.out.println("Child contents ::" + leafNodes);
    	}
    	if (responseCode=="RESOURCE_NOT_FOUND")
    	{
    		System.out.println("Resource Not found");
    	}
       
    }
    
  //************* COMPOSITE SEARCH API ****************************************
    @Given("^Composite Search with payload$")
    public void composite_Search_with_payload() throws Throwable {
    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
    	res=given().header("Content-Type",Utils.getGlobalValue("Content_Type")).header("Authorization",Utils.getGlobalValue("KEY"))
    			.body(payload.CompositeSearch());
        
    }

    @When("^Request with POST call$")
    public void request_with_post_call() throws Throwable {
    	resspec=res.when().post(Resources.CompositeSearch());
        
    }

    @Then("^Validate Composite Search api response$")
    public void validate_composite_search_api_response() throws Throwable {
    	String str=resspec.then().log().all().statusCode(200).extract().response().asString();
    	JsonPath js = new JsonPath(str);
    	String responseCode = js.getString("responseCode");
    	String ownershipType=js.getString("result.content.ownershipType");
    	int count=js.getInt("result.count");
    	if (responseCode.matches("OK") && ownershipType.contains("createdFor"))
    	{
    		System.out.println("Composite Search API is wokring fine." + "Content's Ownership:" + ownershipType );
    	}
    	if (responseCode.matches("OK") && count==0)
    	{
    		System.out.println("Composite Search API returing 0 result.");
    	}
        if (responseCode.contains("ERROR"))
        		{
        	System.out.println("Composite Search API not working.");
        		}
    }
}