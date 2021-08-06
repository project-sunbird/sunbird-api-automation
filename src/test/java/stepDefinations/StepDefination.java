package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import payload.payloads;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefination extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data =new TestDataBuild();
	static String do_id;
	static Properties prop;
	Utils util=new Utils();
	static String userId;

	public StepDefination() throws IOException, ParseException {
	}


	@Given("create content Payload with {string}  {string} {string}")
	public void createContentPayloadWith(String name, String contentType, String mimeType) throws IOException {

	
		 
		 res=given().header("X-Channel-Id","in.ekstep").header("user-id","system")
				 .spec(requestSpecification())
		.body(data.createContentPayload(name,contentType,mimeType));
	}
	@Given("create courseEnroll payload with {string}  {string} {string}")
	public void createcourseEnrollWith(String courseId, String batchId, String userId) throws IOException {



		res=given().spec(requestSpecification())
				.body(payloads.courseEnroll(courseId,batchId,userId));
	}
	@Given("create courseUnEnroll payload with {string}  {string} {string}")
	public void createcourseUnEnrollWith(String courseId, String batchId, String userId) throws IOException {



		res=given().spec(requestSpecification())
				.body(payloads.courseEnroll(courseId,batchId,userId));
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

		assertEquals(200,response.getStatusCode());
		
	
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
	@Given("search content payload")
	public void searchContentPayload() throws IOException {
		// Write code here that turns the phrase above into concrete actions

		res =given().spec(requestSpecification()).body(payloads.contentSearch());
	}


	@And("verify do_id updated maps to {string} using {string}")
	public void verifyDo_idUpdatedMapsToUsing(String expectedStatus, String resource) throws IOException {
		do_id=response.path("result.identifier");
		res=given().spec(requestSpecification()).pathParam("do_id",do_id);
		user_calls_with_http_request(resource,"GET");
		String actualStatus=response.path("result.content.trackable.enabled");
		assertEquals(actualStatus,expectedStatus);
	}

	@Given("read toc filepath to Upload with {string} as pathparam")
	public void readTocFilepathToUploadWithAsPathparam(String bookId) throws IOException {
		prop =new Properties();
		FileInputStream fis =new FileInputStream("src\\test\\java\\resources\\global.properties");
		prop.load(fis);
		res=given().baseUri(util.baseuri)
				.header("Content-Type", "multipart/json")
				.header("Authorization", util.auth_key)
				.header("x-authenticated-user-token", getAccessToken())
				.multiPart("file",new File("src/main/resources/testDataFiles/uploadsamplecsvfile.csv"))
				.pathParam("textbook-id",bookId);
	}

	@Given("read org details  payload with {string}")
	public void readOrgDetailsPayloadWith(String orgId) throws IOException {
		res=given().spec(requestSpecification())
				.body(payloads.readOrgDetail(orgId));
	}

	@Given("update location details  payload with {string} {string}")
	public void updateLocationDetailsPayloadWith(String locID, String name) throws IOException {
		res=given().spec(requestSpecification())
				.body(payloads.updateLocation(locID,name));
	}

	@Given("create group payload with {string}  {string}")
	public void createGroupPayloadWith(String groupName, String description) throws IOException {
		//res=given().spec(requestSpecification())
				//.body(payloads.createGroup(groupName,description));
		
		res=given().header("Content-Type","application/json").header("Authorization",util.auth_key)
			.header("x-authenticated-user-token",util.getAccessToken())
    			.body(payloads.createGroup(groupName, description));
	}

	@Given("Read groupDetails with {string}")
	public void readGroupDetailsWith(String usrId) throws IOException {
		res=given().spec(requestSpecification())
				.body(payloads.listGroupByUser(usrId));
	}

	@Given("create question payload with {string}  {string}")
	public void createQuestionPayloadWith(String mimeType, String primaryCategory) throws IOException {
		res=given().spec(requestSpecification())
				.body(payloads.createQuestion(mimeType,primaryCategory));
	}

	@Given("create questionset payload with {string}  {string}")
	public void createQuestionsetPayloadWith(String mimeType, String primaryCategory) throws IOException {
		res=given().spec(requestSpecification())
				.body(payloads.createQuestionSet(mimeType,primaryCategory));
	}


	@And("verify userId created maps to using {string}")
	public void verifyUserIdCreatedMapsToUsing(String resource) throws IOException {
		userId=response.path("result.userId");
		res=given().spec(requestSpecification()).pathParam("userId",userId);
		user_calls_with_http_request(resource,"GET");
		String actualUserId=response.path("result.response.organisations[0].userId");
		assertEquals(actualUserId,userId);
	}

	@Given("update user Payload with phoneNumber")
	public void updateUserPayloadWithPhoneNumber() throws IOException {
			res =given().spec(requestSpecification())
					.body(payloads.updateUser(userId));
	}

	@And("responseCode in response body is {int}")
	public void responsecodeInResponseBodyIs(int expectedvalue) {
		assertEquals(response.path("responseCode"),expectedvalue);
	}

	@Given("Read channel api with path param {string}")
	public void readChannelApiWithPathParam(String channelId) throws IOException {
		res=given().spec(requestSpecification()).pathParam("channelId",channelId);
	}

	@Given("Read framework api with path param {string}")
	public void readFrameworkApiWithPathParam(String frameworkId) throws IOException {
		res=given().spec(requestSpecification()).pathParam("frameworkId",frameworkId);
	}

	@Given("Generate dialcode using payload")
	public void generateDialcodeUsingPayload() throws IOException {
		res =given().spec(requestSpecification()).header("X-Channel-ID","0126796199493140480").header("Content-Type","application/json")
				.body(payloads.generateDialCode());
	}

	@Given("Request registry record API with payload")
	public void requestRegistryRecordAPIWithPayload() throws IOException {
		res =given().spec(requestSpecification())
				.body(payloads.addRegistryRecord());
	}

	@Given("Request create license api with payload")
	public void requestCreateLicenseApiWithPayload() throws IOException {
		res =given().spec(requestSpecification())
				.body(payloads.createLicense());
	}

	@Given("create user with valid phoneNumber")
	public void createUserWithValidPhoneNumber() throws IOException {
		res =given().spec(requestSpecification())
				.body(payloads.createUser());
	}

	@Given("Read user with valid userId")
	public void readUserWithValid() throws IOException {

		res =given().spec(requestSpecification()).pathParam("userId",userId);

	}

	@Given("update user details with payload")
	public void updateUserDetailsWithPayload() throws IOException {
		res =given().spec(requestSpecification())
				.body(payloads.updateUser(userId));
	}

	@And("validate userId is not null")
	public void validateUserIdIsNotNull() {
		userId=response.path("result.userId");
		Assert.assertNotNull(userId);
	}

	@Given("search user with {string}")
	public void searchUserWith(String emailId) throws IOException {
		res =given().spec(requestSpecification())
				.body(payloads.searchUser(emailId));

	}

	@Given("user exxist api validation with {string} and {string}")
	public void userExxistApiValidationWithAnd(String idType, String idValue) throws IOException {
		res =given().spec(requestSpecification()).pathParam("idType",idType).pathParam("id",idValue);

	}
}

