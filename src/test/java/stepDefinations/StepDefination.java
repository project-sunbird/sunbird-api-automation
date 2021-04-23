package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import static org.junit.Assert.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefination extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data =new TestDataBuild();
	static String do_id;


	@Given("create content Payload with {string}  {string} {string}")
	public void createContentPayloadWith(String name, String contentType, String mimeType) throws IOException {

	
		 
		 res=given().header("X-Channel-Id","in.ekstep").header("user-id","system")
				 .spec(requestSpecification())
		.body(data.createContentPayload(name,contentType,mimeType));
	}

@When("user calls {string} with {string} http request")
public void user_calls_with_http_request(String resource, String method) {

		APIResources resourceAPI=APIResources.valueOf(resource);
		System.out.println(resourceAPI.getResource());
		
		
		resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		if(method.equalsIgnoreCase("POST"))
		 response =res.when().post(resourceAPI.getResource());
		else if(method.equalsIgnoreCase("GET"))
			 response =res.when().get(resourceAPI.getResource());
		else if(method.equalsIgnoreCase("PATCH"))
			response =res.when().patch(resourceAPI.getResource());
		
}

	@Then("the API call got success with status code {int}")
	public void the_API_call_got_success_with_status_code(Integer int1) {

		assertEquals(response.getStatusCode(),200);
		
	
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String Expectedvalue) {
	    // Write code here that turns the phrase above into concrete actions
	  
	 assertEquals(getJsonPath(response,keyValue),Expectedvalue);
	 //assertEquals(response.path("params.status"),Expectedvalue);
	}
	
	@Then("verify do_id created maps to {string} using {string}")
	public void verifyDo_idCreatedMapsToUsing(String expectedName, String resource) throws IOException {

		do_id=response.path("result.identifier");
		 res=given().spec(requestSpecification()).pathParam("do_id",do_id);
		 user_calls_with_http_request(resource,"GET");
		  String actualName=response.path("result.content.name");
		  assertEquals(actualName,expectedName);
		 
	    
	}


	@Given("update content Payload")
	public void updateContentPayload() throws IOException {
    // Write code here that turns the phrase above into concrete actions
   
	res =given().spec(requestSpecification()).pathParam("do_id",do_id).body(data.updateContenetPayload());
}


	@And("verify do_id updated maps to {string} using {string}")
	public void verifyDo_idUpdatedMapsToUsing(String expectedStatus, String resource) throws IOException {
		do_id=response.path("result.identifier");
		res=given().spec(requestSpecification()).pathParam("do_id",do_id);
		user_calls_with_http_request(resource,"GET");
		String actualStatus=response.path("result.content.trackable.enabled");
		assertEquals(actualStatus,expectedStatus);
	}
}
