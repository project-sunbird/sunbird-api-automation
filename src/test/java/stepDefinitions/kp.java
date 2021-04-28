package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.Utils;
import resources.payload;
import resources.Resources;
//import resources.payload;
//import resources.reUseableMethods;
//import resources.generateToken;

import static io.restassured.RestAssured.given;
//import static org.junit.Assert.assertEquals;

import org.testng.Assert;

public class kp {
	
	RequestSpecification res;
	Response resspec;


		// GET Channel API Functional Tests
	 @Given("Request get channel api")
	    public void request_get_channel_api() throws Throwable {
		 RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
	    	res= given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
	    	.log().all();
	        
	    }

	    @When("Valid  \"([^\"]*)\" channelId with GET calls")
	    public void valid_something_channelid_with_get_calls(String channelId) throws Throwable {
	    	resspec=res.when().get(Resources.getChannelAPI(channelId));
	        
	    }

	    @Then("Validate the get channel api response")
	    public void validate_the_get_channel_api_response() throws Throwable {
	    	String result= resspec.then().statusCode(200).extract().response().asString();
	    	System.out.println(result);
	    	JsonPath js = new JsonPath(result);
	    	String channelid = js.getString("result.channel.code");
	    	String responseCode = js.getString("responseCode");
	    	String status = js.getString("params.status");
	    	
	    	Assert.assertNotNull(result);
	    	Assert.assertNotNull("result.channel.code.frameworks.name");
	    	Assert.assertEquals(channelid, "in.ekstep");
	    	Assert.assertEquals(responseCode, "OK");
	    	Assert.assertEquals(status, "successful");
	    	
	    	if (responseCode.contentEquals("OK"))
	    	{
	    		System.out.println("Get channel API is working fine for" +channelid+ " channelId");
	    	}
	    	
	    	else System.out.println("Get channel API is not working");
	    }

	    
	    //GET Framework API Functional Tests
	    @Given("Request get framework api")
	    public void request_get_framework_api() throws Throwable {
	    	
	    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
	    	res= given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
	    	    	.log().all();
	        
	    }

	    @When("Request with \"([^\"]*)\" valid frameworkId")
	    public void request_with_something_valid_frameworkid(String frameworkId) throws Throwable {
	    	resspec=res.when().get(Resources.getFrameworkAPI(frameworkId));
	    }

	    @Then("Validate the get framework api response")
	    public void validate_the_get_framework_api_response() throws Throwable {
	    	String result= resspec.then().statusCode(200).extract().response().asString();
	    	System.out.println(result);
	    	JsonPath js = new JsonPath(result);
	    	String responseCode = js.getString("responseCode");
	    	String status = js.getString("params.status");
	    	String frameworkIdentifier = js.getString("result.framework.code");
	    	String name = js.getString("result.framework.name");
	    	
	    	Assert.assertNotNull(result);
	    	Assert.assertEquals(responseCode, "OK");
	    	Assert.assertEquals(status, "successful");
	    	Assert.assertEquals(frameworkIdentifier, "NCF");
	    	Assert.assertNotNull(name); 	
	    }
	    
	    // POST Generate DialCode API Functional Tests
	    @Given("^Request generate dialcode API with payload$")
	    public void request_generate_dialcode_api_with_payload() throws Throwable {
	    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
	    	
	    	res= given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
	    			.header("X-Channel-ID","0126796199493140480").body(payload.generateDialCode()).log().all();
	       
	    }

	    @When("^Request generate API with GET request path$")
	    public void request_generate_api_with_get_request_path() throws Throwable {
	    	
	    	resspec=res.post(Resources.generateDialCodeAPI());
	        
	    }

	    @Then("^Validate the generateDialCode API response$")
	    public void validate_the_generatedialcode_api_response() throws Throwable {
	    	
	    	String result= resspec.then().statusCode(200).extract().response().asString();
	    	System.out.println(result);
	    	JsonPath js = new JsonPath(result);
	    	String responseCode = js.getString("responseCode");
	    	String status = js.getString("params.status");
	    	String dialcodes = js.getString("result.dialcodes");
	    	String batchcode = js.getString("result.batchcode");
	    	String processId = js.getString("result.processId");
	    	String publisher = js.getString("result.publisher");
	    	
	    	Assert.assertNotNull(result);
	    	Assert.assertNotNull(dialcodes);
	    	Assert.assertNotNull(batchcode);
	    	Assert.assertNotNull(processId);
	    	Assert.assertEquals(publisher, "Sunbird21");
	    	Assert.assertEquals(responseCode, "OK");
	    	Assert.assertEquals(status, "successful");
	    	
	    }
	
	    
	    //POST Add registry record API Functional Tests
	    @Given("Request registry record API with payload")
	    public void request_registry_record_api_with_payload() throws Throwable {
	    	
	    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
	    	
	    	res= given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
	    			.body(payload.addRegistryRecord()).log().all();
	        
	    }
	    
	    @When("Request registry API with POST request path")
	    public void request_registry_api_with_post_request_path() throws Throwable {
	    	
	    	resspec=res.post(Resources.addRegistryRecordAPI());
	        
	    }

	    @Then("Validate the registry API response")
	    public void validate_the_registry_api_response() throws Throwable {
	    	
	    	String result= resspec.then().statusCode(200).extract().response().asString();
	    	System.out.println(result);
	    	JsonPath js = new JsonPath(result);
	    	String responseCode = js.getString("responseCode");
	    	String status = js.getString("params.status");
	    	Assert.assertEquals(responseCode, "OK");
	    	Assert.assertEquals(status, "successful");
	    }

	    //POST Create License API Functional Tests
	    @Given("^Request create license api with requestBody$")
	    public void request_create_license_api_with_requestbody() throws Throwable {
	    	RestAssured.baseURI=Utils.getGlobalValue("baseUrl");
	    	
	    	res= given().header("Content-Type","application/json").header("Authorization",Utils.getGlobalValue("KEY"))
	    			.body(payload.createLicense()).log().all();
	    
	    }

	    @When("^Request create license api with POST call$")
	    public void request_create_license_api_with_post_call() throws Throwable {
	        
	    	resspec=res.post(Resources.createLicenseAPI());
	    	
	    }

	    @Then("^Validate the create license api api response$")
	    public void validate_the_create_license_api_api_response() throws Throwable {
	    	
	    	String result= resspec.then().statusCode(200).extract().response().asString();
	    	System.out.println(result);
	    	JsonPath js = new JsonPath(result);
	    	String responseCode = js.getString("responseCode");
	    	String status = js.getString("params.status");
	    	String identifier = js.getString("result.identifier");
	    	String node_id = js.getString("result.node_id");
	 
	    	Assert.assertEquals(responseCode, "OK");
	    	Assert.assertEquals(status, "successful");
	    	Assert.assertNotNull(node_id);
	    	Assert.assertNotNull(identifier);
	    
	    }

}
